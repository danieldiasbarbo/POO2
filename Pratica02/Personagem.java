package Pratica02;

public abstract class Personagem 
{
    private Pulo pulo;
    private State estado;
    private Integer vida;
        
    public void setPulo(Pulo pulo){
        this.pulo = pulo;
        this.estado = new Forte(this);
        this.vida = 70;
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
        return "Vida: " + this.vida + " | Estado: " + estado;
    }
    
}