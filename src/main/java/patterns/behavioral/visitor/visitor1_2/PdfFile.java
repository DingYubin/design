package patterns.behavioral.visitor.visitor1_2;

public class PdfFile extends ResourceFile {

    public PdfFile(String filePath){
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }
}
