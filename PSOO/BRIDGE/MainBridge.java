public class MainBridge {
    public static void main(String[] args) {
        DesenhoAPI api1 = new DesenhoAPI1();
        DesenhoAPI api2 = new DesenhoAPI2();

        Forma circulo1 = new Circulo(1, 2, 3, api1);
        Forma circulo2 = new Circulo(5, 7, 11, api2);

        circulo1.desenhar();
        circulo2.desenhar();
    }
}