package Animaux;

public class Lapin extends Mamiferes implements Herbivores{

    Lapin() {
        super();
    }

    Lapin(String nom,int age,boolean isMale) {
        super(nom,age,isMale);
    }

    Lapin(int age,String nom) {
        super(age,nom);
    }

    Lapin(int age) {
        super(age);
    }


    @Override
    public String getInfo() {
        if (this.age == 0 ) {
            return "Je suis un lapin";
        }
        return super.getInfo() + "Je suis un Lapin de nom " + this.nom;
    }

    @Override
    public String moyenExpresion() {
        return "je clapit";
    }

    @Override
    public void manger(Plante plante) {
        System.out.println("Je grignotte " + plante );

    }


}
