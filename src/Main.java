import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> personas = new HashMap<>();
        boolean edadValida = false;
        int edad = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el nombre y la edad de la persona ");
            String nombre = sc.nextLine();

            do {
                try {
                    edad = sc.nextInt();
                    sc.nextLine();
                    edadValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("La edad ha de ser numérica.");
                    sc.nextLine();
                }
            }while (!edadValida);

            personas.put(nombre, edad);
        }

        for (String nombre : personas.keySet()) {
            System.out.println(nombre + " " + personas.get(nombre));
        }
    }
}