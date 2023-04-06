package Pratica01;


public class Personagem2 extends Personagem
{
    public Personagem2()
    {
        super();
        this.setPulo(new PuloAlto());
        this.setCorrida(new CorridaRapida());
        this.setAtaque(new AtaqueMedio());
    }
}
