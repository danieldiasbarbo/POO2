package Pratica04;

public abstract class Personagem 
{
    private Pulo pulo;
    private State estado;
    private Integer vida;
    private Escudo escudo;
    
    
    public Personagem(){
        this.escudo = new Escudo(0);
        this.vida = 70;
    }
    
    public Integer atacar(){
        return estado.atacar();
    }
    
    public void adicionaEscudo(Escudo escudo){
        escudo.setSucessor(this.escudo);
        this.escudo = escudo;
    }
    
    public void setPulo(Pulo pulo){
        this.pulo = pulo;
        this.estado = new Forte(this);
        this.vida = 70;
    }
    
    public void processaDano(Integer dano){
        Integer danoFinal = escudo.processaEscudo(dano);
        this.setVida(this.getVida() - danoFinal);
    }
    
    public State getEstado(){
        return this.estado;
    }
    
    public void setEstado(State estado){
        this.estado = estado;
    }
    
    public Integer getVida(){
        return this.vida;
    }
    
    public void setVida(Integer vida){
        this.vida = vida;
    }
    
    public String toString(){
        return "Vida: " + this.vida + " | Estado: " + estado + " | Dano: " + this.atacar();
    }
    
}