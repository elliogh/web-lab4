package lab4.utils;

import static java.lang.Math.pow;

public class HitChecker {
    public static boolean checkArea(int x, float y, int R) {
        return R != 0 && (R > 0 ? doCheck(x, y, R) : doCheck(-x, -y, -R));
    }

    private static boolean doCheck(int x, float y, int R) {
        return (x>=-R && x<=0 && y<=R && y>=0)||
                (x>=0 && y>=0 && y<=-2*x+R) ||
                (x>=0 && y<=0 && pow(x,2) + pow(y,2) <= pow(R,2));
    }
}