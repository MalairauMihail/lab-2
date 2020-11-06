package lab2.MostenireIerarhica;

public class Xiaomi extends Telefon
{
    public Xiaomi(String procesor, int RAM, String culoare)
    {
        super("Xiaomi", procesor, RAM, culoare);
    }

    @Override
    public String pret()
    {
        return(getMarca() + " " + "pretul 10000");
    }
}
