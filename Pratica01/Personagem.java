package Pratica01;

public abstract class Personagem
{
    private Pulo pulo;
    private Corrida corrida;
    private Ataque ataque;
    
    public void setPulo(Pulo pulo){
        this.pulo = pulo;
    }
    
    public void setCorrida(Corrida corrida){
        this.corrida = corrida;
    }
    
    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }
}