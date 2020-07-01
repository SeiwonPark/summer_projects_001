public class KRW extends Currency implements Exchange{
    KRW(int amount, String nation) { // constructor declared
        super(amount, nation);
    }

    @Override
    public void exchange(int amount, int objAmount) {
        System.out.printf("환전된 금액은  %.2f(KRW) 입니다.", (double)(objAmount * amount));
    }
}
