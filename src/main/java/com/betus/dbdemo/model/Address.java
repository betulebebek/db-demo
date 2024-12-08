package com.betus.dbdemo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @OneToOne(mappedBy = "address")
    private Employee employee;

    public Address() {
    }

    public Address(String streetName, String state, String city) {
        this.streetName = streetName;
        this.state = state;
        this.city = city;
    }

    @Override
    public String toString() {
        return

                        ", id=" + id +
                        ", streetName='" + streetName + '\'' +
                        ", state='" + state + '\'' +
                        ", city='" + city + '\'' +
                        '}';
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
