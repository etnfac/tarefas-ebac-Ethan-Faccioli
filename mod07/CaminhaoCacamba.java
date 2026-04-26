/**
 * Classe que representa um Caminhão Caçamba no mundo real.
 * Esta classe foi criada para o exercício da EBAC,
 * demonstrando a união de características (atributos) e comportamentos (ações).
 */
public class CaminhaoCacamba {

    // Propriedades (Atributos do objeto)
    String marca;
    String modelo;
    double capacidadeCargaToneladas;
    boolean cacambaLevantada;

    // Métodos
    public void ligarMotor() {
        System.out.println("O motor do caminhão " + modelo + " está ligado e barulhento!");
    }

    public void levantarCacamba() {
        if (!cacambaLevantada) {
            cacambaLevantada = true;
            System.out.println("Erguendo a caçamba para descarregar o material.");
        } else {
            System.out.println("Atenção: A caçamba já está totalmente levantada.");
        }
    }

    public void abaixarCacamba() {
        if (cacambaLevantada) {
            cacambaLevantada = false;
            System.out.println("Abaixando a caçamba. O caminhão está pronto para o transporte.");
        } else {
            System.out.println("A caçamba já está na posição de descanso.");
        }
    }
}