package co.kr.ideacube.order.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

	Order findByItem(String item);

}
