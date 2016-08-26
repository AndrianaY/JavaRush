package otherstaff.serializeTricks.test;

import org.junit.Test;
import otherstaff.serializeTricks.java.Gender;
import otherstaff.serializeTricks.java.Person;

import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by Andriana_Yarmoliuk on 7/12/2016.
 */
public class SerTest
{


    @Test
    public void testEncryptDecryptPerson() throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IOException {
        Person orig = new Person("Jack", "Denials", 21, Gender.MALE);
        Person spouse = new Person("Hankey", "Bannister", 23, Gender.MALE);
        orig.setSpouse(spouse);
        spouse.setSpouse(orig);

        FileOutputStream fos = new FileOutputStream("d:\\encryptedData.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person.signing(orig, oos);

        FileInputStream fis = new FileInputStream("d:\\encryptedData.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person ted = (Person) Person.unSigning(ois);

        System.out.println(ted.toString());

        assertEquals(ted.getFirstName(), "Jack");
        assertEquals(ted.getSpouse().getFirstName(), "Hankey");

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        Person.signing(orig, baos);
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        assertEquals(orig, Person.unSigning(bais));
    }



    @Test public void serializeToDisk()
    {
        try
        {
            Person ted = new Person("Ted", "Neward", 39, Gender.MALE);
            Person charl = new Person("Charlotte",
                    "Neward", 38, Gender.FEMALE);

            ted.setSpouse(charl); charl.setSpouse(ted);

            FileOutputStream fos = new FileOutputStream("tempdata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ted);
            oos.close();
        }
        catch (Exception ex)
        {
            fail("Exception thrown during test: " + ex.toString());
        }

        try
        {
            FileInputStream fis = new FileInputStream("tempdata.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person ted = (Person) ois.readObject();
            ois.close();

            assertEquals(ted.getFirstName(), "Ted");
            assertEquals(ted.getSpouse().getFirstName(), "Charlotte");

            // Clean up the file
            new File("tempdata.ser").delete();
        }
        catch (Exception ex)
        {
            fail("Exception thrown during test: " + ex.toString());
        }
    }
}
