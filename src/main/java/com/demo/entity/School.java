package com.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(uniqueConstraints = {@UniqueConstraint(name = "unq_school_name", columnNames = "name")})
public class School {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String logoUrl;

    private String phone;

    private String fax;

    private String www;

    private String address;

    private Boolean isPublic;

    private String description;

    private String promo;


    @ManyToOne
    private SchoolType schoolType;

    @ManyToOne
    public City city;

    @OneToOne
    public Gallery gallery;

    @OneToMany(mappedBy = "school")
    private List<Department> departments;

    public School() {
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getFax() {
        return fax;
    }

    public String getPhone() {
        return phone;
    }

    public String getWww() {
        return www;
    }

    public String getPromo() {
        return promo;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }
}