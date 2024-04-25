package ntu.edu.vidu2intentsdangnhap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


        // Tim đk
        Button btnDangNhap = (Button) findViewById(R.id.btnLogin);
        // Sự kiện
        btnDangNhap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(MainActivity.this ,LoginActivity.class);
                startActivity(iLogin);
            }
        });
    }
}