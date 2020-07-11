package patterns.behavioral.visitor.visitor1_3;

public class Compressor implements Visitor{

    @Override
    public void visit(PdfFile pdfFile) {
        //..省略ppt中抽取文本的代码...
        //..将抽取出来的文本报错再跟filePath同名的.txt文件中...
        System.out.println("Compressor PDF.");
    }

    @Override
    public void visit(PPTFile pptFile) {
        //..省略ppt中抽取文本的代码...
        //..将抽取出来的文本报错再跟filePath同名的.txt文件中...
        System.out.println("Compressor PPT.");
    }

    @Override
    public void visit(WordFile wordFile) {
        //..省略ppt中抽取文本的代码...
        //..将抽取出来的文本报错再跟filePath同名的.txt文件中...
        System.out.println("Compressor WORD.");
    }
}
