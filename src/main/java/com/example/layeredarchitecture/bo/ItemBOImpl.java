package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public class ItemBOImpl {
    ItemDAO itemDAO = new ItemDAOImpl();
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }
    public void save(ItemDTO items) throws SQLException, ClassNotFoundException {
        itemDAO.save(items);
    }
    public void update(ItemDTO items) throws SQLException, ClassNotFoundException {
        itemDAO.update(items);
    }
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }
    public void delete(String id) throws SQLException, ClassNotFoundException {
        itemDAO.delete(id);
    }
    public String generateNewId() throws SQLException, ClassNotFoundException {
       return itemDAO.generateNewId();
    }
    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.search(code);
    }
}
