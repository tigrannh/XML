package Service;

import model.User;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserService {
    private static final String FILE_NAME = "user";

    public static void serializeToXML(User user){
        FileOutputStream fos = null;
        XMLEncoder encoder = null;

        try {
            fos = new FileOutputStream(FILE_NAME);
            encoder = new XMLEncoder(fos);
            encoder.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (encoder != null)
              encoder.close();

            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static User deserializeFromXML(){
        User user = null;
        FileInputStream fis = null;
        XMLDecoder decoder = null;

        try {
            fis = new FileInputStream(FILE_NAME);
            decoder = new XMLDecoder(fis);
            user = (User) decoder.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (decoder != null)
                decoder.close();

            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return user;
    }

}
