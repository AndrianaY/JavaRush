package otherStaff.serializeTricks.java;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.*;

public class Person implements java.io.Serializable
{
    public Person(String fn, String ln, int a, Gender g)
    {

        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        this.gender = g;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (age != person.age) {
            return false;
        }
        if ((!firstName.equals(person.firstName)) && (!lastName.equals(person.lastName))) {
            return false;
        }

        return true;
    }
    @Override
    public int hashCode() {
        int result = firstName.hashCode() + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Gender getGender()
    {
        return gender;
    }

    public int getAge()
    {
        return age;
    }

    public Person getSpouse()
    {
        return spouse;
    }

    public void setFirstName(String value)
    {
        firstName = value;
    }

    public void setLastName(String value)
    {
        lastName = value;
    }

    public void setGender(Gender value)
    {
        gender = value;
    }

    public void setAge(int value)
    {
        age = value;
    }

    public void setSpouse(Person value)
    {
        spouse = value;
    }

    private void writeObject(java.io.ObjectOutputStream stream)
            throws java.io.IOException
    {

//         "Encrypt"/obscure the sensitive data
//        age = age >> 2;

        stream.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream stream)
            throws java.io.IOException, ClassNotFoundException
    {
        stream.defaultReadObject();

//         "Decrypt"/de-obscure the sensitive data


//        age = age << 2;
    }

    public static void signing(Serializable object, OutputStream ostream) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        try {
            // Length is 16 byte
            SecretKeySpec sks = new SecretKeySpec(key, transformation);

            // Create cipher
            Cipher cipher = Cipher.getInstance(transformation);
            cipher.init(Cipher.ENCRYPT_MODE, sks);
            SealedObject sealedObject = new SealedObject(object, cipher);

            // Wrap the output stream
            CipherOutputStream cos = new CipherOutputStream(ostream, cipher);
            ObjectOutputStream outputStream = new ObjectOutputStream(cos);
            outputStream.writeObject(sealedObject);
            outputStream.close();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
    }

    public static Object unSigning(InputStream istream) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        SecretKeySpec sks = new SecretKeySpec(key, transformation);
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.DECRYPT_MODE, sks);

        CipherInputStream cipherInputStream = new CipherInputStream(istream, cipher);
        ObjectInputStream inputStream = new ObjectInputStream(cipherInputStream);
        SealedObject sealedObject;
        try {
            sealedObject = (SealedObject) inputStream.readObject();
            return sealedObject.getObject(cipher);
        } catch (ClassNotFoundException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
            return null;
        }
    }



    public String toString()
    {
        return "[Person: firstName=" + firstName +
                " lastName=" + lastName +
                " gender=" + gender +
                " age=" + age +
                " spouse=" + spouse.getFirstName() +
                "]";
    }

    private static final long serialVersionUID = 0;
    private String firstName;
    private String lastName;
    private int age;
    private Person spouse;
    private Gender gender;
    private static final byte[] key = "MyDifficultPassw".getBytes();
    private static final String transformation = "AES";
}
