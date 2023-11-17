package org.lessons.java.christmas;

public class Regalo {
	String name;
	String destinatario;
	
	public Regalo(String name, String destinatario) {
		setName(name);
		setDestinatario(destinatario);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
}
