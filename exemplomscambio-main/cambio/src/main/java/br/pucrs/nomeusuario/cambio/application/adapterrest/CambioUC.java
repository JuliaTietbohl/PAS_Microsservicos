package br.pucrs.nomeusuario.cambio.application.adapterrest;

import org.springframework.stereotype.Component;

import br.pucrs.nomeusuario.cambio.domain.*;

@Component
public class CambioUC {
    private CambioService service;
    private CambioDTOMapper mapper;

    public CambioUC(CambioService service,
                CambioDTOMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    public CambioDTO run(String from, String to) {
        Cambio domainObj = service.getFromTo(from,to);
        CambioDTO dtoObj = mapper.toDTO(domainObj); 
        return dtoObj;
    }

}
