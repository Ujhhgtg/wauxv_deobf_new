package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᤞᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1479 implements InterfaceC1772 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1534 f5264;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final URL f5265;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5266;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f5267;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public URL f5268;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public volatile byte[] f5269;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f5270;

    public C1479(URL url) {
        C1783 c1783 = InterfaceC1534.f5389;
        AbstractC2727.m4693(url, "Argument must not be null");
        this.f5265 = url;
        this.f5266 = null;
        AbstractC2727.m4693(c1783, "Argument must not be null");
        this.f5264 = c1783;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C1479) {
            C1479 c1479 = (C1479) obj;
            if (m3412().equals(c1479.m3412()) && this.f5264.equals(c1479.f5264)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        if (this.f5270 == 0) {
            int iHashCode = m3412().hashCode();
            this.f5270 = iHashCode;
            this.f5270 = this.f5264.hashCode() + (iHashCode * 31);
        }
        return this.f5270;
    }

    public final String toString() {
        return m3412();
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        if (this.f5269 == null) {
            this.f5269 = m3412().getBytes(InterfaceC1772.f5911);
        }
        messageDigest.update(this.f5269);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String m3412() {
        String str = this.f5266;
        if (str != null) {
            return str;
        }
        URL url = this.f5265;
        AbstractC2727.m4693(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final URL m3413() {
        if (this.f5268 == null) {
            if (TextUtils.isEmpty(this.f5267)) {
                String string = this.f5266;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f5265;
                    AbstractC2727.m4693(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f5267 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f5268 = new URL(this.f5267);
        }
        return this.f5268;
    }

    public C1479(String str) {
        C1783 c1783 = InterfaceC1534.f5389;
        this.f5265 = null;
        if (!TextUtils.isEmpty(str)) {
            this.f5266 = str;
            AbstractC2727.m4693(c1783, "Argument must not be null");
            this.f5264 = c1783;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
