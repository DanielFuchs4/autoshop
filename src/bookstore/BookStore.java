package bookstore;
import java.util.Scanner;

public class BookStore {
    private String name;
    private Book[] books;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu knih. A ty prida do pole knih.
     */
    public void addBoooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kolik chceš přidat knih: ");
        int count = sc.nextInt();
        sc.nextLine();
        books = new Book[count];
        for (int i=0; i<count; i++){
            System.out.println(i+1+". Kniha");
            System.out.println("Název:");
            String nazev = sc.nextLine();
            System.out.println("Rok vydání:");
            int rok = sc.nextInt();
            System.out.println("Počet stran:");
            int pocet = sc.nextInt();
            sc.nextLine();
            System.out.println("Žánr: (roman, scifi, detektivka)");
            String zanr1 = sc.nextLine();
            System.out.println("");

            Zanr zanr = null;
            switch (zanr1) {
                case "roman":
                    zanr = Zanr.roman;
                    break;
                case "scifi":
                    zanr = Zanr.scifi;
                    break;
                case "detektivka":
                    zanr = Zanr.detektivka;
                    break;
            }

            books[i] = new Book(nazev, rok, zanr ,pocet);
        }

    }

    /**
     * Tato metoda vypise informace o knihach. Na prvnim rádku bude text "-----INFO O KNIHKUPECTVI----- ", na druhem bude název KNIHKUPECTVI a tecka.
     * Na tretim radku bude text "na sklade mame tyto knihy:" a následne budou vypsany vsichny knihy oddelene od sebe stredniken a to ve formátu "nazev : zanr : rok vydani" (Vyuzijte metodu printInfo() tridy Book.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O KNIHKUPECTVI-----");

        System.out.println(name+".");
        System.out.print("Na sklade mame tyto knihy: ");
        for (int i=0; i<books.length; i++){
            Book book = books[i];
            book.printInfo();
            System.out.print(";");
        }
        System.out.println("");
        System.out.println("-----");
    }

    public BookStore(String name) {
        this.name = name;
    }


    public void nejkratsiKniha(){
        int min;
        min = books[0].getDelka();
        for (int i=0; i<books.length; i++){
            if (books[i].getDelka()<min){
                min = books[i].getDelka();
            }
        }
        System.out.println("Počet stran nejkratší knihy je: "+min);

    }
}
