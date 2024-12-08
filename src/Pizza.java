public class Pizza {
    private String sabor1;
    private String sabor2;
    private int verfSabor;
    private float preco;
    private boolean desconto;
    private int quantidade;


    public static void cardapio(){
        System.out.println("--------------Cardápio--------------\n" +
                "[1] Portuguesa..................50~70\n" +
                "[2] Calabresa...................50~70\n" +
                "[3] Catupiri....................50~70\n" +
                "[4] Frango......................50~70\n" +
                "\t     Especiais\n" +
                "[5] 7 Queijos...................80~100\n" +
                "[6] Vegetariana.................80~100\n" +
                "[7] Brigadeiro..................80~100\n" +
                "[8] Camarão.....................80~100\n" +
                "-------------------------------------\n");
    }

    public Pizza(int verfSabor1,int verfSabor2 , int quantidade) {
        this.setVerfSabor(verfSabor1,verfSabor2);
        this.quantidade = quantidade;
    }

    public String getSabor1() {
        return sabor1;
    }

    public void setSabor1(String sabor1) {
        this.sabor1 = sabor1;
    }

    public String getSabor2() {
        return sabor2;
    }

    public void setSabor2(String sabor2) {
        this.sabor2 = sabor2;
    }

    public int getVerfSabor() {
        return verfSabor;
    }

    public void setVerfSabor(int verfSabor1, int verfSabor2) {
        int[] sabor = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] tPizza = {"Portuguesa", "Calabresa", "Catupiri", "Frango", "7Queijos", "Vegetariana", "Brigadeiro", "Camarão"};
        this.preco = 0;
    
        if (verfSabor1 >= 1 && verfSabor1 <= 8 && verfSabor2 >= 1 && verfSabor2 <= 8) {
            for (int i = 0; i < 8; i++) {
                if (sabor[i] == verfSabor1) {
                    this.sabor1 = tPizza[i];
                    if (verfSabor1 >= 1 && verfSabor1 <= 4) {
                        this.preco += 25; 
                    } else if (verfSabor1 >= 5 && verfSabor1 <= 8) {
                        this.preco += 40;
                    }
                }
                if (sabor[i] == verfSabor2) {
                    this.sabor2 = tPizza[i];
                    if (verfSabor2 >= 1 && verfSabor2 <= 4) {
                        this.preco += 25;
                    } else if (verfSabor2 >= 5 && verfSabor2 <= 8) {
                        this.preco += 40;
                    }
                }
            }
        } else {
            System.out.println("Impossível definir um sabor");
        }
    }    

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



}