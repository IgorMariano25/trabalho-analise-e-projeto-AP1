package JAVA;
// Classe concreta para mineração de documentos PDF

import java.io.File;

class PdfMiner extends DocumentMiner {
    private File pdfFile;

    @Override
    protected void openDocument(String filePath) {
        System.out.println("Abrindo documento PDF: " + filePath);
        pdfFile = new File(filePath);
    }

    @Override
    protected void mineData() {
        System.out.println("Extraindo dados de um documento PDF");
        System.out.println("Status da leitura: Lendo arquvivo...");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Leitura concluída com sucesso !");
        System.out.println("Fechando documento PDF: " + pdfFile.getName());
    }

    @Override
    protected void nextDocument() {
        System.out.println("\n---------- Próximo Arquivo ----------");
    }
}