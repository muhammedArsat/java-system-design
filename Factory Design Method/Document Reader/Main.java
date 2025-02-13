interface DocumentReader{
    void read();
}

class Pdf implements DocumentReader{

    public void read(){
        System.out.println("Pdf Reader is Reading...");
    }
}

class Docx implements DocumentReader{
    public void read(){
        System.out.println("Docx Reader is Reading...");
    }
}

class Text implements DocumentReader{
    public void read(){
            System.out.println("Text Reader is Reading...");
    }
}




abstract class DocumentReaderFactory{
    abstract DocumentReader createReader();
}


class PdfReaderFactory extends DocumentReaderFactory{
    public DocumentReader createReader(){
        return new Pdf();
    }
}

class DocxReaderFactory extends DocumentReaderFactory{
    public DocumentReader createReader(){
        return new Docx();
    }
}

class TextReaderFactory extends DocumentReaderFactory{
    public DocumentReader createReader(){
        return new Text();
    }
}

class DocumentReaderApp {

    private DocumentReader documentReader;

    public DocumentReaderApp(DocumentReaderFactory document){
        documentReader = document.createReader();
    }

    public DocumentReader getDocumentReader(){
        return documentReader;
    }
}


public class Main{
    public static void main(String[] args) {

        DocumentReaderFactory documentReader = new PdfReaderFactory();
        DocumentReaderApp documentReaderApp = new DocumentReaderApp( documentReader);
        DocumentReader document= documentReaderApp.getDocumentReader();
        document.read();

    }

}
