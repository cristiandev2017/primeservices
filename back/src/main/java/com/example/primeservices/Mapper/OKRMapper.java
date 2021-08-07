package com.example.primeservices.Mapper;

import com.example.primeservices.DTO.OKRDTO;
import com.example.primeservices.collections.OKRs;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class OKRMapper {

    public Function<OKRDTO, OKRs> DTOtoOKR(String id){
        return updateOKR->{
            var okr = new OKRs();
            okr.setId(id);
            okr.setTitle(updateOKR.getTitleokr());
            okr.setDescription(updateOKR.getDescriptionokr());
            return okr;
        };
    }

    public Function <OKRs, OKRDTO> OKRtoDTO(){
        return entity-> new OKRDTO(entity.getId(),entity.getTitle(), entity.getDescription());
    }
}
