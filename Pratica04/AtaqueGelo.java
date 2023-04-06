package Pratica04;

public class AtaqueGelo extends Ataque
{
    Ataque ataqueDecorado;
    
    public AtaqueGelo(Ataque ataqueDecorado)
    {
        this.ataqueDecorado = ataqueDecorado;
        this.setDano(6);
    }
    
    public Integer atacar(){
        return this.getDano() + ataqueDecorado.atacar();
    }
}
