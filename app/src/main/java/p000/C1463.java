package p000;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1463 extends Exception {

    public static final StackTraceElement[] f5217 = new StackTraceElement[0];

    public final List f5218;

    public InterfaceC1749 f5219;

    public int f5220;

    public Class f5221;

    public final String f5222;

    public C1463(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void m3230(Throwable th, ArrayList arrayList) {
        if (th instanceof C1463) {
            Iterator it = ((C1463) th).f5218.iterator();
            while (it.hasNext()) {
                m3230((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    public static void m3231(List list, C1462 c1462) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c1462.append("Cause (");
            int i2 = i + 1;
            c1462.append(String.valueOf(i2));
            c1462.append(" of ");
            c1462.append(String.valueOf(size));
            c1462.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C1463) {
                ((C1463) th).m3234(c1462);
            } else {
                m3232(th, c1462);
            }
            i = i2;
        }
    }

    public static void m3232(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f5222);
        sb.append(this.f5221 != null ? ", " + this.f5221 : "");
        int i = this.f5220;
        sb.append(i != 0 ? ", ".concat(AbstractC2784.m4760(i)) : "");
        sb.append(this.f5219 != null ? ", " + this.f5219 : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        m3230(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m3234(System.err);
    }

    public final void m3233() {
        ArrayList arrayList = new ArrayList();
        m3230(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void m3234(Appendable appendable) {
        m3232(this, appendable);
        try {
            m3231(this.f5218, new C1462(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C1463(String str, List list) {
        this.f5222 = str;
        setStackTrace(f5217);
        this.f5218 = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m3234(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m3234(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
