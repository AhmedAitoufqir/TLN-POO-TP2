package Animaux;

public class Plante {
    String nom;
    int age;
    String couleur;

    Plante() {
        this.age = 0;
        this.nom = "";
        this.couleur = "";
    }

    Plante(String nom) {
        this.nom = nom;

    }

    Plante(String nom,int age) {
        this.nom = nom;
        this.age = age;
    }

    Plante(String nom,int age,String couleur) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
    }

    Plante(int age) {
        this.age = age;
    }
}
