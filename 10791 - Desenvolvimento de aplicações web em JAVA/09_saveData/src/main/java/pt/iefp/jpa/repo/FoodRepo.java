package pt.iefp.jpa.repo;


import pt.iefp.jpa.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Long> {

    // select * from Food where name = "name"
    public Food findByName(String name);

}
