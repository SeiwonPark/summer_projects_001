public class MXN extends Currency implements Exchange {
    MXN(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(MXN) 입니다.", (double)(amount * objAmount/CurrenciesValue.MXN.getValue()));
    }
}
