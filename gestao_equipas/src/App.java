public class App {
    public static void main(String[] args) throws Exception {
        
        Viatura carro = new Viatura();

        carro.setTipo("Carro de corrida");
        carro.setNumRodas(4);
        carro.setVelocidadeMax(300);

        carro.mostrarInfo();
    }


}
