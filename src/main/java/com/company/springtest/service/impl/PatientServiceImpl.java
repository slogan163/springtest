package com.company.springtest.service.impl;

import com.company.springtest.entity.Patient;
import com.company.springtest.repository.PatientRepository;
import com.company.springtest.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends GenericServiceImpl<Patient, Long> implements PatientService {

    @Autowired
    public PatientServiceImpl(PatientRepository repository) {
        super(repository);
    }
}
