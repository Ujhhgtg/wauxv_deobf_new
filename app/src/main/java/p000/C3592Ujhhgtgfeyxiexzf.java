package p000;

import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳᛱUjhhgtgᛱᛲ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3592Ujhhgtgfeyxiexzf implements Appendable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Appendable f11178Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public boolean f11179Ujhhgtgfeyxiexzf = true;

    public C3592Ujhhgtgfeyxiexzf(Appendable appendable) {
        this.f11178Ujhhgtgfeyxiexzf = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.f11179Ujhhgtgfeyxiexzf;
        Appendable appendable = this.f11178Ujhhgtgfeyxiexzf;
        if (z) {
            this.f11179Ujhhgtgfeyxiexzf = false;
            appendable.append("  ");
        }
        this.f11179Ujhhgtgfeyxiexzf = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f11179Ujhhgtgfeyxiexzf;
        Appendable appendable = this.f11178Ujhhgtgfeyxiexzf;
        boolean z2 = false;
        if (z) {
            this.f11179Ujhhgtgfeyxiexzf = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f11179Ujhhgtgfeyxiexzf = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
