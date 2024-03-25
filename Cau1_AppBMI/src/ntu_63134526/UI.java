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

        JButton btnTinh = new JButton("Tính ");
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy giá trị chiều cao và cân nặng từ các ô nhập liệu
                double chieuCao = Double.parseDouble(textField.getText());
                double canNang = Double.parseDouble(textField_1.getText());

                // Tính chỉ số BMI
                double bmi = canNang / (chieuCao * chieuCao);

                // Hiển thị kết quả trong textField_2
                textField_2.setText(String.format("%.2f", bmi));

                // Hiển thị thông báo về tình trạng cơ thể
                if (bmi < 18.5) {
                    lblNewLabel_3.setText("Gầy, cần bổ sung dinh dưỡng!");
                } else if (bmi >= 18.5 && bmi < 25) {
                    lblNewLabel_3.setText("Bình thường, sức khỏe tốt!");
                } else if (bmi >= 25 && bmi < 30) {
                    lblNewLabel_3.setText("Thừa cân, chế độ dinh dưỡng xấu!");
                } else {
                    lblNewLabel_3.setText("Béo phì, cần điều trị ngay!");
                }
            }
        });
        btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnTinh.setBounds(70, 369, 85, 26);
        panel_1.add(btnTinh);

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


        JButton btnXoa = new JButton("Xóa");
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  // Xóa giá trị trong các ô nhập liệu
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");

                // Đặt lại giá trị của label lblNewLabel_3
                lblNewLabel_3.setText("");
            }
        });
        btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnXoa.setBounds(205, 369, 85, 26);
        panel_1.add(btnXoa);

        JButton btnThoat = new JButton("Thoát");
        btnThoat.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 // Đóng chương trình
                System.exit(0);
        	}
        });
        btnThoat.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnThoat.setBounds(336, 369, 85, 26);
        panel_1.add(btnThoat);

        lblNewLabel_3 = new JLabel(""); // Khởi tạo lblNewLabel_3
        lblNewLabel_3.setBounds(258, 274, 197, 23);
        panel_1.add(lblNewLabel_3);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(250, 235, 215));
        panel_2.setBounds(10, 506, 492, 174);
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\bmi.jpeg"));
        lblNewLabel_2.setBounds(92, 0, 304, 168);
        panel_2.add(lblNewLabel_2);
    }
}

