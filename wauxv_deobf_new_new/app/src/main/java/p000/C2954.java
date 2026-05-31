package p000;

import bsh.Node;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᲈᤞᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2954 extends C1231 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f9479;

    public C2954(String str, Throwable th, Node node, C0527 c0527, boolean z) {
        super(str, node, c0527, th);
        this.f9479 = z;
    }

    @Override // p000.C1231, java.lang.Throwable
    public final synchronized String getMessage() {
        return super.getMessage() + "\nCaused by: " + m4964(getCause());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final synchronized Throwable m4962() {
        Throwable cause = getCause();
        if (!(cause instanceof InvocationTargetException)) {
            return cause;
        }
        return cause.getCause();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4963(boolean z, PrintStream printStream) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final synchronized String m4964(Throwable th) {
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

    public C2954(Throwable th, Node node, C0527 c0527) {
        this("TargetError", th, node, c0527, false);
    }
}
