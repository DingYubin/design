package patterns.behavioral.visitor.visitor1_2;

import java.util.ArrayList;
import java.util.List;

public class ToolApplication {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles();
        for (ResourceFile resourceFile : resourceFiles){
            resourceFile.accept(extractor);//多态特性
        }
    }

    private static List<ResourceFile> listAllResourceFiles(){
        List<ResourceFile> resourceFiles = new ArrayList<ResourceFile>();
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
