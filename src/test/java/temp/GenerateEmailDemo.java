package temp;

import javax.xml.crypto.Data;
import java.util.Date;

public class GenerateEmailDemo {
    public static void main(String[] args) {
        Date date=new Date();
        String dateString=date.toString();
        String noSpaceDateString=dateString.replaceAll("\\s","");
        String noSpaceAndnoColonDateString=noSpaceDateString.replaceAll("\\:","");
        String emailWithTimeStamp=noSpaceAndnoColonDateString+"@gmail.com";
        System.out.println(emailWithTimeStamp);
    }
}
