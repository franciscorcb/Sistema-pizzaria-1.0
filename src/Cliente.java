public class Cliente {
    private String nome;
    private String endereco;
    private boolean delivery;

    public Cliente(String nome, String endereco,boolean delivery) {
        this.nome = nome;
        this.delivery = delivery;

        if (delivery) {
            this.endereco = "UFMA ao lado do Paulo Freire";
        } else {
            this.endereco = endereco;
        }
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (!delivery) {
            this.endereco = "UFMA ao lado do Paulo Freire";
        } else {
            this.endereco = endereco;
        }
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }
}
