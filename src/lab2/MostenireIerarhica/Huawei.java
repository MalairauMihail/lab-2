package lab2.MostenireIerarhica;

public class Huawei extends Telefon
{
    public Huawei(String procesor, int RAM, String culoare)
    {
        super("Huawei", procesor, RAM, culoare);
    }

    @Override
    public String pret()
    {
        return(getMarca() + " " + "pretul 12000");
    }
}
