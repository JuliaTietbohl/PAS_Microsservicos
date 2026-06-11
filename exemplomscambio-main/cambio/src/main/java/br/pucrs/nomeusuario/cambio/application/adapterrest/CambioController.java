package br.pucrs.nomeusuario.cambio.application.adapterrest;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class CambioController {
    private CambioUC cambioUC;
    private Environment environment;

    public CambioController(CambioUC cambioUC, Environment environment) {
        this.cambioUC = cambioUC;
        this.environment = environment;
    }

    @GetMapping("")
    public String welcomeMessage(){
        return "Welcome to the currency exchange";
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CambioDTO retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        CambioDTO currencyExchange = cambioUC.run(from, to);
        if (currencyExchange == null) {
            throw new ResourceNotFoundException("From " + from + "To " + to + " not found");
        }
        String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }

}
