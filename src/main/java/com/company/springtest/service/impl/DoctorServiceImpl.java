package com.company.springtest.service.impl;

import com.company.springtest.entity.Doctor;
import com.company.springtest.repository.DoctorRepository;
import com.company.springtest.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl extends GenericServiceImpl<Doctor, Long> implements DoctorService{

    @Autowired
    public DoctorServiceImpl(DoctorRepository repository) {
        super(repository);
    }
}
