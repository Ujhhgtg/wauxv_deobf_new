package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴ能不能ᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0659Ujhhgtgfeyxiexzf extends C1412feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f2772Ujhhgtgfeyxiexzf;

    public C0659Ujhhgtgfeyxiexzf(String str, C0660Ujhhgtgfeyxiexzf c0660Ujhhgtgfeyxiexzf) {
        super(str, c0660Ujhhgtgfeyxiexzf, 1);
        this.f2772Ujhhgtgfeyxiexzf = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ能不能ᛴ要点脸ᛳ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ能不能ᛴ要点脸ᛳ] */
    @Override // p000.C1412feyxiexzfUjhhgtg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0659Ujhhgtgfeyxiexzf) {
            InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = (InterfaceC1121feyxiexzfUjhhgtg) obj;
            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4950Ujhhgtgfeyxiexzf, interfaceC1121feyxiexzfUjhhgtg.mo1117Ujhhgtgfeyxiexzf())) {
                C0659Ujhhgtgfeyxiexzf c0659Ujhhgtgfeyxiexzf = (C0659Ujhhgtgfeyxiexzf) obj;
                if (c0659Ujhhgtgfeyxiexzf.f2772Ujhhgtgfeyxiexzf && Arrays.equals((InterfaceC1121feyxiexzfUjhhgtg[]) this.f4959Ujhhgtgfeyxiexzf.getValue(), (InterfaceC1121feyxiexzfUjhhgtg[]) c0659Ujhhgtgfeyxiexzf.f4959Ujhhgtgfeyxiexzf.getValue())) {
                    int iMo1120Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf();
                    int i = this.f4952Ujhhgtgfeyxiexzf;
                    if (i == iMo1120Ujhhgtgfeyxiexzf) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(mo1123Ujhhgtgfeyxiexzf(i2).mo1117Ujhhgtgfeyxiexzf(), interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(i2).mo1117Ujhhgtgfeyxiexzf()) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(mo1123Ujhhgtgfeyxiexzf(i2).mo1119Ujhhgtgfeyxiexzf(), interfaceC1121feyxiexzfUjhhgtg.mo1123Ujhhgtgfeyxiexzf(i2).mo1119Ujhhgtgfeyxiexzf())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.C1412feyxiexzfUjhhgtg
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p000.InterfaceC1121feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final boolean mo1184Ujhhgtgfeyxiexzf() {
        return this.f2772Ujhhgtgfeyxiexzf;
    }
}
