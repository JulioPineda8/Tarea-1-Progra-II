package gt.edu.umg.uml;

public class Enano extends Personaje implements Heroe{
    @Override
    public void atacar(){
        System.out.println("Atacando");
    }
    @Override
    public void defender(){
        System.out.println("Defender");
    }
    @Override
    public void recibirAtaque(){
        System.out.println("Recibir ataque");
    }
}
