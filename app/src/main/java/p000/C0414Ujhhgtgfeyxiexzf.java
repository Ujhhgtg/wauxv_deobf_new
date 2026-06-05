package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ要点脸能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0414Ujhhgtgfeyxiexzf implements Comparator {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C0414Ujhhgtgfeyxiexzf f2237Ujhhgtgfeyxiexzf = new C0414Ujhhgtgfeyxiexzf(0);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C0414Ujhhgtgfeyxiexzf f2238Ujhhgtgfeyxiexzf = new C0414Ujhhgtgfeyxiexzf(1);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2239Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0414Ujhhgtgfeyxiexzf(int i) {
        this.f2239Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2239Ujhhgtgfeyxiexzf) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj2).compareTo((Comparable) obj);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f2239Ujhhgtgfeyxiexzf) {
            case 0:
                return f2238Ujhhgtgfeyxiexzf;
            default:
                return f2237Ujhhgtgfeyxiexzf;
        }
    }
}
