package patterns.behavioral.visitor.visitor1_2;

public class WordFile extends ResourceFile {

    public WordFile(String filePath){
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }
}
