package com.example.demo;

import javax.persistence.*;
//import javax.swing.plaf.nimbus.State;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String name;

    @NotNull
    private String capital;

    @NotNull
    private String currency;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "country")
    private Set<State> state = new HashSet<>();

    public Country() {

    }

    public Country(String name, String capital, String currency) {
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Set<State> getState() {
        return state;
    }

    public void setState(Set<State> state) {
        this.state = state;
    }
}
