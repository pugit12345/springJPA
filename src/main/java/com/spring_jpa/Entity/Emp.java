package com.spring_jpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
    @Id
    private long Id;
    private String name;
    private String address;
    private String phone;
    private String emailAdd;

    public Emp()
    {

    }
    public Emp(long id, String name, String address, String phone, String emailAdd) {
        Id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.emailAdd = emailAdd;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", emailAdd='" + emailAdd + '\'' +
                '}';
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }
}
