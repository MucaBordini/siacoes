﻿package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import lombok.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ToString(onlyExplicitlyIncluded = true)
@Getter @Setter @NoArgsConstructor
public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private  int idDepartment;
	private Campus campus;
	@ToString.Include
	private String name;
	private String fullName;
	private transient byte[] logo;
	private boolean active;
	private String site;
	private String initials;
	
}
