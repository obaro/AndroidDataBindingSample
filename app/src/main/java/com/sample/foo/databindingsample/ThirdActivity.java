package com.sample.foo.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sample.foo.databindingsample.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {

    public ObservableUser myOUser;
    private ActivityThirdBinding thirdBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myOUser = new ObservableUser("Android", "Authority", 22, "Corporate body");

        thirdBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_third);
        thirdBinding.setUser(myOUser);
        thirdBinding.setButtonHandler(new ThirdActivityHandler());
    }

    public void onUpdateClick(View view) {
        myOUser.setFirstname(thirdBinding.firstnameEditText.getText().toString());
        myOUser.setLastname(thirdBinding.lastnameEditText.getText().toString());
    }
}
