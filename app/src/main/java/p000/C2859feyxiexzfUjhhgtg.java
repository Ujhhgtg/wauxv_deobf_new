package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2859feyxiexzfUjhhgtg implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3739feyxiexzfUjhhgtg[] f9118Ujhhgtgfeyxiexzf;

    public C2859feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg[] interfaceC3739feyxiexzfUjhhgtgArr) {
        this.f9118Ujhhgtgfeyxiexzf = interfaceC3739feyxiexzfUjhhgtgArr;
    }

    private final Object readResolve() {
        InterfaceC3739feyxiexzfUjhhgtg[] interfaceC3739feyxiexzfUjhhgtgArr = this.f9118Ujhhgtgfeyxiexzf;
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg = C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf;
        for (InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg : interfaceC3739feyxiexzfUjhhgtgArr) {
            interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg = interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg.mo1764feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg);
        }
        return interfaceC3739feyxiexzfUjhhgtgMo1764feyxiexzfUjhhgtg;
    }
}
