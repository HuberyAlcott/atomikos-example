package demos.cloud.trading.control;

import demos.cloud.general.domains.TradingCreate;
import demos.cloud.trading.domains.TradingDetail;
import demos.cloud.trading.persist.TradingDetailPersist;
import ferrous.commons.defines.GeneralReturns;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author jeff
 */
@Slf4j
@RestController
@RequestMapping("/trading")
public class TradingControl implements GeneralReturns {

  private final TradingDetailPersist detailPersist;

  public TradingControl(TradingDetailPersist detailPersist) {
    this.detailPersist = detailPersist;
  }

  @PostMapping("/create")
  public Object tradingCreate(@RequestBody TradingCreate create) {
    log.info("Trading create : {}", create);
    final var detail = convert(create);
    final var saved = detailPersist.save(detail);
    return normal(saved);
  }

  private TradingDetail convert(TradingCreate source) {
    final var target = new TradingDetail();
    target.setSerial(source.getSerial());
    target.setTotals(source.getCounts());
    return target;
  }
}
