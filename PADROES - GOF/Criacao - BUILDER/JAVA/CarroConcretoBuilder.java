package JAVA;
class CarroConcretoBuilder implements CarroBuilder {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int numeroPortas;
    private double potenciaMotor;

    @Override
    public CarroBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public CarroBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public CarroBuilder setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
        return this;
    }

    @Override
    public CarroBuilder setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
        return this;
    }

    @Override
    public CarroBuilder setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
        return this;
    }

    @Override
    public CarroProduct build() {
        return new CarroProduct(marca, modelo, anoFabricacao, numeroPortas, potenciaMotor);
    }
}