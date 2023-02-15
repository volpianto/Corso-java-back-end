import java.util.Scanner;

public class Eserciziom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Scegli un'operazione:");
        System.out.println("1 - Somma");
        System.out.println("2 - Sottrazione");
        System.out.println("3 - Somma delle radici quadrate");
        System.out.println("4 - Sottrazione tra la radice del valore più piccolo e più grande");

        int choice = scanner.nextInt();

        double result = 0.0;
        String operation = "";
        switch (choice) {
            case 1:
                result = num1 + num2;
                operation = "somma";
                break;
            case 2:
                result = num1 - num2;
                operation = "sottrazione";
                break;
            case 3:
                result = Math.sqrt(num1) + Math.sqrt(num2);
                operation = "somma delle radici quadrate";
                break;
            case 4:
                result = Math.sqrt(Math.max(num1, num2)) - Math.sqrt(Math.min(num1, num2)); // per il secondo numero non riuscivo a farlo senza funzione.
                operation = "sottrazione tra la radice del valore più piccolo e più grande";
                break;
            default:
                System.out.println("Operazione non valida!");
                System.exit(0);
        }

        // Calcola il valore assoluto del risultato
        double absResult = Math.abs(result);

        // Stampa il risultato
        System.out.printf("%s di %.2f e %.2f è: %.2f\n", operation, num1, num2, result);

        // Stampa informazioni sul risultato
        if (result > 0) {
            System.out.printf("Il risultato è positivo con valore assoluto di %.2f\n", absResult);
        } else if (result < 0) {
            System.out.printf("Il risultato è negativo con valore assoluto di %.2f\n", absResult);
        } else {
            System.out.println("Il risultato è zero");
        }

        if (result == (int) result) {
            System.out.printf("Il risultato è un intero\n");
            if ((int) result % 2 == 0) {
                System.out.println("Il risultato è pari");
            } else {
                int intPart = (int) result;
                double decPart = result - intPart;
                System.out.printf("Il risultato è dispari con troncamento a %d e valore decimale di %.2f\n", intPart, decPart);
            }
        } else {
            System.out.println("Il risultato non è un intero");
        }
    }
}

