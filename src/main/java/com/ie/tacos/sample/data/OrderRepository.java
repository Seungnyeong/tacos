package com.ie.tacos.sample.data;

import com.ie.tacos.sample.domain.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    //Order save(Order order);
    List<Order> findByDeliveryZip(String deliveryZip);

}
