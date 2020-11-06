package lab3.polimorphism;

public class Honor extends Telefon{

    private String display;

    public Honor(int RAM, String procesor, int memorie, String display){
        super("Honor",RAM,procesor,memorie);
        this.display = display;
    }

    public String getDisplay(){
        return this.display;
    }

    @Override
    public String toString(){
        return super.toString() + "Display: " + this.display + "\n";
    }

    public void setDisplay(String display){
        this.display = display;
    }

    @Override
    public String functioneaza(){
        return "Honor afiseaza imaginea de fundal.";
    }
}