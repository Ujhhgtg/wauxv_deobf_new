package p000;

import java.security.MessageDigest;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳ要点脸ᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1308feyxiexzfUjhhgtg implements InterfaceC0156Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f4779Ujhhgtgfeyxiexzf;

    public C1308feyxiexzfUjhhgtg(Object obj) {
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(obj, "Argument must not be null");
        this.f4779Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj instanceof C1308feyxiexzfUjhhgtg) {
            return this.f4779Ujhhgtgfeyxiexzf.equals(((C1308feyxiexzfUjhhgtg) obj).f4779Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        return this.f4779Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4779Ujhhgtgfeyxiexzf + '}';
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        messageDigest.update(this.f4779Ujhhgtgfeyxiexzf.toString().getBytes(InterfaceC0156Ujhhgtgfeyxiexzf.f1329Ujhhgtgfeyxiexzf));
    }
}
