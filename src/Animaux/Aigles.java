package Animaux;

public class Aigles extends Oiseaux implements Carnivores{

    Aigles() {
        super();
    }

    Aigles(String nom,int age,boolean isMale) {
        super(nom,age,isMale);
    }

    Aigles(int age,String nom) {
        super(age,nom);
    }

    Aigles(int age) {
        super(age);
    }

    @Override
    public String moyenExpresion() {
        return "je trompette";
    }


    @Override
    public void manger(Animale animale) {
        System.out.println("Je dechire " + animale);
    }
}
