package org.ly817.ddd.wallet.application.service;

import org.ly817.ddd.wallet.api.facade.WalletAPI;

import java.math.BigDecimal;

/**
 * @author LY
 * @date 2020/09/06 20:02
 * <p>
 * Description:
 * 钱包api服务实现
 */
public class WalletAPIImpl implements WalletAPI {

    /**
     * 扣余额
     *
     * @param walletId
     * @param amount
     */
    public void debit(Long walletId, BigDecimal amount) {

    }

    /**
     * 加余额
     *
     * @param walletId
     * @param amount
     */
    public void credit(Long walletId, BigDecimal amount) {

    }

    /**
     * 转账
     *
     * @param fromWalletId
     * @param toWalletId
     * @param amount
     */
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {

    }
}
