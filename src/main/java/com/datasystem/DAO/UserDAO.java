package com.datasystem.DAO;

import com.datasystem.database.ConnectionDB;
import com.datasystem.models.User;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public boolean register(User user) {
        String query = "INSERT INTO users" +
                "(name_user, email, phone_number, username, password, type_level, status, register_by) " +
                "VALUES (?, ?, ?, ?, ?, ? ,? ,?)";

        try {
            Connection conn = ConnectionDB.connect();
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, user.getNameUser());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhoneNumber());
            ps.setString(4, user.getUsername());
            ps.setString(5, user.getPassword());
            ps.setString(6, user.getLevel());
            ps.setString(7, user.getStatus());
            ps.setString(8, user.getRegister_by());

            ps.executeQuery();

            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";
        try {
            Connection conn = ConnectionDB.connect();
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User(
                        rs.getInt("id_user"),
                        rs.getString("name_user"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("type_level"),
                        rs.getString("status"),
                        rs.getString("register_by")
                );
                users.add(user);
            }
            return users;

        } catch (SQLException e) {
            return null;
        }
    }
}
