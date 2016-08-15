package com.sample.foo.databindingsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sample.foo.databindingsample.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    public User myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myUser = new User("Android", "Authority", 22, "Corporate body");

        final ActivitySecondBinding secondBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_second);
        secondBinding.setUser(myUser);

        secondBinding.updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUser.firstname.set(secondBinding.firstnameEditText.getText().toString());
                myUser.lastname = secondBinding.lastnameEditText.getText().toString();
            }
        });

        secondBinding.nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
