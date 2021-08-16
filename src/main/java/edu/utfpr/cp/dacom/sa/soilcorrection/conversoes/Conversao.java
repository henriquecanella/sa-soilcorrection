package edu.utfpr.cp.dacom.sa.soilcorrection.conversoes;

public interface Conversao<T, R> {

    public R converte(T valor);
}
