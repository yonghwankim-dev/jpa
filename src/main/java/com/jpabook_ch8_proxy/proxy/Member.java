package com.jpabook_ch8_proxy.proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
	@Id
	private String memberId;

	private String username;

	@ManyToOne
	@JoinColumn(name = "TEAM_ID")
	private Team team;

}
