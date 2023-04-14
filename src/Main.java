
public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario usuario1 = new Usuario("Luís", "123.123.123-00", "luisvazsouza@gmail.com");
        Usuario usuario2 = new Usuario("Jose", "456.456.456-00", "jose@email.com");

        // Criando produtos
        Produto produto1 = new Produto("Teclado", 69.99);
        Produto produto2 = new Produto("Mouse", 52.50);
        Produto produto3 = new Produto("Headset", 80.00);
        Produto produto4 = new Produto("Mouse-Pad", 25.50);


        // Criando vendas
        Venda venda1 = new Venda(1, usuario1);
        venda1.adicionarItem(new ItemVenda(produto1, 2));
        venda1.adicionarItem(new ItemVenda(produto2, 1));
        venda1.adicionarItem(new ItemVenda(produto3, 3));

        Venda venda2 = new Venda(2,usuario2);
        venda2.adicionarItem(new ItemVenda(produto2, 3));
        venda2.adicionarItem(new ItemVenda(produto3, 2));

        // Exibindo informações das vendas
        System.out.println(venda1);
        System.out.println(venda2);
    }
}
