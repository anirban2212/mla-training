package com.mphasis.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mphasis.dao.AdminDao;
import com.mphasis.entity.Admin;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    
    @Autowired
    AdminDao admindao;
    @Override
    public List<Admin> adminLogin(Admin admin) {
        return admindao.adminLogin(admin);
    
}
}