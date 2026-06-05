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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛴ要点脸ᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0614Ujhhgtgfeyxiexzf implements InterfaceC3078Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3598feyxiexzfUjhhgtg f2641Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f2642Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public HttpURLConnection f2643Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public InputStream f2644Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public volatile boolean f2645Ujhhgtgfeyxiexzf;

    public C0614Ujhhgtgfeyxiexzf(C3598feyxiexzfUjhhgtg c3598feyxiexzfUjhhgtg, int i) {
        this.f2641Ujhhgtgfeyxiexzf = c3598feyxiexzfUjhhgtg;
        this.f2642Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static int m1874Ujhhgtgfeyxiexzf(HttpURLConnection httpURLConnection) {
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

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    public final void cancel() {
        this.f2645Ujhhgtgfeyxiexzf = true;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo1381Ujhhgtgfeyxiexzf() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1382Ujhhgtgfeyxiexzf() {
        InputStream inputStream = this.f2644Ujhhgtgfeyxiexzf;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2643Ujhhgtgfeyxiexzf;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2643Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1383Ujhhgtgfeyxiexzf(EnumC0836feyxiexzfUjhhgtg enumC0836feyxiexzfUjhhgtg, InterfaceC3077Ujhhgtgfeyxiexzf interfaceC3077Ujhhgtgfeyxiexzf) {
        C3598feyxiexzfUjhhgtg c3598feyxiexzfUjhhgtg = this.f2641Ujhhgtgfeyxiexzf;
        int i = AbstractC0264Ujhhgtgfeyxiexzf.f1650Ujhhgtgfeyxiexzf;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            interfaceC3077Ujhhgtgfeyxiexzf.mo1801Ujhhgtgfeyxiexzf(m1875Ujhhgtgfeyxiexzf(c3598feyxiexzfUjhhgtg.m5202Ujhhgtgfeyxiexzf(), 0, null, c3598feyxiexzfUjhhgtg.f11197Ujhhgtgfeyxiexzf.mo1075Ujhhgtgfeyxiexzf()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            interfaceC3077Ujhhgtgfeyxiexzf.mo1799Ujhhgtgfeyxiexzf(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC0264Ujhhgtgfeyxiexzf.m1448Ujhhgtgfeyxiexzf(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // p000.InterfaceC3078Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1384Ujhhgtgfeyxiexzf() {
        return 2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final InputStream m1875Ujhhgtgfeyxiexzf(URL url, int i, URL url2, Map map) throws C0585Ujhhgtgfeyxiexzf {
        if (i >= 5) {
            throw new C0585Ujhhgtgfeyxiexzf("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C0585Ujhhgtgfeyxiexzf("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f2642Ujhhgtgfeyxiexzf;
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
            this.f2643Ujhhgtgfeyxiexzf = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f2644Ujhhgtgfeyxiexzf = this.f2643Ujhhgtgfeyxiexzf.getInputStream();
                if (this.f2645Ujhhgtgfeyxiexzf) {
                    return null;
                }
                int iM1874Ujhhgtgfeyxiexzf = m1874Ujhhgtgfeyxiexzf(this.f2643Ujhhgtgfeyxiexzf);
                int i3 = iM1874Ujhhgtgfeyxiexzf / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f2643Ujhhgtgfeyxiexzf;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f2644Ujhhgtgfeyxiexzf = new C3700feyxiexzfUjhhgtg(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f2644Ujhhgtgfeyxiexzf = httpURLConnection2.getInputStream();
                        }
                        return this.f2644Ujhhgtgfeyxiexzf;
                    } catch (IOException e) {
                        throw new C0585Ujhhgtgfeyxiexzf("Failed to obtain InputStream", m1874Ujhhgtgfeyxiexzf(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM1874Ujhhgtgfeyxiexzf == -1) {
                        throw new C0585Ujhhgtgfeyxiexzf("Http request failed", iM1874Ujhhgtgfeyxiexzf, null);
                    }
                    try {
                        throw new C0585Ujhhgtgfeyxiexzf(this.f2643Ujhhgtgfeyxiexzf.getResponseMessage(), iM1874Ujhhgtgfeyxiexzf, null);
                    } catch (IOException e2) {
                        throw new C0585Ujhhgtgfeyxiexzf("Failed to get a response message", iM1874Ujhhgtgfeyxiexzf, e2);
                    }
                }
                String headerField = this.f2643Ujhhgtgfeyxiexzf.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C0585Ujhhgtgfeyxiexzf("Received empty or null redirect url", iM1874Ujhhgtgfeyxiexzf, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo1382Ujhhgtgfeyxiexzf();
                    return m1875Ujhhgtgfeyxiexzf(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C0585Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Bad redirect url: ", headerField), iM1874Ujhhgtgfeyxiexzf, e3);
                }
            } catch (IOException e4) {
                throw new C0585Ujhhgtgfeyxiexzf("Failed to connect or obtain data", m1874Ujhhgtgfeyxiexzf(this.f2643Ujhhgtgfeyxiexzf), e4);
            }
        } catch (IOException e5) {
            throw new C0585Ujhhgtgfeyxiexzf("URL.openConnection threw", 0, e5);
        }
    }
}
