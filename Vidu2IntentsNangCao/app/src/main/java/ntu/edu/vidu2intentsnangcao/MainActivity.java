package ntu.edu.vidu2intentsnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ChuyenSangMH2(View v){
        Intent thuKichHoatMH2;
        thuKichHoatMH2 = new Intent(MainActivity.this ,NhapLieuActivity.class);
        EditText edtTen = findViewById(R.id.edtHoVaTen);
        EditText edtTuoi = findViewById(R.id.edtTuoi1);

        String strTen = edtTen.getText().toString();
        String strTuoi = edtTuoi.getText().toString();

        thuKichHoatMH2.putExtra("David" ,strTen);
        thuKichHoatMH2.putExtra("Kelvin" ,strTuoi);

        startActivity(thuKichHoatMH2);

    }
}