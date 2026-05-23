package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0417 {

    public static final byte[] f1953 = new byte[1792];

    public final CharSequence f1954;

    public final int f1955;

    public int f1956;

    public char f1957;

    static {
        for (int i = 0; i < 1792; i++) {
            f1953[i] = Character.getDirectionality(i);
        }
    }

    public C0417(CharSequence charSequence) {
        this.f1954 = charSequence;
        this.f1955 = charSequence.length();
    }

    public final byte m1610() {
        int i = this.f1956 - 1;
        CharSequence charSequence = this.f1954;
        char cCharAt = charSequence.charAt(i);
        this.f1957 = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f1956);
            this.f1956 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f1956--;
        char c = this.f1957;
        return c < 1792 ? f1953[c] : Character.getDirectionality(c);
    }
}
