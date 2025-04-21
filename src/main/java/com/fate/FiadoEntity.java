package com.fate;

public class FiadoEntity {
    private Integer id;
    private String cliente;
    private Integer cantidad;

    public FiadoEntity(Integer id, String cliente, Integer cantidad) {
        this.id = id;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
