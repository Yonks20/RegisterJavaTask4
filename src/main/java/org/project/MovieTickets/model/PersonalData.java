package org.project.MovieTickets.model;

public class PersonalData {
    private String name;
    private String phoneNumber;
    private String placeAndDateOfBirth;


    //Buat atribut untuk menyimpan nama,no telepon, dan tempat tanggal lahir

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlaceAndDateOfBirth() {
        return placeAndDateOfBirth;
    }

    public void setPlaceAndDateOfBirth(String placeAndDateOfBirth) {
        this.placeAndDateOfBirth = placeAndDateOfBirth;
    }
}
