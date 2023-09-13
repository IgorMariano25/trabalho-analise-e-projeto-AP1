class DesenhoAPI1 implements DesenhoAPI {
    @Override
    public void desenharCirculo(int x, int y, int raio) {
        System.out.printf("API1 desenha o círculo no ponto (%d, %d) com raio %d%n", x, y, raio);
    }
}