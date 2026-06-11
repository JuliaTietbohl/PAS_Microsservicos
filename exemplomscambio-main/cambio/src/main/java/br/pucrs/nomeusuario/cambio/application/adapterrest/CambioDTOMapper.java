package br.pucrs.nomeusuario.cambio.application.adapterrest;

import org.springframework.stereotype.Component;
import br.pucrs.nomeusuario.cambio.domain.Cambio;

@Component
public class CambioDTOMapper {
    public Cambio toDomain(CambioDTO dtoObj) {
        return new Cambio(dtoObj.getId(), dtoObj.getFrom(),
                            dtoObj.getTo(), dtoObj.getConversionMultiple());
    }

    public CambioDTO toDTO(Cambio domainObj) {
        return new CambioDTO(domainObj.getId(), domainObj.getFrom(), 
                            domainObj.getTo(), domainObj.getConversionMultiple());
    }
}
