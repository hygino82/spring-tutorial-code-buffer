package com.dailycodebuffer.springboot.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

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
	// @Column(name = "id")//serve apenas para tabela, postman não
	private Long departmentId;

	// @Column(name = "name")
	@NotBlank(message = "Please add department name")
	private String departmentName;

	// @Column(name = "address")
	private String departmentAddress;

	// @Column(name = "code")
	private String departmentCode;
}
