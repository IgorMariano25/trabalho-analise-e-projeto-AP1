package JAVA;
class CarroProduct {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int numeroPortas;
    private double potenciaMotor;

    public CarroProduct(String marca, String modelo, int anoFabricacao, int numeroPortas, double potenciaMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "Marca: "+ marca + 
                "\nMoodelo: " + modelo + 
                "\nAno de Fabricação: " + anoFabricacao + 
                "\nNúmero de Portas: " + numeroPortas + 
                "\nPotência do Motor: " + potenciaMotor;
    }
}