package patterns.behavioral.visitor.visitor1_3;

public class WordFile extends ResourceFile {

    public WordFile(String filePath){
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
