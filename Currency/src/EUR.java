public class EUR extends Currency implements Exchange{
    EUR(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(EUR) 입니다.", (double)(amount * objAmount/CurrenciesValue.EUR.getValue()));
    }
}
