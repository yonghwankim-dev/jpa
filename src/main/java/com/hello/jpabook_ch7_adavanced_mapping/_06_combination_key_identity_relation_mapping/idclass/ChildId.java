package com.hello.jpabook_ch7_adavanced_mapping._06_combination_key_identity_relation_mapping.idclass;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"parent", "childId"})
public class ChildId implements Serializable {
	private String parent; // Child.parent 매핑
	private String childId; // Child.childId 매핑
}
