package com.nag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import com.nag.domain.TempDomain;

@Path("/temp")
public class TempCalcService {
	
	
	//@Path("/cent")
	@Path("/cent/{c}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public TempDomain getC(@PathParam("c") Double c)
	{
		TempDomain domain = new TempDomain();
		domain.setC(c);
		
		double f =  ((c * 9) / 5) + 32;
		
		domain.setF(f);
		
		
		return domain;
	}
	
	
	  @Path("/faren/{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") float f)  {

		JSONObject jsonObject = new JSONObject();
		float celsius;
		celsius =  (f - 32)*5/9; 
		jsonObject.put("F Value", f); 
		jsonObject.put("C Value", celsius);

		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
		
	  }
}
