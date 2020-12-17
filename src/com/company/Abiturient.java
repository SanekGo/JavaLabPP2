package com.company;

class Abiturient {
    private int id;//id
    private String Name;
    private String Surname;
    private String middleName;
    private String FIO;
    private String Address;
    private String Number;
    private float middleMark;

    public Abiturient (int id, String FIO, String Address, String Number, float middleMark) {
        this.id = id;
        this.Address = Address;
        this.Number = Number;
        this.middleMark = middleMark;
        this.FIO = FIO;

        String[] newFIO = FIO.split (" ");

        Surname = newFIO[0];
        Name = newFIO[1];
        middleName = newFIO[2];

    }

    public String getName() {
        return Name;
    }

    public float getMiddleMark() {
        return middleMark;
    }

    public String toString() {
        return (String.valueOf(id) + "  " + FIO + "  " + Address + "  " + Number + "  " + String.valueOf(middleMark));
    }
}