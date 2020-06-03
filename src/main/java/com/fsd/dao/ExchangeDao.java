package com.fsd.dao;

import com.fsd.entity.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeDao extends JpaRepository<Exchange, Long> {

  Exchange findByStockExchange(String stockExchange);

}
