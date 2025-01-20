package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dto.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst= SQLUtil.execute("SELECT * FROM customer");

        ArrayList<CustomerDTO> customerDTOArrayList = new ArrayList<>();
        while (rst.next()){
            customerDTOArrayList.add(new CustomerDTO(
                    rst.getString("id"),rst.getString("name"),rst.getString("address")));
        }
        return customerDTOArrayList;
    }


    @Override
    public boolean save(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress());
        return false;
    }
    @Override
    public void update(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        SQLUtil.execute("UPDATE Customer SET name=?,address=? WHERE id=?"
                ,customerDTO.getName()
                ,customerDTO.getAddress()
                ,customerDTO.getId());
    }
    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst=SQLUtil.execute("SELECT * FROM customer WHERE id=?",id);
        return rst.next();
    }
    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
        SQLUtil.execute("DELETE FROM customer WHERE id=?",id);
    }
    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }
    @Override
    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?",id);
        rst.next();
        return new CustomerDTO(rst.getString("id"),
                rst.getString("name"),rst.getString("address"));
    }

    @Override
    public void uniqueMethodForCustomer() {

    }
}
