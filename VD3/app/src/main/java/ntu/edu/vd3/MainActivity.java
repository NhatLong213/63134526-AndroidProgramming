package ntu.edu.vd3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tìm view
        TimView();
        btnCong.setOnClickListener(boLangNghe_XuLyCong);
        btnTru.setOnClickListener(boLangNghe_XuLyTru);
        btnNhan.setOnClickListener(boLangNghe_XuLyNhan);
        //btnChia.setOnClickListener(boLangNghe_XuLyChia);
        // Ví dụ bộ lắng nghe ẩn danh
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code xử lý cộng ở đây
                //1. Lấy số 1
                String strSo1 = edtSoA.getText().toString();
                String strSo2 = edtSoB.getText().toString();
                //b2. Chuyển thành số để tính toán
                double soA = Double.parseDouble(strSo1);
                double soB = Double.parseDouble(strSo2);
                //b3. Tính toán
                double tong = soA/soB;
                //b4. Xuất
                String strKQ = String.valueOf(tong);
                tvKetQua.setText(strKQ);
            }
        });
    }

    // Tạo các bộ lắng nghe để xử lý sự kiện
    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Code xử lý cộng ở đây
            //1. Lấy số 1
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b2. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //b3. Tính toán
            double tong = soA+soB;
            //b4. Xuất
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Code xử lý cộng ở đây
            //1. Lấy số 1
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b2. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //b3. Tính toán
            double tong = soA-soB;
            //b4. Xuất
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Code xử lý cộng ở đây
            //1. Lấy số 1
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b2. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //b3. Tính toán
            double tong = soA*soB;
            //b4. Xuất
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    void TimView(){
        edtSoA = (EditText) findViewById(R.id.edtSo1);
        edtSoB = (EditText) findViewById(R.id.edtSo2);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        tvKetQua = (TextView) findViewById(R.id.textViewKetQua);
    }
    //Khai báo các đối tượng tương ứng với các điều khiển (view) cần thao tác
    EditText edtSoA;
    EditText edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;
}