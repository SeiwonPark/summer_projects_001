public enum CurrenciesValue { // 2020-06-26 15:00 기준 환율을 적용
        KRW(1),
        USD(1205),
        EUR(1350),
        GBP(1490),
        JPY(11),
        CHF(1265),
        MXN(52),
        INR(15),
        AUD(826),
        HKD(154);

        int value;
        CurrenciesValue(int value)
        {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
}

