package com.datasystem.gui;

import com.datasystem.database.ConnectionDB;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import java.util.Objects;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame{

    private JLabel background;
    private JLabel logo;
    private JTextField userField;
    private JPasswordField pwdField;
    private JLabel loginErrorText;
    private JButton loginBtn;

    public Login() {
        initComponents();
        setIconImage(new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/icon.png")
                )).getImage()
        );
        setVisible(true);
        setSize(400, 550);
        setResizable(false);
        setTitle("Inicio de Sesión");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/wallpaperPrincipal.jpg")
                )
        );

        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(
                background.getWidth(), background.getHeight(), Image.SCALE_DEFAULT
        ));
        background.setIcon(icon);


        ImageIcon logoImg = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/DS.png")
                )
        );
        Icon logoIcon = new ImageIcon(logoImg.getImage().getScaledInstance(
                logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT
        ));
        logo.setIcon(logoIcon);

    }

    private void initComponents() {
        Font textFont = new Font("Arial", Font.PLAIN, 16);

        logo = new JLabel();
        logo.setBounds(70, 10, 250, 250);
        add(logo);

        userField = new JTextField();
        userField.setHorizontalAlignment(JTextField.CENTER);
        userField.setFont(textFont);
        userField.setForeground(Color.white);
        userField.setBackground(new Color(153, 153, 255));
        userField.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        userField.setBounds(90, 300, 210, 30);
        add(userField);

        pwdField = new JPasswordField();
        pwdField.setHorizontalAlignment(JPasswordField.CENTER);
        pwdField.setFont(textFont);
        pwdField.setForeground(Color.white);
        pwdField.setBackground(new Color(153, 153, 255));
        pwdField.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        pwdField.setBounds(90, 350, 210, 30);
        add(pwdField);

        loginBtn = new JButton("Entrar");
        loginBtn.addActionListener(this::loginBtnActionPerformed);
        loginBtn.setHorizontalAlignment(JButton.CENTER);
        loginBtn.setFont(textFont);
        loginBtn.setBounds(150, 400, 100, 30);
        add(loginBtn);

        loginErrorText = new JLabel("");
        loginErrorText.setForeground(Color.red);
        loginErrorText.setBounds(0, 450, 400, 30);
        loginErrorText.setHorizontalAlignment(JLabel.CENTER);
        add(loginErrorText);

        background = new JLabel();
        background.setSize(400, 550);
        add(background);

    }

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String username = userField.getText().trim();
        String password = new String(pwdField.getPassword()).trim();
        if (!username.isEmpty() && !password.isEmpty()) {
            try {
                Connection conn = ConnectionDB.connect();
                PreparedStatement pst = conn.prepareStatement(
                        "SELECT name_user, type_level, status FROM users WHERE username = '" + username
                        + "' and password = '" + password + "'"
                );
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String nameUser = rs.getString("name_user");
                    String level = rs.getString("type_level");
                    String status = rs.getString("status");
                    if (status.equalsIgnoreCase("Activo")) {
                        dispose();
                        switch (level.toLowerCase()) {
                            case "administrador" -> new Admin(nameUser);
                            case "capturista" -> new Capturist();
                            case "tecnico" -> new Technician();
                        }
                    } else {
                        loginErrorText.setText("Esta cuenta esta inactiva, contacte con el administrador");
                    }
                } else {
                    loginErrorText.setText("Datos incorrectos");
                    userField.setText("");
                    pwdField.setText("");
                }
            } catch (SQLException e) {
                loginErrorText.setText("Error de acceder, contacte con el administrador...");
                System.out.println(e);
            }
        } else {
            loginErrorText.setText("Debes llenar los campos");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
