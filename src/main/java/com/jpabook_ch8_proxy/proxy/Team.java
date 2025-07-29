package com.jpabook_ch8_proxy.proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Team {
	@Id
	@Column(name = "TEAM_ID")
	private String teamId;

	private String name;
}
