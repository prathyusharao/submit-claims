package com.submit.claims.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "ClaimsDB")
public class SubmitClaims {
	
	public SubmitClaims()
	{
		
	}


	public SubmitClaims(@NotBlank @Size(max = 100) String name, LocalDate dob, LocalDate dateofadmission,
			LocalDate dateofdischarge, String providername, String totalbillamount) {
		super();
		this.name = name;
		this.dob = dob;
		this.dateofadmission = dateofadmission;
		this.dateofdischarge = dateofdischarge;
		this.providername = providername;
		this.totalbillamount = totalbillamount;
	}
	@Override
	public String toString() {
		return "SubmitClaims [id=" + id + ", name=" + name + ", dob=" + dob + ", dateofadmission=" + dateofadmission
				+ ", dateofdischarge=" + dateofdischarge + ", providername=" + providername + ", totalbillamount="
				+ totalbillamount + "]";
	}
	@Id
	private String id;
	
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	private String name;
	private LocalDate dob;
	private LocalDate dateofadmission;
	private LocalDate dateofdischarge;
	private String providername;
	private String totalbillamount;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
public LocalDate getDateofadmission() {
		return dateofadmission;
}
	public void setDateofadmission(LocalDate dateofadmission) {
		this.dateofadmission = dateofadmission;
	}
	public LocalDate getDateofdischarge() {
		return dateofdischarge;
	}
	public void setDateofdischarge(LocalDate dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}
	public String getProvidername() {
		return providername;
	}
	public void setProvidername(String providername) {
		this.providername = providername;
	}
	public String getTotalbillamount() {
		return totalbillamount;
	}
	public void setTotalbillamount(String totalbillamount) {
		this.totalbillamount = totalbillamount;
	}
	
}
