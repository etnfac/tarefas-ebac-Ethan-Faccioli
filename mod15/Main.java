interface Sedan {
    void exibirInfoSedan();
}

interface SUV {
    void exibirInfoSUV();
}

class Corolla implements Sedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Sedan Toyota: Corolla - Confiável e econômico.");
    }
}

class CorollaCross implements SUV {
    @Override
    public void exibirInfoSUV() {
        System.out.println("SUV Toyota: Corolla Cross - Espaçoso e robusto.");
    }
}

class Civic implements Sedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Sedan Honda: Civic - Esportivo e tecnológico.");
    }
}

class HRV implements SUV {
    @Override
    public void exibirInfoSUV() {
        System.out.println("SUV Honda: HR-V - Compacto e ágil.");
    }
}

interface FabricaDeCarros {
    Sedan criarSedan();
    SUV criarSUV();
}

class FabricaToyota implements FabricaDeCarros {
    @Override
    public Sedan criarSedan() {
        return new Corolla();
    }

    @Override
    public SUV criarSUV() {
        return new CorollaCross();
    }
}

class FabricaHonda implements FabricaDeCarros {
    @Override
    public Sedan criarSedan() {
        return new Civic();
    }

    @Override
    public SUV criarSUV() {
        return new HRV();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Testando a Fábrica da Toyota");
        FabricaDeCarros fabricaToyota = new FabricaToyota();
        
        Sedan meuSedanToyota = fabricaToyota.criarSedan();
        SUV meuSUVToyota = fabricaToyota.criarSUV();
        
        meuSedanToyota.exibirInfoSedan();
        meuSUVToyota.exibirInfoSUV();

        System.out.println("\nTestando a Fábrica da Honda");

        FabricaDeCarros fabricaHonda = new FabricaHonda();
        
        Sedan meuSedanHonda = fabricaHonda.criarSedan();
        SUV meuSUVHonda = fabricaHonda.criarSUV();
        
        meuSedanHonda.exibirInfoSedan();
        meuSUVHonda.exibirInfoSUV();
    }
}