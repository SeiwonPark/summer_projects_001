public class GBP extends Currency implements Exchange {
    GBP(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(GBP) 입니다.", (double)(amount * objAmount/CurrenciesValue.GBP.getValue()));
    }
}
