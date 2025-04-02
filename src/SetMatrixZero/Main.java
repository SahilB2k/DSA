// Source code is decompiled from a .class file using FernFlower decompiler.
package SetMatrixZero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public Main() {
    }

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> var0, int var1, int var2) {
        boolean var3 = true;

        int var4;
        int var5;
        for(var4 = 0; var4 < var1; ++var4) {
            for(var5 = 0; var5 < var2; ++var5) {
                if ((Integer)((ArrayList)var0.get(var4)).get(var5) == 0) {
                    ((ArrayList)var0.get(var4)).set(0, 0);
                    if (var5 != 0) {
                        ((ArrayList)var0.get(0)).set(var5, 0);
                    } else {
                        var3 = false;
                    }
                }
            }
        }

        for(var4 = 1; var4 < var1; ++var4) {
            for(var5 = 1; var5 < var2; ++var5) {
                if ((Integer)((ArrayList)var0.get(var4)).get(var5) != 0 && ((Integer)((ArrayList)var0.get(var4)).get(0) == 0 || (Integer)((ArrayList)var0.get(0)).get(var5) == 0)) {
                    ((ArrayList)var0.get(var4)).set(var5, 0);
                }
            }
        }

        if ((Integer)((ArrayList)var0.get(0)).get(0) == 0) {
            for(var4 = 0; var4 < var2; ++var4) {
                ((ArrayList)var0.get(0)).set(var4, 0);
            }
        }

        if (!var3) {
            for(var4 = 0; var4 < var1; ++var4) {
                ((ArrayList)var0.get(var4)).set(0, 0);
            }
        }

        return var0;
    }

    public static void main(String[] var0) {
        ArrayList var1 = new ArrayList();
        var1.add(new ArrayList(Arrays.asList(1, 1, 1)));
        var1.add(new ArrayList(Arrays.asList(1, 0, 1)));
        var1.add(new ArrayList(Arrays.asList(1, 1, 1)));
        int var2 = var1.size();
        int var3 = ((ArrayList)var1.get(0)).size();
        ArrayList var4 = zeroMatrix(var1, var2, var3);
        System.out.println("The Final matrix is: ");
        Iterator var5 = var4.iterator();

        while(var5.hasNext()) {
            ArrayList var6 = (ArrayList)var5.next();
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
                Integer var8 = (Integer)var7.next();
                System.out.print("" + var8 + " ");
            }

            System.out.println();
        }

    }
}
