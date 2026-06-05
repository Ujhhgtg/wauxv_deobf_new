package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳᛱfeyxiexzfᛱᛲ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3598feyxiexzfUjhhgtg implements InterfaceC0156Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC0538Ujhhgtgfeyxiexzf f11197Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final URL f11198Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f11199Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public String f11200Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public URL f11201Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public volatile byte[] f11202Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f11203Ujhhgtgfeyxiexzf;

    public C3598feyxiexzfUjhhgtg(URL url) {
        C0066Ujhhgtgfeyxiexzf c0066Ujhhgtgfeyxiexzf = InterfaceC0538Ujhhgtgfeyxiexzf.f2508Ujhhgtgfeyxiexzf;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(url, "Argument must not be null");
        this.f11198Ujhhgtgfeyxiexzf = url;
        this.f11199Ujhhgtgfeyxiexzf = null;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0066Ujhhgtgfeyxiexzf, "Argument must not be null");
        this.f11197Ujhhgtgfeyxiexzf = c0066Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj instanceof C3598feyxiexzfUjhhgtg) {
            C3598feyxiexzfUjhhgtg c3598feyxiexzfUjhhgtg = (C3598feyxiexzfUjhhgtg) obj;
            if (m5201Ujhhgtgfeyxiexzf().equals(c3598feyxiexzfUjhhgtg.m5201Ujhhgtgfeyxiexzf()) && this.f11197Ujhhgtgfeyxiexzf.equals(c3598feyxiexzfUjhhgtg.f11197Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        if (this.f11203Ujhhgtgfeyxiexzf == 0) {
            int iHashCode = m5201Ujhhgtgfeyxiexzf().hashCode();
            this.f11203Ujhhgtgfeyxiexzf = iHashCode;
            this.f11203Ujhhgtgfeyxiexzf = this.f11197Ujhhgtgfeyxiexzf.hashCode() + (iHashCode * 31);
        }
        return this.f11203Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        return m5201Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        if (this.f11202Ujhhgtgfeyxiexzf == null) {
            this.f11202Ujhhgtgfeyxiexzf = m5201Ujhhgtgfeyxiexzf().getBytes(InterfaceC0156Ujhhgtgfeyxiexzf.f1329Ujhhgtgfeyxiexzf);
        }
        messageDigest.update(this.f11202Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String m5201Ujhhgtgfeyxiexzf() {
        String str = this.f11199Ujhhgtgfeyxiexzf;
        if (str != null) {
            return str;
        }
        URL url = this.f11198Ujhhgtgfeyxiexzf;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final URL m5202Ujhhgtgfeyxiexzf() {
        if (this.f11201Ujhhgtgfeyxiexzf == null) {
            if (TextUtils.isEmpty(this.f11200Ujhhgtgfeyxiexzf)) {
                String string = this.f11199Ujhhgtgfeyxiexzf;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f11198Ujhhgtgfeyxiexzf;
                    AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f11200Ujhhgtgfeyxiexzf = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f11201Ujhhgtgfeyxiexzf = new URL(this.f11200Ujhhgtgfeyxiexzf);
        }
        return this.f11201Ujhhgtgfeyxiexzf;
    }

    public C3598feyxiexzfUjhhgtg(String str) {
        C0066Ujhhgtgfeyxiexzf c0066Ujhhgtgfeyxiexzf = InterfaceC0538Ujhhgtgfeyxiexzf.f2508Ujhhgtgfeyxiexzf;
        this.f11198Ujhhgtgfeyxiexzf = null;
        if (!TextUtils.isEmpty(str)) {
            this.f11199Ujhhgtgfeyxiexzf = str;
            AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(c0066Ujhhgtgfeyxiexzf, "Argument must not be null");
            this.f11197Ujhhgtgfeyxiexzf = c0066Ujhhgtgfeyxiexzf;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
