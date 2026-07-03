import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public static List<String> readBinaryWatch(int turnedOn) {

        List<String> ans = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {

            for (int minute = 0; minute < 60; minute++) {

                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {

                    ans.add(String.format("%d:%02d", hour, minute));
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int turnedOn = 1;

        List<String> result = readBinaryWatch(turnedOn);

        System.out.println(result);
    }
}