public class Viatura {

    private String tipo;
    private int numRodas;
    private int velocidadeMax;

    
    
    public Viatura() {
        this.numRodas = 2;
    }

    public Viatura(String tipo, int numRodas, int velocidadeMax) {
        this.tipo = tipo;
        this.numRodas = numRodas;
        this.velocidadeMax = velocidadeMax;
    }

    public String getTipo() {
        return tipo;
    }
    public int getNumRodas() {
        return numRodas;
    }
    public int getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void mostrarInfo() {
        System.out.println("Vou mostrar a informação do carro:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de Rodas: " + numRodas);
        System.out.println("Velocidade Máxima: " + velocidadeMax);

    }
}
