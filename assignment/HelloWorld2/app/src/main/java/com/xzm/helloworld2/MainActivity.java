package com.xzm.helloworld2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        ImageView img = findViewById(R.id.imageView);
        Switch chos = findViewById(R.id.switch1);
        EditText num = findViewById(R.id.editText);
        TextView text = findViewById(R.id.textView2);
        List<Integer> res1 = new ArrayList<>();
        res1.add(0);
        res1.add(R.mipmap.a01);
        res1.add(R.mipmap.a02);
        res1.add(R.mipmap.a03);
        res1.add(R.mipmap.a04);
        res1.add(R.mipmap.a05);
        res1.add(R.mipmap.a06);
        res1.add(R.mipmap.a07);
        res1.add(R.mipmap.a08);
        res1.add(R.mipmap.a09);
        res1.add(0);
        res1.add(R.mipmap.a11);
        res1.add(R.mipmap.a12);
        res1.add(R.mipmap.a13);
        res1.add(R.mipmap.a14);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num.getText().toString().length() != 1){
                    text.setText("输入不合法");
                    return;
                }
                char input = num.getText().toString().charAt(0);
                if (input <= '0' || input >= '9' ){
                    text.setText("输入不合法");
                    return;
                }
                text.setText("你好呀");
                if (!chos.isChecked())
                    img.setImageResource(res1.get(input - '0'));
                else
                    if (input > '4'){
                        text.setText("给的钱太多了");
                    }
                    else img.setImageResource(res1.get(input - '0' + 10));
            }
        });

    }
}
