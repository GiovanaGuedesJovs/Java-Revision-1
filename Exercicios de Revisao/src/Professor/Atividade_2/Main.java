package Professor.Atividade_2;

public class Main {
    public static void main(String[] args) throws Exception {

        Produto produto1 = new Produto(3066, 29.5, "Livro 1984, George Orwell");
        Produto produto2 = new Produto(0766, 48.5, "Livro A Metamorfose, Franz Kafka");

        ItemPedido itemPedido1 = new ItemPedido(produto1, 3);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 6);

        Pedido pedido = new Pedido();

        pedido.adicionarItem(itemPedido1);
        pedido.adicionarItem(itemPedido2);

        System.out.println("Descição do pedido:");
        pedido.imprimirItens();
        System.out.println("\nO valor total do pedido é: R$"+pedido.getValorTotal());

    }
}
