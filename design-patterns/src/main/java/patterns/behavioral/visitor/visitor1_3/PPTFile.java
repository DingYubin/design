package patterns.behavioral.visitor.visitor1_3;

public class PPTFile extends ResourceFile {

    public PPTFile(String filePath){
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
