package ru.mirea.safiullin.multiactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonGoToSecondActivity = findViewById(R.id.button);
        buttonGoToSecondActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SecondActivity.class)
                    .putExtra("key", "MIREA-Сафиуллин Рафаел Рафаелович"));
        });
    }
}