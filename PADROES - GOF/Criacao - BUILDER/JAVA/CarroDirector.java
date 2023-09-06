package JAVA;
class CarroDirector {
    private CarroBuilder builder;

    public CarroDirector(CarroBuilder builder) {
        this.builder = builder;
    }

    public CarroProduct construirCarro() {
        return builder.build();
    }
}