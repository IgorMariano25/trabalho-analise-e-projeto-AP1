public class TesteProxy {
    public static void main(String[] args) {

        Imagem imagem1 = new ProxyImagem("teste1_10mb.jpg");
        Imagem imagem2 = new ProxyImagem("teste2_10mb.jpg");

        // A imagem1 é carregada (uma única vez) quando for apresentada
        imagem1.display();
        imagem1.display();

        // A imagem2 nunca é carregada para a memória...
        imagem2.display();
    }
}
