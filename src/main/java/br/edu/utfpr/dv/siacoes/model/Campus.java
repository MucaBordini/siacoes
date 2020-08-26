package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Campus implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private @Getter @Setter int idCampus;
	@ToString.Include
	private @Getter @Setter String name;
	private @Getter @Setter String address;
	private @Getter @Setter transient byte[] logo;
	private @Setter boolean active;
	private @Getter @Setter String site;
	private @Getter @Setter String initials;
	
	public boolean isActive() {
		return active;
	}
}
