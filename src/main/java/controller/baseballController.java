package controller;

import model.baseballModel;
import vo.baseballVO;
import model.inputModel;
import model.printModel;


public class baseballController {

    baseballVO result;
    String quesNumber;

    public void gameRun() {
        int isClose = 1;
        while(isClose != 2) {
            quesNumber = inputModel.setQuiz(quesNumber, isClose);
            String in = inputModel.stringInput();
            result = baseballModel.Solution(quesNumber, in);
            isClose = printModel.SolvPrint(result);
        }
    }
}
