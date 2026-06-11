package br.pucrs.nomeusuario.cambio.application.adapterdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import br.pucrs.nomeusuario.cambio.domain.*;

@Repository
@Primary
public class CambioJPARepoImpl implements ICambioRepository {
    private ICambioJPARepository repository;
    private CambioMapper mapper;
    
    @Autowired
    public CambioJPARepoImpl(ICambioJPARepository repository,
                                        CambioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Cambio getFromTo(String from, String to) {
        CambioEntity entidade = repository.findByFromAndTo(from, to);
        Cambio domainObj = mapper.toDomain(entidade);
        return domainObj;
    }
   
}
