package kawah.edukasi.controller.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/http-verbs")
public class HttpVerbsController {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String get(){
    return "Quarkus Tested GET Request";
  }

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  public String post(){
    return "Quarkus Tested POST Request";
  }

  @PUT
  @Produces(MediaType.TEXT_PLAIN)
  public String put(){
    return "Quarkus Tested PUT Request";
  }

  @DELETE
  @Produces(MediaType.TEXT_PLAIN)
  public String del(){
    return "Quarkus Tested DELETE Request";
  }
}
