package br.pucrs.nomeusuario.cambio.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.pucrs.nomeusuario.cambio.application.adapterdb.*;
import br.pucrs.nomeusuario.cambio.application.adapterrest.*;
import br.pucrs.nomeusuario.cambio.domain.*;

@Configuration
public class CurrencyExchangeConfig {
    @Bean
    public CambioUC createCambioUC(CambioService service,
                CambioDTOMapper mapper) {
        return new CambioUC(service,mapper);
    }

    @Bean
    public CambioService createCambioService(ICambioRepository repository) {
        return new CambioService(repository);
    }

    @Bean
    public CambioJPARepoImpl createRepo(ICambioJPARepository repository,
                                        CambioMapper mapper) {
        return new CambioJPARepoImpl(repository,mapper);
    }

}
