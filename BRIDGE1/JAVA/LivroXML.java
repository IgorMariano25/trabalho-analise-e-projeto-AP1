package JAVA;
public class LivroXML implements Persistencia {

    @Override
    public void salvar(Publicacao publicacao) {
        if (publicacao instanceof Livro) {
            Livro livro = (Livro) publicacao;
            System.out.printf("Salvando LIVRO no XML...\nTítulo: %s\nAutor: %s\nISBN: %s\n\n",
                    livro.getTitulo(),
                    livro.getAutor(),
                    livro.getIsbn());
        } else {
            System.out.println("Erro: Tentativa de salvar objeto não compatível com Livro no XML.");
        }
    }

    @Override
    public void recuperar(Publicacao publicacao) {
        System.out.println("Recuperando LIVRO do XML...\n\n");
    }
}
