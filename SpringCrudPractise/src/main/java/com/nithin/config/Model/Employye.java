package com.nithin.config.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
//ctrl+shift+O


@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity

public class Employye {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NonNull
	private String empname;
	@NonNull
	private Integer sal;
	
	

}

