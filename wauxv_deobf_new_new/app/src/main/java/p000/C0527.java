package p000;

import bsh.C0012;
import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0527 implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Stack f2221 = new Stack();

    public C0527() {
    }

    public final void clear() {
        this.f2221.clear();
    }

    public final synchronized String toString() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            sb.append("CallStack:\n");
            for (int size = this.f2221.size() - 1; size >= 0; size += -1) {
                sb.append("\t" + this.f2221.get(size) + "\n");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0012 m2021() {
        try {
            return (C0012) this.f2221.pop();
        } catch (EmptyStackException unused) {
            throw new C1684("pop on empty CallStack");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2022(C0012 c0012) {
        this.f2221.push(c0012);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0012 m2023(C0012 c0012) {
        Stack stack = this.f2221;
        C0012 c0013 = (C0012) stack.pop();
        stack.push(c0012);
        return c0013;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0012 m2024() {
        return (C0012) this.f2221.peek();
    }

    public C0527(C0012 c0012) {
        m2022(c0012);
    }
}
