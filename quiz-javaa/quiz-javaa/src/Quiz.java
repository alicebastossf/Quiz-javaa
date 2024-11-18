import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        System.out.println("Nome da Faculdade: UNIFAN");
        System.out.println("Nome Completo do Aluno:ALICE SOUZA BASTOS");
        System.out.println("Nome do Professor: BRENNO PIMENTA");
        System.out.println("Bem-vindo! Você responderá 15 perguntas de múltipla escolha sobre Princesas da Disney.");
        System.out.println();


        List<Questao> questoes = new ArrayList<>();
        criarQuestões(questoes);


        int acertos = 0;
        int total = questoes.size();

        // Início do Quiz
        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }


        System.out.println("Você acertou: " + acertos + " de " + total + " questões.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", (acertos * 100.0 / total));
    }

    private static void criarQuestões(List<Questao> questoes) {

        questoes.add(criarQuestao("1- De qual princesa é o castelo que aparece na logo da Disney?", "A) Cinderela", "B) Bela", "C) Branca de Neve", "D) Moana", "E) Mulan", "A"));

        questoes.add(criarQuestao("2- Como se chama o príncipe da princesa Aurora?", "A) Príncipe John", "B) Príncipe Phillip", "C) Príncipe Jack", "D) Príncipe Julian", "E) Príncipe Harry", "B"));

        questoes.add(criarQuestao("3- Qual princesa se disfarçou de homem para salvar o pai?", "A) Cinderela", "B) Tiana", "C) Aurora", "D) Mulan", "E) Merida", "D"));

        questoes.add(criarQuestao("4- Qual é o nome do gato de estimação da madastra da Cinderela?", "A) Cheshire", "B) Gato de botas", "C) Lucifer", "D) Flit", "E) Abu", "C"));

        questoes.add(criarQuestao("5- Qual princesa é uma habilidosa arqueira? ", "A) Jasmine", "B) Cinderela", "C) Merida", "D) Tiana", "E) Aurora", "C"));

        questoes.add(criarQuestao("6- Qual princesa não nasceu humana?", "A) Tiana", "B) Rapunzel", "C) Cinderela", "D) Ariel", "E) Merida", "D"));

        questoes.add(criarQuestao("7- De que cor fica o cabelo de Rapunzel quando é cortado?", "A) Rosa", "B) Loiro", "C) Preto", "D) Castanho", "E) Ruivo", "D"));

        questoes.add(criarQuestao("8- Qual fruta é usada para enfeitiçar Branca de Neve?", "A) Jabuticaba", "B) Maçã", "C) laranja", "D) Morango", "E) Uva", "B"));

        questoes.add(criarQuestao("De que material era feito o sapato da Cinderela?", "A) Plástico", "B) Couro", "C)  Borracha", "D) Pvc", "E) Cristal", "E"));

        questoes.add(criarQuestao("Qual é o nome da Princesa do Filme Enrolados?", "A) Pocahontas", "B) Bela", "C) Cinderela", "D) Rapunzel", "E) Tiana", "D"));

        questoes.add(criarQuestao("Qual animal de estimação da Rapunzel?", "A) Gato", "B) Papagaio", "C) Camaleão", "D) Cavalo", "E) Cachorro", "C"));

        questoes.add(criarQuestao("Qual animal a princesa Tiana precisou beijar para quebrar um feitiço?", "A) Jacaré ", "B) Sapo", "C) Macaco", "D) Cavalo", "E) Cachorro", "B"));

        questoes.add(criarQuestao(" Quem ajudou Moana na sua ilha e era conhecida como a louca da ilha?", "A)  Sua mãe", "B) Sua tia", "C) Sua vó", "D) Seu irmão", "E) Seu namorado", "C"));

        questoes.add(criarQuestao("Qual princesa troca sua voz por pernas humanas?", "A) Ariel", "B) Merida", "C)Bela", "D) Cinderela", "E) Moana", "A"));

        questoes.add(criarQuestao("Qual Presente o pai de Bela rouba para dar pra ela?", "A) Carro", "B) Ouro", "C) Anel", "D) Rosa", "E) Aumento do nível do mar", "B"));
    }

    private static Questao criarQuestao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = opcaoA;
        questao.opcaoB = opcaoB;
        questao.opcaoC = opcaoC;
        questao.opcaoD = opcaoD;
        questao.opcaoE = opcaoE;
        questao.correta = correta;
        return questao;
    }
}
