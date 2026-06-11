package br.pucrs.nomeusuario.cambio.application.adapterdb;
import org.springframework.data.repository.CrudRepository;

public interface ICambioJPARepository extends CrudRepository<CambioEntity,Long> {
    CambioEntity findByFromAndTo(String from, String to);
}