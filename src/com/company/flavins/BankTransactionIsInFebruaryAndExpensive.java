package com.company.flavins;

import java.time.Month;
import java.util.List;

public class BankTransactionIsInFebruaryAndExpensive implements BankTransactionFilter{

    @Override
    public boolean test(final BankTransaction bankTransaction){
        return bankTransaction.getDate().getMonth() == Month.JANUARY && bankTransaction.getAmount() >= 1000;
    }

}
