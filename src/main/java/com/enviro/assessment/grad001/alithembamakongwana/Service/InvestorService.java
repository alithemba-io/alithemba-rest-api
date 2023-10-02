package com.enviro.assessment.grad001.alithembamakongwana.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.alithembamakongwana.Entity.Investor;
import com.enviro.assessment.grad001.alithembamakongwana.Repository.InvestorRepository;


@Service

public class InvestorService {
    @Autowired
    private final InvestorRepository investorRepository;

    
    public InvestorService(InvestorRepository investorRepository) {
        this.investorRepository = investorRepository;
    }

    public Investor createInvestor(Investor investor) {
        return InvestorRepository.save(investor);
    }

    public Investor getInvestorById(Long id) {
        return investorRepository.findById(id).orElse(null);
    }

    public void deleteInvestor(Long id) {
        investorRepository.deleteById(id);
    }

}
