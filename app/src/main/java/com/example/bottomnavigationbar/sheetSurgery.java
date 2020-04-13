package com.example.bottomnavigationbar;

public class sheetSurgery {
    private String date;
    private String nameDoctor;
    private String typeSurgery;

    public sheetSurgery(String date, String nameDoctor, String typeSurgery) {
        this.date = date;
        this.typeSurgery = typeSurgery;
        this.nameDoctor = nameDoctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTypeSurgery() {
        return typeSurgery;
    }

    public void setTdypeSurgery(String namePatient) {
        this.typeSurgery = namePatient;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }
}
