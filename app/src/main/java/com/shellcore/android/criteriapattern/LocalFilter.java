package com.shellcore.android.criteriapattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Shell on 18/11/2017.
 */

public class LocalFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> locals = new ArrayList<>();

        for (Ingredient i : ingredients) {
            if (Objects.equals(i.getLocal(), "Producto Local"))
                locals.add(i);
        }

        return locals;
    }
}
