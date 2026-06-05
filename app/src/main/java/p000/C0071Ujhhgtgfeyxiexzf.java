package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲ要点脸ᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0071Ujhhgtgfeyxiexzf implements Iterator, InterfaceC0140Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final CharSequence f1107Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f1108Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1109Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f1110Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f1111Ujhhgtgfeyxiexzf;

    public C0071Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        this.f1107Ujhhgtgfeyxiexzf = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f1108Ujhhgtgfeyxiexzf;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f1111Ujhhgtgfeyxiexzf < 0) {
            this.f1108Ujhhgtgfeyxiexzf = 2;
            return false;
        }
        CharSequence charSequence = this.f1107Ujhhgtgfeyxiexzf;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f1109Ujhhgtgfeyxiexzf; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f1108Ujhhgtgfeyxiexzf = 1;
                this.f1111Ujhhgtgfeyxiexzf = i;
                this.f1110Ujhhgtgfeyxiexzf = length;
                return true;
            }
        }
        i = -1;
        this.f1108Ujhhgtgfeyxiexzf = 1;
        this.f1111Ujhhgtgfeyxiexzf = i;
        this.f1110Ujhhgtgfeyxiexzf = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1108Ujhhgtgfeyxiexzf = 0;
        int i = this.f1110Ujhhgtgfeyxiexzf;
        int i2 = this.f1109Ujhhgtgfeyxiexzf;
        this.f1109Ujhhgtgfeyxiexzf = this.f1111Ujhhgtgfeyxiexzf + i;
        return this.f1107Ujhhgtgfeyxiexzf.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
