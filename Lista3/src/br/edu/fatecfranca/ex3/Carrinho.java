
package br.edu.fatecfranca.ex3;
import java.util.ArrayList;
import java.util.Date;

public class Carrinho {
   private int codigo;
   private Date data;
   private float valor;
   private ArrayList<ItemCarrinho> itens;

   public void Carrinho(){
       itens = new ArrayList();
   }
   
   public Carrinho(int codigo, Date data, float valor, ArrayList<ItemCarrinho> itens) {
       this.codigo = codigo;
       this.data = data;
       this.valor = valor;
       this.itens = itens;
   }

    public Carrinho(int codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
        this.itens = new ArrayList();
        this.valor = 0;
    } 
    
    public void addItem(ItemCarrinho item){
        this.itens.add(item);
        this.valor += item.getValor() * item.getQtd();
        System.out.println("Item adicionado com sucesso");
    }
    
    public void removeItem(ItemCarrinho item){
        if(this.itens.remove(item)){
            this.valor -= item.getValor() * item.getQtd();
            System.out.println("Item removido com sucesso");
        } else {
            System.out.println("Item não exite");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemCarrinho> itens) {
        this.itens = itens;
    }

    public String mostra() {
        return "Carrinho{" + "codigo=" + codigo + ", data=" + data + ", valor=" + valor + ", itens=" + itens + '}';
    }
}
