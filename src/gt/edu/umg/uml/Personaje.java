package gt.edu.umg.uml;

public abstract class Personaje{
    private String nombre;
    private String descripcion;
    private long tamano;
    private int poder;
    private int vida;
    public void desplazarse(){
        System.out.println("Desplazando Personaje");
    }
    public int mostrarVida(){
        return vida;
    }
    public void mostrarPoder(){
        System.out.println("Mostrando Poder");
    }

}
