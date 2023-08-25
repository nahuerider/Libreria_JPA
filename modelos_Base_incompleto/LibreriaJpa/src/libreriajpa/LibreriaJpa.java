/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa;

import java.util.ArrayList;
import libreriajpa.Persistencia.Controladora;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.entidades.Libro;
import libreriajpa.servicios.ControladoraService;



/**
 *
 * @author nahue
 */
public class LibreriaJpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControladoraService control = new ControladoraService();
       
          //metodo para crear un autor :
        Autor auto = new Autor(1, "Franz Kafka", true);
        control.crearAutor(auto);
//             //metodo para crear un autor :
        Editorial edito = new Editorial(0, "ALma",true);
        control.crearEditorial(edito);
        
        
        //metodo para crear y guardar
        Libro lib = new Libro(1, "pablito ", 110, 10, 20, 30, true, auto, edito);    
        control.crearLibro(lib);
        //fin de metodo de crear y guardar
        
        //metodo para buscar libro partiucar por ID
//        Libro lib = control.traerLibroParticular(50);
//        System.out.println("el libro es; " + lib.toString());
        
        
        
        
        
//        control.eliminarLibro(50);
        
        
       /* DATO DE VITAL IMPORTANCIA:
        para editar hay que hacer 2 pasos, primero SETear
       y dps, llamar a la funcion 
//       */
//                lib.setAnio(2020);
//                control.editarLibro(lib);
        /* FIN DE DATO DE VITAL IMPORTANCIA*/        
        
        
                
        //metodo para busqueda grupal
//        ArrayList<Libro>ListaLibros = control.traerListaLibro();
//        for(Libro al: ListaLibros){
//            System.out.println("El libro es: " + al.toString());
//        }
//        


        
     
    }
    
}
