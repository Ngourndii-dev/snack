package com.example.demo.repository;

import com.example.demo.entity.Menus;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class ProductDao {
    private final Connection connection;

    public List<Menus> findAll() {
        List<Menus> productList = new ArrayList<>();
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = "SELECT product_name, price, taste, description, image_url FROM product ORDER BY price ASC";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                productList.add(new Menus(
                        resultSet.getString("product_name"),
                        resultSet.getDouble("price"),
                        resultSet.getString("taste"),
                        resultSet.getString("description"),
                        resultSet.getString("image_url")
                ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return productList;
    }
}
