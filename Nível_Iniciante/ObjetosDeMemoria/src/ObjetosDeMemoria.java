public class ObjetosDeMemoria {
    public static void main(String[] args) {
        /*
        Conceitos sobre Objetos de Memória e Inicialização de Arrays:
            Memória de Arrays: Em Java, os arrays são armazenados na memória heap, pois são objetos. Isso significa que o array em si é uma referência, enquanto seus elementos podem ser tipos primitivos ou objetos, dependendo do tipo definido.
            Valores Padrão: Quando um array é criado, cada elemento é inicializado automaticamente com um valor padrão. Esses valores dependem do tipo de dado do array. Para tipos primitivos, como int, o valor é 0, e para double, é 0.0. Para objetos, o valor inicial é null.
            Índices e Acesso: Como em todo array, os elementos são acessados por seus índices, começando em 0. Se tentarmos acessar um índice que não foi inicializado com um valor explícito, veremos o valor padrão do tipo de dado correspondente.
            Exemplos de Inicialização de Arrays
            Array de inteiros: Um array de inteiros (int[]) é inicializado com zeros. Se criarmos um array de tamanho 5, ele terá a seguinte configuração: [0, 0, 0, 0, 0].
            Array de booleanos: Da mesma forma, um array de booleanos (boolean[]) será inicializado com false, como [false, false, false, false].
            Array de objetos: Se criarmos um array de Strings (String[]), por exemplo, cada elemento será inicializado como null até que seja atribuído um valor específico: [null, null, null].
            Considerações sobre Inicialização
            Inicialização Implícita: Quando o array é declarado, os valores são automaticamente atribuídos com base em seu tipo, economizando a necessidade de inicializar cada elemento individualmente.
            Inicialização Explícita: É possível inicializar o array com valores específicos no momento de sua criação, como int[] números = {1, 2, 3, 4};. Isso evita o uso dos valores padrões.
        */

        // Array é diferente de lista; está é flexível enquanto aquele não;
        // Arrays pegam um único espaço na memória e compartimentaliza conforme os dados que vão ser colocados, necessitando de menos memória; são tipos referência;
        // Quando inicializamos um array como String[] nome = new String; este new é um novo espaço na memória e está inicializando um objeto de memória que no caso é o array String;
        //
    }
}
