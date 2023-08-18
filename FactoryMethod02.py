#SUPERCLASSE CONSTRUCTOR
class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco  = preco

    def exibirDetalhes(self):
        print(f"Nome: {self.nome},Preço: {self.preco},")

# Subclasses de veiculo
class Eletronico(Produto):
    def __init__(self, nome,preco):
        super().__init__(nome,preco)

class Roupa(Produto):
    def __init__(self, nome,preco):
        super().__init__(nome,preco)        

# Fabrica abstrata de veiculo
class FabricaDeProdutos:
    def criarProduto(self, nome,preco):
        raise NotImplementedError("O método criarProduto deve ser implementado pelas subclasses")

# Fabrica concreta de carros
class FabricaDeEletronicos(FabricaDeProdutos):
    def criarProduto(self, nome,preco):
        return Eletronico(nome,preco)

# Fabrica concreta de motos
class FabricaDeRoupas(FabricaDeProdutos):
    def criarProduto(self, nome,preco):
        return Roupa(nome,preco)

# USO DAS FABRICAS
fabricaDeEletronicos1 = FabricaDeEletronicos()
celular = fabricaDeEletronicos1.criarProduto('celular',500)
celular.exibirDetalhes()

fabricaDeEletronicos2 = FabricaDeEletronicos()
notebook = fabricaDeEletronicos2.criarProduto('notebook',3500)
notebook.exibirDetalhes()

fabricaDeRoupas = FabricaDeRoupas()
camiseta = fabricaDeRoupas.criarProduto('camiseta',50)
camiseta.exibirDetalhes()