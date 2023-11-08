package demos.cloud.trading.persist;

import demos.cloud.trading.domains.TradingDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jeff
 */
public interface TradingDetailPersist extends JpaRepository<TradingDetail, Long> {}
