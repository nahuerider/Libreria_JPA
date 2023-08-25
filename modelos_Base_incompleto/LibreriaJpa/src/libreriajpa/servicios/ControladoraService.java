/*
 * CONTROLADORA LOGICA
 */
package libreriajpa.servicios;

import java.util.ArrayList;
import libreriajpa.Persistencia.Controladora;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.entidades.Libro;

/**
 *
 * @author nahue
 */
public class ControladoraService {
    
    Controladora controlPersis = new Controladora();
    
    /*desde aca solicitamos el crear a lumno a las persistencia*/
    
    /*CRUD de LIBRO*/
    public void crearLibro(Libro lib){
        
        controlPersis.crearLibro(lib);
        
    }
    
    public void eliminarLibro(int id){
        
        controlPersis.crearEliminar(id);
        
    }
    
    public void editarLibro(Libro lib){
        
        controlPersis.EditarLibro(lib);
        
    }
    
    public Libro traerLibroParticular(int id){
        return controlPersis.traerLibroParti(id);
    }

    public ArrayList<Libro> traerListaLibro() {
        return controlPersis.traerListaLibro();
    }
    
    /*FIN del CRUD de LIBRO*/
    
    /*CRUD de Autor*/
    
     public void crearAutor(Autor auto){
        
        controlPersis.crearAutor(auto);
        
    }
    
    public void eliminarAutor(int id){
        
        controlPersis.eliminarAutor(id);
        
    }
    
    public void editarAutor(Autor auto){
        
        controlPersis.EditarAutor(auto);
        
    }
    
    public Autor traerAutorParticular(int id){
        return controlPersis.traerAutorParti(id);
    }

    public ArrayList<Autor> traerListaAutor() {
        return controlPersis.traerListaAutor();
    }
    
    /*FIN de CRUD de Autor*/
    
    
    /*CRUD de Edtorial*/
    
      public void crearEditorial(Editorial edito){
        
        controlPersis.crearEditorial(edito);
        
    }
    
    public void eliminarEditorial(int id){
        
        controlPersis.eliminarEditorial(id);
        
    }
    
    public void editarEditorial(Editorial edito){
        
        controlPersis.EditarEditorial(edito);
        
    }
    
    public Editorial traerEditorialParticular(int id){
        return controlPersis.traerEditorialParti(id);
    }

    public ArrayList<Editorial> traerListaEditorial() {
        return controlPersis.traerListaEditorial();
    }
    
    /*FIN CRUD de Edtorial*/
    
    
    
}
