public class ProxyImagem implements Imagem {

    private ImagemReal imagem;
    private String nomeArquivo;

    public ProxyImagem(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void display() {
        if (imagem == null) {
            imagem = new ImagemReal(nomeArquivo);
        }
        imagem.display();
    }
}
