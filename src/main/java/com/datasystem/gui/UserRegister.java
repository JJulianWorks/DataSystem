package com.datasystem.gui;

import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;

public class UserRegister extends JFrame {

    private JLabel titleTxt;
    private JLabel background;
    private JTextField nameUserField;
    private JTextField emailField;
    private JTextField passwordField;
    private JTextField usernameField;
    private JTextField phoneField;
    private JComboBox<String> levelCB;
    public JButton addUserBtn;

    public UserRegister() {
        initComponents();
        setVisible(true);
        setSize(630, 350);
        setResizable(false);
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/icon.png")
                )).getImage()
        );

        ImageIcon backgroundImage = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/wallpaperPrincipal.jpg")
                )
        );
        Icon backgroundIcon = new ImageIcon(backgroundImage.getImage()
                .getScaledInstance(
                        background.getWidth(),
                        background.getHeight(),
                        Image.SCALE_DEFAULT
                )
        );
        background.setIcon(backgroundIcon);

        ImageIcon addUserIcon = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/add.png")
                )
        );
        addUserBtn.setIcon(addUserIcon);
    }

    private void initComponents() {
        setLayout(null);

        titleTxt = new JLabel("REGISTRO DE USUARIO");
        titleTxt.setBounds(1, 15, 650, 30);
        titleTxt.setForeground(Color.white);
        titleTxt.setFont(new Font("Tahoma", Font.PLAIN, 24));
        titleTxt.setHorizontalAlignment(JLabel.CENTER);
        add(titleTxt);

        Font fieldTextFont = new Font("Arial", Font.PLAIN, 16);
        Font textFont = new Font("Tahoma", Font.BOLD, 12);
        Color backgroundFieldColor = new Color(153, 153, 255);
        SoftBevelBorder borderField = new SoftBevelBorder(SoftBevelBorder.RAISED);

        JLabel nameUserTxt = new JLabel("Nombre del usuario:");
        nameUserTxt.setBounds(20, 50, 210, 20);
        nameUserTxt.setForeground(Color.white);
        nameUserTxt.setFont(textFont);
        add(nameUserTxt);

        nameUserField = new JTextField();
        nameUserField.setBounds(20, 70, 210, 30);
        nameUserField.setFont(fieldTextFont);
        nameUserField.setForeground(Color.white);
        nameUserField.setBackground(backgroundFieldColor);
        nameUserField.setBorder(borderField);
        nameUserField.setHorizontalAlignment(JTextField.CENTER);
        add(nameUserField);

        JLabel emailText = new JLabel("email:");
        emailText.setBounds(20, 110, 210, 20);
        emailText.setFont(textFont);
        emailText.setForeground(Color.white);
        add(emailText);

        emailField = new JTextField();
        emailField.setBounds(20, 130, 210, 30);
        emailField.setFont(fieldTextFont);
        emailField.setForeground(Color.white);
        emailField.setBackground(backgroundFieldColor);
        emailField.setBorder(borderField);
        emailField.setHorizontalAlignment(JTextField.CENTER);
        add(emailField);

        JLabel phoneText = new JLabel("Télefono:");
        phoneText.setBounds(20, 170, 210, 20);
        phoneText.setFont(textFont);
        phoneText.setForeground(Color.white);
        add(phoneText);

        phoneField = new JTextField();
        phoneField.setBounds(20, 190, 210, 30);
        phoneField.setFont(fieldTextFont);
        phoneField.setForeground(Color.white);
        phoneField.setBackground(backgroundFieldColor);
        phoneField.setBorder(borderField);
        phoneField.setHorizontalAlignment(JTextField.CENTER);
        add(phoneField);

        JLabel levelText = new JLabel("Permisos de:");
        levelText.setBounds(20, 230, 210, 20);
        levelText.setFont(textFont);
        levelText.setForeground(Color.white);
        add(levelText);

        levelCB = new JComboBox<>(new String[]{"Administrador", "Capturista", "Tecnico"});
        levelCB.setBounds(20, 250, 120, 30);
        add(levelCB);

        JLabel usernameText = new JLabel("Username:");
        usernameText.setBounds(385, 50, 120, 20);
        usernameText.setFont(textFont);
        usernameText.setForeground(Color.white);
        add(usernameText);

        usernameField = new JTextField();
        usernameField.setBounds(385, 70, 210, 30);
        usernameField.setFont(fieldTextFont);
        usernameField.setForeground(Color.white);
        usernameField.setBackground(backgroundFieldColor);
        usernameField.setBorder(borderField);
        usernameField.setHorizontalAlignment(JTextField.CENTER);
        add(usernameField);

        JLabel passwordText = new JLabel("Contraseña:");
        passwordText.setBounds(385, 110, 210, 20);
        passwordText.setFont(textFont);
        passwordText.setForeground(Color.white);
        add(passwordText);

        passwordField = new JTextField();
        passwordField.setBounds(385, 130, 210, 30);
        passwordField.setFont(fieldTextFont);
        passwordField.setForeground(Color.white);
        passwordField.setBackground(backgroundFieldColor);
        passwordField.setBorder(borderField);
        passwordField.setHorizontalAlignment(JTextField.CENTER);
        add(passwordField);

        addUserBtn = new JButton();
        addUserBtn.setBounds(495, 170, 100, 80);
        add(addUserBtn);

        background = new JLabel();
        background.setSize(630, 350);
        add(background);
    }

}
