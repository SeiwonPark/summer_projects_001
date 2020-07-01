public class USD extends Currency implements Exchange{
    USD(int amount, String nation) {
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은 %.2f(USD) 입니다.", (double)(amount * objAmount/CurrenciesValue.USD.getValue()));
    }
}
