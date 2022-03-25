package patterns.behavioral.visitor.visitor1_2;

public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath){
        this.filePath = filePath;
    }

    public abstract void accept(Extractor extractor);
}
