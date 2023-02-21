import java.util.Scanner;
public class Zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ocene z pierwszego testu:");
        int pierwszaocena = klawiatura.nextInt();
        System.out.println("Podaj ocene z drugiego testu: ");
        int drugaocena = klawiatura.nextInt();
        System.out.println("Podaj ocene z trzeciego testu :");
        int trzeciaocena = klawiatura.nextInt();

        double sredniaocen = (pierwszaocena+drugaocena+trzeciaocena)/3;

        System.out.println("Pierwsza ocena: " + pierwszaocena + " Druga ocena: " + drugaocena + " Trzecia ocena: "+trzeciaocena+ " Średnia ocen: "+sredniaocen);
    }
}