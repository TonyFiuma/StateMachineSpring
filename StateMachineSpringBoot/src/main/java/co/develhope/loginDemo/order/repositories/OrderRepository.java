package co.develhope.loginDemo.order.repositories;

import co.develhope.loginDemo.order.entities.Order;
import co.develhope.loginDemo.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    List<Order> findByCreatedBy(User user);

    Object findByRestaurant(User user);

    Object findByRider(User user);
}
