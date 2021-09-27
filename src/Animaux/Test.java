package Animaux;

public class Test {
    public static void main(String[] args) {
        int i;
        Chiens chiens = new Chiens();
        Lapin lapin = new Lapin();
        Hommes hommes = new Hommes();

        Animale animaux[] = {new Hommes(12) , new Lapin() , new Chiens(5,"Medor"), new Hommes(), new Hommes(25,"Robert")};

        /*for(i = 0 ; i < 5; i++) {
            System.out.println(animaux[i].getInfo());
        }*/

        chiens.AffichAnimaux(animaux);

    }
}
