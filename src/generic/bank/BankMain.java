package generic.bank;

import java.util.ArrayList;
import java.util.LinkedList;

public class BankMain {
    public static void main(String[] args) {
        // WooriBank
        BankDataManager<WooriBankVO> wooriManager = new BankDataManager<>(new ArrayList<>());
        wooriManager.addData(new WooriBankVO("이혜원", 100000, "서울"));
        wooriManager.addData(new WooriBankVO("홍길동", 300000, "인천"));
        System.out.println("WooriBank 모든 데이터: " + wooriManager.getAllData());
        System.out.println("WooriBank 최신 데이터: " + wooriManager.getLatestData());

        // NHBank =
        BankDataManager<NHBankVO> nhManager = new BankDataManager<>(new LinkedList<>());
        nhManager.addData(new NHBankVO("1234-5678-9101-1121", 100000, "2024-11-30"));
        nhManager.addData(new NHBankVO("1111-2222-3333-4444", 200000, "2024-12-02"));
        System.out.println("NHBank 모든 데이터: " + nhManager.getAllData());
        System.out.println("NHBank 최신 데이터: " + nhManager.getLatestData());

        // 중간 데이터 삽입 및 삭제
        nhManager.addDataAt(1, new NHBankVO("2222-3333-4444-5555", 50000, "2024-12-01"));
        System.out.println("NHBank 모든 데이터 (삽입 후): " + nhManager.getAllData());
        nhManager.removeData(1);
        System.out.println("NHBank 모든 데이터 (삭제 후): " + nhManager.getAllData());
    }
}
