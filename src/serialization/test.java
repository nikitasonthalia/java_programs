package serialization;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nikitasonthalia on 5/17/16.
 */

class DateTime implements Serializable
{
    Date d;
    DateTime()
    {
        d= Calendar.getInstance().getTime();

    }


}
public class test {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("datetime.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            DateTime dt = new DateTime();
            out.writeObject(dt);

            FileInputStream fin = new FileInputStream("datetime.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
//            while(in.read()!=-1)
//            {
            DateTime dd = (DateTime) in.readObject();

//                System.out.println(in.readObject());
 //           }
            System.out.println(dd.d);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }




    }


}
