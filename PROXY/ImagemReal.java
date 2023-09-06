public class ImagemReal implements Imagem {
    private String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }

    @Override
    public void display() {
        System.out.printf("Apresentando imagem %s...\n", nomeArquivo);
    }

    private void carregarDoDisco() {
        System.out.printf("Carregando imagem %s...\n", nomeArquivo);
    }
}