package p000;

import android.content.Context;
import com.drake.net.exception.URLParseException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲈᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0378 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public HttpUrl.Builder f1761 = new HttpUrl.Builder();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2141 f1762 = AbstractC2140.f7084;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f1763 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Request.Builder f1764 = new Request.Builder();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public OkHttpClient f1765 = AbstractC2140.f7079;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Request mo1520() {
        Request.Builder builderUrl = this.f1764.method(AbstractC1194.m2793(this.f1763), null).url(this.f1761.build());
        builderUrl.tag(C2141.class, this.f1762);
        return builderUrl.build();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1521(String str) {
        this.f1764.tag(C2204.class, new C2204(str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m1522(InterfaceC0875 interfaceC0875) {
        if (interfaceC0875 == null) {
            interfaceC0875 = null;
        }
        this.f1764.tag(C2210.class, interfaceC0875 != null ? new C2210(interfaceC0875) : null);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m1523(String str) throws URLParseException {
        HttpUrl httpUrl = str != null ? HttpUrl.Companion.parse(str) : null;
        if (httpUrl != null) {
            this.f1761 = httpUrl.newBuilder();
            return;
        }
        try {
            HttpUrl.Companion companion = HttpUrl.Companion;
            StringBuilder sb = new StringBuilder("");
            Context context = AbstractC2140.f7078;
            sb.append(str);
            this.f1761 = companion.get(sb.toString()).newBuilder();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("");
            Context context2 = AbstractC2140.f7078;
            sb2.append(str);
            throw new URLParseException(sb2.toString(), th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m1524() {
        this.f1764.tag(null);
    }
}
