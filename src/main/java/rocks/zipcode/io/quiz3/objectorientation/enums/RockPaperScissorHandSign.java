package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        return getRockPaperScissorHandSign(PAPER, SCISSOR, ROCK);
    }
    
    public RockPaperScissorHandSign getLoser() {
        return getRockPaperScissorHandSign(SCISSOR, ROCK, PAPER);
    }

    private RockPaperScissorHandSign getRockPaperScissorHandSign(RockPaperScissorHandSign scissors, RockPaperScissorHandSign rock, RockPaperScissorHandSign paper) {
        switch(this.name()){
            case "ROCK":return scissors;
            case "PAPER":return rock;
            default:return paper;
        }
    }
}
