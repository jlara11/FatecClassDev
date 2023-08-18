// Classe base de produto
class Produto {
    private String nome;
    private String preco;

    public Produto(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + this.nome + ", Preço: " + this.preco);
    }
}

// Subclasses de produto
class Eletronico extends Produto {
    public Eletronico(String nome, String preco) {
        super(nome, preco);
    }
}

class Roupa extends Produto {
    public Roupa(String nome, String preco) {
        super(nome, preco);
    }
}

// Fábrica abstrata de produtos
interface FabricaDeProdutos {
    Produto criarProduto(String nome, String preco);
}

// Fábrica concreta de eletrônicos
class FabricaDeEletronicos implements FabricaDeProdutos {
    public Produto criarProduto(String nome, String preco) {
        return new Eletronico(nome, preco);
    }
}

// Fábrica concreta de roupas
class FabricaDeRoupas implements FabricaDeProdutos {
    public Produto criarProduto(String nome, String preco) {
        return new Roupa(nome, preco);
    }
}

// Uso das fábricas
public class FactoryMethod02 {
    public static void main(String[] args) {
        FabricaDeProdutos fabricaDeEletronicos1 = new FabricaDeEletronicos();
        Produto celular = fabricaDeEletronicos1.criarProduto("celular", "500");
        celular.exibirDetalhes();

        FabricaDeProdutos fabricaDeEletronicos2 = new FabricaDeEletronicos();
        Produto notebook = fabricaDeEletronicos2.criarProduto("notebook", "3500");
        notebook.exibirDetalhes();

        FabricaDeProdutos fabricaDeRoupas = new FabricaDeRoupas();
        Produto camiseta = fabricaDeRoupas.criarProduto("camiseta", "50");
        camiseta.exibirDetalhes();
    }
}
