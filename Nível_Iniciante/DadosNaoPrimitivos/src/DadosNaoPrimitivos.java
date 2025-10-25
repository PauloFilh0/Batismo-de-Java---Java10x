public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
         * Dados não primitivos: ‘String’, Array, Class, enum; são tipos de dados que de maneira geral podem receber métodos
         * para fazer alterações na variável sem que seja mudado o seu escopo.
         * Dados Primitivos: são tipos de dados que de maneira geral não recebem métodos de maneira padrão
         * Os métodos (alteram as variáveis) poderão ser acessados colocando um ponto final no nome da variável
         * Objetivo: Criar um ninja, e atribuir métodos a ele.
         * */

        // Declarando a variavel como NARUTO UZUMAKI
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); // ToUppercase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); // TolowerCase vai colocar tudo em caixa baixa/minusculo
        System.out.println(aldeiaEmCaixaBaixa);

    }

}
