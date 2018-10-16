package com.abdelaziz.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_location")
public class Location {

	@Id
	@GeneratedValue
	@Column(name = "id_loc")
	private Long id;

	@Column(name = "loc_label")
	private String label;

	@Column(name = "loc_prix")
	private double prix;

	@Column(name = "loc_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dateLoc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Calendar getDateLoc() {
		return dateLoc;
	}

	public void setDateLoc(Calendar dateLoc) {
		this.dateLoc = dateLoc;
	}

}
