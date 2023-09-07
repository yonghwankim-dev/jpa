package com.hello.jpabook_ch6_relationship_mapping.many_to_many.oneway;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long id;

	private String name;
}
