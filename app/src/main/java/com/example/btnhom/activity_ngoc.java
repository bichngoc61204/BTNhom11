package com.example.btnhom;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.btnhom.R;
import androidx.appcompat.app.AppCompatActivity;

public class activity_ngoc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ngoc);

        Button button = findViewById(R.id.buttonClick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiển thị Toast
                Toast.makeText(activity_ngoc.this, "Chó là bạn", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
