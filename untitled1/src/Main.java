public class Main {

    public static void main(String[] args) {
        int x = 22;
        int closestPrime = findClosestPrime(x);
        System.out.println("Số nguyên tố nhỏ hơn và gần " + x + " nhất là: " + closestPrime);
    }

    public static int findClosestPrime(int x) {
        for (int i = x - 1; i > 1; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 2;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // Căn bậc 2 của n sẽ giúp cho việc thực hiện vòng lặp giảm xuống và chia nửa làm 2
        // sẽ có thể giảm bớt sự trùng lặp cua phép tính khi n không phải là số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
                //nếu trong trường hợp n không phải là số nguyên tố và ở 1 vài lần của vòng lặp
                // tuy nó không ra false trong vòng if thì vòng lặp sẽ thực hiện cho đến khi bằng
                // căn bậc 2 cua n khi đó nếu kết quả vẫn có ít nhất 1 kết quả là false thì vòng lặp
                //sẽ dừng và khai báo van la false cho tòan bộ hàm isPrime còn nếu tất cả các kết quả vòng đều tra ve là không false thì
                // kết quả cuối cùng l thoắt  vòng lặp trả kết quả true
            }
        }
        return true;// khi kết quả trả về true có nghĩa là n là số nguyên tố
    }
}
