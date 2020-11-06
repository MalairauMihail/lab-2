package lab3.polimorphism;

public class Huawei extends Telefon{

    private String audio;

    public Huawei(int RAM, String procesor, int memorie, String audio){
        super("Huawei", RAM, procesor, memorie);
        this.audio = audio;
    }

    public String getAudio(){
        return this.audio;
    }

    @Override
    public String toString(){
        return super.toString() + "Sistemul audio: " + this.audio + "\n";
    }

    public void setAudio(String audio){
        this.audio = audio;
    }

    @Override
    public String functioneaza(){
        return "Huawei afiseaza imaginea de fundal.";
    }
}