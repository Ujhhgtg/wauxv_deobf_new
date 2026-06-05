package p000;

import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2776Ujhhgtgfeyxiexzf implements Supplier, Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final ThreadLocal f8776Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public volatile boolean f8777Ujhhgtgfeyxiexzf;

    static {
        C2776Ujhhgtgfeyxiexzf c2776Ujhhgtgfeyxiexzf = new C2776Ujhhgtgfeyxiexzf();
        c2776Ujhhgtgfeyxiexzf.f8777Ujhhgtgfeyxiexzf = true;
        f8776Ujhhgtgfeyxiexzf = ThreadLocal.withInitial(c2776Ujhhgtgfeyxiexzf);
        new WeakHashMap();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m4063Ujhhgtgfeyxiexzf() {
        return ((Boolean) f8776Ujhhgtgfeyxiexzf.get()).booleanValue();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f8777Ujhhgtgfeyxiexzf = ((Boolean) obj).booleanValue();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Boolean.valueOf(this.f8777Ujhhgtgfeyxiexzf);
    }
}
