/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_objects;

/**
 *
 * @author Admin
 */
public interface IWarehouseManagement {
    public void createImportReceipt(ProductDao productDao);
    public void createExportReceipt(ProductDao productDao);
}
