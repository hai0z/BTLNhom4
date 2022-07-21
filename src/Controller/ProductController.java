/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Product;
import Model.ProductModel;
import Views.ProductsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HAI PC
 */
public class ProductController {

    private final ProductsView productView;
    private final ProductModel productModel;

    public ProductController(ProductsView productView) {
        this.productView = productView;
        productModel = new ProductModel();
        productView.addProduct(new AddProduct());
        productView.deleteProduct(new DeleteProduct());
        productView.searchProduct(new SearchProduct());
        productView.updateProduct(new UpdateProduct());
    }

    private boolean validateProduct(Product product) {
        if (product.getName().isEmpty())
        {
            JOptionPane.showMessageDialog(productView, "Product name is required", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (product.getPrice() <= 0)
        {
            JOptionPane.showMessageDialog(productView, "Price is required", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (product.getQuantity() <= 0)
        {
            JOptionPane.showMessageDialog(productView, "Quantity is required", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    class AddProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (validateProduct(productView.getInputData()))
            {
                boolean insertSuccess = productModel.insertProduct(productView.getInputData());
                if (insertSuccess)
                {
                    JOptionPane.showMessageDialog(productView, "Add product successfully");
                    ShowProductList();
                    productView.clearInput();
                } else
                {
                    JOptionPane.showMessageDialog(productView, "product already exists", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    class UpdateProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (validateProduct(productView.getInputData())) {
                boolean updateSuccess = productModel.updateProduct(productView.getInputData());
                if (updateSuccess) {
                    JOptionPane.showMessageDialog(productView, "Update product successfully");
                    ShowProductList();
                } else {
                    JOptionPane.showMessageDialog(productView, "update failed", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }

    class DeleteProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showConfirmDialog(productView, "Are you sure");
            if (confirm == 0)
            {
                productModel.deleteProduct(productView.getInputData().getId());
                ShowProductList();
            }
        }
    }

    class SearchProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ArrayList<Product> productList = productModel.getListProduct(productView.getSearchValue());
            productView.showListProduct(productList);
        }

    }

    public void ShowProductList() {
        ArrayList<Product> productList = productModel.getListProduct();
        productView.showListProduct(productList);
    }

}
