package ntu.edu.vidu2intentsnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NhapLieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_lieu);

        Button btnManHinh2 = findViewById(R.id.btnMH2);
        btnManHinh2.setOnClickListener(BoLangNgheChuyenMH);

        Intent thuNhanDuoc = getIntent();
        String ten = thuNhanDuoc.getStringExtra("David");
        String tuoi = thuNhanDuoc.getStringExtra("Kelvin");

        TextView tvTen = findViewById(R.id.tvHoTen);
        TextView tvTuoi = findViewById(R.id.tvTuoi);
        tvTen.setText(ten);
        tvTuoi.setText("Tuổi:" +tuoi);

    }
    View.OnClickListener BoLangNgheChuyenMH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent thuKichHoatMH1 = new Intent(NhapLieuActivity.this ,MainActivity.class);

            startActivity(thuKichHoatMH1);
        }
    };


}