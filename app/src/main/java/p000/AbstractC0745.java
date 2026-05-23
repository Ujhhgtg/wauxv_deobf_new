package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0745 extends AbstractC1459 {
    public static int m2211(List list) {
        return list.size() - 1;
    }

    public static List listOf(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C1189.f4329;
    }

    public static void m2213() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
