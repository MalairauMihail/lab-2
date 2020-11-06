package lab3.polimorphism;

public class Xiaomi extends Telefon{

    private String culoare;

    public Xiaomi(int RAM, String procesor, int memorie, String culoare){
        super("Xiaomi",RAM,procesor,memorie);
        this.culoare = culoare;
    }

    public String getCuloare(){
        return this.culoare;
    }

    @Override
    public String toString(){
        return super.toString() + "Culoare: " + this.culoare + "\n";
    }

    public void setCuloare(String culoare){
        this.culoare = culoare;
    }

    @Override
    public String functioneaza(){
        return "Xiaomi afiseaza imaginea de fundal.";
    }
}
