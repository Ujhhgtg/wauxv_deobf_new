package p000;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3591Ujhhgtgfeyxiexzf extends Exception {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final StackTraceElement[] f11172Ujhhgtgfeyxiexzf = new StackTraceElement[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final List f11173Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public InterfaceC0156Ujhhgtgfeyxiexzf f11174Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f11175Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Class f11176Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String f11177Ujhhgtgfeyxiexzf;

    public C3591Ujhhgtgfeyxiexzf(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m5142Ujhhgtgfeyxiexzf(Throwable th, ArrayList arrayList) {
        if (th instanceof C3591Ujhhgtgfeyxiexzf) {
            Iterator it = ((C3591Ujhhgtgfeyxiexzf) th).f11173Ujhhgtgfeyxiexzf.iterator();
            while (it.hasNext()) {
                m5142Ujhhgtgfeyxiexzf((Throwable) it.next(), arrayList);
            }
        } else if (th != null) {
            arrayList.add(th);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m5143Ujhhgtgfeyxiexzf(List list, C3592Ujhhgtgfeyxiexzf c3592Ujhhgtgfeyxiexzf) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c3592Ujhhgtgfeyxiexzf.append("Cause (");
            int i2 = i + 1;
            c3592Ujhhgtgfeyxiexzf.append(String.valueOf(i2));
            c3592Ujhhgtgfeyxiexzf.append(" of ");
            c3592Ujhhgtgfeyxiexzf.append(String.valueOf(size));
            c3592Ujhhgtgfeyxiexzf.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C3591Ujhhgtgfeyxiexzf) {
                ((C3591Ujhhgtgfeyxiexzf) th).m5146Ujhhgtgfeyxiexzf(c3592Ujhhgtgfeyxiexzf);
            } else {
                m5144Ujhhgtgfeyxiexzf(th, c3592Ujhhgtgfeyxiexzf);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m5144Ujhhgtgfeyxiexzf(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f11177Ujhhgtgfeyxiexzf);
        sb.append(this.f11176Ujhhgtgfeyxiexzf != null ? ", " + this.f11176Ujhhgtgfeyxiexzf : "");
        int i = this.f11175Ujhhgtgfeyxiexzf;
        sb.append(i != 0 ? ", ".concat(AbstractC1225feyxiexzfUjhhgtg.m2714feyxiexzfUjhhgtg(i)) : "");
        sb.append(this.f11174Ujhhgtgfeyxiexzf != null ? ", " + this.f11174Ujhhgtgfeyxiexzf : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        m5142Ujhhgtgfeyxiexzf(this, arrayList);
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
        m5146Ujhhgtgfeyxiexzf(System.err);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m5145Ujhhgtgfeyxiexzf() {
        ArrayList arrayList = new ArrayList();
        m5142Ujhhgtgfeyxiexzf(this, arrayList);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m5146Ujhhgtgfeyxiexzf(Appendable appendable) {
        m5144Ujhhgtgfeyxiexzf(this, appendable);
        try {
            m5143Ujhhgtgfeyxiexzf(this.f11173Ujhhgtgfeyxiexzf, new C3592Ujhhgtgfeyxiexzf(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C3591Ujhhgtgfeyxiexzf(String str, List list) {
        this.f11177Ujhhgtgfeyxiexzf = str;
        setStackTrace(f11172Ujhhgtgfeyxiexzf);
        this.f11173Ujhhgtgfeyxiexzf = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m5146Ujhhgtgfeyxiexzf(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m5146Ujhhgtgfeyxiexzf(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
