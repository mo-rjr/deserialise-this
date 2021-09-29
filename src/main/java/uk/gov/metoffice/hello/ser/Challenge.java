package uk.gov.metoffice.hello.ser;

import java.util.List;
import java.util.Objects;

/**
 * {A thing} to {do something} for {another thing}
 * -- for example, {this}
 * -- and also {this}
 */
// TODO fill in Javadoc
public class Challenge {

    private int drawNumber;

    private List<Integer> luckyNumbers;

    private String presenter;

    private List<Simple> cameraOperators;

    public int getDrawNumber() {
        return drawNumber;
    }

    public void setDrawNumber(int drawNumber) {
        this.drawNumber = drawNumber;
    }

    public List<Integer> getLuckyNumbers() {
        return luckyNumbers;
    }

    public void setLuckyNumbers(List<Integer> luckyNumbers) {
        this.luckyNumbers = luckyNumbers;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public List<Simple> getCameraOperators() {
        return cameraOperators;
    }

    public void setCameraOperators(List<Simple> cameraOperators) {
        this.cameraOperators = cameraOperators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        return drawNumber == challenge.drawNumber && Objects.equals(luckyNumbers, challenge.luckyNumbers) && Objects.equals(presenter, challenge.presenter) && Objects.equals(cameraOperators, challenge.cameraOperators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drawNumber, luckyNumbers, presenter, cameraOperators);
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "drawNumber=" + drawNumber +
                ", luckyNumbers=" + luckyNumbers +
                ", presenter='" + presenter + '\'' +
                ", cameraOperators=" + cameraOperators +
                '}';
    }
}
