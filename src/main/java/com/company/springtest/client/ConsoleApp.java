package com.company.springtest.client;

import com.company.springtest.config.DataConfig;
import com.company.springtest.entity.Doctor;
import com.company.springtest.service.DoctorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ConsoleApp {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        DoctorService doctorService = context.getBean(DoctorService.class);

        Doctor doc1 = new Doctor();
        doc1.setFirstName("Doc11");
        doc1.setLastName("Doc12");
        doc1.setSpecialization("LOR");

        doctorService.saveOrUpdate(doc1);

        List<Doctor> allDoctors = doctorService.findAll();

        allDoctors.forEach(doc->System.out.println(doc.getFirstName()));

    }
}
