package com.fate;

public class FiadoEntity {
    private Integer id;
    private String cliente;
    private String categoria;
    private String producto;
    private String unidad;
    private Double cantidad;
    private Double precioventa;
    private Double total;
    private String estado;

    public FiadoEntity(Integer id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public FiadoEntity(Integer id, String cliente, String categoria, String producto, String unidad, Double cantidad, Double precioventa, Double total, String estado ) {
        this.id = id;
        this.cliente = cliente;
        this.categoria = categoria;
        this.producto = producto;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
        this.total = total;
        this.estado = estado;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getCliente() {return cliente;}
    public void setCliente(String cliente) {this.cliente = cliente;}

    public String getCategoria(){return categoria;}
    public void setCategoria(String categoria){this.categoria = categoria;}

    public String getProducto(){return producto;}
    public void setProducto(String producto){this.producto = producto;}

    public String getUnidad(){return unidad;}
    public void setUnidad(String unidad){this.unidad = unidad;}

    public Double getCantidad() {return cantidad;}
    public void setCantidad(Double cantidad) {this.cantidad = cantidad;}

    public Double getPrecioventa(){return precioventa;}
    public void setPrecioventa(Double precioventa){this.precioventa = precioventa;}

    public Double getTotal(){return total;}
    public void setTotal(Double total){this.total = total;}

    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado = estado;}
}
