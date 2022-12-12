/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attributes;

/**
 *
 * @author dheer
 */   
public class SystemAdmin {
    private UserDirectory userDirectory;

    public SystemAdmin() {
        userDirectory= new UserDirectory();
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }
             
       
}
