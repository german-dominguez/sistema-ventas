package com.tix.persona;

import java.sql.Date;

public class Persona {

	private String documento;
	private String apellido1;
	private String apellido2;
	private String nombre1;
	private String nombre2;
	private Date fechaNac;
	private String clave;
	private String mail;

	public static Builder builder() {
		return new Builder();
	}

	public String getDocumento() {
		return documento;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String getNombre1() {
		return nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public String getClave() {
		return clave;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return "Persona{" + "documento=" + documento + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", fechaNac=" + fechaNac + ", clave=" + clave
				+ ", mail=" + mail + '}';
	}

	public static class Builder {

		private Persona persona;

		public Builder() {
			this.persona = new Persona();
		}

		public Builder documento(String documento) {
			this.persona.documento = documento;
			return this;
		}

		public Builder apellido1(String apellido1) {
			this.persona.apellido1 = apellido1;
			return this;
		}

		public Builder apellido2(String apellido2) {
			this.persona.apellido2 = apellido2;
			return this;
		}

		public Builder nombre1(String nombre1) {
			this.persona.nombre1 = nombre1;
			return this;
		}

		public Builder nombre2(String nombre2) {
			this.persona.nombre2 = nombre2;
			return this;
		}

		public Builder fechaNac(Date fechaNac) {
			this.persona.fechaNac = fechaNac;
			return this;
		}

		public Builder clave(String clave) {
			this.persona.clave = clave;
			return this;
		}

		public Builder mail(String mail) {
			this.persona.mail = mail;
			return this;
		}

		public Persona build() {
			return this.persona;
		}
	}

}
