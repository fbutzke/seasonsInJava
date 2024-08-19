
import java.util.Scanner;

    public class EstaçãoDoAno {
   
    public static void main(String[] args) {
        Scanner digita = new Scanner(System.in);
        System.out.print("Digite o mês (1-12): ");
        int mes = digita.nextInt();

        System.out.print("Digite o dia (1-31): ");
        int dia = digita.nextInt();

        String estacao;

        if (dia < 1 || dia > 31) {
            estacao = "O dia digitado é inválido";
        }
            else {
            switch (mes) {
            case 12:
                estacao = (dia >= 21) ? "Verão" : "Primavera";
                break;
            case 1:
            case 2:
                estacao = "Verão";
                break;
            case 3:
                estacao = (dia >= 20) ? "Outono" : "Verão";
                break;
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
                estacao = (dia >= 21) ? "Inverno" : "Outono";
                break;
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
                estacao = (dia >= 23) ? "Primavera" : "Inverno";
                break;
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            default:
                estacao = "O mês digitado é inválido";
                break;
        }

        System.out.println("A estação é: " + estacao);
        digita.close();
    }
}
    }
        

