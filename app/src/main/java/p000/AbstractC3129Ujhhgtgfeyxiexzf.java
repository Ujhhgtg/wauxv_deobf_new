package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴ能不能ᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3129Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final InterfaceC3123Ujhhgtgfeyxiexzf f9721Ujhhgtgfeyxiexzf;

    static {
        String property;
        C0529Ujhhgtgfeyxiexzf c0529Ujhhgtgfeyxiexzf;
        InterfaceC3123Ujhhgtgfeyxiexzf interfaceC3123Ujhhgtgfeyxiexzf;
        int i = AbstractC2075feyxiexzfUjhhgtg.f6819Ujhhgtgfeyxiexzf;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
            c0529Ujhhgtgfeyxiexzf = AbstractC0166Ujhhgtgfeyxiexzf.f1350Ujhhgtgfeyxiexzf;
            C0529Ujhhgtgfeyxiexzf c0529Ujhhgtgfeyxiexzf2 = c0529Ujhhgtgfeyxiexzf.f2492Ujhhgtgfeyxiexzf;
            if (c0529Ujhhgtgfeyxiexzf == null) {
                interfaceC3123Ujhhgtgfeyxiexzf = c0529Ujhhgtgfeyxiexzf;
                interfaceC3123Ujhhgtgfeyxiexzf = RunnableC3128Ujhhgtgfeyxiexzf.f9719Ujhhgtgfeyxiexzf;
            }
        } else {
            interfaceC3123Ujhhgtgfeyxiexzf = RunnableC3128Ujhhgtgfeyxiexzf.f9719Ujhhgtgfeyxiexzf;
        }
        interfaceC3123Ujhhgtgfeyxiexzf = c0529Ujhhgtgfeyxiexzf;
        f9721Ujhhgtgfeyxiexzf = interfaceC3123Ujhhgtgfeyxiexzf;
    }
}
