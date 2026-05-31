package p000;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᤞᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1240 extends RuntimeException {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final StringBuffer f4470;

    public C1240(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof C1240)) {
            this.f4470 = new StringBuffer(200);
            return;
        }
        String string = ((C1240) exc).f4470.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f4470 = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C1240 m3003(String str, Exception exc) {
        C1240 c1240 = exc instanceof C1240 ? (C1240) exc : new C1240(null, exc);
        c1240.m3004(str);
        return c1240;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f4470);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3004(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        StringBuffer stringBuffer = this.f4470;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f4470);
    }
}
