package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1792 implements Iterator, InterfaceC1737 {

    public final CharSequence f5985;

    public int f5986;

    public int f5987;

    public int f5988;

    public int f5989;

    public C1792(CharSequence charSequence) {
        this.f5985 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f5986;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f5989 < 0) {
            this.f5986 = 2;
            return false;
        }
        CharSequence charSequence = this.f5985;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f5987; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f5986 = 1;
                this.f5989 = i;
                this.f5988 = length;
                return true;
            }
        }
        i = -1;
        this.f5986 = 1;
        this.f5989 = -1;
        this.f5988 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5986 = 0;
        int i = this.f5988;
        int i2 = this.f5987;
        this.f5987 = this.f5989 + i;
        return this.f5985.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
