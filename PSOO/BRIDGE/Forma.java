abstract class Forma {
    protected DesenhoAPI desenhoAPI;

    protected Forma(DesenhoAPI desenhoAPI) {
        this.desenhoAPI = desenhoAPI;
    }

    public abstract void desenhar();
}