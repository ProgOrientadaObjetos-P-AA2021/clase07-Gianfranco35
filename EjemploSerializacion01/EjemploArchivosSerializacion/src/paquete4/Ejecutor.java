/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete3.*;
import paquete1.Calificacion;
import paquete1.Hospital;
import paquete1.Profesor;

public class Ejecutor {

    public static void main(String[] args) {

       String fileName = "hospital.txt";
        
        Hospital hospital = new Hospital("Caritas", 10, 300.55);
        Hospital hospita2 = new Hospital("Clínica Abendaño", 50, 1900.66);
        Hospital hospita3 = new Hospital("Solca", 30, 660.20);

        Hospital[] listaHospitales = {hospital, hospita2, hospita3};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(fileName);

        for (int i = 0; i < listaHospitales.length; i++) {      
            archivo.establecerRegistro(listaHospitales[i]);       
            archivo.establecerSalida();
        }
        archivo.cerrarArchivo();
        
    

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(fileName);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
}
