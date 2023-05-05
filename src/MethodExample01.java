class Numbers {
    int num[];
    Numbers(int num[]){
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


public class MethodExample01 {
    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Numbers obj = new Numbers(arr);
        int total = obj.getTotal();
        int average = obj.getAverage();
        System.out.println("합계 = " + total);
        System.out.println("평균 = " + average);
    }
}
