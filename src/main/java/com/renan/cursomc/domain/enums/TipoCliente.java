package com.renan.cursomc.domain.enums;

public enum TipoCliente {
    PESSOA_FISICA(1, "PESSOA FÍSICA"),
    PESSOA_JURIDICA(2, "PESSOA JURÍDICA");

    private int cod;
    private String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod) throws IllegalAccessException {
        if (cod == null)
            return null;

        for (TipoCliente x : TipoCliente.values())
            if (cod.equals(x.getCod()))
                return x;


        throw new IllegalAccessException("Id inválido: " + cod);
    }
}
