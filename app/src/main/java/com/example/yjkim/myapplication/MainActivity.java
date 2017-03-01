package com.example.yjkim.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked1(View v) {
        Toast.makeText(getApplicationContext(), "Hello World! 버튼이 눌렸어요", Toast.LENGTH_SHORT).show();
    }

    public void buttonClicked2(View v) {
        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public void HiButton(View v){
        Intent intent = new Intent (getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }
}
