package org.launchcode.capstoneProject.models.data;

import org.launchcode.capstoneProject.models.Fav;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavRepository extends CrudRepository<Fav, Integer> {

}