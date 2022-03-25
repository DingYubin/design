package patterns.behavioral.visitor.visitor1_1;

import java.util.ArrayList;
import java.util.List;

public class ToolApplication {
    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles();
        for (ResourceFile resourceFile : resourceFiles){
            resourceFile.extract2txt();
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
