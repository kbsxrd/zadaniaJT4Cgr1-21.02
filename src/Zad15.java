import java.util.Scanner;
public class Zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cene detaliczną płytki: ");
        int cenadetaliczna = klawiatura.nextInt();

        double zysk = cenadetaliczna*0.4;
        System.out.println("Zysk ze sprzedazy płytek: "+zysk);
    }
}
