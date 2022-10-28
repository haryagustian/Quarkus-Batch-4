package kawah.edukasi.controller.service;


import kawah.edukasi.controller.model.PesertaModel;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import java.util.Optional;

@ApplicationScoped
public class PesertaService {

  @Transactional
  public Response post(
      String nama,
      String alamat,
      String surel,
      String nomor,
      String peran,
      Character kelas,
      Integer kelompok
  ){
    PesertaModel pesertaModel= new PesertaModel();
    pesertaModel.name = nama;
    pesertaModel.address = alamat;
    pesertaModel.email = surel;
    pesertaModel.phoneNumber = nomor;
    pesertaModel.role = peran;
    pesertaModel.className = kelas;
    pesertaModel.batch = kelompok;

//    PesertaModel.persist(pesertaModel);
    pesertaModel.persist();

    return Response.ok("id nya adalah : " + pesertaModel.id).build();
//    return ResponseEntity.ok(pesertaRepository.save(pesertaModel).id);
  }
  public Response letGetById(Long id){
    Optional<PesertaModel> optionalPesertaModel = PesertaModel.findByIdOptional(id);
    if(optionalPesertaModel.isEmpty()){
      return Response.status(Response.Status.BAD_REQUEST).entity("PESERTA NOT FOUND DUDE").build();
    }
    PesertaModel pesertaModel = optionalPesertaModel.get();
    return Response.ok(pesertaModel.toString()).build();
  }
}
