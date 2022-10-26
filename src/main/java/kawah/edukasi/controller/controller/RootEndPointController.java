package kawah.edukasi.controller.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/root/next")
@Produces(MediaType.TEXT_PLAIN)
public class RootEndPointController {

  @GET
  @Path("/peserta")
  public String peserta(){
    return "Quarkus : Peserta";
  }
  @GET
  @Path("/materi")
  public String materi(){
    return "Quarkus : Materi";
  }
  @GET
  @Path("/jadwal")
  public String jadwal(){
    return "Quarkus : Jadwal";
  }
}
