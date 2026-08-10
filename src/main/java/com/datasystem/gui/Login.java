package com.datasystem.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JFrame{

    private JLabel background;

    public Login() {
        initComponents();
        setVisible(true);
        setSize(400, 550);
        setResizable(false);
        setTitle("Inicio de Sesión");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon(
                Objects.requireNonNull(getClass().
                        getClassLoader().getResource("images/wallpaperPrincipal.jpg"))
        );

        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(
                background.getWidth(), background.getHeight(), Image.SCALE_DEFAULT
        ));
        background.setIcon(icono);

    }

    private void initComponents() {
        background = new JLabel();
        background.setSize(400, 550);
        add(background);
    }

    public static void main(String[] args) {
        new Login();
    }
}
