/*
 * Mutaz Helal
 * May 15
 * Create
 * This program creates an XML file and fills it with information regarding
 * courses.
 */

import java.io.*;

public class Create {

    public static void main(String[] args) {
        //create an XML file and add courses
        try {
            OutputStream fileOut = new FileOutputStream("classes.xml");
            OutputStream bufferedOut = new BufferedOutputStream(fileOut);
            try (OutputStreamWriter out = new OutputStreamWriter(bufferedOut, "8859_1")) {
                out.write("<?xml version=\"1.0\" ");
                out.write("encoding=\"ISO-8859-1\"?>\r\n");
                out.write("<classes>\r\n");
                out.write("<course>\r\n");
                out.write("<code>ICS4C</code>\r\n");
                out.write("<description>Computer Programming, Grade 12, College</description>\r\n");
                out.write("<teacher>Teacher A</teacher>\r\n");
                out.write("<fileType>Unmodified</fileType>\r\n");
                out.write("</course>\r\n");

                out.write("<course>\r\n");
                out.write("<code>SPH4U</code>\r\n");
                out.write("<description>Physics, Grade 12, University</description>\r\n");
                out.write("<teacher>Mr.Badr</teacher>\r\n");
                out.write("<fileType>Unmodified</fileType>\r\n");
                out.write("</course> \r\n");            

                out.write("<course>\r\n");
                out.write("<code>ENG4U</code>\r\n");
                out.write("<description>English, Grade 12, University</description>\r\n");
                out.write("<teacher>Mr.Faisal</teacher>\r\n");
                out.write("<fileType>Unmodified</fileType>\r\n");
                out.write("</course> \r\n");
                out.write("</classes>\r\n");

                out.flush();
                System.out.println("XML file created successfuly!");
            }

        } catch (UnsupportedEncodingException e) {
            System.out.println(
                    "This VM does not support the Latin-1 character set."
            );
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
