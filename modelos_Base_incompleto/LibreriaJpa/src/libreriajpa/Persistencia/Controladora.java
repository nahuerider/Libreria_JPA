/*
 CONTROLADORA DE PERSISTENCIA
 */
package libreriajpa.Persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import libreriajpa.Persistencia.exceptions.NonexistentEntityException;
import libreriajpa.entidades.Autor;
import libreriajpa.entidades.Editorial;
import libreriajpa.entidades.Libro;

/**
 *
 * @author nahue
 */
public class Controladora {
        /* creamos un objeto libro con el controlador hecho por JPA
    y ocn esto puedo llmar a los emtods hechos por xml y llamrlos desde
    el main
    */
    LibroJpaController libroJapa = new LibroJpaController();

    
    /*Desde aca recibe las ordenes de la COntroladoraServicie y los envia a 
    los metodos del xml
    */
    public void crearLibro(Libro lib) {
        libroJapa.create(lib);
        System.out.println("libro creado correctamente");
    }

    public void crearEliminar(int id) {
        try {
            libroJapa.destroy(id);
            System.out.println("Libro eliminado");
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("El id del libro no existe");
        }
    }

    public void EditarLibro(Libro lib) {
        try {
            libroJapa.edit(lib);
            System.out.println("Libro editado correctamente !");
        } catch (Exception ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se pudo editar el libro porque uno de los datos "
                    + "son erroneos o no son compatibles "
                    + "porfavor, reviza los datos a modificar");
        }
    }

    //funcion para buscar un solo libro
    public Libro traerLibroParti(int id) {
      return  libroJapa.findLibro(id);
    }
    
    //funcion para buscar una lista de libros
    public ArrayList <Libro> traerListaLibro() {
       List<Libro> listita= libroJapa.findLibroEntities();
       ArrayList<Libro> listaLibros = new ArrayList<Libro>(listita);
       return listaLibros;
    }

    
    /*CRUD DE AUTOR*/
    
     AutorJpaController autoJapa = new AutorJpaController();
    
    public void crearAutor(Autor auto) {
        autoJapa.create(auto);
    }

    public void eliminarAutor(int id) {
        try {
            autoJapa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontro el autor a editar, rebice bien el id");
        }
    }

    public void EditarAutor(Autor auto) {
        try {
            autoJapa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontro el autor a editar, rebice bien los paraetros");
        }
    }

    public Autor traerAutorParti(int id) {
        return autoJapa.findAutor(id);
    }

    public ArrayList<Autor> traerListaAutor() {
        List<Autor> lista = autoJapa.findAutorEntities();
        ArrayList<Autor> listaAutor = new ArrayList<>(lista);
        return listaAutor;
    }
    
    /* FIN CRUD DE AUTOR*/

    EditorialJpaController editoJapa = new EditorialJpaController();
    
    public void crearEditorial(Editorial edito) {
       editoJapa.create(edito);
    }

    public void eliminarEditorial(int id) {
        try {
            editoJapa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontro la editorial a eliminar, rebice bien el id");
        }
    }

    public void EditarEditorial(Editorial edito) {
        try {
            editoJapa.edit(edito);
        } catch (Exception ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se encontro la editorial a editar, rebice bien el id");
        }
    }

    public Editorial traerEditorialParti(int id) {
         return editoJapa.findEditorial(id);
    }

    public ArrayList<Editorial> traerListaEditorial() {
       List<Editorial> lista = editoJapa.findEditorialEntities();
        ArrayList<Editorial> listaEdito= new ArrayList<>(lista);
        return listaEdito;
    }
    
    
    
    
    
}


