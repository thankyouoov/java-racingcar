package racingcar.service.race.impl;

import racingcar.service.race.RaceService;
import racingcar.view.InputView;

public class RaceServiceImpl implements RaceService {
    private final InputView inputView;

    public RaceServiceImpl(InputView inputView) {
        this.inputView = inputView;
    }
    public int getRaceTryCount(){
        int tryCount;
        while(true){
            try{
                tryCount = inputView.inputInt();
                if(tryCount <= 0) throw new IllegalArgumentException("비정상적인 숫자입니다.");
                return tryCount;
            }catch (IllegalArgumentException e){
                System.out.println("[ERROR]" + e);
            }
        }
    }

}
