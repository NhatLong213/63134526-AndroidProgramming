package ntu.mssv_63134526;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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
    }
    public void onFacebookIconClicked(View view) {
        // Mở liên kết đến trang Facebook cá nhân của bạn
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nhatlong2103/"));
        startActivity(intent);
    }

    public void onFacebookIconClicked(View view) {
        // Mở liên kết đến trang Facebook cá nhân của bạn
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nhatlong2103/"));
        startActivity(intent);
    }
       
    public void onZaloIconClicked(View view) {
        // Mở liên kết đến trang Zalo cá nhân của bạn
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://zalo.me/0794913604"));
        startActivity(intent);
    }

        public void onInstagramIconClicked(View view) {
        // Mở liên kết đến trang Instagram cá nhân của bạn
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/long_nguyen213/"));
        startActivity(intent);
    }

}