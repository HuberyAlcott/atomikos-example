package demos.cloud.trading.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author jeff
 */
@Data
@Entity
@Table(name = "atomikos_trading_detail")
public class TradingDetail implements Serializable {

  @Id private Long serial;

  private BigDecimal totals;
}
