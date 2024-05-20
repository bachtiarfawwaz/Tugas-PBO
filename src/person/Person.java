/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person;

public class Person {
    protected String name;
    protected String placeOfBirth;
    protected String dateOfBirth;
    protected String occupation;
    protected String address;
    protected String phoneNumber;
    protected String gender;

    public Person(String name, String placeOfBirth, String dateOfBirth, String occupation, String address, String phoneNumber, String gender) {
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getDetails() {
        return String.format("Nama: %s\nTempat Lahir: %s\nTanggal Lahir: %s\nPekerjaan: %s\nAlamat: %s\nNomor Telepon: %s\nJenis Kelamin: %s",
                             name, placeOfBirth, dateOfBirth, occupation, address, phoneNumber, gender);
    }
}

