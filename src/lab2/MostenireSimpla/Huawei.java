package lab2.MostenireSimpla;

public class Huawei
{
    private String marca;
    private int RAM;

    public Huawei(String marca, int RAM)
    {
        this.marca = marca;
        this.RAM = RAM;
    }

    public String printst()
    {
        return("Marca: " + this.marca + ", RAM: " + this.RAM);
    }


    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getRAM() {
        return RAM;
    }
}
