package com.di.hospital.controller;

import com.di.hospital.common.XmlUtilities;
import com.di.hospital.entity.HospitalEntity;
import com.di.hospital.entity.Hospitals;

public class HospitalController {
	
	public Hospitals getAllHospitals() {
		return buildHospitalList();
	}
	
	private Hospitals buildHospitalList() {
		Hospitals hospitals = new Hospitals();
		HospitalEntity he = new HospitalEntity();
		he.setName("Inova Fairfax Hospital");
		he.setAddress("3300 Gallows Road");
		he.setCity("Falls Church");
		he.setState("VA");
		he.setZip("22042");
		hospitals.getHospital().add(he);
		
		he = new HospitalEntity();
		he.setName("Inova Loudoun Hospital");
		he.setAddress("44045 Riverside Parkway");
		he.setCity("Leesburg");
		he.setState("VA");
		he.setZip("20176");
		hospitals.getHospital().add(he);
		
		he = new HospitalEntity();
		he.setName("Reston Hospital Center");
		he.setAddress("1850 Town Center Parkway");
		he.setCity("Reston");
		he.setState("VA");
		he.setZip("20190");
		hospitals.getHospital().add(he);
		
		return hospitals;
		
	}

}
