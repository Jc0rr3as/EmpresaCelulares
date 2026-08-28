public class celular {
    private String marca;
    private String modelo;
    private Double precio;
    private int cantidad;
    private double descuento;
    private int descuentoAplicado;

    public celular(String marca, String modelo, Double precio, int cantidad, Double descuento, int descuentoAplicado) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.descuentoAplicado = descuentoAplicado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(int descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
    }
}