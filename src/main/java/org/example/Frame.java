package org.example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel panelPrincipal;
    private JPanel panelSecundario;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame frame = new Frame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Frame() {
        ventanaFinal();
        ventanaPrevia();

        getContentPane().add(panelPrincipal);
        getContentPane().add(panelSecundario);

        panelPrincipal.setVisible(false);
        panelSecundario.setVisible(true);

    }

    public void ventanaPrevia() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 425, 388);
        panelSecundario = new JPanel();
        panelSecundario.setBorder(new EmptyBorder(5, 5, 5, 5));

        panelSecundario.setLayout(null);

        JLabel lblTitulo = new JLabel("Formulario Clientes");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTitulo.setBounds(0, 11, 409, 24);
        lblTitulo.setForeground(new Color(0, 0, 0));
        lblTitulo.setBackground(new Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelSecundario.add(lblTitulo);

        JButton btnNewButton_6 = new JButton("¡Hágase socio!");
        btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switchPane();
            }
        });
        btnNewButton_6.setBounds(104, 142, 199, 39);
        panelSecundario.add(btnNewButton_6);
    }

    public void ventanaFinal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 425, 388);
        panelPrincipal = new JPanel();
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));


        panelPrincipal.setLayout(null);

        JLabel lblTitulo = new JLabel("Formulario Clientes");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTitulo.setBounds(0, 11, 409, 24);
        lblTitulo.setForeground(new Color(0, 0, 0));
        lblTitulo.setBackground(new Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelPrincipal.add(lblTitulo);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(213, 86, 149, 22);
        panelPrincipal.add(textArea);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(213, 118, 149, 22);
        panelPrincipal.add(textArea_1);

        JTextArea textArea_2 = new JTextArea();
        textArea_2.setBounds(213, 151, 149, 22);
        panelPrincipal.add(textArea_2);

        JTextArea textArea_3 = new JTextArea();
        textArea_3.setBounds(213, 184, 149, 22);
        panelPrincipal.add(textArea_3);

        JTextArea textArea_4 = new JTextArea();
        textArea_4.setBounds(213, 217, 149, 22);
        panelPrincipal.add(textArea_4);

        JTextArea textArea_5 = new JTextArea();
        textArea_5.setBounds(213, 250, 149, 22);
        panelPrincipal.add(textArea_5);

        JLabel lblNewLabel = new JLabel("CLIENTE_ID");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(38, 89, 165, 14);
        panelPrincipal.add(lblNewLabel);

        JLabel lblNombre = new JLabel("NOMBRE");
        lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNombre.setBounds(38, 121, 165, 14);
        panelPrincipal.add(lblNombre);

        JLabel lblApellidos = new JLabel("APELLIDOS");
        lblApellidos.setHorizontalAlignment(SwingConstants.CENTER);
        lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblApellidos.setBounds(38, 156, 165, 14);
        panelPrincipal.add(lblApellidos);

        JLabel lblDireccion = new JLabel("DIRECCION");
        lblDireccion.setHorizontalAlignment(SwingConstants.CENTER);
        lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblDireccion.setBounds(38, 189, 165, 14);
        panelPrincipal.add(lblDireccion);

        JLabel lblEmail = new JLabel("EMAIL");
        lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblEmail.setBounds(38, 222, 165, 14);
        panelPrincipal.add(lblEmail);

        JLabel lblTelefono = new JLabel("TELEFONO");
        lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
        lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblTelefono.setBounds(38, 255, 165, 14);
        panelPrincipal.add(lblTelefono);

        JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\Correo.png"));
        btnNewButton.setBounds(30, 291, 47, 47);
        panelPrincipal.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\Anuncios.png"));
        btnNewButton_1.setBounds(87, 291, 47, 47);
        panelPrincipal.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\insta.png"));
        btnNewButton_2.setBounds(144, 291, 47, 47);
        panelPrincipal.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\yt.png"));
        btnNewButton_3.setBounds(201, 291, 47, 47);
        panelPrincipal.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("");
        btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\SITF.png"));
        btnNewButton_4.setBounds(258, 291, 47, 47);
        panelPrincipal.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("");
        btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\tito.png"));
        btnNewButton_5.setBounds(315, 291, 47, 47);
        panelPrincipal.add(btnNewButton_5);

    }

    public void switchPane() {

        getContentPane().remove(panelSecundario);
        getContentPane().add(panelPrincipal);

        panelPrincipal.setVisible(true);

        revalidate();
        repaint();
    }
}

