import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Básico, pero importante");

        /* if */
        
         /* s */
        

        /* switch */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un número del 1 al 7: ");
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Dominto");
                    break;
                default:
                    System.out.println("Un número del 1 al 7, por favor.");

            }

        }
    }
}
