package com.example.hongseongbo.ex1115_2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button)findViewById(R.id.exitbtn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder exitwindow = new AlertDialog.Builder(MainActivity.this);

                exitwindow.setCancelable(false);
                exitwindow.setTitle("종료창");
                exitwindow.setMessage("종료하시겠습니까?");

                exitwindow.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        finish();
                    }
                });

                exitwindow.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });

                AlertDialog exitDialog = exitwindow.create();
                exitDialog.show();
            }

        });

    }

    private String setting[] = {"망고", "사과", "토마토", "과자"};

    public void click (View v) {

        AlertDialog.Builder list = new AlertDialog.Builder(MainActivity.this);

        list.setTitle("연습리스트");

        list.setItems(setting, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),setting[i], Toast.LENGTH_SHORT).show();

            }
        });

        AlertDialog listDialog = list.create();
        listDialog.show();
    }


    public void exit2(View v){

        AlertDialog.Builder exit2btn = new AlertDialog.Builder(MainActivity.this);

        exit2btn.setTitle("두번째 종료버튼입니다");
        exit2btn.setMessage("두번째 버튼으로 종료하시겠습니까?");

        exit2btn.setPositiveButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        exit2btn.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog exitShow = exit2btn.create();
        exitShow.show();

    }





}
