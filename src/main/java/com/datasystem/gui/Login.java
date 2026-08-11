package com.datasystem.gui;

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

public class Login extends JFrame{

    private JLabel background;
    private JLabel logo;
    private JTextField userField;
    private JPasswordField pwdField;
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

        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(
                background.getWidth(), background.getHeight(), Image.SCALE_DEFAULT
        ));
        background.setIcon(icono);


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
        loginBtn.setHorizontalAlignment(JButton.CENTER);
        loginBtn.setFont(textFont);
        loginBtn.setBounds(150, 400, 100, 30);
        add(loginBtn);

        background = new JLabel();
        background.setSize(400, 550);
        add(background);

    }

    public static void main(String[] args) {
        new Login();
    }
}
