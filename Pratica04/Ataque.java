package Pratica04;

public abstract class Ataque
{
    Integer dano;
    
    public Ataque()
    {
        
    }
    
    public Integer atacar(){
        return dano;
    }
    
    public void setDano(Integer dano){
        this.dano = dano;
    }
    
    public Integer getDano(){
        return dano;
    }
}
