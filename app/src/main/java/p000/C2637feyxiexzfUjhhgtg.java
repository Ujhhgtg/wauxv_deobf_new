package p000;

import bsh.C0029Ujhhgtgfeyxiexzf;
import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2637feyxiexzfUjhhgtg implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Stack f8478Ujhhgtgfeyxiexzf = new Stack();

    public C2637feyxiexzfUjhhgtg() {
    }

    public final void clear() {
        this.f8478Ujhhgtgfeyxiexzf.clear();
    }

    public final synchronized String toString() {
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            sb.append("CallStack:\n");
            for (int size = this.f8478Ujhhgtgfeyxiexzf.size() - 1; size >= 0; size += -1) {
                sb.append("\t" + this.f8478Ujhhgtgfeyxiexzf.get(size) + "\n");
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0029Ujhhgtgfeyxiexzf m3970Ujhhgtgfeyxiexzf() {
        try {
            return (C0029Ujhhgtgfeyxiexzf) this.f8478Ujhhgtgfeyxiexzf.pop();
        } catch (EmptyStackException unused) {
            throw new C0712Ujhhgtgfeyxiexzf("pop on empty CallStack");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3971Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf) {
        this.f8478Ujhhgtgfeyxiexzf.push(c0029Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0029Ujhhgtgfeyxiexzf m3972Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf) {
        Stack stack = this.f8478Ujhhgtgfeyxiexzf;
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2 = (C0029Ujhhgtgfeyxiexzf) stack.pop();
        stack.push(c0029Ujhhgtgfeyxiexzf);
        return c0029Ujhhgtgfeyxiexzf2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0029Ujhhgtgfeyxiexzf m3973Ujhhgtgfeyxiexzf() {
        return (C0029Ujhhgtgfeyxiexzf) this.f8478Ujhhgtgfeyxiexzf.peek();
    }

    public C2637feyxiexzfUjhhgtg(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf) {
        m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
    }
}
