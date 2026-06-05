package p000;

import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0543Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f2530Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ArrayList f2531Ujhhgtgfeyxiexzf;

    public C0543Ujhhgtgfeyxiexzf(String str, ArrayList arrayList) {
        this.f2530Ujhhgtgfeyxiexzf = str;
        this.f2531Ujhhgtgfeyxiexzf = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0543Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0543Ujhhgtgfeyxiexzf c0543Ujhhgtgfeyxiexzf = (C0543Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f2530Ujhhgtgfeyxiexzf, c0543Ujhhgtgfeyxiexzf.f2530Ujhhgtgfeyxiexzf) && this.f2531Ujhhgtgfeyxiexzf.equals(c0543Ujhhgtgfeyxiexzf.f2531Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f2531Ujhhgtgfeyxiexzf.hashCode() + (this.f2530Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928829753638520202L, strArr));
        sb.append(this.f2530Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928829822357996938L, strArr));
        sb.append(this.f2531Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
