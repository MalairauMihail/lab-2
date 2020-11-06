package lab3.abstractizare.clasa;

public class Rosii extends Legume{

    private String forma;

    public Rosii(double greutate, String forma){
        super("Rosie", greutate);
        this.forma = forma;
    }

    public String getForma(){
        return this.forma;
    }

    @Override
    public String toString(){
        return super.toString() + "Forma: " + this.forma + "\n";
    }

    public void setForma(String forma){
        this.forma = forma;
    }

    @Override
    public String ambalare(){
        return "Rosiile se ambaleaza";
    }
}
