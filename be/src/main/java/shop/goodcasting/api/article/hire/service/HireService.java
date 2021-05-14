package shop.goodcasting.api.article.hire.service;

import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.article.hire.domain.HireDTO;

public interface HireService {
    Hire update(HireDTO hireDTO);

    default Hire dtoToEntity(HireDTO hireDTO){
        return Hire.builder()
                .hireId(hireDTO.getHiresId())
                .title(hireDTO.getTitle())
                .contents(hireDTO.getContents())
                .build();
    }

}
