import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner quantidadeDeNinjas = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        Scanner opcao = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int caso;
        int qtd = 0;

        System.out.println("Quantos ninjas deseja declarar: ");
        int quantidade = quantidadeDeNinjas.nextInt();
        String[] ninjas = new String[quantidade];

        do {
            System.out.println("Qual opção deseja no momento: ");
            switch (caso = opcao.nextInt()) {
                case 1:
                    opcao.nextLine();
                    if (qtd < quantidade) {
                        System.out.print("Adicione um novo ninja: ");
                        ninjas[qtd] = nome.nextLine();
                        System.out.println("Ninja Cadastrado");
                        qtd++;
                    } else {
                        System.out.println("Lista cheia");
                    }
                    break;

                case 2:
                    opcao.nextLine();
                    System.out.println("Fim do cadastro de Ninjas");
                    break;

                case 3:
                    opcao.nextLine();
                    System.out.println("============= Listando os Ninjas =============");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println("O nome do ninja é: " + ninjas[i]);
                    }
                    break;
                case 4:
                    System.out.println("Digite o número do ninja a deletar: ");
                    int pos = scanner.nextInt();
                    opcao.nextLine();

                    if(pos < 1 || pos > ninjas.length) {
                        System.out.println("Posição Inválida");
                    }else if(ninjas[pos - 1] == null) {
                            System.out.println("Esse ninja já foi deletado");
                    }else {
                        System.out.println("Ninja '" + ninjas[pos - 1] + "' removido");
                        ninjas[pos - 1] = null;
                        qtd--;
                    }
                    break;
                default:
                    System.out.println("Opção Inválida. Escolha outra: ");
            }

        } while (caso != 2);

        quantidadeDeNinjas.close();
        nome.close();
        opcao.close();
    }
}