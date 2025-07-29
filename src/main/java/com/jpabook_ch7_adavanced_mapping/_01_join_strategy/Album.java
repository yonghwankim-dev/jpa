package com.jpabook_ch7_adavanced_mapping._01_join_strategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends Item {
	private String artist;
}
