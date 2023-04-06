package Pratica03;

public class Normal extends State
{
   

    public Normal(Personagem personagem)
    {
        super(personagem);
        this.setAtaque(new AtaqueMedio());
        this.setCorrida(new CorridaMedia());
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
        return "Normal";
    }
}
