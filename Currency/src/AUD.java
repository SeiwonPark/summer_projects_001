public class AUD extends Currency implements Exchange {
    AUD(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(AUD) 입니다.", (double)(amount * objAmount/CurrenciesValue.AUD.getValue()));
    }
}
