package JAVA;
public abstract class Publicacao {
    protected String titulo;
    protected Persistencia persistencia;

    public Publicacao(String titulo, Persistencia persistencia) {
        this.titulo = titulo;
        this.persistencia = persistencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void salvar();

    public abstract void recuperar();
}
