package com.example.connect.sql.conncetsql.controller;

import com.mysql.cj.xdevapi.AddResult;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
@Table(name = "user_table",catalog = "test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "job_type")
    private String jobType;
    @Column(name = "resident")
    private String resident;
   @OneToOne
   @JoinColumn(name = "id", referencedColumnName = "id")
    private Address address;

    public User() {

    }

    public User(int id, String name, String fatherName, String jobType, String resident) {
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
        this.jobType = jobType;
        this.resident = resident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
