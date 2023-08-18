// SUPERCLASSE CONSTRUCTOR
class Produto{
    constructor(nome, preco){
        this.nome = nome;
        this.preco = preco;
    }

    exibirDetalhes(){
        console.log(`Produto:${this.nome}, Preço: R$${this.preco}`);
    }
}

// SUBCLASSES DE PRODUTOS
class Eletronico extends Produto {
    constructor(nome, preco){
        super(nome, preco);
    }
}

class Roupa extends Produto {
    constructor(nome, preco){
        super(nome, preco);
    }
}

// FABRICA ABSTRATA DE PRODUTOS
class FabricaDeProdutos {
    criarProduto(nome, preco){
        throw  new Error('O método criarProduto deve ser implementado pelas subclasses')
    }
}

// FABRICA CONCRETA - PRODUTO ELETRONICO
class FabricaDeEletronicos extends FabricaDeProdutos{
    criarProduto(nome, preco){
        return new Eletronico(nome, preco);
    }
}

// FABRICA CONCRETA - PRODUTO ROUPAS
class FabricaDeRoupas extends FabricaDeProdutos{
    criarProduto(nome, preco){
        return new Roupa(nome, preco);
    }
}

// INTERFACE DE USO ###########################################################
const fabricaDeEletronicos1 = new FabricaDeEletronicos();
const celular = fabricaDeEletronicos1.criarProduto('Celular', 500);
celular.exibirDetalhes(); 

const fabricaDeRoupas1 = new FabricaDeRoupas();
const camiseta = fabricaDeRoupas1.criarProduto('Camiseta', 50);
camiseta.exibirDetalhes();

const fabricaDeEletronicos2 = new FabricaDeEletronicos();
const notebook = fabricaDeEletronicos1.criarProduto('Notebook', 3500);
notebook.exibirDetalhes(); 