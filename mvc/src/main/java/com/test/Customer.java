package com.test;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull
    @Size(min=3, message="bu alan boş geçilemez")
    private String lastName;

    @NotNull(message="bos gecilemez")
    @Min(value=0,message="0dan buyuk deger gir")
    @Max(value=10, message = "10dan büyük girilemez")
    private Integer degerlendirme;


    @NotNull(message="bos gecilemez")
    @Pattern(regexp="^[a-zA-Z0-9]{5}", message="A-Z 5 deger giriniz")
    private String postaKodu;

    public Integer getDegerlendirme() {
        return degerlendirme;
    }

    public void setDegerlendirme(Integer degerlendirme) {
        this.degerlendirme = degerlendirme;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
