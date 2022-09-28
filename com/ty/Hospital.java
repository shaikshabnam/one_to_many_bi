package com.ty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String website;
	@OneToMany(mappedBy = "hospital")
	private List<Branch> list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<Branch> getList() {
		return list;
	}

	public void setList(List<Branch> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", website=" + website + ", list=" + list + "]";
	}

}
