package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class User7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user7);


//マッチングする
        Button btn1 = findViewById(R.id.ButtonToUser9);
        btn1.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn1.getContext(), User9.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY8", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });
//マッチングしない
        Button btn2 = findViewById(R.id.ButtonToUser8);
        btn2.setOnClickListener(v -> {
            // Intent を生成
            // 第一引数はこの処理のContext
            // 第二引数に遷移先画面のSampleActivityを指定
            Intent newIntent = new Intent(btn2.getContext(), User8_GoogleMap.class);

            // Intent にデータを保存
            newIntent.putExtra("KEY9", "value");

            // 新規画面表示実行
            startActivity(newIntent);

        });

    }
}