package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PlaceOrderBO {
     CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;
     boolean existItem(String code) throws SQLException, ClassNotFoundException;
     boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
     String generateNewOrderId() throws SQLException, ClassNotFoundException;
     ArrayList<CustomerDTO> getAllCustomerIds() throws SQLException, ClassNotFoundException ;
     ArrayList<ItemDTO> getAllItemIds() throws SQLException, ClassNotFoundException;
}
