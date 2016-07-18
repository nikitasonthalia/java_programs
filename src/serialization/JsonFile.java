package serialization;

import java.io.Serializable;

/**
 * Created by nikitasonthalia on 5/17/16.
 */

class UserPermission implements Serializable
{
    String email;
    Serializable permission;

    UserPermission(String email,String permission)
    {
        this.email=email;
        this.permission=permission;
    }

}
public class JsonFile {
    public static void main(String[] args)
    {
        try
        {
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
