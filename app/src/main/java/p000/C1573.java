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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲁᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1573 implements InterfaceC0955 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1468 f5464;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f5465;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public HttpURLConnection f5466;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public InputStream f5467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public volatile boolean f5468;

    public C1573(C1468 c1468, int i) {
        this.f5464 = c1468;
        this.f5465 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m3285(HttpURLConnection httpURLConnection) {
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

    @Override // p000.InterfaceC0955
    public final void cancel() {
        this.f5468 = true;
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo1391() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1855() {
        InputStream inputStream = this.f5467;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5466;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5466 = null;
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1856(EnumC2401 enumC2401, InterfaceC0954 interfaceC0954) {
        C1468 c1468 = this.f5464;
        int i = 0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            interfaceC0954.mo1883(m3286(c1468.m3236(), 0, null, c1468.f5232.mo3255()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            interfaceC0954.mo1882(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC1853.m3620(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // p000.InterfaceC0955
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1857() {
        return 2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InputStream m3286(URL url, int i, URL url2, Map map) throws C1327 {
        if (i >= 5) {
            throw new C1327("Too many (> 5) redirects!", -1, (IOException) null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C1327("In re-direct loop", -1, (IOException) null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f5465;
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
            this.f5466 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f5467 = this.f5466.getInputStream();
                if (this.f5468) {
                    return null;
                }
                int iM3285 = m3285(this.f5466);
                int i3 = iM3285 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f5466;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f5467 = new C0838(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f5467 = httpURLConnection2.getInputStream();
                        }
                        return this.f5467;
                    } catch (IOException e) {
                        throw new C1327("Failed to obtain InputStream", m3285(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM3285 == -1) {
                        throw new C1327("Http request failed", -1, (IOException) null);
                    }
                    try {
                        throw new C1327(this.f5466.getResponseMessage(), iM3285, (IOException) null);
                    } catch (IOException e2) {
                        throw new C1327("Failed to get a response message", iM3285, e2);
                    }
                }
                String headerField = this.f5466.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C1327("Received empty or null redirect url", iM3285, (IOException) null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo1855();
                    return m3286(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C1327(AbstractC2784.m4757("Bad redirect url: ", headerField), iM3285, e3);
                }
            } catch (IOException e4) {
                throw new C1327("Failed to connect or obtain data", m3285(this.f5466), e4);
            }
        } catch (IOException e5) {
            throw new C1327("URL.openConnection threw", 0, e5);
        }
    }
}
