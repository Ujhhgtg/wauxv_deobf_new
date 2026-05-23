package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cc {
    private static final String a = "HttpClient";
    private static HostnameVerifier f;
    private String b;
    private a c;
    private Map<String, String> d;
    private cd e;

    /* JADX INFO: compiled from: obf */
    public enum a {
        POST,
        GET
    }

    public cc(String str, a aVar, Map<String, String> map, cd cdVar) {
        this.b = str;
        this.c = aVar;
        this.d = map;
        this.e = cdVar;
    }

    private static HostnameVerifier a() {
        if (f == null) {
            f = new HostnameVerifier() { // from class: com.umeng.analytics.pro.cc.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    return !TextUtils.isEmpty(str) && "resolve.umeng.com".equalsIgnoreCase(str);
                }
            };
        }
        return f;
    }

    public String a(int i, String str) {
        HttpsURLConnection httpsURLConnection;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(this.b).openConnection();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, new SecureRandom());
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                httpsURLConnection.setHostnameVerifier(a());
                Map<String, String> map = this.d;
                if (map != null && !map.isEmpty()) {
                    for (String str2 : this.d.keySet()) {
                        if (!TextUtils.isEmpty(str2)) {
                            httpsURLConnection.setRequestProperty(str2, this.d.get(str2));
                        }
                    }
                }
                httpsURLConnection.setConnectTimeout(i);
                httpsURLConnection.setReadTimeout(i);
                if (this.c == "HttpClient".POST) {
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setDefaultUseCaches(false);
                    if (!TextUtils.isEmpty(str)) {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream());
                        outputStreamWriter.write(str);
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                    }
                    httpsURLConnection.connect();
                } else {
                    httpsURLConnection.setRequestMethod("GET");
                }
                if (httpsURLConnection.getResponseCode() == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    byte[] streamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                    String str3 = "";
                    if (true) {
                        try {
                            if (streamToByteArray.length > 1) {
                                str3 = new String(streamToByteArray);
                            }
                        } catch (Throwable th) {
                            HelperUtils.safeClose(inputStream);
                            throw th;
                        }
                    }
                    cd cdVar = this.e;
                    if (cdVar != null) {
                        cdVar.a(str3);
                    }
                    HelperUtils.safeClose(inputStream);
                    httpsURLConnection.disconnect();
                    return str3;
                }
            } catch (MalformedURLException unused) {
                if (true) {
                }
                return null;
            } catch (SocketTimeoutException unused2) {
                if (true) {
                }
                return null;
            } catch (UnknownHostException unused3) {
                if (true) {
                }
                return null;
            } catch (SSLHandshakeException unused4) {
                if (true) {
                }
                return null;
            } catch (IOException unused5) {
                if (true) {
                }
                return null;
            } catch (Throwable unused6) {
                if (httpsURLConnection != null) {
                }
                return null;
            }
        } catch (MalformedURLException unused7) {
            httpsURLConnection = null;
        } catch (SocketTimeoutException unused8) {
            httpsURLConnection = null;
        } catch (UnknownHostException unused9) {
            httpsURLConnection = null;
        } catch (SSLHandshakeException unused10) {
            httpsURLConnection = null;
        } catch (IOException unused11) {
            httpsURLConnection = null;
        } catch (Throwable unused12) {
            httpsURLConnection = null;
        }
        httpsURLConnection.disconnect();
        return null;
    }
}
