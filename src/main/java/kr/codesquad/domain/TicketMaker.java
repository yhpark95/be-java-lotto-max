package main.java.kr.codesquad.domain;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class TicketMaker {

    private final int ticketPrice = 1_000;

    private ArrayList<Ticket> tickets = new ArrayList<>();

    public TicketMaker(String inputAmount){
        LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
        this.createTickets(Integer.parseInt(inputAmount), lottoNumberGenerator);
    }

    private void createTickets(int Amount, LottoNumberGenerator lottoNumberGenerator) {
        for (int i = 0; i < Amount/this.ticketPrice; i++){
            tickets.add(new Ticket(lottoNumberGenerator.createLottoNumber()));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tickets.size() + "개를 구매했습니다.\n");
        for(Ticket ticket: tickets){
            sb.append(ticket.toString()).append("\n");
        }

        return sb.toString();
    }
}
