package org.example;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FrameEstilodeVida extends JFrame {

    private JPanel panelPrincipal;
    private CardLayout cardLayout;
    private JPanel panel0;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrameEstilodeVida frame = new FrameEstilodeVida();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FrameEstilodeVida() {
        setTitle("Vida Saludable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 391);
        panelPrincipal = new JPanel();
        panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panelPrincipal);

        cardLayout = new CardLayout();
        panelPrincipal.setLayout(cardLayout);

        panel0 = new JPanel();
        panelPrincipal.add(panel0, "panel0");

        panel1 = instanciarPanel1("panel1");
        panelPrincipal.add(panel1, "panel1");

        panel2 = instanciarPanel2("panel2");
        panelPrincipal.add(panel2, "panel2");

        panel3 = instanciarPanel3("panel3");
        panelPrincipal.add(panel3, "panel3");

        panel4 = instanciarPanel4("panel4");
        panelPrincipal.add(panel4, "panel4");
        panel0.setLayout(new GridLayout(0, 1, 0, 0));

        JButton btnNewButton_3 = new JButton("Iniciar sesión");
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel0.add(btnNewButton_3);

        btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel1");
            }
        });

        JButton btnNewButton_2 = new JButton("Gestionar perfil");
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel0.add(btnNewButton_2);

        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel2");
            }
        });

        JButton btnNewButton = new JButton("Dieta semanal");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel0.add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel3");
            }
        });

        JButton btnNewButton_1 = new JButton("Sobre nosotros");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel0.add(btnNewButton_1);

        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel4");
            }
        });
    }

    private JPanel instanciarPanel1(String panelName) {
        JPanel panel = new JPanel();

        JButton btnNewButton = new JButton("Volver");
        btnNewButton.setBounds(146, 298, 126, 33);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel0");
            }
        });
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Email");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(46, 106, 151, 27);
        panel.add(lblNewLabel_1);

        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(btnNewButton);

        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(46, 159, 151, 27);
        panel.add(lblNewLabel_1_1);

        JTextPane textPane = new JTextPane();
        textPane.setBounds(207, 106, 151, 20);
        panel.add(textPane);

        JTextPane textPane_1 = new JTextPane();
        textPane_1.setBounds(207, 159, 151, 20);
        panel.add(textPane_1);

        return panel;
    }

    private JPanel instanciarPanel2(String panelName) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Volver");
        btnNewButton.setBounds(146, 298, 124, 33);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel0");
            }
        });

        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(btnNewButton);

        table = new JTable();
        table.setBounds(162, 129, 1, 1);
        panel.add(table);

        // Crear una tabla con datos aleatorios
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Edad");
        model.addColumn("Peso");

        for (int i = 0; i < 5; i++) {
            model.addRow(new Object[]{
                    "nombre"+i,
                    "edad"+1,
                    "peso"+1
            });
        }

        table = new JTable(model);
        table.setBounds(38, 167, 350, 81);
        panel.add(table);

        JLabel lblNewLabel_2 = new JLabel("Ranking Saludables");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2.setBounds(74, 18, 263, 33);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Bienvenida Noelia");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 17));
        lblNewLabel_3.setBounds(114, 62, 180, 39);
        panel.add(lblNewLabel_3);

        JButton btnNewButton_4 = new JButton("Perfil");
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_4.setBounds(158, 112, 112, 36);
        panel.add(btnNewButton_4);


        return panel;
    }

    private JPanel instanciarPanel3(String panelName) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Volver");
        btnNewButton.setBounds(135, 298, 139, 33);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel0");
            }
        });

        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(btnNewButton);

        JButton btnNewButton_5 = new JButton("Menú Semana 1");
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_5.setBounds(96, 70, 230, 40);
        panel.add(btnNewButton_5);

        JButton btnNewButton_5_1 = new JButton("Menú Semana 2");
        btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_5_1.setBounds(96, 121, 230, 40);
        panel.add(btnNewButton_5_1);

        JButton btnNewButton_5_2 = new JButton("Menú Semana 3");
        btnNewButton_5_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_5_2.setBounds(96, 172, 230, 40);
        panel.add(btnNewButton_5_2);

        JButton btnNewButton_5_3 = new JButton("Menú Semana 4");
        btnNewButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_5_3.setBounds(96, 223, 230, 40);
        panel.add(btnNewButton_5_3);

        JLabel lblNewLabel_3 = new JLabel("Bienvenida Noelia");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 17));
        lblNewLabel_3.setBounds(118, 21, 180, 39);
        panel.add(lblNewLabel_3);

        return panel;
    }

    private JPanel instanciarPanel4(String panelName) {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Volver");
        btnNewButton.setBounds(147, 298, 128, 33);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                navigateToPanel("panel0");
            }
        });

        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(btnNewButton);

        JTextPane txtpnVidaSaludableEs = new JTextPane();
        txtpnVidaSaludableEs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        txtpnVidaSaludableEs.setText("Vida saludable es una app para hacer ver que una dieta saludable, con deporte moderado o intenso, unos buenos hábitos de descanso y tener marcada una rutina no va reñido con un estilo de vida despreocupado y feliz.  Nuestra meta es lograr que los usuarios disfruten del camino de sentirse sano y fuerte, como una forma de vida, en lugar del marcado objetivo de una operación bikini o una eventual pérdida de peso o ganancia muscular. ¡Forma parte de la familia Saludable!");
        txtpnVidaSaludableEs.setBounds(35, 26, 354, 215);
        panel.add(txtpnVidaSaludableEs);

        JButton btnNewButton_6 = new JButton("");
        btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\SITF.png"));
        btnNewButton_6.setBounds(342, 267, 47, 47);
        panel.add(btnNewButton_6);

        JButton btnNewButton_6_1 = new JButton("");
        btnNewButton_6_1.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\Correo.png"));
        btnNewButton_6_1.setBounds(285, 267, 47, 47);
        panel.add(btnNewButton_6_1);

        JButton btnNewButton_6_2 = new JButton("");
        btnNewButton_6_2.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\yt.png"));
        btnNewButton_6_2.setBounds(90, 267, 47, 47);
        panel.add(btnNewButton_6_2);

        JButton btnNewButton_6_3 = new JButton("");
        btnNewButton_6_3.setIcon(new ImageIcon("C:\\Users\\danir\\Pictures\\Iconos\\insta.png"));
        btnNewButton_6_3.setBounds(35, 267, 47, 47);
        panel.add(btnNewButton_6_3);

        return panel;
    }

    private void navigateToPanel(String panelName) {
        cardLayout.show(panelPrincipal, panelName);
    }
}
