package JAVA;

public class RevistaBD implements Persistencia {

    @Override
    public void salvar(Publicacao publicacao) {
        if (publicacao instanceof Revista) {
            Revista revista = (Revista) publicacao;
            System.out.printf("Salvando REVISTA no BD...\nTítulo: %s\nMês: %d\nAno: %d\n\n",
                    revista.getTitulo(),
                    revista.getMes(),
                    revista.getAno());
        } else {
            System.out.println("Tipo de publicação não suportado para salvar no BD. (Revista)\n");
        }
    }

    @Override
    public void recuperar(Publicacao publicacao) {
        System.out.println("Recuperando REVISTA do BD...\n\n");
    }
}