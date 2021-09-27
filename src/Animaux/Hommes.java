package Animaux;

public class Hommes extends Mamiferes{


    Hommes() {
        super();
    }

    Hommes(String nom,int age,boolean isMale) {
        super(nom,age,isMale);
    }

    Hommes(int age,String nom) {
        super(age,nom);
    }

    Hommes(int age) {
        super(age);
    }

    @Override
    public String getInfo() {
        /*if (this.age == 0 ) {
            return "Je suis un homme";
        }*/
        return super.getInfo() + "Je suis un homme de nom " + this.nom;
    }

    @Override
    public String moyenExpresion() {
        return "je parle";
    }
}
