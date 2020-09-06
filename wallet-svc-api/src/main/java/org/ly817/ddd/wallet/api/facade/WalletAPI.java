package org.ly817.ddd.wallet.api.facade;

import java.math.BigDecimal;

/**
 * Created by LuoYu on 2020-09-06.
 * 钱包操作api示意
 * 方法对应的业务逻辑层面的操作
 *
 * 不同的协议可以对接口添加不用的元数据注解
 */
//@Service()
//@RestController()
public interface WalletAPI {

    /**
     * 扣余额
     * @param walletId
     * @param amount
     */
    void debit(Long walletId, BigDecimal amount);

    /**
     * 加余额
     * @param walletId
     * @param amount
     */
    void credit(Long walletId, BigDecimal amount);

    /**
     * 转账
     * @param fromWalletId
     * @param toWalletId
     * @param amount
     */
    void transfer(Long fromWalletId,Long toWalletId,BigDecimal amount);

}
