package com.nag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nag.domain.ToDo;

@Path("/todo")
public class ToDoResource {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public ToDo getJSONTodo()
	{
		ToDo toDo = new ToDo();
		toDo.setSummary("JSON ToDO");
		toDo.setDescription("This is a ToDo JSON Descriptions");
		
		return toDo;
	}
	
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public ToDo getXMLTodo()
	{
		ToDo toDo = new ToDo();
		toDo.setSummary("XML ToDO");
		toDo.setDescription("This is a ToDo XML Descriptions");
		
		return toDo;
	}

}
