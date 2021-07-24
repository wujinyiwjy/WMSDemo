package domain;

import org.springframework.stereotype.Repository;

@Repository
public class Administrator {
    private String adminname;
    private String password;
    
    public Administrator(String adminname, String password) {
        this.adminname = adminname;
        this.password = password;
    }
    
    public Administrator() {
    }
    
    public String getAdminName() {
        return adminname;
    }
    
    public void setAdminName(String adminname) {
        this.adminname = adminname;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Administrator{" +
                "adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
