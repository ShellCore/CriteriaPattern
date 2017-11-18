package com.shellcore.android.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shell on 18/11/2017.
 */

public class VegetarianFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> vegetarians = new ArrayList<>();

        for (Ingredient i : ingredients) {
            if (i.isVegetarian()) {
                vegetarians.add(i);
            }
        }
        return vegetarians;
    }
}
