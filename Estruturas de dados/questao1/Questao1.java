package questao1;

public class Questao1 {
    public static void main(String[] args) {

      /*   double notas [] = {9.5, 2.5, 7.5, 8.5, 6.5};


        for (int i = 0; i < notas.length; i++) {
                
            if (notas[i] >= 6) {

                System.out.println("Nota " + (i + 1) + ": " + notas[i] + " - Aprovado");
            } else {

                System.out.println("Nota " + (i + 1) + ": " + notas[i] + " - Reprovado");
            }*/
            
            double notas [] [] = 
            {
                {9.5, 2.5, 7.5},
                {7.0, 8.0, 9.0},
                {6.0, 7.0, 8.0},
            };

            for (int i = 0; i < notas.length; i++) {

                double soma = 0;

                for (int c = 0; c < notas[i].length; c++){

                    soma += notas[i][c];
                }
                double media = soma / notas[i].length;

                    if (media >= 7) {
                        System.out.println(" Média do aluno" + (i + 1) + " : " + media + " - Aluno Aprovado");
                        
                    } else {

                        System.out.println(" Média do aluno" + (i + 1) + " : " + media + " - Aluno Reprovado");
                    }
            }
    }
}

        
    

