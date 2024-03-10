package ntu.edu.vd2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {
    // Khai báo các đối tượng gắn với điều khiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

    }
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);

    }

    //Xử lý cộng
    public void XuLyCong(View v){

      //Lấy dữ liệu từ 2 điều khiển trên
       String soThu1 = editTextSo1.getText().toString();
       String soThu2 = editTextSo2.getText().toString();
       //Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Tong = soA + soB;
        //Hiện kết quả

        //Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //Gắn kết quả
        editTextKQ.setText(chuoiKQ);
    }

    public void XuLyTru(View v){


        //Lấy dữ liệu từ 2 điều khiển trên
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Tong = soA - soB;
        //Hiện kết quả

        //Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //Gắn kết quả
        editTextKQ.setText(chuoiKQ);

    }

    public void XuLyNhan(View v){


        //Lấy dữ liệu từ 2 điều khiển trên
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Tong = soA * soB;
        //Hiện kết quả

        //Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //Gắn kết quả
        editTextKQ.setText(chuoiKQ);

    }

    public void XuLyChia(View v){


        //Lấy dữ liệu từ 2 điều khiển trên
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //Tính toán
        float Tong = soA / soB;
        //Hiện kết quả

        //Chuẩn bị dữ liệu xuất, biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //Gắn kết quả
        editTextKQ.setText(chuoiKQ);

    }
}