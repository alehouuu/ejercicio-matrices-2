import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de estudiantes: ");
        int estudiantes = sc.nextInt();

        System.out.print("Ingrese número de materias: ");
        int materias = sc.nextInt();

        double[][] notas = new double[estudiantes][materias];
        double sumaGeneral = 0;
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < materias; j++) {
                do {
                    System.out.print("Nota estudiante " + (i + 1) + ", materia " + (j + 1) + ": ");
                    notas[i][j] = sc.nextDouble();
                } while (notas[i][j] < 0 || notas[i][j] > 5);

                sumaGeneral += notas[i][j];
            }
        }
        System.out.println("\nTabla de notas:");
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < materias; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nPromedio por estudiante:");
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < materias; j++) {
                suma += notas[i][j];
            }
            System.out.println("Estudiante " + (i + 1) + ": " + (suma / materias));
        }
        System.out.println("\nPromedio por materia:");
        for (int j = 0; j < materias; j++) {
            double suma = 0;
            for (int i = 0; i < estudiantes; i++) {
                suma += notas[i][j];
            }
            System.out.println("Materia " + (j + 1) + ": " + (suma / estudiantes));
        }
        double promedioGeneral = sumaGeneral / (estudiantes * materias);
        System.out.println("\nPromedio general: " + promedioGeneral);
    }
}
