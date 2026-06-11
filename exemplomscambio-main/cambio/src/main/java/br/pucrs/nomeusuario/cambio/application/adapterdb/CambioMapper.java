package br.pucrs.nomeusuario.cambio.application.adapterdb;

import org.springframework.stereotype.Component;

import br.pucrs.nomeusuario.cambio.domain.Cambio;

@Component
public class CambioMapper {

    public Cambio toDomain(CambioEntity entituObj) {
        return new Cambio(entituObj.getId(), entituObj.getFrom(),
                            entituObj.getTo(), entituObj.getConversionMultiple());
    }

    public CambioEntity toEntity(Cambio domainObj) {
        return new CambioEntity(domainObj.getId(), domainObj.getFrom(), 
                            domainObj.getTo(), domainObj.getConversionMultiple());
    }


}
