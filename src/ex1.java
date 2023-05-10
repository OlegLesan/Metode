import java.util.Scanner;
public class ex1 {
    private String genul;
    private int suma;

    public void citesteDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("intrare in program...");
        System.out.println("Buna ziua! Alegeti genul (masculin/feminin):");
        System.out.print("m - masculin, f - feminin: ");
        this.genul = scanner.nextLine().toLowerCase();
        System.out.println("Introduceti 3 cifre in diapazonul 10 si 100:");
        int cifra1 = scanner.nextInt();
        int cifra2 = scanner.nextInt();
        int cifra3 = scanner.nextInt();
        this.suma = calculeazaSuma(cifra1, cifra2, cifra3);
        scanner.close();
    }

    private int calculeazaSuma(int cifra1, int cifra2, int cifra3) {
        return cifra1 + cifra2 + cifra3;
    }

    public void afiseazaGenulSiSuma() {
        System.out.println("genul: " + this.genul + " si suma: " + this.suma);
    }

    public static void main(String[] args) {
       ex1 program = new ex1();
        program.citesteDate();
        program.afiseazaGenulSiSuma();
        System.out.println("iesire din program...");
    }
}
