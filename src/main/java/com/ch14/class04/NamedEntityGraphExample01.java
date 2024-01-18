package com.ch14.class04;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.hello.jpabook_practice.model.entity.DeliveryStatus;

@SpringBootApplication
public class NamedEntityGraphExample01 implements ApplicationRunner {

	@Autowired
	private OrderService orderService;

	@Autowired
	private MemberService memberService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Member member = Member.builder()
			.name("김용환")
			.address(Address.builder()
				.city("서울")
				.street("강남구")
				.zipcode("123456")
				.build())
			.build();
		member = memberService.save(member);

		Delivery delivery = Delivery.builder()
			.address(Address.builder()
				.city("서울")
				.street("강남구")
				.zipcode("123456")
				.build())
			.status(DeliveryStatus.READY)
			.build();

		Order order = Order.builder()
			.member(member)
			.delivery(delivery)
			.orderDate(LocalDateTime.now())
			.orderStatus(OrderStatus.ORDER)
			.build();
		member.getOrders().add(order);
		Order saveOrder = orderService.order(order);

		Order fineOrder = orderService.findOrderWithMember(saveOrder.getId());
		System.out.println(fineOrder);
	}

	public static void main(String[] args) {
		SpringApplication.run(NamedEntityGraphExample01.class);
	}
}
