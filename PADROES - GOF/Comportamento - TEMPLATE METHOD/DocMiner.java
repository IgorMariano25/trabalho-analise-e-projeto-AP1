// Classe concreta para mineração de documentos DOC

import java.io.File;

class DocMiner extends DocumentMiner {
    private File docFile;

    @Override
    protected void openDocument(String filePath) {
        System.out.println("Abrindo documento DOC: " + filePath);
        docFile = new File(filePath);
    }

    @Override
    protected void mineData() {
        System.out.println("Extraindo dados de um documento DOC");
        System.out.println("Status da leitura: Lendo arquvivo...");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Leitura concluída com sucesso !");
        System.out.println("Fechando documento DOC: " + docFile.getName());
    }

    @Override
    protected void nextDocument() {
        System.out.println("\n---------- Próximo Arquivo ----------");
    }
}