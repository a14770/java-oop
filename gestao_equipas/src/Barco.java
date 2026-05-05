public class Barco extends Viatura {

    private boolean temPiscina;

    public Barco() {
        super("Barco", 0, 0);
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }
     
    @Override
    public void mostrarInfo() {
        System.out.println("\nVou mostrar a informação do barco:");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Número de Rodas: " + getNumRodas());
        System.out.println("Velocidade Máxima: " + getVelocidadeMax());
        if (temPiscina){
            System.out.println("Tem Pescina:  ");
        }else {
            System.out.println("Não tem Pescina:  ");
        }

    }
}
