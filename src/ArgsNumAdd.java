public class ArgsNumAdd {
    public static void main(String[] args){
        int sum = 0;
        for(String str : args)
            sum += Integer.parseInt(str);
        System.out.println("total = " + sum);
    }

}
