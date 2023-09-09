// // Classe abstrata que define o Template Method
// abstract class DocumentMiner {
//     boolean anyDocumentProcessed = false;

//     public void mineDocument(String filePath) {
//             // Passo 1: Abrir o documento
//             openDocument(filePath);
    
//             // Passo 2: Extrair dados do documento
//             mineData();
    
//             // Passo 3: Fechar o documento
//             closeDocument();

//             // Passo 4: Ir para o próximo documento
//             nextDocument();
//     }

//     protected abstract void openDocument(String filePath);

//     protected abstract void mineData();

//     protected abstract void closeDocument();

//     protected abstract void nextDocument();
// }

abstract class DocumentMiner {
    boolean anyDocumentProcessed = true;
    boolean lastDocumentProcessed = false;

    public void mineDocument(String filePath) {
        if (anyDocumentProcessed) {
            // Passo 1: Abrir o documento
            openDocument(filePath);
    
            // Passo 2: Extrair dados do documento
            mineData();
    
            // Passo 3: Fechar o documento
            closeDocument();

            if (!lastDocumentProcessed) {
                // Passo 4: Ir para o próximo documento
                nextDocument();
            }
        }
    }

    protected abstract void openDocument(String filePath);

    protected abstract void mineData();

    protected abstract void closeDocument();

    protected abstract void nextDocument();
}