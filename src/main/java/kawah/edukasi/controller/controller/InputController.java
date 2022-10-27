package kawah.edukasi.controller.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/input")
public class InputController {

  @GET
  public String queryParams(@QueryParam("user1") String usr1, @QueryParam("user2") String usr2){
    return usr1.toUpperCase() + " QUARKUS " + usr2.toUpperCase();
  }

// placeholder / wild card harys sama dengan @PathParam nya -
  @GET
  @Path("/{posCode}")
  public String pathParams(@PathParam("posCode") String posId, @QueryParam("city") String city){
    return "Your POS ID is: QUARKUS " + posId + " and my City is => " + city;
  }

  @GET
  @Path("/header")
  public String headerParams(@HeaderParam("nameCode") String nCode, @HeaderParam("address") String myAddres){
    return "Your QUARKUS Name is: " + nCode.toUpperCase() + " and my Address is => " + myAddres.toUpperCase();
  }

  @POST
  @Path("/getBody")
  @Consumes(MediaType.TEXT_PLAIN)
  public String bodyParams(String input){
    return "QUARKUS : " + input;
  }
}
