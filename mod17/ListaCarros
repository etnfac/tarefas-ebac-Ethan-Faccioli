import java.util.ArrayList;
import java.util.List;

abstract class Carro {
    protected String marca;
    protected String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void exibirDetalhes();
}

class Sedan extends Carro {
    public Sedan(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Sedan: " + marca + " " + modelo + " - Ideal para a cidade e viagens confortáveis.");
    }
}

class SUV extends Carro {
    public SUV(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("SUV: " + marca + " " + modelo + " - Robusto e com tração para qualquer terreno.");
    }
}

class Esportivo extends Carro {
    public Esportivo(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Esportivo: " + marca + " " + modelo + " - Focado em alta velocidade e aerodinâmica.");
    }
}

public class ListaGenericaCarros {
    public static void main(String[] args) {
        
        System.out.println("Garagem de Carros\n");

        List<Carro> garagem = new ArrayList<>();

        garagem.add(new Sedan("Honda", "Civic"));
        garagem.add(new SUV("Toyota", "Corolla Cross"));
        garagem.add(new Esportivo("Porsche", "911 Carrera"));

        for (Carro carro : garagem) {
            carro.exibirDetalhes();
        }
    }
}