package com.example.connect.sql.conncetsql.controller;

import javax.persistence.*;

@Entity(name = "Address")
@Table(name = "user_address",catalog = "test" )
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "location_name")
    private String locationName;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "street_number")
    private String StreetNumber;
    @Column(name = "province")
    private String province;

    public Address(Long id, String locationName, String zipCode, String streetNumber, String province) {
        this.id = id;
        this.locationName = locationName;
        this.zipCode = zipCode;
        StreetNumber = streetNumber;
        this.province = province;
    }
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetNumber() {
        return StreetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        StreetNumber = streetNumber;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
