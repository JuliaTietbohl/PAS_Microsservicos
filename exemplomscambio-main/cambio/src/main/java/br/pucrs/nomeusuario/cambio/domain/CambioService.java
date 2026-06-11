package br.pucrs.nomeusuario.cambio.domain;

public class CambioService {
    private ICambioRepository repository;

    public CambioService(ICambioRepository repository) {
        this.repository = repository;
    }

    public Cambio getFromTo(String from, String to) {
        Cambio cambio = repository.getFromTo(from, to);
        return cambio;
    }
}
