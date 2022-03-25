package patterns.behavioral.visitor.visitor1_1;

public class PdfFile extends ResourceFile{

    public PdfFile(String filePath){
        super(filePath);
    }

    @Override
    public void extract2txt() {
        //..省略ppt中抽取文本的代码...
        //..将抽取出来的文本报错再跟filePath同名的.txt文件中...
        System.out.println("Extract PDF.");
    }
}
