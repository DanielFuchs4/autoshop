package elektroshop;
import java.util.Scanner;
public class Items {
    private Fridge[] items;
    Scanner sc = new Scanner(System.in);

    public void addItems(int count) {
        System.out.println("Kolik chces lednicek?");
        count = sc.nextInt();
        items = new Fridge[count];
        String o;
        for (int i=0; i<count; i++) {
            //nacti od uzivatele míru spotreby a rok výroby ledničky
            //pridej lednicku do pole lednicek
            System.out.print("Míra spotřeby: (A-G)");
            o = sc.nextLine();
            Energie energie = null;
            if (o.equals("A")) {
                energie = Energie.A;
            } else if (o.equals("B")) {
                 energie = Energie.B;
            } else if (o.equals("C")) {
                 energie = Energie.C;
            } else if (o.equals("D")) {
                 energie = Energie.D;
            } else if (o.equals("E")) {
                 energie = Energie.E;
            } else if (o.equals("F")) {
                 energie = Energie.F;
            } else if (o.equals("G")) {
                 energie = Energie.G;
            }

            System.out.println("Jaký je rok výroby ledničky?");
            int rokVyroby = sc.nextInt();
            sc.nextLine();
            System.out.println("Jaká je značka?");
            String znacka = sc.nextLine();
            System.out.println("Jaký je model?");
            String model = sc.nextLine();
            
            
            items[i] = new Fridge(energie ,znacka, model, rokVyroby);
        }
    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH-----");
        for (int i=0; i<items.length; i++) {
            System.out.println(items[i].getRokVyroby()+": "+ items[i].getMiraSpotrebi());
        }
        System.out.println("------");
    }
}
