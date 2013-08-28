package com.di.hospital.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.di.hospital.controller.HospitalController;
import com.di.hospital.entity.Hospitals;

@Path("hospitals")
public class HospitalServices {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Hospitals getAllHospitals() {
		HospitalController hc = new HospitalController();
		return hc.getAllHospitals();
	}

}
