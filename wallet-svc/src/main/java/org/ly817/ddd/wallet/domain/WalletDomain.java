package org.ly817.ddd.wallet.domain;

import org.ly817.ddd.wallet.api.exception.InsufficientBalanceException;
import org.ly817.ddd.wallet.api.exception.InvalidAmountException;

import java.math.BigDecimal;

/**
 * @author LY
 * @date 2020/09/06 14:20
 * <p>
 * Description:
 * 钱包领域模型
 * 对外暴露最基本、可以复用的**实体类数据操作**
 * - debit  扣余额
 * - credit 加余额
 */
public class WalletDomain {

    private Long id;

    private Long createTime = System.currentTimeMillis();

    private BigDecimal balance = BigDecimal.ZERO;

    public WalletDomain(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 扣余额
     * @param amount
     */
    public void debit(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException();
        }
        this.balance.subtract(amount);
    }

    /**
     * 加余额
     * @param amount
     */
    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException();
        }
        this.balance.add(amount);
    }
}
