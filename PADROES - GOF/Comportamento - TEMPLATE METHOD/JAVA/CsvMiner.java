package JAVA;
// Classe concreta para mineração de documentos CSV

import java.io.File;

class CsvMiner extends DocumentMiner {
    private File csvFile;

    @Override
    protected void openDocument(String filePath) {
        System.out.println("Abrindo documento CSV: " + filePath);
        csvFile = new File(filePath);
    }

    @Override
    protected void mineData() {
        System.out.println("Extraindo dados de um documento CSV");
        System.out.println("Status da leitura: Lendo arquvivo...");
    }

    @Override
    protected void closeDocument() {
        System.out.println("Leitura concluída com sucesso !");
        System.out.println("Fechando documento CSV: " + csvFile.getName());
    }

    @Override
    protected void nextDocument() {
        System.out.println("\n---------- Próximo Arquivo ----------");
    }
}