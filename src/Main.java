import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> boardingPassList = new HashSet<>();
    }
    public static int boardingPassNumber(HashSet<Integer>boardingPassList){
        boolean numberNotAdded = true;
        int boardingPassNumber = 0;
        while(numberNotAdded) {
            boardingPassNumber= (int) (100000+(Math.random()*999999));
            while (!boardingPassList.contains(boardingPassNumber)) {
                boardingPassList.add(boardingPassNumber);
                numberNotAdded = false;
            }
        }
        return boardingPassNumber;
    }
}
