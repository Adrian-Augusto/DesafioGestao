import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;

    List<Produto> produtos = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
    }


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void Remover(Produto produto) {
        produtos.remove(id);


    }
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco().doubleValue();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", produtos=" + produtos +
                '}';
    }
}