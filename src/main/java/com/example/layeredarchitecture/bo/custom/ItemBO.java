package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.SuperBO;
import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO extends SuperBO {
     ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;
     void save(ItemDTO items) throws SQLException, ClassNotFoundException;
     void update(ItemDTO items) throws SQLException, ClassNotFoundException;
     boolean exist(String code) throws SQLException, ClassNotFoundException;
     void delete(String id) throws SQLException, ClassNotFoundException;
     String generateNewId() throws SQLException, ClassNotFoundException;
     ItemDTO search(String code) throws SQLException, ClassNotFoundException;
}
