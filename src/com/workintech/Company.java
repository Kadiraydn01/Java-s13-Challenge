package com.workintech;
import java.util.Arrays;

public class Company {
    private int id;
    private String name;

    private  double giro;

    private String[] developerNames;

    public Company(int id , String name ,double giro){
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = new String[3];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata: Geçersiz indeks. Lütfen geçerli bir indeks belirtin.");
        } else if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println(name + " isimli çalışan " + index + " indekse eklendi.");
        } else {
            System.out.println("Hata: Bu indeks zaten dolu. Başka bir indeks deneyin.");
        }
    }
    public String toString(){
        return "Name:"+ name + " Giro: "+ giro + " developers: " + Arrays.toString(developerNames);
    }
}
