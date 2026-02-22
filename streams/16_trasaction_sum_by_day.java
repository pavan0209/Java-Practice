import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private String date;
    private int amount;

    Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "Transaction [date=" + date + ", amount=" + amount + "]";
    }
}

class Solution {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500));

        Map<String, Integer> sumByDay = transactions.stream()
                .collect(Collectors.groupingBy(t -> t.getDate(), Collectors.summingInt(t -> t.getAmount())));

        System.out.println(sumByDay);
    }
}