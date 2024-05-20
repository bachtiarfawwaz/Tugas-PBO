/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author Lenovo
 */
public class Family {
    public static void main(String[] args) {
        Person bapakSuprih = new Parent("Suprihatin Zakini Ahmad", "Magelang", "10 Februari 1971", "Buruh", "Jawa Tengah, Magelang", "-", "Laki-laki");
        Person ibuSundari = new Parent("Sundari", "Magelang", "22 Maret", "Buruh", "Jawa Tengah, Magelang", "081225120810", "Perempuan");
        Person bachtiar = new Child("Ahmad Bachtiar Fawwaz", "Magelang", "24 September 2003", "Pelajar/Mahasiswa", "Magelang", "0895363230542", "Laki-laki");
        Person arka = new Child("Muhammad Zuhair Arkana", "Magelang", "18 November 2014", "Pelajar", "Magelang", "-", "Laki-laki");

        System.out.println("Keluarga ku:");
        System.out.println("------ Bapak ------");
        System.out.println(bapakSuprih.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibuSundari.getDetails());

        Person[] anak = new Person[]{bachtiar, arka};

        System.out.println("Mereka berdua memiliki 2 anak:");
        for (int i = 0; i < anak.length; i++) {
            if (anak[i] instanceof Child) {
                int anakKe = i + 1;
                String jenisKelamin = anak[i].gender.equals("Perempuan") ? "perempuan" : "laki-laki";
                System.out.println("Anak ke-" + anakKe + " yaitu anak " + jenisKelamin);
                System.out.println(anak[i].getDetails());

                if (i < anak.length - 1) {
                    System.out.println();
                }
            }
        }
    }
}

