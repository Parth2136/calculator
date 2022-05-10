package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b00,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,point,equal,multi,plus,sub,div,per,DELETE,AC;
    TextView txt;
    int f_num;
    int s_num;
    char op='+';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b00=findViewById(R.id.b00);
        plus=findViewById(R.id.plus);
        sub=findViewById(R.id.sub);
        div=findViewById(R.id.div);
        multi=findViewById(R.id.multi);
        point=findViewById(R.id.point);
        equal=findViewById(R.id.equal);
        per=findViewById(R.id.per);
        DELETE=findViewById(R.id.DELETE);
        AC=findViewById(R.id.AC);
        txt=findViewById(R.id.txt);

        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"00");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText().toString()+"9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='+';
                f_num = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='-';
                f_num = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='/';
                f_num = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='*';
                f_num = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='.';
                f_num = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='%';
                f_num = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        DELETE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op='X';
                f_num = Integer.parseInt(txt.getText().toString());
                txt.setText("");
            }
        });
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f_num = Integer.parseInt(txt.getText().toString());
                f_num=0;
                s_num=0;
                txt.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s_num = Integer.parseInt(txt.getText().toString());
                if(op=='+'){
                    txt.setText(""+(f_num+s_num));
                } if(op=='-'){
                    txt.setText(""+(f_num-s_num));
                } if(op=='*'){
                    txt.setText(""+(f_num*s_num));
                } if(op=='/'){
                    txt.setText(""+(f_num/s_num));
                } if(op=='%'){
                    txt.setText(""+(f_num*s_num)/100);
                }
            }
        });
    }
}