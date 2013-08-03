package com.springapp.mvc.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.joda.time.DateTime;
import org.junit.Test;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class JsonTest {

    @Test
    public void testJson1() {

        Author author1 = new Author();
        author1.setId(new Long(12));
        author1.setFirstName("Felix");
        author1.setLastName("Rong");

        DateTime d1 = new DateTime(2013, 7, 18, 12, 00, 00);
        DateTime d2 = new DateTime(2013, 8, 18, 12, 00, 00);

        Post post1 = new Post();
        post1.setId(new Long(1));
        post1.setAuthor(author1);
        post1.setContent("Test as fasd fas fsa fsaf ");
        post1.setTitle("Post 1");
        post1.setPublicDate(d1);


        Post post2 = new Post();
        post2.setId(new Long(2));
        post2.setAuthor(author1);
        post2.setContent("Test as fasd fas fsa fsaf a daf asdf sda f");
        post2.setTitle("Post 2");
        post2.setPublicDate(d2);


        Set<Post> posts = new HashSet<>();
        posts.add(post1);
        posts.add(post2);

        try {
            File file = new File("/tmp/author.json");

            if (!file.exists()) {
                file.createNewFile();
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JodaModule());
            mapper.configure(com.fasterxml.jackson.databind.SerializationFeature.
                    WRITE_DATES_AS_TIMESTAMPS , false);
            mapper.writeValue(file, posts);

        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Test
    public void testOutputStream() {
        final OutputStream os;
        try {
            os = new FileOutputStream("/tmp/out");


            final PrintStream printStream = new PrintStream(os);
            printStream.flush();
            printStream.print("String 111111\n");
            printStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Test
    public void testFileWriter() {
        try {

            String content = "This is the content to write into file";

            File file = new File("/tmp/filename.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
