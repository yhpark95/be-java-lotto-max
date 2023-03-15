package main.java.kr.codesquad.domain.PrizeConditions;

import main.java.kr.codesquad.domain.PrizeCondition;

import java.util.ArrayList;

public class FouthPrizeCondition extends PrizeCondition {
    private static final int PRIZE = 5_000;

    private static final int MATCHING_NUMBER_COUNT = 3;

    protected int returnPrize(ArrayList<Integer> winningNumbers, ArrayList<Integer> ticketNumber){
        if(checkCondition(winningNumbers, ticketNumber)){
            return PRIZE;
        }
        return NOPRIZE;
    }

    protected boolean checkCondition(ArrayList<Integer> winningNumbers, ArrayList<Integer> ticketNumber){
        int count = 0;
        for(Integer i : ticketNumber){
            if(winningNumbers.contains(i)){
                count++;
            }
        }
        if(count == MATCHING_NUMBER_COUNT){
            return true;
        }
        return false;

    }
}
