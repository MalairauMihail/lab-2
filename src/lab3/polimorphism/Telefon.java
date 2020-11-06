package lab3.polimorphism;

public class Telefon
{
    private String producator;
    private int RAM;
    private String procesor;
    private int memorie;

    public Telefon(String producator, int RAM, String procesor, int memorie) {
        this.producator = producator;
        this.RAM = RAM;
        this.procesor = procesor;
        this.memorie = memorie;
    }

    public String getProducator(){
        return this.producator;
    }
    public int getRAM(){
        return this.RAM;
    }
    public String getProcesor(){
        return this.procesor;
    }
    public int getMemorie(){
        return this.memorie;
    }

    @Override
    public String toString(){
        return "Producator: " + this.producator + "\n" +
                "RAM: " + this.RAM + "\n" +
                "Procesor: " + this.procesor + "\n" +
                "Memorie: " + this.memorie + "\n";
    }

    public void setProducator(String producator){
        this.producator = producator;
    }
    public void setRAM(int RAM){
        this.RAM = RAM;
    }
    public void setProcesor(String procesor){
        this.procesor = procesor;
    }
    public void setMemorie(int memorie){
        this.memorie = memorie;
    }

    public String functioneaza(){
        return "Telefonul afiseaza imaginea de fundal.";
    }
}
