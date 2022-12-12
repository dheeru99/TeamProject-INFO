/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

import java.util.ArrayList;

/**
 *
 * @author dheer
 */
public class UserDirectory {
    private ArrayList<User> userDirectory;

    public UserDirectory() {
        userDirectory= new ArrayList<User>();
    }

    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }
    public User add(){
        User d =new User();
        userDirectory.add(d);
        return d;
    }
    public void delete(User doc){
        userDirectory.remove(doc);
        
    }
    
    
}
