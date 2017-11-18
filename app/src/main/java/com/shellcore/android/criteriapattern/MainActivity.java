package com.shellcore.android.criteriapattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.txt_view);

        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Queso", "Producto Local", true));
        ingredients.add(new Ingredient("Tomate", "Valencia", true));
        ingredients.add(new Ingredient("Jamón", "México", false));
        ingredients.add(new Ingredient("Pavo", "Producto Local", false));
        ingredients.add(new Ingredient("Lechuga", "Producto Local", true));
        ingredients.add(new Ingredient("Chorizo", "Perú", false));

        Filter vegetarian = new VegetarianFilter();
        Filter local = new LocalFilter();
        Filter nonLocal = new NonLocalFilter();
        Filter localAndVegetarian = new AndCriteria(local, vegetarian);
        Filter localOrVegetarian = new OrCriteria(local, vegetarian);

        printIngredients(local.meetCriteria(ingredients), "Local");
        printIngredients(nonLocal.meetCriteria(ingredients), "No local");
        printIngredients(vegetarian.meetCriteria(ingredients), "Vegetariano");
        printIngredients(localAndVegetarian.meetCriteria(ingredients), "Local y Vegetariano");
        printIngredients(localOrVegetarian.meetCriteria(ingredients), "Local o Vegetariano");
    }

    public void printIngredients(List<Ingredient> ingredients, String header) {
        textView.append("\n" + header + "\n");

        for (Ingredient i : ingredients) {
            textView.append(i.toString());
            textView.append("\n");
        }
    }
}
