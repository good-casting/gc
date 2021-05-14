package shop.goodcasting.api.user.producer.service;

import shop.goodcasting.api.user.producer.domain.Producer;
import shop.goodcasting.api.user.producer.domain.ProducerDTO;

public interface ProducerService {
    Producer signup(Producer producer);
    ProducerDTO signin(Producer producer);
}
