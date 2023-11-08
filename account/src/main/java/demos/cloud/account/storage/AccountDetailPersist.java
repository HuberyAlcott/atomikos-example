package demos.cloud.account.storage;

import demos.cloud.account.domains.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author jeff
 */
@NoRepositoryBean
public interface AccountDetailPersist extends JpaRepository<AccountDetail, Long> {}
