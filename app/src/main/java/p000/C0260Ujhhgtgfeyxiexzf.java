package p000;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱᛳ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0260Ujhhgtgfeyxiexzf extends Writer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final StringBuilder f1637Ujhhgtgfeyxiexzf = new StringBuilder(128);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f1636Ujhhgtgfeyxiexzf = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1435Ujhhgtgfeyxiexzf();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1435Ujhhgtgfeyxiexzf();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m1435Ujhhgtgfeyxiexzf();
            } else {
                this.f1637Ujhhgtgfeyxiexzf.append(c);
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m1435Ujhhgtgfeyxiexzf() {
        StringBuilder sb = this.f1637Ujhhgtgfeyxiexzf;
        if (sb.length() > 0) {
            Log.d(this.f1636Ujhhgtgfeyxiexzf, sb.toString());
            sb.delete(0, sb.length());
        }
    }
}
