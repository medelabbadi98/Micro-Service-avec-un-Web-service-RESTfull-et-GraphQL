package com.example.bankaccountservice.service;

import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;

import java.util.List;

public interface AccountService  {

    public BankAccountResponseDTO addAccount(BankAccountRequestDTO request);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO request);
//    public List<BankAccountResponseDTO> listAccounts();
//    public BankAccountResponseDTO Accountbyid (String id) throws BankAccountNotFoundException;
//    public BankAccountResponseDTO updateAccount(BankAccountRequestDTO bankAccountRequestDTO);
//    public void deleteAccount(String id) throws BankAccountNotFoundException;
}
