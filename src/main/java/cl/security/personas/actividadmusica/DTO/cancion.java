/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.security.personas.actividadmusica.DTO;

/**
 *
 * @author Cetecom
 */
public class cancion {
    private String Nombre;
    private int Duracion;
    private String Artista;
    private String Genero;

    public cancion(String Nombre, int Duracion, String Artista, String Genero) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Artista = Artista;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
       if(String.valueOf(Duracion).length()>= 5){
            this.Duracion = Duracion;
        }
        else{
            System.out.println("La cancion es larga");
        }
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
   
}
