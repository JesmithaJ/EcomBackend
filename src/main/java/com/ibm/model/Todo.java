package com.ibm.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

	@Id
	@GeneratedValue
	private int id;
	
	@Size(min = 5, max = 100, message = "Description must be b/w 5-100")
	private String productName;
	
	private String productImg;
	
	@NotBlank (message = "User name can't be empty!")
	@NotNull (message = "User name can't be null!")
	private String productPrice;
	
	private String productDesc;
}



