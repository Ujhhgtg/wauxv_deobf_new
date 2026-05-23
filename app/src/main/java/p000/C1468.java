package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᛸᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1468 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1522 f5232;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final URL f5233;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5234;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f5235;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public URL f5236;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public volatile byte[] f5237;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f5238;

    public C1468(URL url) {
        C1761 c1761 = InterfaceC1522.f5358;
        AbstractC1460.m3210(url, "Argument must not be null");
        this.f5233 = url;
        this.f5234 = null;
        AbstractC1460.m3210(c1761, "Argument must not be null");
        this.f5232 = c1761;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C1468) {
            C1468 c1468 = (C1468) obj;
            if (m3235().equals(c1468.m3235()) && this.f5232.equals(c1468.f5232)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        if (this.f5238 == 0) {
            int iHashCode = m3235().hashCode();
            this.f5238 = iHashCode;
            this.f5238 = this.f5232.hashCode() + (iHashCode * 31);
        }
        return this.f5238;
    }

    public final String toString() {
        return m3235();
    }

    @Override // p000.InterfaceC1749
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2001(MessageDigest messageDigest) {
        if (this.f5237 == null) {
            this.f5237 = m3235().getBytes(InterfaceC1749.f5849);
        }
        messageDigest.update(this.f5237);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String m3235() {
        String str = this.f5234;
        if (str != null) {
            return str;
        }
        URL url = this.f5233;
        AbstractC1460.m3210(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final URL m3236() {
        if (this.f5236 == null) {
            if (TextUtils.isEmpty(this.f5235)) {
                String string = this.f5234;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f5233;
                    AbstractC1460.m3210(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f5235 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f5236 = new URL(this.f5235);
        }
        return this.f5236;
    }

    public C1468(String str) {
        C1761 c1761 = InterfaceC1522.f5358;
        this.f5233 = null;
        if (!TextUtils.isEmpty(str)) {
            this.f5234 = str;
            AbstractC1460.m3210(c1761, "Argument must not be null");
            this.f5232 = c1761;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
