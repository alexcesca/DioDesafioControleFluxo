import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O Segundo parametro deve ser superior ao primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        System.out.println("Contando até "+contagem);
        for ( int i = 0;i<contagem;i++){
            System.out.println(i+1);
        }
    }
}