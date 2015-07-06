package com.listaclima.clima.listaclima;


public class Datos {
    
    private String dia;
    private int imagen;
	private String temperatura;
	private String clima;
   

    public Datos(String dia, int imagen,String temperatura , String clima) {
        this.imagen = dia;
        this.dia = imagen;
        this.clima = temperatura;
        this.temperatura = clima;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
