package com.company.romz;
import java.util.*;

public  class Calcul {
    Scanner sc = new Scanner(System.in);

    /**Used to determine what method to use next depending on user's choice
     * @return typeChoice
     */
    public int askType() {
        int typeChoice = 0;
        System.out.println("Cet outil permet de mesurer la surface d'un rectangle ou l'aire d'un carré taper 1 ou 2 pour selectionner un outil !");
        typeChoice = sc.nextInt();
        if (typeChoice == 1)
        {
            getSurfRectangle();
        }
        else if (typeChoice == 2)
        {
            getAreaSquare();
        }
        else if (typeChoice == 42)
        {
            System.out.println("bien joué gros malin , t'as gagné ta place de geek de l'espace");
        }
        else if (typeChoice <= 0 || typeChoice > 2)
        {
            System.out.println("Votre choix ne fait pas parti des propositions merci de réessayer!");
            askType();
        }
        return typeChoice;
    }

    /**
     * Calculates a rectangle surface with two given values
     */
    public void getSurfRectangle() {
        System.out.println("Veuillez inserer la longeur de votre rectangle :");
        int longueur = sc.nextInt();
        System.out.println("Veuillez inserer la largeur de votre rectangle :");
        int largeur = sc.nextInt();
        int surf = longueur * largeur;
        System.out.println("votre surface est de : " + surf);
    }

    /**
     * Calculates a square's area with one given value
     */
    public void getAreaSquare() {
        System.out.println("Quel est la taille de vos côtés ?");
        int cote = sc.nextInt();
        int area = cote * 4;
        System.out.println("Votre aire est de : " + area + " cm²");
    }
}


