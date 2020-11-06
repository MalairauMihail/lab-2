package lab3.abstractizare.clasa;

public class Castravete extends Legume {

    private String soi;

    public Castravete(double greutate, String soi){
        super("Castravete", greutate);
        this.soi = soi;
    }

    public String getSoi(){
        return this.soi;
    }

    @Override
    public String toString(){
        return super.toString() + "Soi: " + this.soi + "\n";
    }

    public void setSoi(String soi){
        this.soi = soi;
    }

    @Override
    public String ambalare(){
        return "Castravetii se ambaleaza";
    }
}