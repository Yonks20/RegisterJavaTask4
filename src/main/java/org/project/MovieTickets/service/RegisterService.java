package org.project.MovieTickets.service;

import org.project.MovieTickets.model.Register;

public interface RegisterService {

    void process (Register register);

}

/**
 * Interface disini sebagai superclass dari class register sebelumnya
 * isinya yaitu method bernama process ()
 * interface ini berfunsgi untuk mengolah inputan nantinya
 * isi parameter dari methodnya yaitu Register
 * Register berisi inputan yang diterima dari user
 * **/