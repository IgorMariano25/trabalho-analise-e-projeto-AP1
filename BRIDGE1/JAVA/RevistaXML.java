package JAVA;

public class RevistaXML implements Persistencia {

    @Override
    public void salvar(Publicacao publicacao) {
        if (publicacao instanceof Revista) {
            Revista revista = (Revista) publicacao;
            System.out.printf("Salvando LIVRO no XML...\nTítulo: %s\nMês: %s\nAno: %s\n\n",
                    revista.getTitulo(),
                    revista.getMes(),
                    revista.getAno());
        } else {
            System.out.println("Erro: Tentativa de salvar objeto não compatível com Revista no XML.");
        }
    }

    @Override
    public void recuperar(Publicacao publicacao) {
        System.out.println("Recuperando REVISTA do XML...\n\n");
    }
}
