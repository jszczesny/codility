package com.github.jszczesny.codility;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Running SolutionTest class tests")
class SolutionTest {

    private static Solution solution;
    private static PrintStream ps;
    private static ByteArrayOutputStream out;

    @BeforeAll
    static void setUp(){
        solution = new Solution();
    }

    @BeforeEach
    private void setOutputStreamHandler(){
        out = new ByteArrayOutputStream();
        ps = new PrintStream(out);
        System.setOut(ps);
    }

    @AfterEach
    private void cleanUp() throws IOException {
        if(ps!=null)
            ps.close();
        if(out!=null)
            try{
                out.close();
            }catch (IOException ex){
                throw ex;
            }
    }

    @Test
    @DisplayName("running getResultTest")
    void getResultTest() throws IOException{
        solution.getResult();
        ps.flush();
        assertEquals(this.getFileContent("result.txt"), out.toString());
    }

    private String getFileContent(String fileName) throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return new String(Files.readAllBytes(Paths.get(file.toURI())));
    }
}