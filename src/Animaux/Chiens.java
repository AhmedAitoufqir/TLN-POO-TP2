package Animaux;

public class Chiens extends Mamiferes implements Carnivores{

    Chiens() {
        super();
    }

    Chiens(String nom ,int age,boolean isMale) {
        super(nom, age, isMale);
    }

    Chiens(int age,String nom) {
        super(age,nom);
    }

    Chiens(int age) {
        super(age);
    }


    @Override
    public String getInfo() {
        if (this.age == 0 ) {
            return "Je suis un chien";
        }
        return super.getInfo() + "Je suis un Chien de nom " + this.nom;
    }

    @Override
    public String moyenExpresion() {
        return "J’aboie";
    }

    @Override
    public void manger(Animale animale) {
        System.out.println("Je Mord " + animale);
    }

}
