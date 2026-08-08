package questao1;

public class Aluno {

    String nome;
    double notas;
    int idade;

    public static void main(String[] args) throws Exception {
       
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Lay";
        aluno1.notas = 9.5;
        aluno1.idade = 24;

        System.out.println("Nome: " + aluno1.nome ); 
        System.out.println("Idade: " + aluno1.idade );

        if (aluno1.notas >= 7) {
            System.out.println("Nota: " + aluno1.notas + " - Aprovado");
        } else {
            System.out.println("Nota: " + aluno1.notas + " - Reprovado");
        }
    }
    
    }
