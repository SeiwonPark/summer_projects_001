public class JPY extends Currency implements Exchange{
    JPY(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(JPY) 입니다.", (double)(amount * objAmount/CurrenciesValue.JPY.getValue()));
    }
}
