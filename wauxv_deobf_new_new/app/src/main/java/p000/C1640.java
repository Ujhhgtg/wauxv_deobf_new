package p000;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᛸᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1640 extends FilterWriter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f5533;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5534;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f5535;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5536;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f5537;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f5538;

    public C1640(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f5534 = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.f5535 = i2;
        this.f5533 = str.length() == 0 ? null : str;
        this.f5536 = 0;
        this.f5537 = i2 != 0;
        this.f5538 = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            try {
                boolean z = true;
                if (this.f5537) {
                    if (i == 32) {
                        int i3 = this.f5538 + 1;
                        this.f5538 = i3;
                        int i4 = this.f5535;
                        if (i3 >= i4) {
                            this.f5538 = i4;
                            this.f5537 = false;
                        }
                    } else {
                        this.f5537 = false;
                    }
                }
                if (this.f5536 == this.f5534 && i != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.f5536 = 0;
                }
                if (this.f5536 == 0) {
                    String str = this.f5533;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.f5537) {
                        int i5 = 0;
                        while (true) {
                            i2 = this.f5538;
                            if (i5 >= i2) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i5++;
                        }
                        this.f5536 = i2;
                    }
                }
                ((FilterWriter) this).out.write(i);
                if (i == 10) {
                    this.f5536 = 0;
                    if (this.f5535 == 0) {
                        z = false;
                    }
                    this.f5537 = z;
                    this.f5538 = 0;
                } else {
                    this.f5536++;
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
