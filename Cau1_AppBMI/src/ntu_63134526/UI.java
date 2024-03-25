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
        
        // Tạo một nhóm cho các JRadioButton
        ButtonGroup group = new ButtonGroup();

        lblNewLabel_3 = new JLabel(""); // Khởi tạo lblNewLabel_3
        lblNewLabel_3.setBounds(258, 274, 197, 23);
        panel_1.add(lblNewLabel_3);
    }
}

