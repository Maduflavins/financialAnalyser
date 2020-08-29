package com.company.flavins;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	    final BankTransactionAnalyzerSimple bankTransactionAnalyzerSimple = new BankTransactionAnalyzerSimple();

	    final BankStatementParser bankStatementParser = new BankStatementCSVParser();

	    bankTransactionAnalyzerSimple.analyze(args[0], bankStatementParser);

    }
}
