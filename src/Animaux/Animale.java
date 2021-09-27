package Animaux;

public abstract class Animale {
    String nom;
    int age;
    boolean isMale;
    Animale() {
        this.nom = "";
        this.age = 0;
        this.isMale = true;
    }

    Animale(String nom, int age, boolean isMale) {
        this.nom = nom;
        this.age = age;
        this.isMale = isMale;
    }

    Animale(int age, String nom) {
        this.nom = nom;
        this.age = age;
    }

    Animale(int age) {
        this.age = age;
    }

    public abstract String moyenExpresion();

    public void AffichAnimaux(Animale animaux[]){
        for(int i = 0 ;i < animaux.length ; i++) {
            System.out.println(animaux[i].getClass().getName() + "@" + Integer.toHexString(hashCode()) + ", " + animaux[i].moyenExpresion() );
        }
    }





    public String toString() {

        return "Je suis un animal est mon identifiant est" + this.hashCode();
    }

    public String getInfo() {
        if(this.age == 0) {
            return "Je suis un animal.";
        }
        return "Je suis un animal age de " + this.age + " an(s) .";
    }


}
