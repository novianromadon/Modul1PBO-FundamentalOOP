package com.noviandwiromadon.modul1;

//Class Main / Demo class
public class Objek {
    public static void main(String[] args) {
        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Bagus");
        mahasiswaTanpa.setNim(18293040);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi objet dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Paimon", 19104011);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());

    }
}
