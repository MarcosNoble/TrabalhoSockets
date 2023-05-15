// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class DIO {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;
        String result;
        if(renda < 2000.01){
            System.out.println("Isento");
        }
        if(renda >=2000.01 && renda < 3000.01){
            renda= renda-2000.01;
            imposto = renda*0.08;
            result = String.format("%.2f", imposto);
            System.out.println("R$ "+ result);
        }
        if(renda >=3000.01 && renda < 4500.01){
            renda= renda-3000.01;
            imposto = 80+renda*0.18;
            result = String.format("%.2f", imposto);
            System.out.println("R$ "+ result);
        }
        if(renda >=4500.01 ){
            renda= renda-4500;
            imposto = 80+180+renda*0.28;
            result = String.format("%.2f", imposto);
            System.out.println("R$ "+result);
        }


    }

}