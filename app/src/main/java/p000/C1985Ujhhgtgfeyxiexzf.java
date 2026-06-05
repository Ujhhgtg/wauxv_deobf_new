package p000;

import bsh.Node;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱ要点脸ᛴᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1985Ujhhgtgfeyxiexzf extends C3353Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f6551Ujhhgtgfeyxiexzf;

    public C1985Ujhhgtgfeyxiexzf(String str, Throwable th, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, boolean z) {
        super(str, node, c2637feyxiexzfUjhhgtg, th);
        this.f6551Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.C3353Ujhhgtgfeyxiexzf, java.lang.Throwable
    public final synchronized String getMessage() {
        return super.getMessage() + "\nCaused by: " + m3341Ujhhgtgfeyxiexzf(getCause());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final synchronized Throwable m3339Ujhhgtgfeyxiexzf() {
        Throwable cause = getCause();
        if (!(cause instanceof InvocationTargetException)) {
            return cause;
        }
        return cause.getCause();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3340Ujhhgtgfeyxiexzf(boolean z, PrintStream printStream) {
        if (z) {
            printStackTrace(printStream);
            printStream.println("--- Target Stack Trace ---");
        }
        for (StackTraceElement stackTraceElement : getCause().getStackTrace()) {
            if (stackTraceElement.getClassName().contains("reflect")) {
                return;
            }
            printStream.println("        at " + stackTraceElement);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final synchronized String m3341Ujhhgtgfeyxiexzf(Throwable th) {
        if (th == null) {
            return "Cause is null";
        }
        StringBuilder sb = new StringBuilder(th.toString());
        while (true) {
            th = th.getCause();
            if (th == null) {
                return sb.toString();
            }
            sb.append("\n");
            sb.append(th.toString());
        }
    }

    public C1985Ujhhgtgfeyxiexzf(Throwable th, Node node, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg) {
        this("TargetError", th, node, c2637feyxiexzfUjhhgtg, false);
    }
}
