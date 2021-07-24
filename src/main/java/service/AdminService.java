package service;

import domain.Administator;
import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;

public interface AdminService {
    public  void adminLogin(Administator administator);
    
}
