package com.ie.tacos.sample.data;
import com.ie.tacos.sample.domain.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    //Taco save(Taco design);
}
