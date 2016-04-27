package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Gallery {


    @Id
    @GeneratedValue
    private Integer id;

    public String Photo1;

    public String Photo2;

    public String Photo3;

    public String Photo4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto1() {
        return Photo1;
    }

    public void setPhoto1(String photo1) {
        Photo1 = photo1;
    }

    public String getPhoto2() {
        return Photo2;
    }

    public void setPhoto2(String photo2) {
        Photo2 = photo2;
    }

    public String getPhoto3() {
        return Photo3;
    }

    public void setPhoto3(String photo3) {
        Photo3 = photo3;
    }

    public String getPhoto4() {
        return Photo4;
    }

    public void setPhoto4(String photo4) {
        Photo4 = photo4;
    }
}
