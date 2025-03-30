import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Criando produtos
        Produto produto = new Produto(1, "PC DA CASAS BAHIA", new BigDecimal(3599));
        Produto produto1 = new Produto(2, "PC GAMER", new BigDecimal(2999));

        // Criando pedidos
        Pedido pedido = new Pedido(1);  // Pedido 1
        Pedido pedido2 = new Pedido(2); // Pedido 2

        // Adicionando produtos aos pedidos
        pedido.adicionarProduto(produto);
        pedido2.adicionarProduto(produto1);

        // Exibindo os pedidos
        System.out.println("pedido: " + pedido);
        System.out.println("pedido2: " + pedido2);

        // Calculando o total dos pedidos
        System.out.println("Total do pedido 1: R$ " + pedido.calcularTotal());
        System.out.println("Total do pedido 2: R$ " + pedido2.calcularTotal());
    }
}
