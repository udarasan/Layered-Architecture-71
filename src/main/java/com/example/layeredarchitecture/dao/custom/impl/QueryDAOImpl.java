package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.QueryDAO;

import java.sql.SQLException;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public void findOrdersByOrderDerailID() throws SQLException, ClassNotFoundException {
        SQLUtil.execute("");
    }
}
