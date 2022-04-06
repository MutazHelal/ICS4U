/*
 * Mutaz Helal
 * May 15
 * Modify
 * This program modifies the XML file created in "Create.java"
 */

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.*;

public class Modify {

    public static void main(String[] args) {
        try {
            String filepath = "classes.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            // change the name of teacherA
            final NodeList courses = doc.getElementsByTagName("course");
            for (int i = 0; i < courses.getLength(); i++) {
                final Element currentCourse = (Element) courses.item(i);
                final NodeList teachers = currentCourse
                        .getElementsByTagName("teacher");
                if (teachers.getLength() > 0 && teachers.item(0)
                        .getTextContent().equals("Teacher A")) {
                    teachers.item(0).setTextContent("Mr.Theodoropoulos");
                }
            }

            //append AMDSB to each course
            if (doc.getElementsByTagName("schoolBoard").getLength() == 0) {
                int len = doc.getElementsByTagName("course").getLength();
                for (int j = 0; j < len; j++) {
                    final Node Course = doc.getElementsByTagName("course")
                            .item(j);
                    final Element schoolBoard = doc
                            .createElement("schoolBoard");
                    schoolBoard.appendChild(doc.createTextNode("AMDSB"));
                    Course.appendChild(schoolBoard);
                    Node fileType = doc.getElementsByTagName("fileType").item(j);
                    fileType.setTextContent("Modified");
                }
            }

            //write the content into the xml file
            TransformerFactory transformerFactory
                    = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);

            //indicate that the process has been completed
            System.out.println("The changes have successfuly been made.");

        } catch (ParserConfigurationException | TransformerException
                | IOException | SAXException pce) {
        }
    }
}
