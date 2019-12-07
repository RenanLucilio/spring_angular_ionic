package com.renan.cursomc.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ItemPedido implements Serializable {
    private Pedido pedido;
    private Produto item;
    private Double desconto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido(Pedido pedido, Produto item, Double desconto, Integer quantidade, Double preco) {
        this.pedido = pedido;
        this.item = item;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public ItemPedido() {
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Produto getItem() {
        return item;
    }

    public Double getDesconto() {
        return desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return Objects.equals(pedido, that.pedido) &&
                Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido, item);
    }
}
