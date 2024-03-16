package ntu.edu.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Tại đây ta khai thác các biến toàn cục
    // Ví dụ: các biến tham chiếu đến các điều khiển
    EditText edtThongTin;
    ListView lsvTen;
    // Biến lưu trữ danh sách tên
    ArrayList<String> dsTen;
    ArrayAdapter<String> bo_Nguon;
    void getControls(){
        edtThongTin = (EditText)findViewById(R.id.edThongTin);
        lsvTen = (ListView)findViewById(R.id.lvTen);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ta muốn, có ngay listview hiện dữ liệu khi màn hình đc tạo ra và hiện
        // lên, nên ta viết tại đây
        getControls();  // Lấy tham chiếu
        // Tạo nguồn dữ liệu, danh sách tên
        dsTen = new ArrayList<String>();  // Lệnh tạo mới danh sách
        // Ở đây, ta tạo cứng (Hardcode) một danh sách tên
        dsTen.add("Long");
        dsTen.add("Dũng");
        dsTen.add("Toàn");
        dsTen.add("Huy");
        // Tạo Adapter và gắn vào nguồn dữ liệu

        bo_Nguon = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1 , dsTen);
        // Cắm bộ nguồn vào ListView
        lsvTen.setAdapter(bo_Nguon);
        // Gắn các bộ lắng nghe sự kiện và xử lý đáp ứng sự kiện
        // khi user nhấn lên item
        lsvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l ) {
                edtThongTin.setText("Vị trí item:" + String.valueOf(i) + "Gia trị" + String.valueOf(l));
            }
        });

    }

    public void ThemPhanTu (View v){
        // Lấy dữ liệu từ điều khiển
        EditText edtTenMoi = (EditText)findViewById(R.id.edNhapTen);
        String tenNhap = edtTenMoi.getText().toString();
        // Thêm vào dsTen
        dsTen.add(tenNhap);
        // Yêu cầu adapter báo cho view (ListView biết) đã có thay đổi ở nguồn dữ liệu
        // cần phải cập nhật lại view
              // Ở quên, hôì nãy adapter khai báo nội bộ trong hàm OnCreate,
              // nên ở đây sao mà dùng được, --> cần chuyển ra khai báo ngoài hàm
        // ok, đã xử lý xong
        bo_Nguon.notifyDataSetChanged();
    }
}