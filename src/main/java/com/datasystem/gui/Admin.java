package com.datasystem.gui;

import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.util.Objects;

public class Admin extends JFrame{

    String user;
    public static int userSession;

    private JLabel background;
    private JLabel text;
    private JButton userRegisterBtn;
    private JButton userManageBtn;
    private JButton creativeBtn;
    private JButton capturistViewBtn;
    private JButton technicianViewBtn;

    public Admin(String user) {
        this.user = user;
        userSession = 1;
        initComponents();
        setTitle("Panel de Administración - " + this.user);
        setVisible(true);
        setSize(650, 430);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setIconImage(new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/icon.png")
                )).getImage()
        );

        ImageIcon wallpaperImg = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/wallpaperPrincipal.jpg"))
        );
        Icon icon = new ImageIcon(wallpaperImg.getImage().getScaledInstance(
                background.getWidth(), background.getHeight(), Image.SCALE_DEFAULT
        ));
        background.setIcon(icon);

        ImageIcon userRegisterIcon = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/addUser.png")
                )
        );
        userRegisterBtn.setIcon(userRegisterIcon);

        ImageIcon userManageIcon = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/informationuser.png")
                )
        );
        userManageBtn.setIcon(userManageIcon);

        ImageIcon creativeIcon = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/creatividad.png")
                )
        );
        creativeBtn.setIcon(creativeIcon);

        ImageIcon capturistViewIcon = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/capturista.png")
                )
        );
        capturistViewBtn.setIcon(capturistViewIcon);

        ImageIcon technicianViewIcon = new ImageIcon(
                Objects.requireNonNull(getClass()
                        .getClassLoader()
                        .getResource("images/tecnico.png")
                )
        );
        technicianViewBtn.setIcon(technicianViewIcon);
    }

    private void initComponents() {
        setLayout(null);

        Font font = new Font("Arial", Font.BOLD, 18);

        text = new JLabel("Bienvenido " + user);
        text.setFont(font);
        text.setForeground(Color.white);
        text.setBounds(10, 10, 500, 30);
        add(text);

        userRegisterBtn = new JButton();
        userRegisterBtn.setBounds(40, 70, 120, 100);
        userRegisterBtn.setFocusPainted(false);
        add(userRegisterBtn);

        userManageBtn = new JButton();
        userManageBtn.setBounds(270, 70, 120, 100);
        userManageBtn.setFocusPainted(false);
        add(userManageBtn);

        creativeBtn = new JButton();
        creativeBtn.setBounds(500, 70, 120, 100);
        creativeBtn.setFocusPainted(false);
        add(creativeBtn);

        capturistViewBtn = new JButton();
        capturistViewBtn.setBounds(40, 240, 120, 100);
        capturistViewBtn.setFocusPainted(false);
        add(capturistViewBtn);

        technicianViewBtn = new JButton();
        technicianViewBtn.setBounds(270, 240, 120, 100);
        technicianViewBtn.setFocusPainted(false);
        add(technicianViewBtn);

        background = new JLabel();
        background.setSize(650, 430);
        add(background);
    }

}
