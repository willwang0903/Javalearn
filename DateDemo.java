import java.util.*;
public class DateDemo{
    public static void main(String[] args) throws ClassNotFoundException{
        String strDate,strTime = "";
        Date objDate = new Date();
        System.out.println("今天的日期是："+objDate);
        long time = objDate.getTime();
        System.out.println("自1970年1月1日起以毫秒为单位的时间（GMT）："+time);
        strDate = objDate.toString();
        strTime = strDate.substring(11,(strDate.length()-4));
        strTime = "时间："+strTime.substring(0,8);
        System.out.println(strTime);
    }
}