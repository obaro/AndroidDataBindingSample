package com.sample.foo.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.sample.foo.databindingsample.BR;

/**
 * Created by Obaro on 15/08/2016.
 */
public class ObservableUser extends BaseObservable {

    private String firstname;
    private String lastname;
    private int age;
    private String gender;

    public ObservableUser(String firstname, String lastname, int age, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }
    
    @Bindable
    public String getFirstname() {
        return this.firstname;
    }

    @Bindable
    public String getLastname() {
        return this.lastname;
    }

    @Bindable
    public int getAge() {
        return this.age;
    }

    @Bindable
    public String getGender() {
        return this.gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
        notifyPropertyChanged(BR.firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        notifyPropertyChanged(BR.lastname);
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

}
