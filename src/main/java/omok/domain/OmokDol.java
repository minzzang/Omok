package omok.domain;

public enum  OmokDol {
    BLACK(1),
    WHITE(2);

    private int value;

    OmokDol(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
