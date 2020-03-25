package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;
    CharSequence t1="You just click OK button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final TextInputEditText no1=(TextInputEditText)findViewById(R.id.textInputLayout);
        final TextInputEditText no2=(TextInputEditText)findViewById(R.id.textInputLayout2);


        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1=no1.getText().toString();
                String n2=no2.getText().toString();


                displayToast();
                openSecondActivity();



            }
        });
    }
    public void openSecondActivity(){
        final TextInputEditText no1=(TextInputEditText)findViewById(R.id.textInputLayout);
        final TextInputEditText no2=(TextInputEditText)findViewById(R.id.textInputLayout2);

        String num1=no1.getText().toString();
        String num2=no2.getText().toString();

        Intent intent =new Intent(FirstActivity.this, SecondActivity.class);

        intent.putExtra("num1",no1.getText().toString());

        startActivity(intent);

    }


    private void displayToast() {

        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 70);
        toast.setView(layout);
        toast.show();
    }

    private void validate(){
        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

    }
}
