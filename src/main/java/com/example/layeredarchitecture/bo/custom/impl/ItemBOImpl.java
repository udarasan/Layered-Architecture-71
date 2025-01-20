package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.custom.ItemBO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dto.ItemDTO;
import com.example.layeredarchitecture.entity.Item;

import java.sql.*;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.ITEM);

    @Override
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<ItemDTO> itemDTOArrayList = new ArrayList<>();
        ArrayList<Item>items=itemDAO.getAll();
        for(Item item:items){
            itemDTOArrayList.add(new ItemDTO(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand()));
        }
        return itemDTOArrayList;
    }
    @Override
    public void save(ItemDTO items) throws SQLException, ClassNotFoundException {
        itemDAO.save(new Item(items.getCode(),items.getDescription(),items.getUnitPrice(),items.getQtyOnHand()));
    }
    @Override
    public void update(ItemDTO items) throws SQLException, ClassNotFoundException {
        itemDAO.update(new Item(items.getCode(),items.getDescription(),items.getUnitPrice(),items.getQtyOnHand()));
    }
    @Override
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }
    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
        itemDAO.delete(id);
    }
    public String generateNewId() throws SQLException, ClassNotFoundException {
       return itemDAO.generateNewId();
    }
    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        Item item=itemDAO.search(code);
        return new ItemDTO(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand());
    }
}
