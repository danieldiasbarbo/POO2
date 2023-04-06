package Pratica04;

public class AtaqueVento extends Ataque
{
    Ataque ataqueDecorado;
    
    public AtaqueVento(Ataque ataqueDecorado)
    {
        this.ataqueDecorado = ataqueDecorado;
        this.setDano(3);
    }
    
    public Integer atacar(){
        return this.getDano() + ataqueDecorado.atacar();
    }
}
