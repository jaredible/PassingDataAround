package com.jaredible.passingdataaround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvReceivedData = findViewById(R.id.tvReceivedData);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("name");
            int age = bundle.getInt("age", 0);
            tvReceivedData.setText(name + " is " + age + " years old.");
        }
    }
}
