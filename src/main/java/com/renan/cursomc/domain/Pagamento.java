package com.renan.cursomc.domain;

import com.renan.cursomc.domain.enums.EstadoPagamento;

import java.io.Serializable;
import java.util.Objects;

public class Pagamento implements Serializable {
    private Integer id;
    private EstadoPagamento estado;
    private PagamentoComBoleto pagamentoComBoleto;
    private PagamentoComCartao pagamentoComCartao;

    public Pagamento(EstadoPagamento estado, PagamentoComBoleto pagamentoComBoleto, PagamentoComCartao pagamentoComCartao) {
        this.estado = estado;
        this.pagamentoComBoleto = pagamentoComBoleto;
        this.pagamentoComCartao = pagamentoComCartao;
    }

    public Pagamento() {
    }

    public Integer getId() {
        return id;
    }

    public EstadoPagamento getEstado() {
        return estado;
    }

    public void setEstado(EstadoPagamento estado) {
        this.estado = estado;
    }

    public PagamentoComBoleto getPagamentoComBoleto() {
        return pagamentoComBoleto;
    }

    public void setPagamentoComBoleto(PagamentoComBoleto pagamentoComBoleto) {
        this.pagamentoComBoleto = pagamentoComBoleto;
    }

    public PagamentoComCartao getPagamentoComCartao() {
        return pagamentoComCartao;
    }

    public void setPagamentoComCartao(PagamentoComCartao pagamentoComCartao) {
        this.pagamentoComCartao = pagamentoComCartao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(id, pagamento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
