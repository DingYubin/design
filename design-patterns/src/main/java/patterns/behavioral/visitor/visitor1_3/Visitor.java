package patterns.behavioral.visitor.visitor1_3;

public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pptFile);
    void visit(WordFile wordFile);
}
