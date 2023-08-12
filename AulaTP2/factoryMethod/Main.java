// Classe base de veículo
class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDetalhes() {
        System.out.println("Modelo: " + this.modelo);
    }
}

// Subclasses de veículo
class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }
}

class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }
}

// Fábrica abstrata de veículos
interface FabricaDeVeiculos {
    Veiculo criarVeiculo(String modelo);
}

// Fábrica concreta de carros
class FabricaDeCarros implements FabricaDeVeiculos {
    public Veiculo criarVeiculo(String modelo) {
        return new Carro(modelo);
    }
}

// Fábrica concreta de motos
class FabricaDeMotos implements FabricaDeVeiculos {
    public Veiculo criarVeiculo(String modelo) {
        return new Moto(modelo);
    }
}

// Uso das fábricas
public class Main {
    public static void main(String[] args) {
        FabricaDeVeiculos fabricaDeCarros = new FabricaDeCarros();
        Veiculo carro = fabricaDeCarros.criarVeiculo("Sedan");
        carro.mostrarDetalhes();

        FabricaDeVeiculos fabricaDeMotos = new FabricaDeMotos();
        Veiculo moto = fabricaDeMotos.criarVeiculo("Esportiva");
        moto.mostrarDetalhes();
    }
}
