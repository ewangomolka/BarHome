package com.example.BarHome;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="quantity")
    private String quantity;

    @JsonBackReference
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name="cocktails_ingredients",
            joinColumns = {@JoinColumn(
                    name= "ingredient_id",
                    nullable= false,
                    updatable= false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name= "cocktail_id",
                    nullable= false,
                    updatable= false
            )}
    )
    private List<Cocktail> cocktails;

    public Ingredient(String name, String quantity) {
        this.name = name;
        this.quantity = quantity;
        this.cocktails = new ArrayList<Cocktail>();
    }

    public Ingredient(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    public void setCocktails(List<Cocktail> cocktails) {
        this.cocktails = cocktails;
    }
}
