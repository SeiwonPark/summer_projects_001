public class INR extends Currency implements Exchange {
    INR(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(INR) 입니다.", (double)(amount * objAmount/CurrenciesValue.INR.getValue()));
    }
}
