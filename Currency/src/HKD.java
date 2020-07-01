public class HKD extends Currency implements Exchange {
    HKD(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(HKD) 입니다.", (double)(amount * objAmount/CurrenciesValue.HKD.getValue()));
    }
}
