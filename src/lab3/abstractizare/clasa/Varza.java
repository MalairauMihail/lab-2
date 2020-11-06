package lab3.abstractizare.clasa;

public class Varza extends Legume {

    private String origine;

    public Varza(double greutate, String origine){
        super("Varza", greutate);
        this.origine = origine;
    }

    public String getOrigine(){
        return this.origine;
    }

    @Override
    public String toString(){
        return super.toString() + "Tara origine: " + this.origine + "\n";
    }

    public void setOrigine(String origine){
        this.origine = origine;
    }

    @Override
    public String ambalare(){
        return "Varza se ambaleaza.";
    }
}