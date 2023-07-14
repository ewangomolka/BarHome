package com.example.BarHome;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cocktails")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="image")
    private String image;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;


    @ManyToMany
    @JsonIgnoreProperties({"cocktail"})
    @JoinTable(
            name="cocktails_ingredients",
            joinColumns = {@JoinColumn(
                    name="cocktail_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name="ingredient_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<Ingredient> ingredients;

    @Column(name="method")
    private String method;

    @Column(name="saved")
    private boolean saved;

    public Cocktail(String image, String name, String type, String method, boolean saved) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.ingredients = new ArrayList<Ingredient>();
        this.method = method;
        this.saved = saved;
    }

    public Cocktail(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
