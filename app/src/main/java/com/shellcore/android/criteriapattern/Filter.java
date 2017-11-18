package com.shellcore.android.criteriapattern;

import java.util.List;

/**
 * Created by Shell on 18/11/2017.
 */

public interface Filter {

    List<Ingredient> meetCriteria(List<Ingredient> ingredients);
}
