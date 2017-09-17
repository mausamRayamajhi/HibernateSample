package com.mausam.DemoHib;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="alien_table")

@Cacheable			//for caching only for 2nd level
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)   //for caching only for 2nd level

public class Alien 
{
	@Id
	private int  aid;
	private AlienFullName aname;
	@Column(name="alen_color")
	private String color;
	
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alien(int aid, AlienFullName aname, String color,
			FatherMotherName fmName) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.color = color;
		
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienFullName getAname() {
		return aname;
	}
	public void setAname(AlienFullName aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color
				+ "]";
	}

	
	
}
