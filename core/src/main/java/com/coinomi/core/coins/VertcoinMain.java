package com.coinomi.core.coins;

/**
 * @author John L. Jegutanis
 */
public class VertcoinMain extends CoinType {
    private VertcoinMain() {
        id = "vertcoin.main";

        addressHeader = 71;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;

        name = "Vertcoin (beta)";
        symbol = "VTC";
        uriScheme = "vertcoin";
        bip44Index = 28;
        unitExponent = 8;
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 VTC mininput
        softDustLimit = value(100000); // 0.001 VTC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static VertcoinMain instance = new VertcoinMain();
    public static synchronized VertcoinMain get() {
        return instance;
    }
}
