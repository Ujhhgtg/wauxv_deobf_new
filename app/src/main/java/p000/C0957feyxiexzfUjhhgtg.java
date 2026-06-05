package p000;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲ能不能ᛱUjhhgtgᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0957feyxiexzfUjhhgtg implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f3824Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f3825Ujhhgtgfeyxiexzf;

    public C0957feyxiexzfUjhhgtg(String str, int i) {
        this.f3824Ujhhgtgfeyxiexzf = str;
        this.f3825Ujhhgtgfeyxiexzf = i;
    }

    private final Object readResolve() {
        return new C0964feyxiexzfUjhhgtg(Pattern.compile(this.f3824Ujhhgtgfeyxiexzf, this.f3825Ujhhgtgfeyxiexzf));
    }
}
