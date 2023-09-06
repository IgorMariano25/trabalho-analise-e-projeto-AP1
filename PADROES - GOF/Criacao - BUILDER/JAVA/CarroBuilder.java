package JAVA;
// Builder
interface CarroBuilder {
    CarroBuilder setMarca(String marca);
    CarroBuilder setModelo(String modelo);
    CarroBuilder setAnoFabricacao(int anoFabricacao);
    CarroBuilder setNumeroPortas(int numeroPortas);
    CarroBuilder setPotenciaMotor(double potenciaMotor);
    CarroProduct build();
}