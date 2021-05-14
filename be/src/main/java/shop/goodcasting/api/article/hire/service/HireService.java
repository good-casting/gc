package shop.goodcasting.api.article.hire.service;

import shop.goodcasting.api.article.hire.domain.Hire;
import shop.goodcasting.api.article.hire.domain.HireDTO;

public interface HireService {
    Hire update(HireDTO hireDTO);
}
