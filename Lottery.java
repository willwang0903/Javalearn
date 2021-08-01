import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Lottery{
    public List<String> getHeadNumber(){
        List<String> list = new ArrayList<String>();
        String lotteryNumber = "";
        for(int i=1;i<36;i++){
            if(i<10){
                list.add("0" + i + " ");
            }
            else
            {
                list.add("" + i +" ");
            }
        }
        int roundIndex = 0;
        List<String> lotteryList = new ArrayList<String>();
        for(int j=0;j<5;j++){
            int amount = list.size();
            Random r = new Random();
            roundIndex = r.nextInt(amount);
            lotteryNumber = list.get(roundIndex);
            lotteryList.add(lotteryNumber);
            list.remove(roundIndex);
        }
        Collections.sort(lotteryList);
        return lotteryList;
    }
    public List<String> getRearNumber(){
        List<String> list = new ArrayList<String>();
        String lotteryNumber = "";
        for(int i=1;i<13;i++){
            if(i<10){
                list.add("0" + i + " ");
            }
            else
            {
                list.add("" + i +" ");
            } 
        }
        int roundIndex = 0;
        List<String> lotteryList = new ArrayList<String>();
        for(int j=0;j<2;j++){
            int amount = list.size();
            Random r = new Random();
            roundIndex = r.nextInt(amount);
            lotteryNumber = list.get(roundIndex);
            lotteryList.add(lotteryNumber);
            list.remove(roundIndex);
        }
        Collections.sort(lotteryList);
        return lotteryList;
    }
    public void generateLottery(String groupNum){
        int groupNumber = 0;
        groupNumber = Integer.parseInt(groupNum);
        StringBuilder sbuiler = new StringBuilder();
        for (int i=0;i<groupNumber;i++){
            List<String> startList = getHeadNumber();
            List<String> endList = getRearNumber();
            for (int m=0;m<startList.size();m++){
                sbuiler.append(startList.get(m));
            }
            sbuiler.append("    ");
            for (int n=0;n<endList.size();n++){
                sbuiler.append(endList.get(n));
            }
            sbuiler.append("\n");
        }
        System.out.println(sbuiler.toString());        

    }
    public static void main(String[] args){
        Lottery l = new Lottery();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number of lottery group(s) that you want to generate:");
        String groupNum = scan.nextLine();
        l.generateLottery(groupNum);
    }
}