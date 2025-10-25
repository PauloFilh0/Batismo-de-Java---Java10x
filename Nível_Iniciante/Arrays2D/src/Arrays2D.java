public class Arrays2D {
    public static void main(String[] args) {
         /*
         Arrays Multidimensionais
Em Java ou em outras linguagens, podemos usar arrays multidimensionais para organizar informações de forma estruturada. Vamos usar um exemplo com o universo de Naruto, onde temos diferentes aldeias e os ninjas que pertencem a essas aldeias.

Exemplo de um Array 2D
Vamos criar um array 2D onde cada linha representa uma aldeia e cada coluna contém os ninjas dessa aldeia:

String[][] aldeiasENinjas = {
    {"Aldeia da Folha", "Naruto", "Sasuke", "Sakura"},
    {"Aldeia da Areia", "Gaara", "Kankuro", "Temari"},
    {"Aldeia da Névoa", "Zabuza", "Haku"},
    {"Aldeia da Nuvem", "Darui", "C"},
    {"Aldeia da Pedra", "Kurotsuchi", "Akatsuchi"}
};
Este array 2D pode ser visualizado como uma tabela, onde cada aldeia contém uma lista de ninjas. Veja como ficaria:

Aldeia da Folha: Naruto, Sasuke, Sakura
Aldeia da Areia: Gaara, Kankuro, Temari
Aldeia da Névoa: Zabuza, Haku
Aldeia da Nuvem: Darui, C
Aldeia da Pedra: Kurotsuchi, Akatsuchi
Iterando sobre o Array
Podemos percorrer o array usando loops. No exemplo abaixo, percorremos cada aldeia e seus ninjas:

          */

        //O primeiro array será uma referência para o próximo array

        String[][] aldeiasENinjas = {
                {"Aldeia da Folha", "Naruto", "Sasuke", "Sakura"},
                {"Aldeia da Areia", "Gaara", "Kankuro", "Temari"},
                {"Aldeia da Névoa", "Zabuza", "Haku"},
                {"Aldeia da Nuvem", "Darui", "C"},
                {"Aldeia da Pedra", "Kurotsuchi", "Akatsuchi"}
        };
        for (int i = 0; i < aldeiasENinjas.length; i++) {
            System.out.println("Aldeia: " + aldeiasENinjas[i][0]);
            for (int j = 1; j < aldeiasENinjas[i].length; j++) {
                System.out.println("Ninja: " + aldeiasENinjas[i][j]);
            }
        }
    }
}
