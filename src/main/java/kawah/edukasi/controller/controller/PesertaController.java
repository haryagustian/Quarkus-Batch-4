package kawah.edukasi.controller.controller;

import kawah.edukasi.controller.service.PesertaService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/peserta")
@Produces(MediaType.TEXT_PLAIN)
public class PesertaController {
  @Inject
  PesertaService pesertaService;
  @POST
  public Response post(
      @QueryParam("name") String name,
      @QueryParam("address") String address,
      @QueryParam("email") String email,
      @QueryParam("phone") String phoneNumber,
      @QueryParam("role") String role,
      @QueryParam("class") Character className,
      @QueryParam("batch") Integer batch){
    return pesertaService.post(name,address,email,phoneNumber,role,className,batch);
  }

  @GET
  @Path("/{id}")
  public Response letGetById(@PathParam("id") Long id){
    return pesertaService.letGetById(id);
  }
}