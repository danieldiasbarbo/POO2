package Pratica04;

public abstract class State
{
    private Pulo pulo;
    private Corrida corrida;
    private Ataque ataque;
    private Personagem personagem;
    
    public State(Personagem personagem){
        this.personagem = personagem;  
    }
    
    public Integer atacar(){
        return ataque.atacar();
    }
    
    public void setCorrida(Corrida corrida){
        this.corrida = corrida;
    }
    
    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }
    
    public Ataque getAtaque(){
        return ataque;
    }

    public Personagem getPersonagem(){
        return this.personagem;
    }
    
    public void sofreuAtaque(Integer dano){
        this.personagem.processaDano(dano);
        this.handler();
    }
    
    public void coletouRecompensa(Integer cura){
        this.personagem.setVida(this.personagem.getVida() + cura);
        this.handler();
    }
    protected abstract void handler(); //fica o  estado
}
