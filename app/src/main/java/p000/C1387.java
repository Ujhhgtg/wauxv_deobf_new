package p000;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.CipherSuite;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.OkHttpUtils;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1387 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f4989;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f4990;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f4991;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Headers f4992;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f4993;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Protocol f4994;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f4995;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f4996;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Headers f4997;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Handshake f4998;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final long f4999;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final long f5000;

    static {
        StringBuilder sb = new StringBuilder();
        Platform.Companion companion = Platform.Companion;
        sb.append(companion.get().getPrefix());
        sb.append("-Sent-Millis");
        f4989 = sb.toString();
        f4990 = companion.get().getPrefix() + "-Received-Millis";
    }

    public C1387(InterfaceC2786 interfaceC2786) throws IOException {
        try {
            C2477 c2477 = new C2477(interfaceC2786);
            this.f4991 = c2477.mo1773(9223372036854775807L);
            this.f4993 = c2477.mo1773(9223372036854775807L);
            Headers.Builder builder = new Headers.Builder();
            int iM3098 = AbstractC1386.m3098(c2477);
            for (int i = 0; i < iM3098; i++) {
                OkHttpUtils.addLenient(builder, c2477.mo1773(9223372036854775807L));
            }
            this.f4992 = builder.build();
            StatusLine statusLine = StatusLine.Companion.parse(c2477.mo1773(9223372036854775807L));
            this.f4994 = statusLine.protocol;
            this.f4995 = statusLine.code;
            this.f4996 = statusLine.message;
            Headers.Builder builder2 = new Headers.Builder();
            int iM3099 = AbstractC1386.m3098(c2477);
            for (int i2 = 0; i2 < iM3099; i2++) {
                OkHttpUtils.addLenient(builder2, c2477.mo1773(9223372036854775807L));
            }
            String str = f4989;
            String str2 = builder2.get(str);
            String str3 = f4990;
            String str4 = builder2.get(str3);
            builder2.removeAll(str);
            builder2.removeAll(str3);
            this.f4999 = str2 != null ? Long.parseLong(str2) : 0L;
            this.f5000 = str4 != null ? Long.parseLong(str4) : 0L;
            this.f4997 = builder2.build();
            if (this.f4991.startsWith("https://")) {
                String strMo1773 = c2477.mo1773(9223372036854775807L);
                if (strMo1773.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo1773 + '\"');
                }
                this.f4998 = Handshake.Companion.get(!c2477.mo1766() ? TlsVersion.Companion.forJavaName(c2477.mo1773(9223372036854775807L)) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(c2477.mo1773(9223372036854775807L)), m3099(c2477), m3099(c2477));
            } else {
                this.f4998 = null;
            }
            interfaceC2786.close();
        } catch (Throwable th) {
            interfaceC2786.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m3099(C2477 c2477) throws IOException {
        int iM3098 = AbstractC1386.m3098(c2477);
        if (iM3098 == -1) {
            return C1189.f4329;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM3098);
            for (int i = 0; i < iM3098; i++) {
                String strMo1773 = c2477.mo1773(9223372036854775807L);
                C0504 c0504 = new C0504();
                c0504.m1795(C0373.m1496(strMo1773));
                arrayList.add(certificateFactory.generateCertificate(new C0503(c0504, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3100(C2476 c2476, List list) throws IOException {
        try {
            c2476.mo1791(list.size());
            c2476.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c2476.mo1775(C0373.m1500(((Certificate) it.next()).getEncoded()).mo1868());
                c2476.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3101(DiskLruCache.Editor editor) {
        String str = this.f4991;
        Handshake handshake = this.f4998;
        Headers headers = this.f4997;
        Headers headers2 = this.f4992;
        C2476 c2476 = new C2476(editor.newSink(0));
        c2476.mo1775(str);
        c2476.writeByte(10);
        c2476.mo1775(this.f4993);
        c2476.writeByte(10);
        c2476.mo1791(headers2.size());
        c2476.writeByte(10);
        int size = headers2.size();
        for (int i = 0; i < size; i++) {
            c2476.mo1775(headers2.name(i));
            c2476.mo1775(": ");
            c2476.mo1775(headers2.value(i));
            c2476.writeByte(10);
        }
        c2476.mo1775(new StatusLine(this.f4994, this.f4995, this.f4996).toString());
        c2476.writeByte(10);
        c2476.mo1791(headers.size() + 2);
        c2476.writeByte(10);
        int size2 = headers.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c2476.mo1775(headers.name(i2));
            c2476.mo1775(": ");
            c2476.mo1775(headers.value(i2));
            c2476.writeByte(10);
        }
        c2476.mo1775(f4989);
        c2476.mo1775(": ");
        c2476.mo1791(this.f4999);
        c2476.writeByte(10);
        c2476.mo1775(f4990);
        c2476.mo1775(": ");
        c2476.mo1791(this.f5000);
        c2476.writeByte(10);
        if (str.startsWith("https://")) {
            c2476.writeByte(10);
            c2476.mo1775(handshake.cipherSuite().javaName());
            c2476.writeByte(10);
            m3100(c2476, handshake.peerCertificates());
            m3100(c2476, handshake.localCertificates());
            c2476.mo1775(handshake.tlsVersion().javaName());
            c2476.writeByte(10);
        }
        th = null;
        try {
            c2476.close();
        } catch (Throwable th) {
            if (false) {
                th = th;
            } else {
                AbstractC2202.m3992(th, th);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public C1387(Response response) {
        Headers headersBuild;
        this.f4991 = response.request().url().toString();
        Headers headers = response.networkResponse().request().headers();
        Headers headers2 = response.headers();
        int size = headers2.size();
        Set treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers2.name(i))) {
                String strValue = headers2.value(i);
                treeSet = treeSet == null ? new TreeSet(String.CASE_INSENSITIVE_ORDER) : treeSet;
                Iterator it = AbstractC2841.m4842(strValue, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC2841.m4848((String) it.next()).toString());
                }
            }
        }
        treeSet = treeSet == null ? C1192.f4332 : treeSet;
        if (treeSet.isEmpty()) {
            headersBuild = Util.EMPTY_HEADERS;
        } else {
            Headers.Builder builder = new Headers.Builder();
            int size2 = headers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strName = headers.name(i2);
                if (treeSet.contains(strName)) {
                    builder.add(strName, headers.value(i2));
                }
            }
            headersBuild = builder.build();
        }
        this.f4992 = headersBuild;
        this.f4993 = response.request().method();
        this.f4994 = response.protocol();
        this.f4995 = response.code();
        this.f4996 = response.message();
        this.f4997 = response.headers();
        this.f4998 = response.handshake();
        this.f4999 = response.sentRequestAtMillis();
        this.f5000 = response.receivedResponseAtMillis();
    }
}
