package demos.cloud.account.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author jeff
 */
@Data
@Entity
@Table(name = "atomikos_account_detail")
public class AccountDetail {

  @Id private Long serial;

  private BigDecimal prices;
}
