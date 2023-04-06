public class Personagem3 extends Personagem
{
    public Personagem3()
    {
        super();
        this.setPulo(new PuloBaixo());
        this.setCorrida(new CorridaRapida());
        this.setAtaque(new AtaqueForte());
    }
}
