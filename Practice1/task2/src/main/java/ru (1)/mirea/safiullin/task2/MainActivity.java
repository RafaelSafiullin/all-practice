package ru.mirea.safiullin.task2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textViewOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewOut = findViewById(R.id.tv0ut);
        Button buttonOk = findViewById(R.id.ok);
        Button buttonCancel = findViewById(R.id.cancel);

        buttonOk.setOnClickListener(view -> textViewOut.setText("Нажата кнопка Ок"));

        buttonCancel.setOnClickListener(view -> textViewOut.setText("Нажата кнопка Отмена"));
    }
}