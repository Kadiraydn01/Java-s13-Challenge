package com.workintech.Employee;

import com.workintech.Healthplan.Healthplan;

public class Employee {
    private int id;
    private  String fullName;
    private  String email;
    private  String password;
    private  String[] healthplans;

    public void addHealthplan(int index, String name){
       this.fullName = name;

    }
}
