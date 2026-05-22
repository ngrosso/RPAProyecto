package main.java.rpa;

import java.util.Scanner;
 
public class BatallaHogwarts {
 
    public static int calcularDaño(int valAtaque){
        int numAlea = (int)(Math.random() * valAtaque) + 1;
        return numAlea;
    }
 
    public static void magoAscii() {
        System.out.println("      __/\\__");
        System.out.println(". _  \\\\''//");
        System.out.println("-( )-/_||_\\");
        System.out.println(" .'. \\_()_/");
        System.out.println("  |   | . \\\\");
        System.out.println("  |mrf| .  \\\\");
        System.out.println(" .'. ,\\_____'.");
    }
 
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Bienvenido al duelo de Hogwarts!");
        magoAscii(); 
        System.out.println(); 
 
        System.out.println("Ingrese su nombre joven mago!: ");
        String nombreMago = sc.nextLine();
 
        System.out.println("Ingrese qué tan fuerte es su varita! (Rango: 1-20): ");
        int poder = sc.nextInt();
        
        if (poder >= 1 && poder <= 20) {
            int danioFinal = calcularDaño(poder);
            
            System.out.println("El mago " + nombreMago + " atacó con la potencia de: " + poder);
            System.out.println("Su ataque fue de: " + danioFinal + " puntos mágicos!");
            System.out.println("(∩｀-´)⊃━☆ﾟ.*・｡ﾟ");
            
        } else {
            System.out.println("Ingrese un valor válido joven mago! (1-20)");
        }
        
        sc.close();
    }
}