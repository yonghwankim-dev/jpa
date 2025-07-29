package com.jpabook_ch10_objected_query._01_objected_query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Getter
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "PRODUCT_ID")
	private Long id;

	private String name;

	private Long stockAmount;
}
