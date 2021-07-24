package service.impl;

import domain.Administrator;
import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    
    @Override
    public void adminLogin(Administrator administrator) {
        adminMapper.adminLogin(administrator);
    }
}
