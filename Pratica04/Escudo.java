package Pratica04;

public class Escudo
{
    Integer defesa;
    Escudo escudoSucessor;
    
    public Escudo(Integer defesa)
    {
         this.defesa = defesa;
    }
    
    public void setSucessor(Escudo escudo){
        this.escudoSucessor = escudo;
    }
    
    public Integer processaEscudo(Integer dano){
        if (escudoSucessor == null){
            Integer danoFinal = dano - defesa;
            if (danoFinal <= 0){
                return 0;
            }
            return danoFinal;
        }
        
        return escudoSucessor.processaEscudo(dano-defesa);
    }
}
