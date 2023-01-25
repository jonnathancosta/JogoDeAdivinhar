package Adivinha;
import java.util.Random;
import java.util.Scanner;
public class Jogo {
    public static void main(String[] args) {
        Random r = new Random(); //Técnica para gerar número aleatório. 
        int num = r.nextInt(20);//Definindo o alcance do número a ser gerado aleatoriamente.
        int x, i = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 20: ");
        x = s.nextInt();
        //Abaixo iremos definir as condições possíveis dentro do jogo e suas respectivas orientações ao usuário/jogador.
        while (x != num) { 
            i = i + 1;
            if (x > num) {
                System.out.println(x + " É maior que o número que deve adivinhar. \nTente novamente: ");
                x = s.nextInt();
            } else {
                System.out.println(x + " É menor que o número que deve adivinhar. \nTente novamente: ");
                x = s.nextInt();
            }
            if (x == num) {
                System.out.println("Parabéns! Você acertou em: " + i + " tentativas");
                s.close();

            }
        }
    }
}
