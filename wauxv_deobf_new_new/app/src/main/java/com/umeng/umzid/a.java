package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static SharedPreferences a(Context context) {
        if (context != null) {
            return context.getSharedPreferences("umzid_general_config", 0);
        }
        return null;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) ((bArr[i] ^ bArr2[i % bArr2.length]) ^ (i & 255));
            }
        }
        return bArr;
    }

    public static synchronized String a(String str, String str2) {
        byte[] byteArray;
        try {
            String host = Uri.parse(str).getHost();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            httpsURLConnection.setHostnameVerifier(new b(host));
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
            httpsURLConnection.setConnectTimeout(30000);
            httpsURLConnection.setReadTimeout(30000);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            byte[] bytes = str2.getBytes();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                byteArray = null;
            }
            outputStream.write(a(byteArray, "7EC2papS9acZxgIb".getBytes()));
            outputStream.flush();
            outputStream.close();
            if (httpsURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                byte[] bArr = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        return new String(a(byteArrayOutputStream2.toByteArray(), "7EC2papS9acZxgIb".getBytes()));
                    }
                    byteArrayOutputStream2.write(bArr, 0, i);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
