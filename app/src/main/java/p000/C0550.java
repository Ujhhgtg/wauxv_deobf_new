package p000;

import bsh.C0007;
import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0550 implements Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Stack f2265 = new Stack();

    public C0550() {
    }

    public final void clear() {
        this.f2265.clear();
    }

    public final synchronized String toString() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            sb.append("CallStack:\n");
            for (int size = this.f2265.size() - 1; size >= 0; size += -1) {
                sb.append("\t" + this.f2265.get(size) + "\n");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0007 m1926() {
        try {
            return (C0007) this.f2265.pop();
        } catch (EmptyStackException unused) {
            throw new C1669("pop on empty CallStack");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1927(C0007 c0007) {
        this.f2265.push(c0007);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0007 m1928(C0007 c0007) {
        Stack stack = this.f2265;
        C0007 c0008 = (C0007) stack.pop();
        stack.push(c0007);
        return c0008;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0007 m1929() {
        return (C0007) this.f2265.peek();
    }

    public C0550(C0007 c0007) {
        m1927(c0007);
    }
}
