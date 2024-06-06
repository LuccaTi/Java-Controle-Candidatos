package desafioFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int primeiroParametro = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int segundoParametro = terminal.nextInt();

            contar(primeiroParametro, segundoParametro);
        } catch (ParametroInvalidoException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametroInvalidoException {
        if (primeiroParametro > segundoParametro){
            throw new ParametroInvalidoException();
        } else {
            int contagem = segundoParametro - primeiroParametro;
            System.out.println("Valor da contagem: " + contagem);
        }
    }
}
