package com.example.bankaccountservice.service;

import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;
import com.example.bankaccountservice.mappers.AcountMapper;
import com.example.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private BankAccountRepository bankAccountRepository;
    private AcountMapper acountMapper;

    public AccountServiceImpl(BankAccountRepository bankAccountRepository, AcountMapper acountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.acountMapper = acountMapper;
    }

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO request) {
        BankAccount account = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .balance(request.getBalance())
                .type(request.getType())
                .currency(request.getCurrency())
                .build();
        BankAccount savedBankAccount = bankAccountRepository.save(account);
       BankAccountResponseDTO bankAccountResponseDTO = acountMapper.fromBankAccount(savedBankAccount);
        return bankAccountResponseDTO;
    }

    @Override
    public BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO request) {
        BankAccount account = BankAccount.builder()
                .id(id)
                .createdAt(new Date())
                .balance(request.getBalance())
                .type(request.getType())
                .currency(request.getCurrency())
                .build();
        BankAccount savedBankAccount = bankAccountRepository.save(account);
        BankAccountResponseDTO bankAccountResponseDTO = acountMapper.fromBankAccount(savedBankAccount);
        return bankAccountResponseDTO;
    }
}
