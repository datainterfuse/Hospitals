package com.di.hospital.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "hospitals")
public class Hospitals {
	private List<HospitalEntity> hospital = new ArrayList<HospitalEntity>();

	
	@XmlElement(name = "hospital", type = HospitalEntity.class)
	public List<HospitalEntity> getHospital() {
		return hospital;
	}

	public void setHospital(List<HospitalEntity> hospital) {
		this.hospital = hospital;
	}
	
	

}
