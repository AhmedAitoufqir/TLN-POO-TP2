package Animaux;


public abstract class Mamiferes extends Animale {

    Mamiferes() {
        super();
    }


    Mamiferes(String nom,int age,boolean isMale) {
        super(nom, age, isMale);
    }

    Mamiferes(int age,String nom) {
        super(age,nom);
    }

    Mamiferes(int age) {
        super(age);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Je suis un mamifere. ";

    }

    @Override
    public abstract String moyenExpresion();
}
