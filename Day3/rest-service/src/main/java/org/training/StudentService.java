package org.training;





import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path(value = "students")
public class StudentService {
	
  @GET
  public String findAllStudents() {
	  return "Ram,sam";
  }
  
  @GET
  @Path("/{id}")
  @Produces(value = MediaType.APPLICATION_JSON)
  public Response findByStudentId(@PathParam("id") int id) {
	  Student obj= new Student(101,"Ramesh",80);
	  if(id==2) {
		  obj= new Student(102,"amn",75);
	  }
	  return Response.ok().entity(obj).build();
  }
  @POST
  @Produces(value = MediaType.APPLICATION_JSON)
  @Consumes(value = MediaType.APPLICATION_JSON)
  public Response addStudent(Student obj) {
	  System.out.println(obj);
	  return Response.status(201).entity(obj).build();
  }
  
}
