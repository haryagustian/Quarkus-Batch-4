package kawah.edukasi.controller.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("")
public class EndPointNameController {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/firstName")
  public String firstName(){
    return "Hary";
  }
  @GET
  @Path("/lastName")
  @Produces(MediaType.TEXT_PLAIN)
  public String lastName(){
    return "Hary";
  }
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/age")
  public Integer age(){
    return 25;
  }
}
