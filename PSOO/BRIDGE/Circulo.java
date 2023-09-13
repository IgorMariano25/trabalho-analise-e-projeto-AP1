class Circulo extends Forma {
    private int x, y, raio;

    public Circulo(int x, int y, int raio, DesenhoAPI desenhoAPI) {
        super(desenhoAPI);
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        desenhoAPI.desenharCirculo(x, y, raio);
    }
}