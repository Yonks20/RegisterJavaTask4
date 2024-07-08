package org.project.MovieTickets.model;

public class EmailData {
    private String Email;
    private String Password;

    /**
    buat atribut berisi email dan password didalam class EmailData unntuk memisahkan antara class nama, nohp
    Setelah itu buat getter dan setternya agar class lain dapat mengambil data dan menggunakan datanya

     **/


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
