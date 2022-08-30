package com.example.bmi_244;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numnang;
    Float numcao;
    Float numkq;
    String str;
    boolean kt=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttinh = (Button) findViewById(R.id.bttinh);
        EditText cao = (EditText) findViewById(R.id.ccaotext);
        EditText nang = (EditText) findViewById(R.id.cnangtext);
        TextView kq= (TextView) findViewById(R.id.textView);
        TextView kqc= (TextView) findViewById(R.id.textView1);
        bttinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numnang = Integer.parseInt(nang.getText().toString());
                numcao = Float.parseFloat(cao.getText().toString());
                if (numcao==0){
                    kq.setText("Nhập đúng định dạng".toString());
                }else{
                    str=String.valueOf(numnang*1.0/(numcao*numcao));
                    kq.setText(str);
                    numkq=Float.parseFloat(kq.getText().toString());
                    String loai;
                    if ( numkq <18 ) loai="Người gầy";
                    else if (numkq < 25) loai = "Người bình thường";
                    else if (numkq <30) loai = "Người béo phì độ I";
                    else if (numkq <35) loai ="Người béo phì độ II";
                    else loai= "Người béo phì độ III";
                    kqc.setText(loai);
                }}
        }
        );
    }
}