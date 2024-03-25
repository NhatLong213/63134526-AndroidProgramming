package ntu_63134526;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class UI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblNewLabel_3; // Thêm biến thành viên cho lblNewLabel_3

 

    public UI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 522, 717);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 128, 255));
        panel.setBounds(10, 0, 492, 66);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("BMI Calculator");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(176, 10, 184, 36);
        panel.add(lblNewLabel);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 224));
        panel_1.setBounds(10, 69, 492, 436);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Chiều cao(m)");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(43, 42, 95, 38);
        panel_1.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Cân nặng(kg)");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(43, 114, 95, 38);
        panel_1.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("BMI");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_1_2.setBounds(92, 264, 38, 38);
        panel_1.add(lblNewLabel_1_2);

        textField = new JTextField();
        textField.setBounds(170, 51, 157, 26);
        panel_1.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(173, 123, 154, 26);
        panel_1.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(173, 273, 75, 26);
        panel_1.add(textField_2);

        JLabel lblNewLabel_1_1_1 = new JLabel("Giới tính");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1_1.setBounds(73, 190, 55, 38);
        panel_1.add(lblNewLabel_1_1_1);

        JRadioButton rdbtnNam = new JRadioButton("Nam");
        rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnNam.setBounds(171, 196, 70, 26);
        panel_1.add(rdbtnNam);

        JRadioButton rdbtnNu = new JRadioButton("Nữ");
        rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnNu.setBounds(271, 196, 70, 26);
        panel_1.add(rdbtnNu);

        JRadioButton rdbtnKhac = new JRadioButton("Khác");
        rdbtnKhac.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnKhac.setBounds(364, 196, 70, 26);
        panel_1.add(rdbtnKhac);
        
        // Tạo một nhóm cho các JRadioButton
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnNam);
        group.add(rdbtnNu);
        group.add(rdbtnKhac);

        lblNewLabel_3 = new JLabel(""); // Khởi tạo lblNewLabel_3
        lblNewLabel_3.setBounds(258, 274, 197, 23);
        panel_1.add(lblNewLabel_3);
    }
}

