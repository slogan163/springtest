package com.company.springtest.service.impl;

import com.company.springtest.entity.Prescription;
import com.company.springtest.repository.PrescriptionRepository;
import com.company.springtest.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionServiceImpl extends GenericServiceImpl<Prescription, Long> implements PrescriptionService {

    @Autowired
    public PrescriptionServiceImpl(PrescriptionRepository repository) {
        super(repository);
    }
}
