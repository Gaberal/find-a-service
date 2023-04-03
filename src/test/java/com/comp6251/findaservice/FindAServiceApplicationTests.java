package com.comp6251.findaservice;

import com.comp6251.findaservice.model.Admin;
import com.comp6251.findaservice.model.Service;
import com.comp6251.findaservice.model.ServiceProvider;
import com.comp6251.findaservice.repository.AdminRepository;
import com.comp6251.findaservice.repository.ServiceProviderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class FindAServiceApplicationTests {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private ServiceProviderRepository serviceProviderRepository;
    @Test
    void contextLoads() {
        Admin admin=new Admin();
        admin.setEmail("aaadafg@qq.com");
        admin.setPassword("12356");
        adminRepository.save(admin);
    }
    @Test
    void test(){
        ServiceProvider serviceProvider=new ServiceProvider();
        serviceProvider.setEmail("2279207040@qq.com");
        Service service=new Service();
        service.setCategory(1);
        List<Service> list=new ArrayList<>();
        list.add(service);
        serviceProvider.setServices(list);
        serviceProviderRepository.save(serviceProvider);

    }

}
