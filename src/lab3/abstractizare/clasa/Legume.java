package lab3.abstractizare.clasa;

public abstract class Legume {

    private String tipul;
    private double greutate;

    public Legume(String tipul, double greutate){
        this.tipul = tipul;
        this.greutate = greutate;
    }

    public String getTipul(){
        return this.tipul;
    }
    public double getGreutate(){
        return this.greutate;
    }

    @Override
    public String toString(){
        return "Tipul: " + this.tipul + "\n" +
                "Greutate: " + this.greutate + "\n";
    }

    public void setTipul(String tipul){
        this.tipul = tipul;
    }
    public void setGreutate(double greutate){
        this.greutate = greutate;
    }

    public abstract String ambalare();
}