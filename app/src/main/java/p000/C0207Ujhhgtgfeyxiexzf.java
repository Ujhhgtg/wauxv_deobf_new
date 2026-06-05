package p000;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳ要点脸ᛴᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0207Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Matcher f1465Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final CharSequence f1466Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0208Ujhhgtgfeyxiexzf f1467Ujhhgtgfeyxiexzf;

    public C0207Ujhhgtgfeyxiexzf(Matcher matcher, CharSequence charSequence) {
        this.f1465Ujhhgtgfeyxiexzf = matcher;
        this.f1466Ujhhgtgfeyxiexzf = charSequence;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List m1285Ujhhgtgfeyxiexzf() {
        if (this.f1467Ujhhgtgfeyxiexzf == null) {
            this.f1467Ujhhgtgfeyxiexzf = new C0208Ujhhgtgfeyxiexzf(this);
        }
        return this.f1467Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0207Ujhhgtgfeyxiexzf m1286Ujhhgtgfeyxiexzf() {
        Matcher matcher = this.f1465Ujhhgtgfeyxiexzf;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f1466Ujhhgtgfeyxiexzf;
        if (iEnd <= charSequence.length()) {
            return AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(matcher.pattern().matcher(charSequence), iEnd, charSequence);
        }
        return null;
    }
}
