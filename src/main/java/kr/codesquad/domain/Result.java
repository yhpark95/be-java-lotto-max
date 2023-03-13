package main.java.kr.codesquad.domain;

import main.java.kr.codesquad.viewer.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Result {

    private final int threeMatchPrize = 5_000;
    private final int fourMatchPrize = 50_000;
    private final int fiveMatchPrize = 1_500_000;
    private final int sixMatchPrize = 2_000_000_000;

    private final int prizeCount = 4;

    private double returnRate;

    private ArrayList<Integer> ticketResult = new ArrayList<>();


    public Result(ArrayList<Ticket> tickets, int amount){
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        this.getTicketResult(tickets, lottoNumberGenerator.createLottoNumber());

    }

    private void getTicketResult(ArrayList<Ticket> tickets, ArrayList<Integer> lottoResultNumbers) {
        for(Ticket ticket: tickets){
            this.ticketResult.add(ticket.countMatchingNumbers(lottoResultNumbers));
        }

    }
}
