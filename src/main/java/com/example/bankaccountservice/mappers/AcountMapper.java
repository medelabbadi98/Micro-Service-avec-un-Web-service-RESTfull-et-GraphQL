package com.example.bankaccountservice.mappers;

import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AcountMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public BankAccountResponseDTO fromBankAccount(BankAccount account){
        return modelMapper.map(account,BankAccountResponseDTO.class);
    }

//    public BankAccount fromBankAccountRequestDTO(BankAccountRequestDTO requestDTO){
//        BankAccount bankAccount = new BankAccount();
//        BeanUtils.copyProperties(requestDTO,bankAccount);
//        return bankAccount;
//    }



}
