package org.example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameCalculadora extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private JPanel panelDeInicio;
    private JPanel panelCalculadora;
    private JTextField textField;

    public FrameCalculadora() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 425, 645);

        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        panelDeInicio = createInicioPanel();
        panelCalculadora = createCalculadoraPanel();

        cardPanel.add(panelDeInicio, "INICIO");
        cardPanel.add(panelCalculadora, "CALCULADORA");

        JButton btnNewButton_1 = new JButton("8");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1.setBounds(83, 37, 63, 63);
        panelCalculadora.add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("7");
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_1.setBounds(156, 37, 63, 63);
        panelCalculadora.add(btnNewButton_1_1);

        JButton btnNewButton_1_2 = new JButton("6");
        btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_2.setBounds(10, 116, 63, 63);
        panelCalculadora.add(btnNewButton_1_2);

        JButton btnNewButton_1_3 = new JButton("5");
        btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_3.setBounds(83, 116, 63, 63);
        panelCalculadora.add(btnNewButton_1_3);

        JButton btnNewButton_1_4 = new JButton("4");
        btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_4.setBounds(156, 116, 63, 63);
        panelCalculadora.add(btnNewButton_1_4);

        JButton btnNewButton_1_5 = new JButton("3");
        btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_5.setBounds(10, 190, 63, 63);
        panelCalculadora.add(btnNewButton_1_5);

        JButton btnNewButton_1_6 = new JButton("2");
        btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_6.setBounds(83, 190, 63, 63);
        panelCalculadora.add(btnNewButton_1_6);

        JButton btnNewButton_1_7 = new JButton("1");
        btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_7.setBounds(156, 190, 63, 63);
        panelCalculadora.add(btnNewButton_1_7);

        JButton btnNewButton_1_8 = new JButton("0");
        btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_8.setBounds(10, 264, 63, 63);
        panelCalculadora.add(btnNewButton_1_8);

        JButton btnNewButton_1_9 = new JButton(".");
        btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1_9.setBounds(83, 264, 63, 63);
        panelCalculadora.add(btnNewButton_1_9);

        JButton btnNewButton_2_1 = new JButton("-");
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2_1.setBounds(314, 117, 74, 33);
        panelCalculadora.add(btnNewButton_2_1);

        JButton btnNewButton_2_1_1 = new JButton("*");
        btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2_1_1.setBounds(314, 161, 74, 33);
        panelCalculadora.add(btnNewButton_2_1_1);

        JButton btnNewButton_2_1_2 = new JButton("\\");
        btnNewButton_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2_1_2.setBounds(314, 205, 74, 33);
        panelCalculadora.add(btnNewButton_2_1_2);

        JButton btnNewButton_2_1_3 = new JButton("C");
        btnNewButton_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2_1_3.setBounds(314, 249, 74, 33);
        panelCalculadora.add(btnNewButton_2_1_3);

        JButton btnNewButton_2_1_4 = new JButton("CE");
        btnNewButton_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2_1_4.setBounds(314, 293, 74, 33);
        panelCalculadora.add(btnNewButton_2_1_4);

        getContentPane().add(cardPanel);
        cardLayout.show(cardPanel, "INICIO");
    }

    private JPanel createInicioPanel() {
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("App Calculadora");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(110, 11, 196, 31);
        panel.add(lblNewLabel);

        JButton btnNewButton = new JButton("Abrir Calculadora");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(cardPanel, "CALCULADORA");
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\calculadora.png"));
        btnNewButton.setBounds(86, 53, 238, 238);
        panel.add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("Prueba haciendo clic");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(110, 324, 185, 14);
        panel.add(lblNewLabel_1);

        return panel;
    }

    private JPanel createCalculadoraPanel() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 425, 388);
        panelCalculadora = new JPanel();
        panelCalculadora.setVisible(false);
        panelCalculadora.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelCalculadora.setLayout(null);

        JButton btnNewButton_1 = new JButton("9");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1.setBounds(10, 37, 63, 63);
        panelCalculadora.add(btnNewButton_1);

        JButton btnNewButton_2_1 = new JButton("+");
        btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_2_1.setBounds(314, 73, 74, 33);
        panelCalculadora.add(btnNewButton_2_1);

        textField = new JTextField();
        textField.setBounds(262, 11, 126, 51);
        panelCalculadora.add(textField);
        textField.setColumns(10);

        return panelCalculadora;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrameCalculadora frame = new FrameCalculadora();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

