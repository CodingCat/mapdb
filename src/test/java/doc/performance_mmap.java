package doc;

import org.mapdb.DB;
import org.mapdb.DBMaker;

import java.io.File;
import java.io.IOException;


public class performance_mmap {

    public static void main(String[] args) throws IOException {
        File file = File.createTempFile("mapdb","mapdb");
        //a
        DB db = DBMaker
            .fileDB(file)
            .fileMmapEnable()            // always enable mmap
            .fileMmapEnableIfSupported() // only enable on supported platforms
            .fileMmapCleanerHackEnable() // closes file on DB.close()
            .make();
        //z
    }
}
