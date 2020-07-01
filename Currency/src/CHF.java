public class CHF extends Currency implements Exchange {
    CHF(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(CHF) 입니다.", (double)(amount * objAmount/CurrenciesValue.CHF.getValue()));
    }
}