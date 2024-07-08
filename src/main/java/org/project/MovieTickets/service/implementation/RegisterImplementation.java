package org.project.MovieTickets.service.implementation;

import org.project.MovieTickets.model.EmailData;
import org.project.MovieTickets.model.PersonalData;
import org.project.MovieTickets.model.Register;
import org.project.MovieTickets.service.RegisterService;

public class RegisterImplementation implements RegisterService {

    @Override
    public void process(Register register) {
        //validasi setiap field apakah kosong atau tidak
        boolean isValidatePhoneNumber = isValidatePhoneNumber(register.getPersonalData());
        boolean isValidateName = isValidateName(register.getPersonalData());
        boolean isValidatePlaceAndDateofBirth = isValidatePlaceAndDateOfBirth(register.getPersonalData());
        boolean isValidateEmail = isValidateEmail(register.getEmailData());
        boolean isValidatePassword = isValidatePassword(register.getEmailData());

        if (!isValidatePhoneNumber) {
            System.out.println("Registrasi gagal, isi nomor telepon terlebih dahulu");
        } else if(!isValidateName || !isValidatePlaceAndDateofBirth || !isValidateEmail || !isValidatePassword){
            System.out.println("Registrasi gagal, terdapat field yang kosong, cek kambali field yang kosong");
        }
        else {
            System.out.println("Registrasi Berhasil");
        }
    }

    private boolean isValidatePhoneNumber(PersonalData personalData) {
        return !personalData.getPhoneNumber().isEmpty();
    }

    private boolean isValidateName(PersonalData personalData) {
        return !personalData.getName().isEmpty();
    }

    private boolean isValidatePlaceAndDateOfBirth(PersonalData personalData) {
        return !personalData.getPlaceAndDateOfBirth().isEmpty();
    }

    private boolean isValidateEmail(EmailData emailData) {
        return !emailData.getEmail().isEmpty();
    }

    private boolean isValidatePassword(EmailData emailData) {
        return !emailData.getPassword().isEmpty();
    }
}

/**
 * Class RegisterImplementation ini merupakan turunan dari interface RegisterService
 * Gunakan kata kunci implements untuk memanggil interface RegisterService yang artinya class RegisterImplementation akan mewarisi RegisterService
 * Lalu gunakan method override yang dinama digunakan untuk mewariskan method yang dimiliki dari kelas induk
 * Berikan logic untuk memvalidasi apakah no telfon sudah diisi atau belum dengan if else
 * buat method untuk logic dengan
 * private boolean isValidatePhoneNumber(PersonalData personaldata) parameter ini berisi inputan inputan dari depan dan akan mengembalikan data sekaligus mengecek apakah empty/kosong
 * Lalu buat validasi untuk phoneNumber dan lainnya dengan mengambil data dari model pada class register yang akan mengecek apakah data terisi atu tidak
 * Setelah itu buat logic if else dengan !isValidatePhoneNumber dengan arti jika phoneNumber tidak terisi atau kosong maka beri keterangan/notifikasi "Registrasi gagal, isi nomor telepon terlebih dahulu"
 * Lalu else if nya digunakan untuk lainnya yaitu validasi nama, tempat tanggal lahir, email dan juga password
 * Jika inputan terisi semua maka cetak "Registrasi Berhasil"
 * **/