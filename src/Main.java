import java.text.SimpleDateFormat;
import java.util.Date;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
    //devoir (1

       SimpleDateFormat formater = null;
       //nom
        System.out.println("votre nom");
        System.out.println("Haubursin");
        //prenom
        System.out.println("votre prénom");
        System.out.println("Eiji");

        //note
        // Programmation = 20 crédits, Mathématique = 20 crédits, Chimie = 10 crédits, Physique = 10 crédits
       int Programmation = 15;
       int Mathématique = 18;
       int Chimie = 9;
       int Physique = 7;

       System.out.println("vos notes :");
       System.out.println("Programmation: "+Programmation+"/20  "+"Mathématique: "+Mathématique+ "/20  "+"Chimie: "+Chimie+"/20  "+"Physique: "+Physique+"/20  ");

       //moyenne
        int Programmation_credit = 20;
        int Mathématique_credit = 20;
        int Chimie_credit = 10;
        int Physique_credit = 10;

        int Moyenne= (Programmation*Physique_credit+Mathématique*Mathématique_credit+Chimie*Chimie_credit+Physique*Physique_credit)/(Programmation_credit+Mathématique_credit+Chimie_credit+Physique_credit);

        System.out.println("la moyenne est de : "+Moyenne);

       //crédits accordés
        System.out.println("nombre de crédit pour la programmation : "+Programmation_credit);
        System.out.println("nombre de crédit pour les mathématiques : "+Mathématique_credit);
        System.out.println("nombre de crédit pour la chimie : "+Chimie_credit);
        System.out.println("nombre de crédit pour la physique : "+Physique_credit);

        //System.out.println()
       //System.out.println();

       Date aujourdhui = new Date();
       formater = new SimpleDateFormat("dd-MM-yy");
       System.out.println(formater.format(aujourdhui));

    //devoir (2

      String exe = "exemple";
      String exefirst = exe.substring(0,3);
      String exesec = exe.substring(3,7);
      System.out.println(exefirst+"  "+exesec);

      String text = "exemple";
      String textavecespace = text.replace("em","e m");
      System.out.println(textavecespace);

    }
}