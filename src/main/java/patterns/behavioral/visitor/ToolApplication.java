package patterns.behavioral.visitor;

import patterns.behavioral.visitor.visitor1_3.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式：允许一个或者多个操作应用到一组对象上，解耦操作和对象本身。
 */
public class ToolApplication {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles();
        for (ResourceFile resourceFile : resourceFiles){
            resourceFile.accept(extractor);//多态特性
        }

        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles){
            resourceFile.accept(compressor);
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
