package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛴᛲ能不能ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0725Ujhhgtgfeyxiexzf extends CancellationException {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final transient InterfaceC0717Ujhhgtgfeyxiexzf f2995Ujhhgtgfeyxiexzf;

    public C0725Ujhhgtgfeyxiexzf(String str, Throwable th, C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf) {
        super(str);
        this.f2995Ujhhgtgfeyxiexzf = c0731Ujhhgtgfeyxiexzf;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0725Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0725Ujhhgtgfeyxiexzf c0725Ujhhgtgfeyxiexzf = (C0725Ujhhgtgfeyxiexzf) obj;
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0725Ujhhgtgfeyxiexzf.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c0725Ujhhgtgfeyxiexzf.f2995Ujhhgtgfeyxiexzf;
        if (obj2 == null) {
            obj2 = C1289feyxiexzfUjhhgtg.f4695Ujhhgtgfeyxiexzf;
        }
        Object obj3 = this.f2995Ujhhgtgfeyxiexzf;
        if (obj3 == null) {
            obj3 = C1289feyxiexzfUjhhgtg.f4695Ujhhgtgfeyxiexzf;
        }
        return obj2.equals(obj3) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0725Ujhhgtgfeyxiexzf.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Object obj = this.f2995Ujhhgtgfeyxiexzf;
        if (obj == null) {
            obj = C1289feyxiexzfUjhhgtg.f4695Ujhhgtgfeyxiexzf;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f2995Ujhhgtgfeyxiexzf;
        if (obj == null) {
            obj = C1289feyxiexzfUjhhgtg.f4695Ujhhgtgfeyxiexzf;
        }
        sb.append(obj);
        return sb.toString();
    }
}
