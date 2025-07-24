import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main (String[] args) {

        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        } catch (InputMismatchException e) {
            System.out.println("Os parâmetros devem ser apenas números!");
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int ind = 0; ind < contagem; ind++) {
            System.out.println("Imprimindo o número " + (ind + 1));
        }

    }
}
