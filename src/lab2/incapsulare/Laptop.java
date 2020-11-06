package lab2.incapsulare;

public class Laptop
{
    private String marca;
    private String procesor;
    private int RAM;

    public Laptop(String marca, String procesor, int RAM)
    {
        this.marca = marca;
        this.procesor = procesor;
        this.RAM = RAM;
    }

    public String printst()
    {
        return("Marca: " + this.marca + ", Procesor: " + this.procesor + ", RAM: " + this.RAM);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
