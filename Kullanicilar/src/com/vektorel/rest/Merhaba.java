package com.vektorel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/merhaba")
public class Merhaba {

	
	
	@GET
	@Path("/selamcak")
	@Produces(MediaType.TEXT_PLAIN)
	public String selamCak(){
		return "merhaba";
	}
	
	@GET
	@Path("/selamcak/{param1}/{param2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String toplama(@PathParam("param1") String veri1,@PathParam("param2") String veri2){
		int toplam = Integer.parseInt(veri1)+Integer.parseInt(veri2);
		return String.valueOf(toplam);
	}
	
	
	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public String person(){
		
		Person person = new Person(1, "mustafa");
		Gson gson = new Gson();
		String json = gson.toJson(person);
		return json;
	}
	
}