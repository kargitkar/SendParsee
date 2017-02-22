package am.karen.sendparse;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Администратор on 12.02.2017.
 */
@ParseClassName("Developer")
public class Android extends ParseObject {

public String getVersionName(){
    return getString("name");
}


}
