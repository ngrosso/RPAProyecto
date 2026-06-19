import java.util.Scanner;
 
public class BatallaHogwarts {
 
    public static int calcularDaño(int valAtaque){
        int numAlea = (int)(Math.random() * valAtaque) + 1;
        return numAlea;
    }

    public static int calcularDanioVol(){
        int danVol = (int)(Math.random() * 20) + 1;
        return  danVol;
    }

    public static String calculoBatalla(int danioMagBueno, int danioMagoMalo){
        String resultadoDelEnfrentemiento;

        if (danioMagBueno == danioMagoMalo) {
            resultadoDelEnfrentemiento = "Empate de ataque!";
            magoAsciiEmpate();
        } else {
            if (danioMagBueno > danioMagoMalo) {
                resultadoDelEnfrentemiento = "Ataque efectivo!";
                magoAsciiGanador();
            } else {
                resultadoDelEnfrentemiento = "Ataque enemigo superior!";
                magoAsciiPerdedor();
            }
        }

        return resultadoDelEnfrentemiento;
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
    
    public static void magoAsciiEmpate() {
    System.out.println("___ __ ._`.*.'_._ ____ ____");
    System.out.println(" . +  * .o   o.* `.`. +.    .");
    System.out.println("*  . ' ' |\\^/|  `. * .  * `");
    System.out.println("         \\\\V/ . +");
    System.out.println("          /_\\\\  .`. ");
    System.out.println("======== _/ \\_ =====::.*");
}

    public static void magoAsciiPerdedor() {
    System.out.println("      |\\\\");
    System.out.println("     | \\\\");
    System.out.println("     |(*\\\\");
    System.out.println("     |___\\\\");
    System.out.println("     (((\"\'\\\\");
    System.out.println("     ((c'7')");
    System.out.println("     ((((^))");
    System.out.println("      )))(((");
    System.out.println("      (((())");
    System.out.println("       )))(");
    System.out.println("        (())");
    System.out.println("         ))");
}

public static void magoAsciiGanador() {
    System.out.println("      |\\\\          .(' *) ' .");
    System.out.println("     | \\\\        ' .*) .'*");
    System.out.println("     |(*\\\\      .*(// .*) .");
    System.out.println("     |___\\\\       // (. '*");
    System.out.println("     (((\"\'\\\\     // '  * .");
    System.out.println("     ((c'7')   /\\)");
    System.out.println("     ((((^))  /  \\\\");
    System.out.println("   .-')))(((-'   /");
    System.out.println("      (((()) __/'");
    System.out.println("       )))( |");
    System.out.println("        (())");
    System.out.println("         ))");
}


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int danioVol, poder;
        String nombreMago, resultadoBatalla;

 
        System.out.println("Bienvenido al duelo de Hogwarts!");
        magoAscii(); 
        System.out.println(); 
 
        System.out.println("Ingrese su nombre joven mago!: ");
        nombreMago = sc.nextLine();
 
        System.out.println("Ingrese qué tan fuerte es su varita! (Rango: 1-20): ");
        poder = sc.nextInt();

        danioVol = calcularDanioVol();
 
        if (poder >= 1 && poder <= 20) {
            int danioFinal = calcularDaño(poder);
 
            System.out.println("El mago " + nombreMago + " preparó el ataque con una potencia de: " + poder);
            System.out.println("Su ataque fue de: " + danioFinal + " puntos mágicos!");
            System.out.println("(∩｀-´)⊃━☆ﾟ.*・｡ﾟ");

            System.out.println("Voldemort atacó con un poder de: " + danioVol);

            resultadoBatalla = calculoBatalla(danioFinal, danioVol);
            System.out.println(resultadoBatalla);
 
        } else {
            System.out.println("Ingrese un valor válido joven mago! (1-20)");
        }


 
        sc.close();
    }
}