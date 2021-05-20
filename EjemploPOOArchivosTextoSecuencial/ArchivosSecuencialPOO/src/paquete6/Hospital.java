/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

public class Hospital {

    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String nombre, int numeroCamas, double presupuesto) {
        this.nombre = nombre;
        this.numeroCamas = numeroCamas;
        this.presupuesto = presupuesto;

    }

    public void estabelcerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public void estabelcerPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}

/* 
Agregar valor de objetos de tipo Hospital a un archivo
Y leer el archivo
*/
