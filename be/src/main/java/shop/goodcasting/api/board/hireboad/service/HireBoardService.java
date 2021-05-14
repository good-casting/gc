package shop.goodcasting.api.board.hireboad.service;


import org.springframework.stereotype.Service;
import shop.goodcasting.api.board.hireboad.domain.HireBoard;
import shop.goodcasting.api.board.hireboad.domain.HireBoardDTO;


@Service
public interface HireBoardService {
   HireBoard update(HireBoardDTO hireBoardDTO);

   default HireBoard dtoTOEntity(HireBoardDTO hireBoardDTO) {
      return HireBoard.builder()
              .hireBoardId(hireBoardDTO.getHireBoardId())
              .build();
   }
}
