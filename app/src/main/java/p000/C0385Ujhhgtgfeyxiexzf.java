package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛲᛱfeyxiexzfᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0385Ujhhgtgfeyxiexzf extends AbstractC2484feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2118Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f2119Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f2120Ujhhgtgfeyxiexzf;

    public C0385Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge, int i, int i2, int i3, int i4, String str, int i5, ArrayList arrayList) {
        super(dexKitBridge, i, i2);
        this.f2118Ujhhgtgfeyxiexzf = i4;
        this.f2119Ujhhgtgfeyxiexzf = str;
        this.f2120Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2977Ujhhgtgfeyxiexzf(29, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0385Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(((C0385Ujhhgtgfeyxiexzf) obj).f2119Ujhhgtgfeyxiexzf, this.f2119Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f2119Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f2118Ujhhgtgfeyxiexzf;
        if (i != 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m1633Ujhhgtgfeyxiexzf().f10280Ujhhgtgfeyxiexzf);
        sb.append(" ");
        sb.append(m1633Ujhhgtgfeyxiexzf().f10277Ujhhgtgfeyxiexzf);
        sb.append(".");
        sb.append(m1633Ujhhgtgfeyxiexzf().f10278Ujhhgtgfeyxiexzf);
        sb.append("(");
        return AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(sb, AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg(m1633Ujhhgtgfeyxiexzf().f10279Ujhhgtgfeyxiexzf, ", ", null, null, null, 62), ")");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3270feyxiexzfUjhhgtg m1633Ujhhgtgfeyxiexzf() {
        return (C3270feyxiexzfUjhhgtg) this.f2120Ujhhgtgfeyxiexzf.getValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Method m1634Ujhhgtgfeyxiexzf(ClassLoader classLoader) {
        return m1633Ujhhgtgfeyxiexzf().m4777Ujhhgtgfeyxiexzf(classLoader, Boolean.valueOf(Modifier.isStatic(this.f2118Ujhhgtgfeyxiexzf)));
    }
}
