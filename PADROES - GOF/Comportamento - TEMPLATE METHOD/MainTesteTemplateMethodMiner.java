public class MainTesteTemplateMethodMiner {
    public static void main(String[] args) {

        System.out.println("\n---------------------------------------");
        System.out.println("    Iniciando Leitura de Documentos      ");
        System.out.println("---------------------------------------  \n");

        DocumentMiner docMiner = new DocMiner();
        docMiner.mineDocument("Documento.csv");

        DocumentMiner csvMiner = new CsvMiner();
        csvMiner.mineDocument("Documento.csv");

        DocumentMiner pdfMiner = new PdfMiner();
        pdfMiner.lastDocumentProcessed = true;
        pdfMiner.mineDocument("Documento.pdf");

        System.out.println("\n---------------------------------------");
        System.out.println("     Leitura Concluída com sucesso !     ");
        System.out.println("---------------------------------------  \n");
    }
}