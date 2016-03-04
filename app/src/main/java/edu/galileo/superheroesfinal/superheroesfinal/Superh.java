package edu.galileo.superheroesfinal.superheroesfinal;

/**
 * Created by rzurita on 02/03/2016.
 */
public class Superh {
    public Superh(int imagen,String nombre,String descripcion){
        this.setImagen(imagen);
        this.setNombre(nombre);
        this.setDescripcion(descripcion);

    }




    private int imagen;
    private String nombre,descripcion;

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
