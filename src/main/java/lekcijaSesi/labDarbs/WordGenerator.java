package lekcijaSesi.labDarbs;

import java.lang.module.InvalidModuleDescriptorException;

public class WordGenerator {

    public static void main(String[] args) throws IDException {
        //Blank Document
        Faker faker = new Faker();
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream( new File("createdocument.docx"));
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(faker.shakespeare().hamletQuote());

        document.write(out);
        out.close();
        System.out.println("createparagraph.docx written successfully");
        System.out.println("createdocument.docx written successully");

    }
}
