package Pratica04;

public class AtaqueFogo extends Ataque
{
    Ataque ataqueDecorado;
    
    public AtaqueFogo(Ataque ataqueDecorado)
    {
        this.ataqueDecorado = ataqueDecorado;
        this.setDano(5);
    }
    
    public Integer atacar(){
        return this.getDano() + ataqueDecorado.atacar();
    }
}
