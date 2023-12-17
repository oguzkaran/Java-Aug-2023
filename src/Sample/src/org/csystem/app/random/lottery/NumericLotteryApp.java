package org.csystem.app.random.lottery;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        NumericLottery numericLottery = new NumericLottery(random);

        while (true) {
            System.out.print("Kaç kupon oynamak istersiniz?");
            int count = Integer.parseInt(kb.nextLine());

            while (count-- > 0)
                ArrayUtil.print(2, numericLottery.getNumbers());
        }
    }
    public static void main(String[] args)
    {
        run();
    }
}
