package org.project.MovieTickets.model;

public class Register {

    private PersonalData personalData;
    private EmailData emailData;

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public EmailData getEmailData() {
        return emailData;
    }

    public void setEmailData(EmailData emailData) {
        this.emailData = emailData;
    }
}

/**
 * class utama bernama Register yang menampung class yang membantu yaitu Class EmailData dan Class PersonalData
 * Setelah itu get
 **/