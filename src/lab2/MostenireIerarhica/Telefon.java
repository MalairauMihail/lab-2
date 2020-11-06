package lab2.MostenireIerarhica;

public class Telefon
{
    private String marca;
    private String procesor;
    private int RAM;
    private String culoare;

    public Telefon(String marca, String procesor, int RAM, String culoare)
    {
        this.marca = marca;
        this.procesor = procesor;
        this.RAM = RAM;
        this.culoare = culoare;
    }

    public String pret()
    {
        return(getMarca() + " " + "pretul 9000");
    }

    public String getMarca()
    {
        return marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String print()
    {
        return(
                "Marca: " + marca + "\n" +
                "Procesor: " + procesor + "\n" +
                "RAM: " + RAM + "\n" +
                "Culoare: " + culoare
                );
    }
}
