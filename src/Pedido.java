import java.util.Random;

public class Pedido {
    private static int contadorPedidos = 1; // Contador de pedidos
    private int numeroPedido;
    private Cliente cliente;
    private Pizza pizza;
    private int tempEntrega = 40; // Tempo fixo de entrega
    private int tempEntregaEstimada;
    private boolean delivery;
    private float taxaEntrega = 6.0f; // Taxa de entrega fixa
    private int quantidade;


    // Exibe a nota fiscal do pedido
    public void notaFiscal() {
        System.out.println("-------------Nota fiscal-------------");
        System.out.println("Número do Pedido: " + this.numeroPedido);
        //Relacionamento de classes
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Sabor: " + this.pizza.getSabor1() +" e " + this.pizza.getSabor2());
        System.out.println("Quantidade: " + this.pizza.getQuantidade());

        if (delivery) {
            System.out.println("Endereço: " + this.cliente.getEndereco());
            System.out.println("Delivery? Sim (Taxa de entrega: R$ 6.00)");
            System.out.println("Tempo fixo de entrega: " + this.tempEntrega + " minutos");
            System.out.println("Tempo que foi entregue: " + this.tempEntregaEstimada + " minutos");

            if (this.tempEntregaEstimada > this.tempEntrega) {
                System.out.println("Atrasou? Sim, desconto aplicado.");
            } else {
                System.out.println("Atrasou? Não.");
            }
        } else {
            System.out.println("Delivery? Não");
            System.out.println("Local de retirada: " + this.cliente.getEndereco());
        }

        System.out.printf("Valor total: R$ %.2f\n", calcularTotal());
    }

    // Construtor atualizado
    public Pedido(Cliente cliente, Pizza pizza) {
        this.numeroPedido = contadorPedidos++;
        this.cliente = cliente;
        this.pizza = pizza;

        // Verifica o delivery usando o método na classe Cliente
        this.delivery = cliente.isDelivery();

        // Se for delivery, solicita o endereço
        if(!delivery){
            cliente.setEndereco("UFMA ao lado do Paulo Freire");
        }
        gerarTempoEntregaEstimada();
    }

    // Gera um tempo estimado de entrega aleatório (entre 10 e 100 minutos)
    private void gerarTempoEntregaEstimada() {
        Random random = new Random();
        this.tempEntregaEstimada = 10 + random.nextInt(91);
    }

    // Calcula o valor total do pedido
    public float calcularTotal() {
        float total = this.pizza.getPreco() * this.pizza.getQuantidade();

        // Aplica desconto de atraso na entrega e calcula o desconto
        if(delivery){
            total += this.taxaEntrega;
            if(this.tempEntregaEstimada > this.tempEntrega){
                // Desconta R$ 20,00
                total -= 20.0f; 
            }
        }

        // Garante que o total não seja negativo
        if(total < 0){
            total = 0;
        }

        return total;
    }


    // Getters e setters Cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    //get e set de Pizza
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    //set e get de quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

     //get e set taxa de entrega
    public float getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }


    //get e set do tempo de entrega
    public int getTempEntrega() {
        return tempEntrega;
    }

    public void setTempEntrega(int tempEntrega) {
        this.tempEntrega = tempEntrega;
    }

    //get e set de tempo de entrega estimada
    public int getTempEntregaEstimada() {
        return tempEntregaEstimada;
    }

    public void setTempEntregaEstimada(int tempEntregaEstimada) {
        this.tempEntregaEstimada = tempEntregaEstimada;
    }
}
