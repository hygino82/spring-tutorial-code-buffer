package com.dailycodebuffer.springboot.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")//serve apenas para tabela, postman não
	private Long departmentId;

	@Column(name = "name")
	private String departmentName;
	
	@Column(name = "address")
	private String departmentAddress;

	@Column(name = "code")
	private String departmentCode;
}
