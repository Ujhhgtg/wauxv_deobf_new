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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᲀᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1395 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f5018;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f5019;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f5020;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Headers f5021;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f5022;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Protocol f5023;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f5024;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f5025;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Headers f5026;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Handshake f5027;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final long f5028;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final long f5029;

    static {
        StringBuilder sb = new StringBuilder();
        Platform.Companion companion = Platform.Companion;
        sb.append(companion.get().getPrefix());
        sb.append("-Sent-Millis");
        f5018 = sb.toString();
        f5019 = companion.get().getPrefix() + "-Received-Millis";
    }

    public C1395(InterfaceC2846 interfaceC2846) throws IOException {
        try {
            C2531 c2531 = new C2531(interfaceC2846);
            this.f5020 = c2531.mo1867(Long.MAX_VALUE);
            this.f5022 = c2531.mo1867(Long.MAX_VALUE);
            Headers.Builder builder = new Headers.Builder();
            int iM3206 = AbstractC1394.m3206(c2531);
            for (int i = 0; i < iM3206; i++) {
                OkHttpUtils.addLenient(builder, c2531.mo1867(Long.MAX_VALUE));
            }
            this.f5021 = builder.build();
            StatusLine statusLine = StatusLine.Companion.parse(c2531.mo1867(Long.MAX_VALUE));
            this.f5023 = statusLine.protocol;
            this.f5024 = statusLine.code;
            this.f5025 = statusLine.message;
            Headers.Builder builder2 = new Headers.Builder();
            int iM3207 = AbstractC1394.m3206(c2531);
            for (int i2 = 0; i2 < iM3207; i2++) {
                OkHttpUtils.addLenient(builder2, c2531.mo1867(Long.MAX_VALUE));
            }
            String str = f5018;
            String str2 = builder2.get(str);
            String str3 = f5019;
            String str4 = builder2.get(str3);
            builder2.removeAll(str);
            builder2.removeAll(str3);
            this.f5028 = str2 != null ? Long.parseLong(str2) : 0L;
            this.f5029 = str4 != null ? Long.parseLong(str4) : 0L;
            this.f5026 = builder2.build();
            if (this.f5020.startsWith("https://")) {
                String strMo1867 = c2531.mo1867(Long.MAX_VALUE);
                if (strMo1867.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo1867 + '\"');
                }
                this.f5027 = Handshake.Companion.get(!c2531.mo1860() ? TlsVersion.Companion.forJavaName(c2531.mo1867(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(c2531.mo1867(Long.MAX_VALUE)), m3207(c2531), m3207(c2531));
            } else {
                this.f5027 = null;
            }
            interfaceC2846.close();
        } catch (Throwable th) {
            interfaceC2846.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static List m3207(C2531 c2531) throws IOException {
        int iM3206 = AbstractC1394.m3206(c2531);
        if (iM3206 == -1) {
            return C1191.f4326;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM3206);
            for (int i = 0; i < iM3206; i++) {
                String strMo1867 = c2531.mo1867(Long.MAX_VALUE);
                C0481 c0481 = new C0481();
                c0481.m1889(C0348.m1601(strMo1867));
                arrayList.add(certificateFactory.generateCertificate(new C0480(c0481, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m3208(C2530 c2530, List list) throws IOException {
        try {
            c2530.mo1885(list.size());
            c2530.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c2530.mo1869(C0348.m1605(((Certificate) it.next()).getEncoded()).mo1962());
                c2530.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3209(DiskLruCache.Editor editor) {
        String str = this.f5020;
        Handshake handshake = this.f5027;
        Headers headers = this.f5026;
        Headers headers2 = this.f5021;
        C2530 c2530 = new C2530(editor.newSink(0));
        c2530.mo1869(str);
        c2530.writeByte(10);
        c2530.mo1869(this.f5022);
        c2530.writeByte(10);
        c2530.mo1885(headers2.size());
        c2530.writeByte(10);
        int size = headers2.size();
        for (int i = 0; i < size; i++) {
            c2530.mo1869(headers2.name(i));
            c2530.mo1869(": ");
            c2530.mo1869(headers2.value(i));
            c2530.writeByte(10);
        }
        c2530.mo1869(new StatusLine(this.f5023, this.f5024, this.f5025).toString());
        c2530.writeByte(10);
        c2530.mo1885(headers.size() + 2);
        c2530.writeByte(10);
        int size2 = headers.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c2530.mo1869(headers.name(i2));
            c2530.mo1869(": ");
            c2530.mo1869(headers.value(i2));
            c2530.writeByte(10);
        }
        c2530.mo1869(f5018);
        c2530.mo1869(": ");
        c2530.mo1885(this.f5028);
        c2530.writeByte(10);
        c2530.mo1869(f5019);
        c2530.mo1869(": ");
        c2530.mo1885(this.f5029);
        c2530.writeByte(10);
        if (str.startsWith("https://")) {
            c2530.writeByte(10);
            c2530.mo1869(handshake.cipherSuite().javaName());
            c2530.writeByte(10);
            m3208(c2530, handshake.peerCertificates());
            m3208(c2530, handshake.localCertificates());
            c2530.mo1869(handshake.tlsVersion().javaName());
            c2530.writeByte(10);
        }
        th = null;
        try {
            c2530.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            } else {
                AbstractC1272.m3094(th, th);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public C1395(Response response) {
        Headers headersBuild;
        this.f5020 = response.request().url().toString();
        Headers headers = response.networkResponse().request().headers();
        Headers headers2 = response.headers();
        int size = headers2.size();
        Set treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers2.name(i))) {
                String strValue = headers2.value(i);
                treeSet = treeSet == null ? new TreeSet(String.CASE_INSENSITIVE_ORDER) : treeSet;
                Iterator it = AbstractC2901.m4875(strValue, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC2901.m4882((String) it.next()).toString());
                }
            }
        }
        treeSet = treeSet == null ? C1194.f4329 : treeSet;
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
        this.f5021 = headersBuild;
        this.f5022 = response.request().method();
        this.f5023 = response.protocol();
        this.f5024 = response.code();
        this.f5025 = response.message();
        this.f5026 = response.headers();
        this.f5027 = response.handshake();
        this.f5028 = response.sentRequestAtMillis();
        this.f5029 = response.receivedResponseAtMillis();
    }
}
