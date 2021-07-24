package domain;

import org.springframework.stereotype.Repository;

@Repository
public class Administator {
    private String adminname;
    private String password;
    
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
        return "Administator{" +
                "adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
