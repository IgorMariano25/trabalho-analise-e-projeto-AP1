package JAVA;

public class LivroBD implements Persistencia {

    @Override
    public void salvar(Publicacao publicacao) {
        if (publicacao instanceof Livro) {
            Livro livro = (Livro) publicacao;
            System.out.printf("Salvando LIVRO no BD...\nTítulo: %s\nAutor: %s\nISBN: %s\n\n",
                    livro.getTitulo(),
                    livro.getAutor(),
                    livro.getIsbn());
        } else {
            System.out.println("Tipo de publicação não suportado para salvar no BD. (Livro)\n");
        }
    }

    @Override
    public void recuperar(Publicacao publicacao) {
        System.out.println("Recuperando LIVRO do BD...\n");
    }
}
