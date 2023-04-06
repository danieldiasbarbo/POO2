package Pratica02;

public class Principal
{

    public static void main() {
        System.out.println("=====PADRÃO STATE=====");
        System.out.println("Personagem Criado");
        Personagem3 personagem = new Personagem3();
        System.out.println(personagem);
        personagem.getEstado().sofreuAtaque(30);
        System.out.println("Dano sofrido (PERDEU 30 DE VIDA) ");
        System.out.println(personagem);
        personagem.getEstado().sofreuAtaque(30);
        System.out.println("Dano sofrido (PERDEU 30 DE VIDA) ");
        System.out.println(personagem);
        personagem.getEstado().sofreuAtaque(30);
        System.out.println("Dano sofrido (PERDEU 30 DE VIDA) ");
        System.out.println(personagem);
        System.out.println("Recompensa coletada(GANHOU 30 DE VIDA) ");
        personagem.getEstado().coletouRecompensa(30);
        System.out.println(personagem);
        System.out.println("Recompensa coletada(GANHOU 30 DE VIDA) ");
        personagem.getEstado().coletouRecompensa(30);
        System.out.println(personagem);
        System.out.println("Recompensa coletada(GANHOU 30 DE VIDA) ");
        personagem.getEstado().coletouRecompensa(30);
        System.out.println(personagem);
        
    
        
        
    }

    
}
