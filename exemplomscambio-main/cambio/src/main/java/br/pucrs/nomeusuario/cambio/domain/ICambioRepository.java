package br.pucrs.nomeusuario.cambio.domain;

public interface ICambioRepository {
    public Cambio getFromTo(String from, String to);
}
