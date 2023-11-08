package demos.cloud.general.domains;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author jeff
 */
@Data
@EqualsAndHashCode
public class TradingCreate {

  private Long serial;

  private BigDecimal counts;
}
