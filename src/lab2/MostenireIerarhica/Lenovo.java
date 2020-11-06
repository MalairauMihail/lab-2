package lab2.MostenireIerarhica;

public class Lenovo extends Telefon
{
    public Lenovo(String procesor, int RAM, String culoare)
    {
        super("Lenovo", procesor, RAM, culoare);
    }

    @Override
    public String pret()
    {
        return(getMarca() + " " + "pretul 8000");
    }
}
