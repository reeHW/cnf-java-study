package generic.bank;

import java.util.List;

public class BankDataManager<T> {
    private List<T> dataList;

    public BankDataManager(List<T> dataList) {
        this.dataList = dataList;
    }

    /* 데이터 추가 */
    public void addData(T data) {
        dataList.add(data);

    }
    /* 모든 데이터를 반환 */
    public List<T> getAllData() {
        return dataList;
    }
    /* 가장 최근에 추가된 데이터를 반환 */
    public T getLatestData() {
        if (dataList.isEmpty()) {
            return null;
        }
        return dataList.get(dataList.size() - 1);
    }
    /* 중간 데이터 삽입 */
    public void addDataAt(int index, T data) {
        if (index < 0 || index > dataList.size()) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        dataList.add(index, data);
    }

    /* 데이터 삭제 */
    public void removeData(int index) {
        if (index < 0 || index >= dataList.size()) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }
        dataList.remove(index);
    }
}
