public class Desafio1 {
    public static void main(String[] args) {
        //Ninjas de Konoha

        System.out.println("============ Ninja 1 ============");
        String nome1 = "Naruto Uzumaki";
        int idade1 = 12;
        String missao1 = "achar o seu namorado Sasuke";
        char Rank1 = 'A';
        System.out.println("O nome do ninja é " + nome1 + ", tem " + idade1 + " anos e está cumprindo a missão: '" + missao1 +
                "' de Rank " + Rank1);

        if(idade1 <= 15 && (Rank1 == 'C' || Rank1 == 'D')) {
            System.out.println("Missão Concluída");
        } else if (idade1 > 15) {
            System.out.println("Missão Concluída");
        }else {
            System.out.println("Missão Não Concluída");
        }

        System.out.println("============ Ninja 2 ============");
        String nome2 = "Sasuke Uchiha";
        int idade2 = 17;
        String missao2 = "fugir do corno do Naruto";
        char Rank2 = 'S'; //O cabra é chato pa karai
        System.out.println("O nome do ninja é " + nome2 + ", tem " + idade2 + " anos e está cumprindo a missão: '" + missao2 +
                "' de Rank " + Rank2);

        if(idade2 <= 15 && (Rank2 == 'C' || Rank2 == 'D')) {
            System.out.println("Missão Concluída");
        } else if (idade2 > 15) {
            System.out.println("Missão Concluída");
        }else {
            System.out.println("Missão Não Concluída");
        }

        System.out.println("============ Ninja 3 ============");
        String nome3 = "Jiraya";
        int idade3 = 46;
        String missao3 = "ajudar o corno do Naruto";
        char Rank3 = 'A';
        System.out.println("O nome do ninja é " + nome3 + ", tem " + idade3 + " anos e está cumprindo a missão: '" + missao3 +
                "' de Rank " + Rank3);

        if(idade3 <= 15 && (Rank3 == 'C' || Rank3 == 'D')) {
            System.out.println("Missão Concluída");
        } else if (idade3 > 15) {
            System.out.println("Missão Concluída");
        }else {
            System.out.println("Missão Não Concluída");
        }
    }
}