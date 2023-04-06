package Pratica02;

public class Perigo extends State
{
   

    public Perigo(Personagem personagem)
    {
        super(personagem);
        this.setAtaque(new AtaqueFraco());
        this.setCorrida(new CorridaDevagar());
    }

            protected void handler(){
        if(this.getPersonagem().getVida() >= 70) {
            this.getPersonagem().setEstado(new Forte(this.getPersonagem() ) );
        }
        else if(this.getPersonagem().getVida() >= 30) {
            this.getPersonagem().setEstado(new Normal(this.getPersonagem() ) );
        }
        else if(this.getPersonagem().getVida() >= 0) {
            this.getPersonagem().setEstado(new Perigo(this.getPersonagem() ) );
        }
        else {
            this.getPersonagem().setVida(0);
            this.getPersonagem().setEstado(new Morto(this.getPersonagem() ) );
        }
       
    }
    
    public String toString(){
        return "Perigo";
    }
    
}
