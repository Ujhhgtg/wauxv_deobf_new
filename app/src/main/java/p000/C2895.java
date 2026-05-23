package p000;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2895 extends C1229 {

    public final boolean f9312;

    public C2895(String str, Throwable th, InterfaceC2225 interfaceC2225, C0550 c0550, boolean z) {
        super(str, interfaceC2225, c0550, th);
        this.f9312 = z;
    }

    @Override // p000.C1229, java.lang.Throwable
    public final synchronized String getMessage() {
        return super.getMessage() + "Caused by: " + m4902(getCause());
    }

    public final synchronized Throwable m4900() {
        Throwable cause = getCause();
        if (!(cause instanceof InvocationTargetException)) {
            return cause;
        }
        return cause.getCause();
    }

    public final void m4901(boolean z, PrintStream printStream) {
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

    public final synchronized String m4902(Throwable th) {
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

    public C2895(Throwable th, AbstractC2707 abstractC2707, C0550 c0550) {
        this("TargetError", th, abstractC2707, c0550, false);
    }
}
