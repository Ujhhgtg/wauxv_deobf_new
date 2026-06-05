package p000;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2803Ujhhgtgfeyxiexzf extends AbstractC2484feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f8909Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f8910Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Integer f8911Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final ArrayList f8912Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f8913Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f8914Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f8915Ujhhgtgfeyxiexzf;

    public C2803Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge, int i, int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f8909Ujhhgtgfeyxiexzf = i3;
        this.f8910Ujhhgtgfeyxiexzf = str;
        this.f8911Ujhhgtgfeyxiexzf = num;
        this.f8912Ujhhgtgfeyxiexzf = arrayList;
        this.f8913Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2977Ujhhgtgfeyxiexzf(12, this));
        this.f8914Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2804Ujhhgtgfeyxiexzf(this, dexKitBridge, i2));
        this.f8915Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2804Ujhhgtgfeyxiexzf(dexKitBridge, this, i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2803Ujhhgtgfeyxiexzf) {
            return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8910Ujhhgtgfeyxiexzf, ((C2803Ujhhgtgfeyxiexzf) obj).f8910Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8910Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f8909Ujhhgtgfeyxiexzf;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m4124Ujhhgtgfeyxiexzf().f10253Ujhhgtgfeyxiexzf);
        C2803Ujhhgtgfeyxiexzf c2803Ujhhgtgfeyxiexzf = (C2803Ujhhgtgfeyxiexzf) this.f8914Ujhhgtgfeyxiexzf.getValue();
        if (c2803Ujhhgtgfeyxiexzf != null) {
            sb.append(" extends ");
            sb.append(c2803Ujhhgtgfeyxiexzf.m4124Ujhhgtgfeyxiexzf().f10253Ujhhgtgfeyxiexzf);
        }
        if (this.f8912Ujhhgtgfeyxiexzf.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC2856feyxiexzfUjhhgtg.m4243feyxiexzfUjhhgtg((C2805Ujhhgtgfeyxiexzf) this.f8915Ujhhgtgfeyxiexzf.getValue(), ", ", null, null, new C2901feyxiexzfUjhhgtg(10), 30));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3264feyxiexzfUjhhgtg m4124Ujhhgtgfeyxiexzf() {
        return (C3264feyxiexzfUjhhgtg) this.f8913Ujhhgtgfeyxiexzf.getValue();
    }
}
