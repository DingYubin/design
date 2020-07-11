package patterns.behavioral.visitor.visitor1_2;

public class Extractor {
    public void extract2txt(PPTFile pptFile) {
        //..省略ppt中抽取文本的代码...
        //..将抽取出来的文本报错再跟filePath同名的.txt文件中...
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pptFile) {
        //..省略ppt中抽取文本的代码...
        //..将抽取出来的文本报错再跟filePath同名的.txt文件中...
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        //..省略ppt中抽取文本的代码...
        //..将抽取出来的文本报错再跟filePath同名的.txt文件中...
        System.out.println("Extract WORD.");
    }

}
