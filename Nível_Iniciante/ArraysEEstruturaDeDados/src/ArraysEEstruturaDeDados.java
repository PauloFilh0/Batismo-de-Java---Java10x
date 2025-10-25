import java.util.Arrays;
import java.util.Scanner;

public class ArraysEEstruturaDeDados {
    public static void main(String[] args) {
        /*
        * Principais Conceitos sobre Arrays:

            Definição: Um array é uma coleção de elementos do mesmo tipo, organizados numa sequência contínua na memória. Cada elemento é acessado por um índice.
            Índices: Os elementos de um array são acessados por meio de índices numéricos, que começam em 0. Por exemplo, o primeiro elemento de um array está na posição 0.
            Tamanho fixo: O tamanho de um array é definido no momento da sua criação e não pode ser alterado. Uma vez que o array é inicializado, não é possível adicionar ou remover elementos.
            Tipos de Dados: Arrays podem armazenar qualquer tipo de dado, incluindo tipos primitivos (como int, double) e objetos (como String ou classes personalizadas).
            Multidimensionais: Java permite a criação de arrays multidimensionais, como matrizes (arrays de arrays). Isso é útil para representar dados em múltiplas dimensões, como uma tabela ou grade.
            Exemplo no Contexto de Naruto: Imagine um array que armazena os nomes dos personagens do time 7: ["Naruto", "Sakura", "Sasuke", "Kakashi"]. Cada nome pode ser acessado por seu índice, como time7[0] para acessar "Naruto".

        * Vantagens e Limitações:

            Vantagens: Arrays oferecem acesso rápido aos elementos e são eficientes em termos de memória quando o número de elementos é conhecido previamente.
            Limitações: O tamanho dos arrays é fixo e não pode ser alterado após a sua criação. Para manipulação dinâmica de coleções de dados, outras estruturas como ArrayList podem ser mais adequadas.
            */

        //Index começa em 0 e por aí vai
        //Que gambiarra vei

        Scanner nome = new Scanner(System.in);

        String[] ninja = new String[3]; //String[] ninjas = {"Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno"}; // String ninjas[]

        int i = 0;

        while (i < ninja.length) {
            System.out.println("Digite o nome do ninja: ");
            String nome1 = nome.nextLine();
            ninja[i] = nome1;
            i++;
        }
        System.out.println(Arrays.toString(ninja));

        nome.close();
    }
}
