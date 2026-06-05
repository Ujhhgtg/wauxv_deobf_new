package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.Node;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能ᛴ要点脸ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1091feyxiexzfUjhhgtg extends C1863Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ int f4176Ujhhgtgfeyxiexzf = 0;

    public C1091feyxiexzfUjhhgtg(String str) {
        super(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("SecurityError: ", str));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static String m2566Ujhhgtgfeyxiexzf(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Object[] objArr2 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            Class clsM562Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(obj, false);
            strArr[i] = clsM562Ujhhgtgfeyxiexzf != null ? clsM562Ujhhgtgfeyxiexzf.getTypeName() : "null";
        }
        return String.join(", ", strArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C1091feyxiexzfUjhhgtg m2567Ujhhgtgfeyxiexzf(Class cls, Object[] objArr) {
        return new C1091feyxiexzfUjhhgtg("Can't call this construct using reflection: new " + cls.getName() + "(" + m2566Ujhhgtgfeyxiexzf(objArr) + ")");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static C1091feyxiexzfUjhhgtg m2568Ujhhgtgfeyxiexzf(Object obj, String str) {
        return new C1091feyxiexzfUjhhgtg("Can't get this field using reflection: " + obj.getClass().getTypeName() + "." + str);
    }

    @Override // p000.C1863Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3353Ujhhgtgfeyxiexzf mo2569Ujhhgtgfeyxiexzf(Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        return new C3353Ujhhgtgfeyxiexzf(getMessage(), node, c2637feyxiexzfUjhhgtg);
    }

    @Override // p000.C1863Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3353Ujhhgtgfeyxiexzf mo2570Ujhhgtgfeyxiexzf(String str, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        return new C3353Ujhhgtgfeyxiexzf(getMessage(), node, c2637feyxiexzfUjhhgtg);
    }
}
