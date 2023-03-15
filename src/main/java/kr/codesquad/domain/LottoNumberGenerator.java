package main.java.kr.codesquad.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoNumberGenerator {

    private static final int MIN = 1;
    private static final int MAX = 45;

    private static final int NUMBER_OF_LOTTERY_NUMBERS = 6;

    public ArrayList<Integer> generateLottoNumbers() {
        List<Integer> allNumbers = generateShuffledNumbersList();

        // 6개 뽑아오기
        ArrayList<Integer> lottoNumber = new ArrayList<>(allNumbers.subList(0, NUMBER_OF_LOTTERY_NUMBERS));

        // 오름차순 정렬
        Collections.sort(lottoNumber);
        return lottoNumber;
    }

    private List<Integer> generateShuffledNumbersList() {
        List<Integer> allNumbers = IntStream.rangeClosed(MIN, MAX)
                .boxed()
                .collect(Collectors.toList());

        // 리스트 섞어주기
        Collections.shuffle(allNumbers);
        return allNumbers;
    }
}
