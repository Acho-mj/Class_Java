class Num {
    int num[];
    Num(int num[]){
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

public class MethodExample02 {
    public static void main(String args[]) {
        int arr[] = new int[0];                   // 길이가 0인 배열을 생성
        Num obj = new Num(arr);
        int average = obj.getAverage();
        System.out.println("평균 = " + average);
    }
}
