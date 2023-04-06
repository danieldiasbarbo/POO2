package Pratica03;

public class Principal
{

    public static void main() {
        System.out.println("=====PADRÃO STATE=====");
        System.out.println("Personagem Criado");
        Personagem3 personagem = new Personagem3();
        System.out.println(personagem);
        personagem.getEstado().sofreuAtaque(30);
        System.out.println("Dano sofrido 30 (PERDEU 30 DE VIDA) ");
        System.out.println(personagem);
        
        System.out.println("Colocando Escudo de 10");
        
        personagem.adicionaEscudo(new Escudo(10));
        
        personagem.getEstado().sofreuAtaque(30);
        System.out.println("Dano sofrido 30 (PERDEU 20 DE VIDA) ");
        System.out.println(personagem);
        
        System.out.println("Colocando Escudo de 5");
        personagem.adicionaEscudo(new Escudo(5));
        
        
        personagem.getEstado().sofreuAtaque(30);
        System.out.println("Dano sofrido 30 (PERDEU 15 DE VIDA) ");
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
