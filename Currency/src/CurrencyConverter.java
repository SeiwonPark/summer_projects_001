import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {

    private static Scanner scanner = new Scanner(System.in);
    private static int standardValue; // 환전 기준 통화의 가치
    private static int amount;        // 환전할 금액

    public static void main (String[] args) {

        while (true) {

            System.out.println("월별 환전 가능 통화가 다릅니다.");
            System.out.println("현재 속해 있는 달의 번호를 입력하세요.");
            System.out.println("1. 1월, 2월, 3월, 4월, 5월, 9월, 10월, 11월, 12월");
            System.out.println("2. 6월, 7월, 8월");
            System.out.println("3. 종료");

            try {
                monthInput();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                scanner.next();
            }
        }
    }


    private static void monthInput() {

        CurrencyConverter currencyConverter = new CurrencyConverter();
        switch (scanner.nextInt())
        {
            case 1: {
                currencyConverter.commonCurrencyInput();
                break;
            }
            case 2: {
                currencyConverter.mainCurrencyInput();
                break;
            }
            case 3: {
                scanner.close();
                return;
            }
            default:
                System.out.println("선택하신 메뉴가 없습니다.");
        }
    }

    private void mainCurrencyInput() { // 6~8월 입력을 받았을 경우

        while (true) {
            System.out.println("환전 기준 통화를 입력하세요.");
            System.out.println("1. 원(KRW)");
            System.out.println("2. 미국달러(USD)");
            System.out.println("3. 유로(EUR)");
            System.out.println("4. 종료");

            try {
                mainAmountInput();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                scanner.next();
            }
        }
    }

    private void commonCurrencyInput() {  // 6~8월이 아닌 입력을 받았을 경우

        while (true) {
            System.out.println("환전 기준 통화를 입력하세요.");
            System.out.println("1. 원(KRW)");
            System.out.println("2. 미국달러(USD)");
            System.out.println("3. 유로(EUR)");
            System.out.println("4. 파운드(GBP)");
            System.out.println("5. 엔(JPY)");
            System.out.println("6. 프랑(CHF)");
            System.out.println("7. 페소(MXN)");
            System.out.println("8. 루피(INR)");
            System.out.println("9. 호주달러(AUD)");
            System.out.println("10. 홍콩달러(HKD)");
            System.out.println("11. 종료");

            try {
                commonAmountInput();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                scanner.next();
            }
        }
    }

    private void mainAmountInput() {  // 6~8월인 경우의 환전할 금액 입력
        CurrenciesValue currenciesValue;

        switch (scanner.nextInt())
        {
            case 1: {
                currenciesValue = CurrenciesValue.KRW;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                mainObjectInput();
                break;
            }
            case 2: {
                currenciesValue = CurrenciesValue.USD;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                mainObjectInput();
                break;
            }
            case 3: {
                currenciesValue = CurrenciesValue.EUR;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                mainObjectInput();
                break;
            }
            case 4:
                scanner.close();
                return;
            default:
                System.out.println("선택하신 메뉴가 없습니다.");
        }
    }

    private void commonAmountInput() {   // 6~8월이 아닌 경우의 환전할 금액 입력
        CurrenciesValue currenciesValue;

        switch (scanner.nextInt()) {
            case 1: {
                currenciesValue = CurrenciesValue.KRW;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 2: {
                currenciesValue = CurrenciesValue.USD;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 3: {
                currenciesValue = CurrenciesValue.EUR;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 4: {
                currenciesValue = CurrenciesValue.GBP;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 5: {
                currenciesValue = CurrenciesValue.JPY;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 6: {
                currenciesValue = CurrenciesValue.CHF;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 7: {
                currenciesValue = CurrenciesValue.MXN;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 8: {
                currenciesValue = CurrenciesValue.INR;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 9: {
                currenciesValue = CurrenciesValue.AUD;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 10: {
                currenciesValue = CurrenciesValue.HKD;
                standardValue = currenciesValue.getValue();
                System.out.println("환전할 금액을 입력하세요.");
                amount = scanner.nextInt();
                commonObjectInput();
                break;
            }
            case 11: {
                scanner.close();
                return;
            }
            default:
                System.out.println("선택하신 메뉴가 없습니다.");
        }
    }

    private void mainObjectInput() {  // 6~8월인 경우, 환전 목적 통화 선택
        while (true) {
            System.out.println("환전 대상 통화를 입력하세요.");
            System.out.println("1. 원(KRW)");
            System.out.println("2. 미국달러(USD)");
            System.out.println("3. 유로(EUR)");
            System.out.println("4. 종료");

            try {
                mainCurrencyConvert();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                scanner.next();
            }
        }
    }

    private void commonObjectInput() {  // 6~8월이 아닌 경우, 환전 목적 통화 선택
        while (true) {
            System.out.println("환전 대상 통화를 입력하세요.");
            System.out.println("1. 원(KRW)");
            System.out.println("2. 미국달러(USD)");
            System.out.println("3. 유로(EUR)");
            System.out.println("4. 파운드(GBP)");
            System.out.println("5. 엔(JPY)");
            System.out.println("6. 프랑(CHF)");
            System.out.println("7. 페소(MXN)");
            System.out.println("8. 루피(INR)");
            System.out.println("9. 호주달러(AUD)");
            System.out.println("10. 홍콩달러(HKD)");
            System.out.println("11. 종료");

            try {
                commonCurrencyConvert();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                scanner.next();
            }
        }
    }

    private void mainCurrencyConvert() {  // 6~8월인 경우, 환전된 금액 계산

        switch (scanner.nextInt())
        {
            case 1: {
                KRW krw = new KRW(amount, "원(KRW)");
                krw.exchange(amount, standardValue);
                break;
            }
            case 2: {
                USD usd = new USD(amount, "미국달러(USD)");
                usd.exchange(amount, standardValue);
                break;
            }
            case 3: {
                EUR eur = new EUR(amount, "유로(EUR)");
                eur.exchange(amount, standardValue);
                break;
            }
            case 4: {
                scanner.close();
                return;
            }
            default: {
                System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }

    private void commonCurrencyConvert(){  //  6~8월이 아닌 경우, 환전된 금액 계산

        switch (scanner.nextInt()) {
            case 1: {
                KRW krw = new KRW(amount, "원(KRW)");
                krw.exchange(amount, standardValue);
                break;
            }
            case 2: {
                USD usd = new USD(amount, "미국달러(USD)");
                usd.exchange(amount, standardValue);
                break;
            }
            case 3: {
                EUR eur = new EUR(amount, "유로(EUR)");
                eur.exchange(amount, standardValue);
                break;
            }
            case 4: {
                GBP gbp = new GBP(amount, "파운드(GBP)");
                gbp.exchange(amount, standardValue);
                break;
            }
            case 5: {
                JPY jpy = new JPY(amount, "엔(JPY)");
                jpy.exchange(amount, standardValue);
                break;
            }
            case 6: {
                CHF chf = new CHF(amount, "프랑(CHF)");
                chf.exchange(amount, standardValue);
                break;
            }
            case 7: {
                MXN mxn = new MXN(amount, "페소(MXN)");
                mxn.exchange(amount, standardValue);
                break;
            }
            case 8: {
                INR inr = new INR(amount, "루피(INR)");
                inr.exchange(amount, standardValue);
                break;
            }
            case 9: {
                AUD aud = new AUD(amount, "호주달러(AUD)");
                aud.exchange(amount, standardValue);
                break;
            }
            case 10: {
                HKD hkd= new HKD(amount, "홍콩달러(HKD)");
                hkd.exchange(amount, standardValue);
                break;
            }
            case 11: {
                scanner.close();
                return;
            }
            default: {
                System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}
