package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲈᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1585 implements InterfaceC0958 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1479 f5494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f5495;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public HttpURLConnection f5496;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public InputStream f5497;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public volatile boolean f5498;

    public C1585(C1479 c1479, int i) {
        this.f5494 = c1479;
        this.f5495 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m3465(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // p000.InterfaceC0958
    public final void cancel() {
        this.f5498 = true;
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1537() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1949() {
        InputStream inputStream = this.f5497;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5496;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5496 = null;
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1950(EnumC2454 enumC2454, InterfaceC0957 interfaceC0957) {
        C1479 c1479 = this.f5494;
        int i = AbstractC1879.f6242;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            interfaceC0957.mo1977(m3466(c1479.m3413(), 0, null, c1479.f5264.mo3436()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            interfaceC0957.mo1976(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC1879.m3798(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // p000.InterfaceC0958
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1951() {
        return 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InputStream m3466(URL url, int i, URL url2, Map map) throws C1583 {
        if (i >= 5) {
            throw new C1583("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C1583("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f5495;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f5496 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f5497 = this.f5496.getInputStream();
                if (this.f5498) {
                    return null;
                }
                int iM3465 = m3465(this.f5496);
                int i3 = iM3465 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f5496;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f5497 = new C0837(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f5497 = httpURLConnection2.getInputStream();
                        }
                        return this.f5497;
                    } catch (IOException e) {
                        throw new C1583("Failed to obtain InputStream", m3465(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM3465 == -1) {
                        throw new C1583("Http request failed", iM3465, null);
                    }
                    try {
                        throw new C1583(this.f5496.getResponseMessage(), iM3465, null);
                    } catch (IOException e2) {
                        throw new C1583("Failed to get a response message", iM3465, e2);
                    }
                }
                String headerField = this.f5496.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C1583("Received empty or null redirect url", iM3465, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo1949();
                    return m3466(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C1583(AbstractC2844.m4790("Bad redirect url: ", headerField), iM3465, e3);
                }
            } catch (IOException e4) {
                throw new C1583("Failed to connect or obtain data", m3465(this.f5496), e4);
            }
        } catch (IOException e5) {
            throw new C1583("URL.openConnection threw", 0, e5);
        }
    }
}
