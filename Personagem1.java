public class Personagem1 extends Personagem
{
    public Personagem1()
    {
        super();
        this.setPulo(new PuloMedio());
        this.setCorrida(new CorridaMedia());
        this.setAtaque(new AtaqueForte());
    }
}
