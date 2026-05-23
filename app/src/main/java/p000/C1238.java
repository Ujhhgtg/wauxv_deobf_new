package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1238 extends RuntimeException {

    public final StringBuffer f4471;

    public C1238(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof C1238)) {
            this.f4471 = new StringBuffer(200);
            return;
        }
        String string = ((C1238) exc).f4471.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f4471 = stringBuffer;
        stringBuffer.append(string);
    }

    public static C1238 m2884(String str, Exception exc) {
        C1238 c1238 = exc instanceof C1238 ? (C1238) exc : new C1238(null, exc);
        c1238.m2885(str);
        return c1238;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f4471);
    }

    public final void m2885(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        StringBuffer stringBuffer = this.f4471;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f4471);
    }
}
