package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1239 {

    public static final C2819 f4472;

    public static final C2819 f4473;

    public static final C2819 f4474;

    public static final C2819 f4475;

    public static final C2819 f4476;

    public static final C2819 f4477;

    public static final C2819 f4478;

    public static final C2819 f4479;

    static {
        C3448 c3448M4961 = C3448.m4961("Ljava/lang/ArithmeticException;");
        C3448 c3448M4962 = C3448.m4961("Ljava/lang/ArrayIndexOutOfBoundsException;");
        C3448 c3448M4963 = C3448.m4961("Ljava/lang/ArrayStoreException;");
        C3448 c3448M4964 = C3448.m4961("Ljava/lang/ClassCastException;");
        C3448 c3448M4965 = C3448.m4961("Ljava/lang/Error;");
        C3448 c3448M4966 = C3448.m4961("Ljava/lang/IllegalMonitorStateException;");
        C3448 c3448M4967 = C3448.m4961("Ljava/lang/NegativeArraySizeException;");
        C3448 c3448M4968 = C3448.m4961("Ljava/lang/NullPointerException;");
        f4472 = C2819.m4794(c3448M4965);
        f4473 = C2819.m4795(c3448M4965, c3448M4961);
        f4474 = C2819.m4795(c3448M4965, c3448M4964);
        f4475 = C2819.m4795(c3448M4965, c3448M4967);
        f4476 = C2819.m4795(c3448M4965, c3448M4968);
        f4477 = C2819.m4796(c3448M4965, c3448M4968, c3448M4962);
        C2819 c2819 = new C2819(4);
        c2819.m3063(0, c3448M4965);
        c2819.m3063(1, c3448M4968);
        c2819.m3063(2, c3448M4962);
        c2819.m3063(3, c3448M4963);
        f4478 = c2819;
        f4479 = C2819.m4796(c3448M4965, c3448M4968, c3448M4966);
    }
}
