import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

import java.util.ArrayList;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(largeNum+1);
        try {
            System.out.println(IntMath.checkedAdd(largeNum, 1));
        } catch(ArithmeticException e) {
            System.out.println("Can not do this");
        }

        String nameTag = "Hello,, ,my, name,,, is,,, Joe!";
        String[] cutUpTag = nameTag.split(",");
        System.out.println(cutUpTag.length);
        ArrayList<String> cutUpTag2 = new ArrayList<>();
        Splitter.on(",").trimResults().omitEmptyStrings().split(nameTag).forEach(cutUpTag2::add);
        System.out.println(cutUpTag2);
    }
}
