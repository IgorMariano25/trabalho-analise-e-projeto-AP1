package JAVA;
public class Revista extends Publicacao {
    private int mes;
    private int ano;

    public Revista(String titulo, int mes, int ano, Persistencia persistencia) {
        super(titulo, persistencia);
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void salvar() {
        persistencia.salvar(this);
    }

    public void recuperar() {
        persistencia.recuperar(this);
    }
}
