package vn.edu.hau.pizzaexpress.repository;

import org.springframework.data.repository.CrudRepository;
import vn.edu.hau.pizzaexpress.model.Categories;

public interface CategoryRepository extends CrudRepository<Categories, Integer> {
}
