package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class RegistrationActivity extends AppCompatActivity {
    TextInputEditText txtName, txtNumber;
    Students students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();
    }

    private void init() {
        students = new Students();
        txtName = findViewById(R.id.edit_name_txt);
        txtNumber = findViewById(R.id.edit_phone_number_txt);
    }

    public void onClickSaveItem(View view) {
        students.setFirstName(Objects.requireNonNull(txtName.getText()).toString());
        int phone = Integer.parseInt(Objects.requireNonNull(txtNumber.getText()).toString());
        students.setPhone(phone);

        close();
    }

    private void close() {
        Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
        intent.putExtra("students", students);
        Log.i("TAG", students.getFirstName() + " ");
        startActivityForResult(intent, 1);
        finish();
    }

}