public class GarbageCollector {
    public static void main(String[] args) {
        /*
         Arrays em Programação:

            Arrays são estruturas de dados usadas para armazenar múltiplos valores em uma única variável. Cada valor é acessado por um índice numérico, começando do zero.
            Por exemplo: int[] numeros = {1, 2, 3, 4, 5};

         Redeclaração de Arrays:

            Em muitas linguagens de programação, uma vez que um array é declarado, você pode atribuir novos valores, mas não pode redeclará-lo diretamente sem perder os dados atuais.
            Por exemplo, se você tentar redeclarar um array já existente, você irá sobrescrever o array anterior:

            int numeros = new int[]{4, 5, 6};
            <!-- Redeclaração -->

          Introdução ao Garbage Collection:

            Garbage Collection (GC) é o processo automático de gerenciamento de memória, onde objetos que não estão mais em uso são removidos da memória. Isso ajuda a evitar vazamentos de memória.
            O Garbage Collector monitora objetos que não têm mais referências ativas e os limpa da memória.
            // Exemplo de objeto não mais referenciado:
            MinhaClasse obj = new MinhaClasse();
            obj = null;  // O objeto anterior é agora elegível para GC
            O Garbage Collection é especialmente importante em linguagens como Java e C#, onde a memória é gerenciada automaticamente.
        */

        //Redeclarar

        String nome = "Naruto";
        nome = "Boruto";
        System.out.println(nome);

        //Redeclarar Array

        String[] nomes = new String[6];
        nomes = new String[3]; // Array vazio; todos os espaços de antes são liberados pelo garbage collector;
        System.out.println(nomes);
    }
}
