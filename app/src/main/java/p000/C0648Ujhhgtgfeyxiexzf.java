package p000;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲ能不能ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0648Ujhhgtgfeyxiexzf extends FilterWriter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f2704Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2705Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f2706Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f2707Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f2708Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f2709Ujhhgtgfeyxiexzf;

    public C0648Ujhhgtgfeyxiexzf(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f2705Ujhhgtgfeyxiexzf = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.f2706Ujhhgtgfeyxiexzf = i2;
        this.f2704Ujhhgtgfeyxiexzf = str.length() == 0 ? null : str;
        this.f2707Ujhhgtgfeyxiexzf = 0;
        this.f2708Ujhhgtgfeyxiexzf = i2 != 0;
        this.f2709Ujhhgtgfeyxiexzf = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            try {
                boolean z = true;
                if (this.f2708Ujhhgtgfeyxiexzf) {
                    if (i == 32) {
                        int i3 = this.f2709Ujhhgtgfeyxiexzf + 1;
                        this.f2709Ujhhgtgfeyxiexzf = i3;
                        int i4 = this.f2706Ujhhgtgfeyxiexzf;
                        if (i3 >= i4) {
                            this.f2709Ujhhgtgfeyxiexzf = i4;
                            this.f2708Ujhhgtgfeyxiexzf = false;
                        }
                    } else {
                        this.f2708Ujhhgtgfeyxiexzf = false;
                    }
                }
                if (this.f2707Ujhhgtgfeyxiexzf == this.f2705Ujhhgtgfeyxiexzf && i != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.f2707Ujhhgtgfeyxiexzf = 0;
                }
                if (this.f2707Ujhhgtgfeyxiexzf == 0) {
                    String str = this.f2704Ujhhgtgfeyxiexzf;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.f2708Ujhhgtgfeyxiexzf) {
                        int i5 = 0;
                        while (true) {
                            i2 = this.f2709Ujhhgtgfeyxiexzf;
                            if (i5 >= i2) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i5++;
                        }
                        this.f2707Ujhhgtgfeyxiexzf = i2;
                    }
                }
                ((FilterWriter) this).out.write(i);
                if (i == 10) {
                    this.f2707Ujhhgtgfeyxiexzf = 0;
                    if (this.f2706Ujhhgtgfeyxiexzf == 0) {
                        z = false;
                    }
                    this.f2708Ujhhgtgfeyxiexzf = z;
                    this.f2709Ujhhgtgfeyxiexzf = 0;
                } else {
                    this.f2707Ujhhgtgfeyxiexzf++;
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
