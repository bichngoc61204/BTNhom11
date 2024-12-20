package com.example.btnhom;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
=======
>>>>>>> 275701364a8fe87c751ae6987c7f9969568f45dd
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
        Button button = findViewById(R.id.button_open);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tạo Intent để chuyển đến NewActivity
                Intent intent = new Intent(MainActivity.this, TaskActivity.class);
                startActivity(intent); // Mở NewActivity
            }
        });

        // Xử lý khi nhấn vào nút
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activity_ngoc.class);
            startActivity(intent);
        });
    }
}