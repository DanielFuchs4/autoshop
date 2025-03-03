package elektroshop;

public class Fridge {

    private Energie miraSpotrebi;
    private String znacka;
    private String model;
    private int rokVyroby;

    public Fridge(Energie miraSpotrebi, String znacka, String model, int rokVyroby) {
        this.miraSpotrebi = miraSpotrebi;
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }

    public void printInfo(){
        if (miraSpotrebi == Energie.A){
            System.out.println(rokVyroby+": Very Low");
        }
        else if (miraSpotrebi == Energie.B){
            System.out.println(rokVyroby+": Low");
        }
        else if (miraSpotrebi == Energie.C){
            System.out.println(rokVyroby+": Normal");
        }
        else if (miraSpotrebi == Energie.D){
            System.out.println(rokVyroby+": Above Normal");
        }
        else if (miraSpotrebi == Energie.E){
            System.out.println(rokVyroby+": High");
        }
        else if (miraSpotrebi == Energie.F){
            System.out.println(rokVyroby+": Very High");
        }
        else if (miraSpotrebi == Energie.G){
            System.out.println(rokVyroby+": Extremely High");
        }


    }

    public Energie getMiraSpotrebi() {
        return miraSpotrebi;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public String getModel() {
        return model;
    }

    public String getZnacka() {
        return znacka;
    }
}
