package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.ce;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class c {
    private String a = "10.0.0.172";
    private int b = 80;
    private Context c;

    public c(Context context) {
        this.c = context;
    }

    public void a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strImprintProperty)) {
            return;
        }
        a.h = DataHelper.assembleStatelessURL(strImprintProperty);
    }

    public void b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            a.g = DataHelper.assembleStatelessURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            a.j = DataHelper.assembleStatelessURL(strImprintProperty2);
        }
        a.h = a.j;
        if (TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.b)) {
            return;
        }
        if (com.umeng.commonsdk.statistics.b.b.startsWith("460") || com.umeng.commonsdk.statistics.b.b.startsWith("461")) {
            a.h = a.g;
        }
    }

    public boolean a(byte[] bArr, String str, String str2, String str3) throws Throwable {
        String str4 = str2 + "/" + str;
        if (SdkVersion.SDK_TYPE == 1) {
            return a(bArr, str4, str3);
        }
        if (ca.a().b()) {
            String strReplace = str4.replace("ulogs", "cnlogs");
            String strC = ce.b().c();
            if (!TextUtils.isEmpty(strC)) {
                strReplace = ca.a(strC, str);
            }
            boolean zA = a(bArr, strReplace, str3);
            if (!zA) {
                String strA = ca.a().a(str);
                if (!TextUtils.isEmpty(strA) && !strReplace.equalsIgnoreCase(strA)) {
                    return a(bArr, strA, str3);
                }
            }
            return zA;
        }
        return a(bArr, str4, str3);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0109, code lost:
    
        if (r8 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(byte[] bArr, String str, String str2) throws Throwable {
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection;
        boolean z = false;
        if (bArr != null && !TextUtils.isEmpty(str)) {
            UMRTLog.i("MobclickRT", "[无状态] 上报url：" + str);
            HttpsURLConnection httpsURLConnection2 = null;
            outputStream = null;
            outputStream = null;
            OutputStream outputStream2 = null;
            try {
                try {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                    try {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                        httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                        httpsURLConnection.setRequestProperty("Content-Type", "ut/" + str2);
                        httpsURLConnection.setRequestProperty("SM-IMP", "1");
                        httpsURLConnection.setRequestProperty("User-Agent", DeviceConfig.getCustomAgt());
                        httpsURLConnection.setConnectTimeout(30000);
                        httpsURLConnection.setReadTimeout(30000);
                        httpsURLConnection.setRequestMethod("POST");
                        httpsURLConnection.setDoOutput(true);
                        httpsURLConnection.setDoInput(true);
                        httpsURLConnection.setUseCaches(false);
                        outputStream2 = httpsURLConnection.getOutputStream();
                        outputStream2.write(bArr);
                        outputStream2.flush();
                        httpsURLConnection.connect();
                        if (httpsURLConnection.getResponseCode() == 200) {
                            UMRTLog.i("MobclickRT", "--->>> send stateless message success : " + str);
                            z = true;
                        }
                        try {
                            outputStream2.close();
                        } catch (Exception unused) {
                        }
                    } catch (SSLHandshakeException e) {
                        e = e;
                        try {
                            UMRTLog.e("MobclickRT", "SSLHandshakeException, Failed to send message.\n" + e);
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (Exception unused2) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream2;
                            httpsURLConnection2 = httpsURLConnection;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (true) {
                                try {
                                    UMRTLog.i("MobclickRT", "--->>> stateless: disconnect connection.");
                                    httpsURLConnection2.disconnect();
                                    throw th;
                                } catch (Throwable unused4) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = outputStream2;
                        httpsURLConnection2 = httpsURLConnection;
                        try {
                            UMRTLog.e("MobclickRT", "Exception,Failed to send message.\n" + th);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (httpsURLConnection2 != null) {
                                UMRTLog.i("MobclickRT", "--->>> stateless: disconnect connection.");
                                httpsURLConnection2.disconnect();
                            }
                            return z;
                        } catch (Throwable th3) {
                            th = th3;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpsURLConnection2 != null) {
                                UMRTLog.i("MobclickRT", "--->>> stateless: disconnect connection.");
                                httpsURLConnection2.disconnect();
                                throw th;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable unused6) {
                }
            } catch (SSLHandshakeException e2) {
                e = e2;
                httpsURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
            }
            UMRTLog.i("MobclickRT", "--->>> stateless: disconnect connection.");
            httpsURLConnection.disconnect();
            return z;
        }
        ULog.i("walle", "[stateless] sendMessage, envelopeByte == null || url is empty ");
        return false;
    }
}
