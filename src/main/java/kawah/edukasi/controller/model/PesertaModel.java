package kawah.edukasi.controller.model;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "t_peserta")
public class PesertaModel extends PanacheEntityBase {
  @Id
  @SequenceGenerator(name = "peserta_sequence", sequenceName = "peserta_sequence", initialValue = 1,allocationSize = 1)
  @GeneratedValue(generator = "peserta_sequence", strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  public Long id;

  @Column(name = "c_name", length = 20)
  public String name;

  @Column(name = "c_address", nullable = true, length = 40, unique = false)
  public  String address;

  @Column(name = "c_email", length = 30, nullable = false, unique = false)
  public String email;

  @Column(name = "c_phone_number", unique = false)
  public String phoneNumber;

  @Column(name = "c_role", unique = false)
  public String role;

  @Column(name = "c_class_name",length = 1, unique = false)
  public Character className;

  @Column(name = "c_batch", unique = false)
  public Integer batch;

  @Override
  public String toString() {
    return "PesertaModel{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", email='" + email + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", role='" + role + '\'' +
        ", className=" + className +
        ", batch=" + batch +
        '}';
  }
}