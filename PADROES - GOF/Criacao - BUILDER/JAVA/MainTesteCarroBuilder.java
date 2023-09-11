package JAVA;
public class MainTesteCarroBuilder {
    public static void main(String[] args) {
        CarroBuilder builder = new CarroConcretoBuilder();
        // CarroDirector director = new CarroDirector(builder);

        // Configurando os atributos do carro Ferrari
        CarroProduct ferrari = builder
                .setMarca("Ferrari")
                .setModelo("458 Italia")
                .setAnoFabricacao(2015)
                .setNumeroPortas(2)
                .setPotenciaMotor(2.6)
                .build();

        System.out.println("Carro construído com sucesso !");
        System.out.println("------------------------------");
        System.out.println(ferrari);
        System.out.println("------------------------------");
    }
}