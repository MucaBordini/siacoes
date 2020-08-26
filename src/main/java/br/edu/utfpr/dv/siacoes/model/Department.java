package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import lombok.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ToString(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private @Getter @Setter int idDepartment;
	private @Getter @Setter Campus campus;
	@ToString.Include
	private @Getter @Setter String name;
	private @Getter @Setter String fullName;
	private @Getter @Setter transient byte[] logo;
	private @Setter boolean active;
	private @Getter @Setter String site;
	private @Getter @Setter String initials;
	
	public boolean isActive() {
		return active;
	}
	
}
