package JAVA;

public class Livro extends Publicacao {
    private String autor;
    private String isbn;

    public Livro(String titulo, String autor, String isbn, Persistencia persistencia) {
        super(titulo, persistencia);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void salvar() {
        persistencia.salvar(this);
    }

    public void recuperar() {
        persistencia.recuperar(this);
    }
}
