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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱ能不能ᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3537Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final String f11040Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final String f11041Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f11042Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Headers f11043Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f11044Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Protocol f11045Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f11046Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f11047Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Headers f11048Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Handshake f11049Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final long f11050Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final long f11051Ujhhgtgfeyxiexzf;

    static {
        StringBuilder sb = new StringBuilder();
        Platform.Companion companion = Platform.Companion;
        sb.append(companion.get().getPrefix());
        sb.append("-Sent-Millis");
        f11040Ujhhgtgfeyxiexzf = sb.toString();
        f11041Ujhhgtgfeyxiexzf = companion.get().getPrefix() + "-Received-Millis";
    }

    public C3537Ujhhgtgfeyxiexzf(InterfaceC1227feyxiexzfUjhhgtg interfaceC1227feyxiexzfUjhhgtg) throws IOException {
        try {
            C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = new C0789feyxiexzfUjhhgtg(interfaceC1227feyxiexzfUjhhgtg);
            this.f11042Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
            this.f11044Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
            Headers.Builder builder = new Headers.Builder();
            int iM5086Ujhhgtgfeyxiexzf = AbstractC3536Ujhhgtgfeyxiexzf.m5086Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg);
            for (int i = 0; i < iM5086Ujhhgtgfeyxiexzf; i++) {
                OkHttpUtils.addLenient(builder, c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE));
            }
            this.f11043Ujhhgtgfeyxiexzf = builder.build();
            StatusLine statusLine = StatusLine.Companion.parse(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE));
            this.f11045Ujhhgtgfeyxiexzf = statusLine.protocol;
            this.f11046Ujhhgtgfeyxiexzf = statusLine.code;
            this.f11047Ujhhgtgfeyxiexzf = statusLine.message;
            Headers.Builder builder2 = new Headers.Builder();
            int iM5086Ujhhgtgfeyxiexzf2 = AbstractC3536Ujhhgtgfeyxiexzf.m5086Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg);
            for (int i2 = 0; i2 < iM5086Ujhhgtgfeyxiexzf2; i2++) {
                OkHttpUtils.addLenient(builder2, c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE));
            }
            String str = f11040Ujhhgtgfeyxiexzf;
            String str2 = builder2.get(str);
            String str3 = f11041Ujhhgtgfeyxiexzf;
            String str4 = builder2.get(str3);
            builder2.removeAll(str);
            builder2.removeAll(str3);
            this.f11050Ujhhgtgfeyxiexzf = str2 != null ? Long.parseLong(str2) : 0L;
            this.f11051Ujhhgtgfeyxiexzf = str4 != null ? Long.parseLong(str4) : 0L;
            this.f11048Ujhhgtgfeyxiexzf = builder2.build();
            if (this.f11042Ujhhgtgfeyxiexzf.startsWith("https://")) {
                String strMo2112Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
                if (strMo2112Ujhhgtgfeyxiexzf.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo2112Ujhhgtgfeyxiexzf + '\"');
                }
                this.f11049Ujhhgtgfeyxiexzf = Handshake.Companion.get(!c0789feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf() ? TlsVersion.Companion.forJavaName(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.Companion.forJavaName(c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE)), m5087Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg), m5087Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg));
            } else {
                this.f11049Ujhhgtgfeyxiexzf = null;
            }
            interfaceC1227feyxiexzfUjhhgtg.close();
        } catch (Throwable th) {
            interfaceC1227feyxiexzfUjhhgtg.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static List m5087Ujhhgtgfeyxiexzf(C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg) throws IOException {
        int iM5086Ujhhgtgfeyxiexzf = AbstractC3536Ujhhgtgfeyxiexzf.m5086Ujhhgtgfeyxiexzf(c0789feyxiexzfUjhhgtg);
        if (iM5086Ujhhgtgfeyxiexzf == -1) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM5086Ujhhgtgfeyxiexzf);
            for (int i = 0; i < iM5086Ujhhgtgfeyxiexzf; i++) {
                String strMo2112Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
                C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = new C2598feyxiexzfUjhhgtg();
                c2598feyxiexzfUjhhgtg.m3868feyxiexzfUjhhgtg(C2466feyxiexzfUjhhgtg.m3698Ujhhgtgfeyxiexzf(strMo2112Ujhhgtgfeyxiexzf));
                arrayList.add(certificateFactory.generateCertificate(new C2597feyxiexzfUjhhgtg(c2598feyxiexzfUjhhgtg, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m5088Ujhhgtgfeyxiexzf(C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg, List list) throws IOException {
        try {
            c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(list.size());
            c0806feyxiexzfUjhhgtg.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(C2466feyxiexzfUjhhgtg.m3702feyxiexzfUjhhgtg(((Certificate) it.next()).getEncoded()).mo2576Ujhhgtgfeyxiexzf());
                c0806feyxiexzfUjhhgtg.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m5089Ujhhgtgfeyxiexzf(DiskLruCache.Editor editor) {
        String str = this.f11042Ujhhgtgfeyxiexzf;
        Handshake handshake = this.f11049Ujhhgtgfeyxiexzf;
        Headers headers = this.f11048Ujhhgtgfeyxiexzf;
        Headers headers2 = this.f11043Ujhhgtgfeyxiexzf;
        C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg = new C0806feyxiexzfUjhhgtg(editor.newSink(0));
        c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(str);
        c0806feyxiexzfUjhhgtg.writeByte(10);
        c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(this.f11044Ujhhgtgfeyxiexzf);
        c0806feyxiexzfUjhhgtg.writeByte(10);
        c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(headers2.size());
        c0806feyxiexzfUjhhgtg.writeByte(10);
        int size = headers2.size();
        for (int i = 0; i < size; i++) {
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(headers2.name(i));
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(headers2.value(i));
            c0806feyxiexzfUjhhgtg.writeByte(10);
        }
        c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(new StatusLine(this.f11045Ujhhgtgfeyxiexzf, this.f11046Ujhhgtgfeyxiexzf, this.f11047Ujhhgtgfeyxiexzf).toString());
        c0806feyxiexzfUjhhgtg.writeByte(10);
        c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(headers.size() + 2);
        c0806feyxiexzfUjhhgtg.writeByte(10);
        int size2 = headers.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(headers.name(i2));
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(headers.value(i2));
            c0806feyxiexzfUjhhgtg.writeByte(10);
        }
        c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(f11040Ujhhgtgfeyxiexzf);
        c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
        c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(this.f11050Ujhhgtgfeyxiexzf);
        c0806feyxiexzfUjhhgtg.writeByte(10);
        c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(f11041Ujhhgtgfeyxiexzf);
        c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(": ");
        c0806feyxiexzfUjhhgtg.mo2153feyxiexzfUjhhgtg(this.f11051Ujhhgtgfeyxiexzf);
        c0806feyxiexzfUjhhgtg.writeByte(10);
        if (str.startsWith("https://")) {
            c0806feyxiexzfUjhhgtg.writeByte(10);
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(handshake.cipherSuite().javaName());
            c0806feyxiexzfUjhhgtg.writeByte(10);
            m5088Ujhhgtgfeyxiexzf(c0806feyxiexzfUjhhgtg, handshake.peerCertificates());
            m5088Ujhhgtgfeyxiexzf(c0806feyxiexzfUjhhgtg, handshake.localCertificates());
            c0806feyxiexzfUjhhgtg.mo2149Ujhhgtgfeyxiexzf(handshake.tlsVersion().javaName());
            c0806feyxiexzfUjhhgtg.writeByte(10);
        }
        th = null;
        try {
            c0806feyxiexzfUjhhgtg.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            } else {
                AbstractC1791feyxiexzfUjhhgtg.m3129Ujhhgtgfeyxiexzf(th, th);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public C3537Ujhhgtgfeyxiexzf(Response response) {
        Headers headersBuild;
        this.f11042Ujhhgtgfeyxiexzf = response.request().url().toString();
        Headers headers = response.networkResponse().request().headers();
        Headers headers2 = response.headers();
        int size = headers2.size();
        Set treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers2.name(i))) {
                String strValue = headers2.value(i);
                treeSet = treeSet == null ? new TreeSet(String.CASE_INSENSITIVE_ORDER) : treeSet;
                Iterator it = AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf(strValue, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg((String) it.next()).toString());
                }
            }
        }
        treeSet = treeSet == null ? C3310feyxiexzfUjhhgtg.f10347Ujhhgtgfeyxiexzf : treeSet;
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
        this.f11043Ujhhgtgfeyxiexzf = headersBuild;
        this.f11044Ujhhgtgfeyxiexzf = response.request().method();
        this.f11045Ujhhgtgfeyxiexzf = response.protocol();
        this.f11046Ujhhgtgfeyxiexzf = response.code();
        this.f11047Ujhhgtgfeyxiexzf = response.message();
        this.f11048Ujhhgtgfeyxiexzf = response.headers();
        this.f11049Ujhhgtgfeyxiexzf = response.handshake();
        this.f11050Ujhhgtgfeyxiexzf = response.sentRequestAtMillis();
        this.f11051Ujhhgtgfeyxiexzf = response.receivedResponseAtMillis();
    }
}
