/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan44.hukumohm;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : Ohm
 */
public class Baterai {
    private float kuatArus, hambatan;

    public Baterai(){
        System.out.println("===== Hukum Ohm =====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n"
                + "akan berbanding lurus dengan beda potensial\npada ujung-ujung "
                + "kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    
        System.out.println("Kuat Arus : " + kuatArus + " ampere");
        System.out.println("Hambatan : " + hambatan + " ohm");
        System.out.println("Hasil Tegangan : " + hitungTegangan() + " volt");
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public final float hitungTegangan(){
        return hambatan * kuatArus;
    }
}
