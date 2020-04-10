package Modelo;

import java.sql.Date;

public class reserva {

    private String idReserva;
    private String idhabitacion;
    private String idcliente;

    private String tipo_reserva;
    private String fecha_reserva;
    private String fecha_ingresa;
    private String fecha_salida;
    private String costo_alojamiento;
    private String estado;

    public reserva() {
    }

    public reserva(String idReserva, String idhabitacion, String idcliente, String tipo_reserva, String fecha_reserva, String fecha_ingresa, String fecha_salida, String costo_alojamiento, String estado) {
        this.idReserva = idReserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_ingresa = fecha_ingresa;
        this.fecha_salida = fecha_salida;
        this.costo_alojamiento = costo_alojamiento;
        this.estado = estado;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(String idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public String getFecha_ingresa() {
        return fecha_ingresa;
    }

    public void setFecha_ingresa(String fecha_ingresa) {
        this.fecha_ingresa = fecha_ingresa;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getCosto_alojamiento() {
        return costo_alojamiento;
    }

    public void setCosto_alojamiento(String costo_alojamiento) {
        this.costo_alojamiento = costo_alojamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
