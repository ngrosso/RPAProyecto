import java.util.Scanner;

public class BatallaHogwarts {

    public static int calcularDaño(int valAtaque) {
        int numAlea = (int) (Math.random() * valAtaque) + 1;
        return numAlea;
    }

    public static int calcularPoderVol() {
        int danVol = (int) (Math.random() * 20) + 1;
        return danVol;
    }

    public static String calculoBatalla(int danioMagBueno, int danioMagoMalo) {
        String resultadoDelEnfrentemiento;

        if (danioMagBueno == danioMagoMalo) {
            resultadoDelEnfrentemiento = YLW + "Empate de ataque!";
            magoAsciiEmpate();
        } else {
            if (danioMagBueno > danioMagoMalo) {
                resultadoDelEnfrentemiento = GRN + "Ataque efectivo!";
                magoAsciiGanador();
            } else {
                resultadoDelEnfrentemiento = PPL + "Ataque enemigo superior!";
                magoAsciiPerdedor();
            }
        }

        return resultadoDelEnfrentemiento;
    }

    public static void magoAscii() {
        System.out.println("      __/\\__");
        System.out.println(". _   \\\\''//");
        System.out.println("-( )-/_||_\\");
        System.out.println(" .'. \\_()_/");
        System.out.println("  |   | . \\\\");
        System.out.println("  |mrf| .  \\\\");
        System.out.println(" .'. ,\\_____'.");
    }

    public static void magoAsciiEmpate() {
        System.out.println(YLW + "___ __ ._`.*.'_._ ____ ____");
        System.out.println(" . +  * .o   o.* `.`. +.    .");
        System.out.println("* . ' ' |\\^/|  `. * .  * `");
        System.out.println("         \\\\V/ . +");
        System.out.println("          /_\\\\  .`. ");
        System.out.println("======== _/ \\_ =====::.*" + RST);
    }

    public static void magoAsciiPerdedor() {
        System.out.println(RED + "      |\\\\");
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
        System.out.println(CYN + "      |\\\\          .(' *) ' .");
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

    public static final String RST = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLU = "\u001B[34m";
    public static final String YLW = "\u001B[33m";
    public static final String GRN = "\u001B[32m";
    public static final String PPL = "\u001B[35m";
    public static final String CYN = "\u001B[36m";
    public static final String REDBG = "\u001B[41m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int danioVol, danioMago, poderMago, poderVol;
        String nombreMago, resultadoBatalla;

        int hpMago = 100;
        int hpVol = 100;
        int rondas = 0;

        System.out.println("Bienvenido al duelo de Hogwarts!");
        magoAscii();
        System.out.println();

        System.out.println("Ingrese su nombre joven mago!: ");
        nombreMago = sc.nextLine();

        while (hpMago > 0 && hpVol > 0) {

            rondas++;
            System.out.println("\n");
            System.out.println(CYN + "⸝* *ੈ✩‧₊˚༺☆༻*ੈ✩‧₊˚");
            System.out.println(YLW + "Ronda N° " + rondas);
            System.out.println(
                    BLU + "HP " + nombreMago + ": " + hpMago + PPL + " | " + RED + "HP Voldemort: " + hpVol + RST);

            System.out.println("Ingrese qué tan fuerte es su varita! (Rango: 1-20): ");
            poderMago = sc.nextInt();

            if (poderMago >= 1 && poderMago <= 20) {
                poderVol = calcularPoderVol();

                danioMago = calcularDaño(poderMago);
                danioVol = calcularDaño(poderVol);

                System.out.println("\n");
                System.out
                        .println(BLU + "El mago " + nombreMago + " preparó el ataque con una potencia de: " + poderMago
                                + " e hizo " + danioMago + " de daño efectivo.");
                System.out.println(
                        RED + "Voldemort atacó con un poder de: " + poderVol + " e hizo " + danioVol
                                + " de daño efectivo.");

                resultadoBatalla = calculoBatalla(danioMago, danioVol);
                System.out.println(resultadoBatalla);
                hpVol = hpVol - danioMago;
                hpMago = hpMago - danioVol;
            } else {
                System.out.println("El rango debe ser entre 1 y 20");
            }
        }
        System.out.println("\n");
        System.out.println(CYN + "⸝* *ੈ✩‧₊˚༺☆༻*ੈ✩‧₊˚");
        System.out.println(REDBG + "Fin de la batalla!" + RST);
        System.out.println("\n");

        if (hpMago <= 0 && hpVol <= 0) {
            System.out.println(YLW+"Empate!");
        } else if (hpMago > 0) {
            System.out.println(CYN + "El mago " + nombreMago + " ha derrotado a Voldemort!");
        } else {
            System.out.println(RED + "Voldemort ha vencido.................................................");
        }

        System.out.println("(∩｀-´)⊃━☆ﾟ.*・｡ﾟ");

        sc.close();
    }
}