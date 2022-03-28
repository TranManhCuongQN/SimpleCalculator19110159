package com.android.s19110159;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CalculatorActivity";

    private Calculator mCalculator;

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;
    private  Button btnAdd , btnSub , btnMul , btnDiv , btnPow , btnLog , btnFact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the calculator class and all the views
        mCalculator = new Calculator();
        AnhXa();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mOperandOneEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ nhất",Toast.LENGTH_SHORT).show();
                }
                else if(mOperandTwoEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ hai",Toast.LENGTH_SHORT).show();
                }
                else{
                    double numberOne = Double.parseDouble(mOperandOneEditText.getText().toString());
                    double numberTwo = Double.parseDouble(mOperandTwoEditText.getText().toString());
                    double result = mCalculator.add(numberOne,numberTwo);
                    mResultTextView.setText(result+"");
                    Toast.makeText(MainActivity.this,"Result: "+result,Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOperandTwoEditText.setEnabled(true);
                if(mOperandOneEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ nhất",Toast.LENGTH_SHORT).show();
                }
                else if(mOperandTwoEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ hai",Toast.LENGTH_SHORT).show();
                }
                else{
                    double numberOne = Double.parseDouble(mOperandOneEditText.getText().toString());
                    double numberTwo = Double.parseDouble(mOperandTwoEditText.getText().toString());
                    double result = mCalculator.sub(numberOne,numberTwo);
                    mResultTextView.setText(result+"");
                    Toast.makeText(MainActivity.this,"Result: "+result,Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOperandTwoEditText.setEnabled(true);
                if(mOperandOneEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ nhất",Toast.LENGTH_SHORT).show();
                }
                else if(mOperandTwoEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ hai",Toast.LENGTH_SHORT).show();
                }
                else{
                    double numberOne = Double.parseDouble(mOperandOneEditText.getText().toString());
                    double numberTwo = Double.parseDouble(mOperandTwoEditText.getText().toString());
                    double result = mCalculator.mul(numberOne,numberTwo);
                    mResultTextView.setText(result+"");
                    Toast.makeText(MainActivity.this,"Result: "+result,Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOperandTwoEditText.setEnabled(true);
                if(mOperandOneEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ nhất",Toast.LENGTH_SHORT).show();
                }
                else if(mOperandTwoEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ hai",Toast.LENGTH_SHORT).show();
                }
                else{
                    double numberOne = Double.parseDouble(mOperandOneEditText.getText().toString());
                    double numberTwo = Double.parseDouble(mOperandTwoEditText.getText().toString());
                    double result = mCalculator.div(numberOne,numberTwo);
                    mResultTextView.setText(result+"");
                    Toast.makeText(MainActivity.this,"Result: "+result,Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOperandTwoEditText.setEnabled(true);
                if(mOperandOneEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ nhất",Toast.LENGTH_SHORT).show();
                }
                else if(mOperandTwoEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ hai",Toast.LENGTH_SHORT).show();
                }
                else{
                    double numberOne = Double.parseDouble(mOperandOneEditText.getText().toString());
                    double numberTwo = Double.parseDouble(mOperandTwoEditText.getText().toString());
                    double result = mCalculator.pow(numberOne,numberTwo);
                    mResultTextView.setText(result+"");
                    Toast.makeText(MainActivity.this,"Result: "+result,Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOperandTwoEditText.setEnabled(true);
                if(mOperandOneEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ nhất",Toast.LENGTH_SHORT).show();
                }
                else if(mOperandTwoEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ hai",Toast.LENGTH_SHORT).show();
                }
                else{
                    double numberOne = Double.parseDouble(mOperandOneEditText.getText().toString());
                    double numberTwo = Double.parseDouble(mOperandTwoEditText.getText().toString());
                    double result = mCalculator.log(numberOne,numberTwo);
                    mResultTextView.setText(result+"");
                    Toast.makeText(MainActivity.this,"Result: "+result,Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mOperandOneEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Mời bạn nhập số thứ nhất",Toast.LENGTH_SHORT).show();
                }
                else{
                    mOperandTwoEditText.setText("");
                    mOperandTwoEditText.setEnabled(false);
                    double numberOne = Double.parseDouble(mOperandOneEditText.getText().toString());
                    if(numberOne <= 0){
                        Toast.makeText(MainActivity.this,"Mời bạn nhập lại số thứ nhất (numberOne > 0 )",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        double result = mCalculator.fact(numberOne);
                        mResultTextView.setText(result + "");
                        Toast.makeText(MainActivity.this, "Result: " + result, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }
    private void AnhXa(){
        mResultTextView = findViewById(R.id.operation_result_text_view);
        mOperandOneEditText = findViewById(R.id.operand_one_edit_text);
        mOperandTwoEditText = findViewById(R.id.operand_two_edit_text);
        btnAdd = findViewById(R.id.operation_add_btn);
        btnSub = findViewById(R.id.operation_sub_btn);
        btnMul = findViewById(R.id.operation_mul_btn);
        btnDiv = findViewById(R.id.operation_div_btn);
        btnPow = findViewById(R.id.operation_pow_btn);
        btnLog = findViewById(R.id.operation_log_btn);
        btnFact = findViewById(R.id.operation_fact_btn);
    }
}