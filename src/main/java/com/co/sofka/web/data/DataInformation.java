package com.co.sofka.web.data;

import com.github.javafaker.Faker;
import org.apache.hc.core5.http2.frame.StreamIdGenerator;

import java.security.SecureRandom;
import java.util.Locale;

public class DataInformation {
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new SecureRandom());

    private String firstName;
    private String last_name;
    private String zip;
    private String username;
    private String password;

    public void dataGenerator(){
        setFirstName(faker.name().firstName());
        setLast_name(faker.name().lastName());
        setZip(faker.address().zipCode());
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
