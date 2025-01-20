package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl {

    CustomerDAO customerDAO = new CustomerDAOImpl();

    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    public void save(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        customerDAO.save(customerDTO);
    }

    public void update(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        customerDAO.update(customerDTO);
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        customerDAO.delete(id);
    }

    public String generateNewId() throws SQLException, ClassNotFoundException {
        return customerDAO.generateNewId();
    }

    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.search(id);
    }

}
