package com.android.androiddatabindingsample;

import android.databinding.ObservableField;

import java.util.Observable;


public class User {
    public final ObservableField<String> firstname = new ObservableField<>();
    public String lastname;
    public final ObservableField<Integer> age = new ObservableField<>();
    public String gender;

    public User(String firstname, String lastname, int age, String gender){
        this.firstname.set(firstname);
        this.lastname = lastname;
        this.age.set(age);
        this.gender = gender;
    }
}
