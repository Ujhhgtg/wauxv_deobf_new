package p000;

import java.io.IOException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1462 implements Appendable {

    public final Appendable f5215;

    public boolean f5216 = true;

    public C1462(Appendable appendable) {
        this.f5215 = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.f5216;
        Appendable appendable = this.f5215;
        if (z) {
            this.f5216 = false;
            appendable.append("  ");
        }
        this.f5216 = c == '\n';
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
        boolean z = this.f5216;
        Appendable appendable = this.f5215;
        boolean z2 = false;
        if (z) {
            this.f5216 = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f5216 = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
