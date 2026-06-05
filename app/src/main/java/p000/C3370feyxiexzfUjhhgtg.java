package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴ能不能ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3370feyxiexzfUjhhgtg implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Class f10537Ujhhgtgfeyxiexzf;

    public C3370feyxiexzfUjhhgtg(Enum[] enumArr) {
        this.f10537Ujhhgtgfeyxiexzf = enumArr.getClass().getComponentType();
    }

    private final Object readResolve() {
        return new C3369feyxiexzfUjhhgtg((Enum[]) this.f10537Ujhhgtgfeyxiexzf.getEnumConstants());
    }
}
