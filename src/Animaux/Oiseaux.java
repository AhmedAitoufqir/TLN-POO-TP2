package Animaux;

public abstract class Oiseaux extends Animale {

    Oiseaux() {
        super();
    }
    Oiseaux(String nom,int age,boolean isMale) {
        super(nom, age, isMale);
    }

    Oiseaux(int age,String nom) {
        super(age, nom);
    }

    Oiseaux(int age) {
        super(age);
    }

    @Override
    public abstract String moyenExpresion();
}
