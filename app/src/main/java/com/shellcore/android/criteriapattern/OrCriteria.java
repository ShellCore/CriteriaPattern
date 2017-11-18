package com.shellcore.android.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shell on 18/11/2017.
 */

public class OrCriteria implements Filter {

    private Filter criteria1, criteria2;

    public OrCriteria(Filter criteria1, Filter criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> firstIngredients = criteria1.meetCriteria(ingredients);
        List<Ingredient> secondIngredients = criteria2.meetCriteria(ingredients);

        for (Ingredient i : firstIngredients) {
            if (!secondIngredients.contains(i)) {
                secondIngredients.add(i);
            }
        }

        return secondIngredients;
    }
}
