import java.util.Scanner; // mod scanner
public class Main
{
    public static void main(String[] args) {



        /*
        Una banca online vuole che tu crei un programma che mostri ai potenziali clienti come cresceranno i loro depositi.
        Il tuo programma dovrebbe leggere il saldo iniziale e il
        tasso d'interesse annuale.
       L'interesse è composto mensilmente. Stampa i saldi dopo i primi tre mesi.

       Inserisci il saldo iniziale: 1000
       Inserisci Interesse annuo (%): 6.0
         */

            //variabili

        double saldo_conto;
        double interesse_annuo;
        double interesse_mensile;
        double mese1;
        double mese2;
        double mese3;

                Scanner valore = new Scanner (System.in);

        System.out.println("Perfavore, inserisca il suo saldo iniziale: ");
        saldo_conto = valore.nextDouble();

        System.out.println("Il suo interesse annuo è del (%): ");
        interesse_annuo = valore.nextDouble();


        interesse_mensile = interesse_annuo  / 12 ;

        mese1 = saldo_conto+ saldo_conto * interesse_mensile;
        mese2 = mese1 + mese1 * interesse_mensile;
        mese3 = mese2 + mese2 * interesse_mensile;

        System.out.printf ("Bilancio dopo il primo mese: %.2f\n", mese1);
        System.out.printf("Bilancio dopo il secondo mese: %.2f\n", mese2);
        System.out.printf("Bilancio dopo il terzo mese: %.2f\n", mese3);
    }
}