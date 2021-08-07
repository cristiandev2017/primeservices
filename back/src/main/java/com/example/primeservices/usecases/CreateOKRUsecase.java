package com.example.primeservices.usecases;

import com.example.primeservices.DTO.OKRDTO;
import com.example.primeservices.Mapper.OKRMapper;
import com.example.primeservices.repositories.OKRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Service
public class CreateOKRUsecase {
    private final OKRRepository okrRepository;
    private final OKRMapper okrMapper;

    @Autowired
    public CreateOKRUsecase(OKRRepository okrRepository, OKRMapper okrMapper){
        this.okrMapper = okrMapper;
        this.okrRepository = okrRepository;
    }

    public Mono<OKRDTO> apply (OKRDTO okrdto){
        return okrRepository.save(okrMapper.DTOtoOKR(null).apply(okrdto)).map(okRs -> okrdto);
    }

}
