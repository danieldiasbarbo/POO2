package Pratica04;

public class Principal
{

    public static void main() {
        Personagem2 personagem = new Personagem2();
        System.out.println("Criando personagem");
        System.out.println(personagem);
        System.out.println("Decorando com ataqueFogo +5");
        personagem.getEstado().setAtaque(new AtaqueFogo(personagem.getEstado().getAtaque()));
        System.out.println(personagem);
        System.out.println("Decorando com ataqueVento +3");
        personagem.getEstado().setAtaque(new AtaqueVento(personagem.getEstado().getAtaque()));
        System.out.println(personagem);
    }
}
