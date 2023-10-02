package com.enviro.assessment.grad001.alithembamakongwana.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.alithembamakongwana.Entity.WithdrawalNotice;
import com.enviro.assessment.grad001.alithembamakongwana.Repository.WithdrawalNoticeRepository;


@Service

public class WithdrawalNoticeService {
    @Autowired
    private final WithdrawalNoticeRepository withdrawalNoticeRepository;

    
    public WithdrawalNoticeService(WithdrawalNoticeRepository withdrawalNoticeRepository) {
        this.withdrawalNoticeRepository = withdrawalNoticeRepository;
    }

    public WithdrawalNotice createWithdrawalNotice(WithdrawalNotice withdrawalNotice) {
        return WithdrawalNoticeRepository.save(withdrawalNotice);
    }

    public WithdrawalNotice getWithdrawalNoticeById(Long id) {
        return withdrawalNoticeRepository.findById(id).orElse(null);
    }

    public void deleteWithdrawalNotice(Long id) {
        withdrawalNoticeRepository.deleteById(id);
    }

}
