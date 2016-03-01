/**
 * Created by brindaba on 2/29/16.
 */
public class PowerOfTwo {
    int number;

    public PowerOfTwo(int number) {
        this.number = number;
    }

    public boolean isPowerOfTwo() {
        String binaryRepresentation = Integer.toString(number,2);
        return binaryRepresentation.lastIndexOf('1') == 0;
    }

}
