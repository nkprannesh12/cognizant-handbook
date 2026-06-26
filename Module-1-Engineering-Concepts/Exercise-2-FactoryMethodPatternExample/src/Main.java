public class Main {
    

    public static void main(String[] args)
    {
        DocumentFactory factory;

        factory = new WordDocumentFactory();
        Document document1 = factory.createDocument();
        document1.open();

        factory = new PdfDocumentFactory();
        Document document2 = factory.createDocument();
        document2.open();

        factory = new ExcelDocumentFactory();
        Document document3 = factory.createDocument();
        document3.open();
    }
}
