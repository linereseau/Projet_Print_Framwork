package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DemandeConge {
	
		Collaborateur collaborateur;
		Periode periode;
		
		public Collaborateur getCollaborateur() {
		      return collaborateur;
		   }

		   public void setCollaborateur(Collaborateur collaborateur) {
		      this.collaborateur = collaborateur;
		   }

		   public Periode getPeriode() {
		      return periode;
		   }

		   public void setPeriode(Periode periode) {
		      this.periode = periode;
		   }
		
		@Override
		   public String toString() {
			return new ToStringBuilder(this).
				       append("collaborateur", collaborateur).
				       append("periode", periode).
				       toString();
		   }

}
