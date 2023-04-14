import java.util.ArrayList;
import java.util.List;
public class Venda {

    private int codigo;

    private Usuario usuario;

    private List<ItemVenda> itens;


    public Venda (int codigo, Usuario usuario){
        this.codigo = codigo;
        this.usuario = usuario;
        this.itens = new ArrayList<>();

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemVenda item){
        itens.add(item);

    }

    public double getTotal(){
        double total = 0.0;
        for(ItemVenda item : itens) {
            total += item.getPrecoTotal();
        }
        return total;


    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda: ");
        sb.append(codigo);
        sb.append(", CLiente: ");
        sb.append(usuario.getNome());
        sb.append(", Total: ");
        sb.append(String.format("R$%.2f", getTotal()));
        sb.append("\n");

        for (ItemVenda item : itens){
            sb.append(item.getProduto().getNome());
            sb.append(", Preço: ");
            sb.append(String.format("R$%.2f",item.getProduto().getPreco()));
            sb.append(", Quantidade: ");
            sb.append(item.getQuantidade());
            sb.append(", Total: ");
            sb.append(String.format("R$%.2f",item.getPrecoTotal()));
            sb.append("\n");

        }
        return sb.toString();
    }
}
