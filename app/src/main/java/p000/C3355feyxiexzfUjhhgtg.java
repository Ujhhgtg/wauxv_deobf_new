package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3355feyxiexzfUjhhgtg extends RuntimeException {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final StringBuffer f10472Ujhhgtgfeyxiexzf;

    public C3355feyxiexzfUjhhgtg(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof C3355feyxiexzfUjhhgtg)) {
            this.f10472Ujhhgtgfeyxiexzf = new StringBuffer(200);
            return;
        }
        String string = ((C3355feyxiexzfUjhhgtg) exc).f10472Ujhhgtgfeyxiexzf.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f10472Ujhhgtgfeyxiexzf = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C3355feyxiexzfUjhhgtg m4860Ujhhgtgfeyxiexzf(String str, Exception exc) {
        C3355feyxiexzfUjhhgtg c3355feyxiexzfUjhhgtg = exc instanceof C3355feyxiexzfUjhhgtg ? (C3355feyxiexzfUjhhgtg) exc : new C3355feyxiexzfUjhhgtg(null, exc);
        c3355feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf(str);
        return c3355feyxiexzfUjhhgtg;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f10472Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4861Ujhhgtgfeyxiexzf(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        StringBuffer stringBuffer = this.f10472Ujhhgtgfeyxiexzf;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f10472Ujhhgtgfeyxiexzf);
    }
}
