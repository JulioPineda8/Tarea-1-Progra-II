package gt.edu.umg.uml;

public class Ogro extends Personaje implements Villano {
    @Override
    public void atacar(){
        System.out.println("Atacando");
    }
    @Override
    public void destruir(){
        System.out.println("Destruindo");
    }
}
