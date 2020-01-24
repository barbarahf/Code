package com.company;
class Celular {
    //atributos de la clase
    private String marca;
    private String modelo;
    private String color;


    // constructor con parámetros
    public Celular(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //constructor vacio
    public Celular(){

    }

    // método hacer llamada
    public void llamar(String nombre){
        System.out.println("LLamando a "+nombre);
    }

    //método finalizar llamada
    public void cortarLlamada(){
        System.out.println("Llamada finalizada");
    }

    //método para informar de la caracteristicas del celular
    public void informarCaracteristicas(){
        System.out.println(String.format("Celular Marca: %s", marca));
        System.out.println(String.format("Celular  Modelo: %s", modelo));
        System.out.println(String.format("Celular Color: %s", color));
    }

    //getters y Setters
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}