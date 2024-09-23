import java.util.Scanner;

public class Beecrowd1045 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        double A, B, C;
        String sequencia;
        String[] partes;

        //ler a sequência
        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");

        //atribuir valores às variáveis de forma decresente
        A = Math.max(Double.parseDouble(partes[0]), Math.max(Double.parseDouble(partes[1]), Double.parseDouble(partes[2])));
        B = Math.max(Double.parseDouble(partes[0]), Math.min(Double.parseDouble(partes[1]), Double.parseDouble(partes[2])));
        C = Math.min(Double.parseDouble(partes[0]), Math.min(Double.parseDouble(partes[1]), Double.parseDouble(partes[2])));

        //verificar as condições do triângulo e mostrar resultado no console
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }
        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}