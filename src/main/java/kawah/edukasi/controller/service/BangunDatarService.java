package kawah.edukasi.controller.service;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class BangunDatarService {

  public Response luasPersegi(Integer sisi){
    if(sisi < 1){
      return  Response.status(Response.Status.FORBIDDEN).build();
    }
    return Response.ok(sisi * sisi).build();
  }

  public Response kelilingPersegi(Integer sisi){
    if(sisi < 1){
      return Response.status(Response.Status.BAD_REQUEST).build();
    }
    return Response.ok(sisi * 4).build();
  }
}
