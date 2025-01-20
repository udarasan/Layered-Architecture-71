package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {
     ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;
     void save(ItemDTO items) throws SQLException, ClassNotFoundException;
     void update(ItemDTO items) throws SQLException, ClassNotFoundException;
     boolean exist(String code) throws SQLException, ClassNotFoundException;
     void delete(String id) throws SQLException, ClassNotFoundException;
     String generateNewId() throws SQLException, ClassNotFoundException;
     ItemDTO search(String code) throws SQLException, ClassNotFoundException;
}
