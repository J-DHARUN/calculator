package com.example.myapplication;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Defining the Views
    EditText Num1;
    EditText Num2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.editText1);
        Num2 = findViewById(R.id.editText2);
        Add = findViewById(R.id.Add);
        Sub = findViewById(R.id.Sub);
        Mul = findViewById(R.id.Mul);
        Div = findViewById(R.id.Div);
        Result = findViewById(R.id.textView);

        Add.setOnClickListener(this);
        Sub.setOnClickListener(this);
        Mul.setOnClickListener(this);
        Div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String oper = "";

        if (TextUtils.isEmpty(Num1.getText().toString()) || TextUtils.isEmpty(Num2.getText().toString())) {
            return;
        }


        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());

        int id = v.getId();


        if (id == R.id.Add) {
            oper = "+";
            result = num1 + num2;
        } else if (id == R.id.Sub) {
            oper = "-";
            result = num1 - num2;
        } else if (id == R.id.Mul) {
            oper = "*";
            result = num1 * num2;
        } else if (id == R.id.Div) {
            oper = "/";
            result = num1 / num2;
        }

        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:orientation="vertical"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:layout_margin="20dp">
    <LinearLayout
android:id="@+id/linearLayout1"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_margin="20dp">
        <EditText
android:id="@+id/editText1"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_weight="1"
android:inputType="numberDecimal"
android:textSize="20sp" />
        <EditText
android:id="@+id/editText2"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_weight="1"
android:inputType="numberDecimal"
android:textSize="20sp" />
    </LinearLayout>
    <LinearLayout
android:id="@+id/linearLayout2"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_margin="20dp">
        <Button
android:id="@+id/Add"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_weight="1"
android:text="+"
android:textSize="30sp"/>
        <Button
android:id="@+id/Sub"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_weight="1"
android:text="-"
android:textSize="30sp"/>
        <Button
android:id="@+id/Mul"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_weight="1"
android:text="*"
android:textSize="30sp"/>
        <Button
android:id="@+id/Div"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_weight="1"
android:text="/"
android:textSize="30sp"/>
    </LinearLayout>
    <TextView
android:id="@+id/textView"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_marginTop="50dp"
android:text="Answer is"
android:textSize="30sp"
android:gravity="center"/>
</LinearLayout>
