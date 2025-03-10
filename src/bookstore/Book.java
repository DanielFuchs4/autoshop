package bookstore;


public class Book {
    private String nazev;
    private int rokVydani;
    private int delka;
    private Zanr zanr;

    public Book(String nazev, int rokVydani, Zanr zanr, int delka) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.zanr = zanr;
        this.delka = delka;
    }

    public void printInfo(){
        System.out.print(nazev+" : "+zanr+" : "+rokVydani);
    }

    public int getDelka() {
        return delka;
    }
}
