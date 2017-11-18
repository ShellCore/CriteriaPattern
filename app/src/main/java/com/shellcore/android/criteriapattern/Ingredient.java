package com.shellcore.android.criteriapattern;

/**
 * Created by Shell on 18/11/2017.
 */

public class Ingredient {

    private String nombre;
    private String local;
    private boolean vegetarian;

    public Ingredient(String nombre, String local, boolean vegetarian) {
        this.nombre = nombre;
        this.local = local;
        this.vegetarian = vegetarian;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocal() {
        return local;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String toString() {
        return "Ingrediente: " + nombre
                + "(" + local + ")"
                + (isVegetarian() ? "V" : "NV");
    }
}
