import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de entrega de pizza da UFMA!");

        //Pizza.cardapio();

        int n=3;
        Pizza pizza[] = new Pizza[n];
        Cliente cliente[] = new Cliente[n];
        pizza[0] = new Pizza(5,3, 1);
        cliente[0] = new Cliente("Francisco", "Rua das Flores, 123", true);
        pizza[1] = new Pizza(6,2, 5);
        cliente[1] = new Cliente("joana", "Rua 123", true);
        pizza[2] = new Pizza(8,1, 1);
        cliente[2] = new Cliente("Mikael", "maiobas", false);

        // Loop para exibir os pedidos, Simulando o historico de Pedidos ja realizados
        for(int i =0;i<1;i++){
            Pedido pedido = new Pedido(cliente[i], pizza[i]);
            pedido.notaFiscal();
            System.out.println("\n");
        }
        
    }
}
