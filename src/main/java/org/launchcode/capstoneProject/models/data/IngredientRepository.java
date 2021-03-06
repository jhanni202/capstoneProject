package org.launchcode.capstoneProject.models.data;

import org.launchcode.capstoneProject.models.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}
