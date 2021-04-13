package com.bayareala8s.ecommerce.entity;



import javax.persistence.*;

@Entity
@Table(name="state")

public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

}












