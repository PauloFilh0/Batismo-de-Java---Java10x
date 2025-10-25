public class Ternarios {
    public static void main(String[] args) {

        /*
         * Ternarios: São maneiras de reduzir o código
         * variável = (condição) ? valorSeVerdadeiro : valorSeFalso;
         * */

        short numeroDeMissioes = 1;
        String nivelDoNinja = (numeroDeMissioes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);
    }

}
