package p000;

import android.content.Context;
import com.drake.net.exception.URLParseException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0353 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public HttpUrl.Builder f1732 = new HttpUrl.Builder();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2175 f1733 = AbstractC2174.f7208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1734 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Request.Builder f1735 = new Request.Builder();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public OkHttpClient f1736 = AbstractC2174.f7203;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Request mo1626() {
        Request.Builder builderUrl = this.f1735.method(AbstractC1095.m2809(this.f1734), null).url(this.f1732.build());
        builderUrl.tag(C2175.class, this.f1733);
        return builderUrl.build();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1627(String str) {
        this.f1735.tag(C2237.class, new C2237(str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1628(InterfaceC0874 interfaceC0874) {
        if (interfaceC0874 == null) {
            interfaceC0874 = null;
        }
        this.f1735.tag(C2241.class, interfaceC0874 != null ? new C2241(interfaceC0874) : null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m1629(String str) throws URLParseException {
        HttpUrl httpUrl = str != null ? HttpUrl.Companion.parse(str) : null;
        if (httpUrl != null) {
            this.f1732 = httpUrl.newBuilder();
            return;
        }
        try {
            HttpUrl.Companion companion = HttpUrl.Companion;
            StringBuilder sb = new StringBuilder("");
            Context context = AbstractC2174.f7202;
            sb.append(str);
            this.f1732 = companion.get(sb.toString()).newBuilder();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("");
            Context context2 = AbstractC2174.f7202;
            sb2.append(str);
            throw new URLParseException(sb2.toString(), th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1630() {
        this.f1735.tag(null);
    }
}
