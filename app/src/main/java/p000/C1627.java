package p000;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1627 extends FilterWriter {

    public final String f5499;

    public final int f5500;

    public final int f5501;

    public int f5502;

    public boolean f5503;

    public int f5504;

    public C1627(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f5500 = i != 0 ? i : 2147483647;
        int i2 = i >> 1;
        this.f5501 = i2;
        this.f5499 = str.length() == 0 ? null : str;
        this.f5502 = 0;
        this.f5503 = i2 != 0;
        this.f5504 = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            try {
                boolean z = true;
                if (this.f5503) {
                    if (i == 32) {
                        int i3 = this.f5504 + 1;
                        this.f5504 = i3;
                        int i4 = this.f5501;
                        if (i3 >= i4) {
                            this.f5504 = i4;
                            this.f5503 = false;
                        }
                    } else {
                        this.f5503 = false;
                    }
                }
                if (this.f5502 == this.f5500 && i != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.f5502 = 0;
                }
                if (this.f5502 == 0) {
                    String str = this.f5499;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.f5503) {
                        int i5 = 0;
                        while (true) {
                            i2 = this.f5504;
                            if (i5 >= i2) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i5++;
                        }
                        this.f5502 = i2;
                    }
                }
                ((FilterWriter) this).out.write(i);
                if (i == 10) {
                    this.f5502 = 0;
                    if (this.f5501 == 0) {
                        z = false;
                    }
                    this.f5503 = z;
                    this.f5504 = 0;
                } else {
                    this.f5502++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                try {
                    write(cArr[i]);
                    i++;
                    i2--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                try {
                    write(str.charAt(i));
                    i++;
                    i2--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
