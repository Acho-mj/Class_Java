class Number {
    int num[];
    Number(int num[]){
        this.num = num;
    }

    int getTotal() {
        int total = 0;
        for(int cnt=0; cnt<num.length; cnt++)
            total+=num[cnt];
        return total;
    }
    int getAverage() {
        int total;
        total=getTotal();
        int avg = total/num.length;
        return avg;
    }
}


public class MethodExample03 {
    public static void main(String args[]) {
        int arr[] = new int[0];                   // 길이가 0인 배열을 생성
        Number obj = new Number(arr);
        try {
            int average = obj.getAverage();
            System.out.println("평균 = " + average);
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("평균을 계산하는 도중 에러가 발생했습니다.");
        }
    }
}