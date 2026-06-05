package p000;

import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0091Ujhhgtgfeyxiexzf implements InterfaceC1121feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg f1197Ujhhgtgfeyxiexzf;

    public AbstractC0091Ujhhgtgfeyxiexzf(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg) {
        this.f1197Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0091Ujhhgtgfeyxiexzf)) {
            return false;
        }
        AbstractC0091Ujhhgtgfeyxiexzf abstractC0091Ujhhgtgfeyxiexzf = (AbstractC0091Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f1197Ujhhgtgfeyxiexzf, abstractC0091Ujhhgtgfeyxiexzf.f1197Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(mo1117Ujhhgtgfeyxiexzf(), abstractC0091Ujhhgtgfeyxiexzf.mo1117Ujhhgtgfeyxiexzf());
    }

    public final int hashCode() {
        return mo1117Ujhhgtgfeyxiexzf().hashCode() + (this.f1197Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        return mo1117Ujhhgtgfeyxiexzf() + '(' + this.f1197Ujhhgtgfeyxiexzf + ')';
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo1118Ujhhgtgfeyxiexzf(String str) {
        Integer numM2673feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2673feyxiexzfUjhhgtg(str);
        if (numM2673feyxiexzfUjhhgtg != null) {
            return numM2673feyxiexzfUjhhgtg.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final AbstractC3611Ujhhgtgfeyxiexzf mo1119Ujhhgtgfeyxiexzf() {
        return C1189feyxiexzfUjhhgtg.f4475Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo1120Ujhhgtgfeyxiexzf() {
        return 1;
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final String mo1121Ujhhgtgfeyxiexzf(int i) {
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final List mo1122Ujhhgtgfeyxiexzf(int i) {
        if (i >= 0) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "Illegal index ", ", ");
        sbM4804Ujhhgtgfeyxiexzf.append(mo1117Ujhhgtgfeyxiexzf());
        sbM4804Ujhhgtgfeyxiexzf.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4804Ujhhgtgfeyxiexzf.toString().toString());
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1123Ujhhgtgfeyxiexzf(int i) {
        if (i >= 0) {
            return this.f1197Ujhhgtgfeyxiexzf;
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "Illegal index ", ", ");
        sbM4804Ujhhgtgfeyxiexzf.append(mo1117Ujhhgtgfeyxiexzf());
        sbM4804Ujhhgtgfeyxiexzf.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4804Ujhhgtgfeyxiexzf.toString().toString());
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final boolean mo1124Ujhhgtgfeyxiexzf(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "Illegal index ", ", ");
        sbM4804Ujhhgtgfeyxiexzf.append(mo1117Ujhhgtgfeyxiexzf());
        sbM4804Ujhhgtgfeyxiexzf.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM4804Ujhhgtgfeyxiexzf.toString().toString());
    }
}
