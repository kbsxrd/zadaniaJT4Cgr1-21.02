import java.util.Scanner;
public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartość produktu:");
        int wartoscproduktu = klawiatura.nextInt();
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        double stanowy = wartoscproduktu*podatekStanowy;
        double lokalny = wartoscproduktu*podatekLokalny;
        double wartoscCalkowita = wartoscproduktu+stanowy+lokalny;

        System.out.println("Wartość produktu:"+wartoscproduktu+" Podatek stanowy: "+stanowy+" Podatek Lokalny: "+lokalny+" Wartość całkowita: "+wartoscCalkowita);
    }
}
