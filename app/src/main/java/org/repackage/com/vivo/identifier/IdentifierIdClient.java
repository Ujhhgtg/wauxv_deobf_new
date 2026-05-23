package org.repackage.com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class IdentifierIdClient {
    private static int A = 13;
    private static IdentifierIdObserver B = null;
    private static IdentifierIdObserver C = null;
    private static IdentifierIdObserver D = null;
    private static IdentifierIdObserver E = null;
    private static HandlerThread F = null;
    private static Handler G = null;
    private static String H = null;
    private static String I = null;
    private static String J = null;
    private static String K = null;
    private static String L = null;
    private static String M = null;
    private static String N = null;
    private static volatile IdentifierIdClient O = null;
    private static volatile DataBaseOperation P = null;
    private static int R = 0;
    private static int S = 0;
    private static int T = 0;
    private static int U = 0;
    private static int V = 0;
    private static int W = 0;
    private static int X = 0;
    private static int Y = 0;
    private static int Z = 0;
    public static final String a = "persist.sys.identifierid";
    private static int aa = 0;
    private static int ab = 0;
    private static int ac = 0;
    private static final String b = "VMS_SDK_Client";
    private static final String c = "content://com.vivo.vms.IdProvider/IdentifierId";
    private static final String d = "persist.sys.identifierid.supported";
    private static final String e = "com.vivo.vms";
    private static final String f = "appid";
    private static final String g = "type";
    private static final String h = "OAID";
    private static final String i = "VAID";
    private static final String j = "OAIDSTATUS";
    private static Object k = new Object();
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 3;
    private static final int p = 4;
    private static final int q = 5;
    private static final int r = 6;
    private static final int s = 7;
    private static final int t = 8;
    private static final int u = 9;
    private static final int v = 10;
    private static final int w = 11;
    private static final int x = 2000;
    private static Context y = null;
    private static boolean z = false;
    private final int Q;

    private IdentifierIdClient() {
        D();
        P = new DataBaseOperation(y);
        this.Q = c(y);
    }

    private void C() {
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new Runnable() { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.1
            @Override // java.lang.Runnable
            public void run() {
                int i2 = IdentifierIdClient.aa + IdentifierIdClient.X + IdentifierIdClient.S + IdentifierIdClient.R;
                int i3 = IdentifierIdClient.aa + IdentifierIdClient.Z + IdentifierIdClient.U + IdentifierIdClient.T;
                if (i2 + i3 + IdentifierIdClient.ac + IdentifierIdClient.ab + IdentifierIdClient.W + IdentifierIdClient.V > 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("oaid", IdentifierIdClient.this.a(IdentifierIdClient.R, IdentifierIdClient.S, IdentifierIdClient.X, IdentifierIdClient.Y));
                    contentValues.put("vaid", IdentifierIdClient.this.a(IdentifierIdClient.T, IdentifierIdClient.U, IdentifierIdClient.Z, IdentifierIdClient.aa));
                    contentValues.put("aaid", IdentifierIdClient.this.a(IdentifierIdClient.V, IdentifierIdClient.W, IdentifierIdClient.ab, IdentifierIdClient.ac));
                    IdentifierIdClient.P.a(7, "vivo", new ContentValues[]{contentValues});
                    int unused = IdentifierIdClient.R = IdentifierIdClient.S = IdentifierIdClient.T = IdentifierIdClient.U = IdentifierIdClient.V = IdentifierIdClient.W = 0;
                    int unused2 = IdentifierIdClient.X = IdentifierIdClient.Y = IdentifierIdClient.Z = IdentifierIdClient.aa = IdentifierIdClient.ab = IdentifierIdClient.ac = 0;
                }
            }
        }, 600L, 600L, TimeUnit.SECONDS);
    }

    private static void D() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        F = handlerThread;
        handlerThread.start();
        G = new Handler(F.getLooper()) { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.2
            @Override // android.os.Handler
            public void handleMessage(Message message) throws Throwable {
                if (message.what != 11) {
                    Log.e("VMS_SDK_Client", "message type valid");
                    return;
                }
                int i2 = message.getData().getInt("type");
                try {
                    String strA = IdentifierIdClient.P.a(i2, message.getData().getString("appid"));
                    if (i2 == 0) {
                        String unused = IdentifierIdClient.H = strA;
                        IdentifierIdClient.c(8, IdentifierIdClient.H);
                    } else if (i2 == 1) {
                        if (strA != null) {
                            String unused2 = IdentifierIdClient.I = strA;
                        } else {
                            Log.e("VMS_SDK_Client", "get vaid failed");
                        }
                        IdentifierIdClient.c(9, IdentifierIdClient.I);
                    } else if (i2 == 2) {
                        if (strA != null) {
                            String unused3 = IdentifierIdClient.J = strA;
                        } else {
                            Log.e("VMS_SDK_Client", "get aaid failed");
                        }
                        IdentifierIdClient.c(10, IdentifierIdClient.J);
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            String unused4 = IdentifierIdClient.L = strA;
                        } else if (i2 == 5) {
                            if (strA != null) {
                                String unused5 = IdentifierIdClient.M = strA;
                            } else {
                                Log.e("VMS_SDK_Client", "get guid failed");
                            }
                        }
                    } else if (strA != null) {
                        String unused6 = IdentifierIdClient.K = strA;
                    } else {
                        Log.e("VMS_SDK_Client", "get udid failed");
                    }
                } catch (Exception e2) {
                    Log.e("VMS_SDK_Client", "readException:" + e2.toString());
                }
                synchronized (IdentifierIdClient.k) {
                    IdentifierIdClient.k.notify();
                }
            }
        };
    }

    private static void E() {
        z = "1".equals(a("persist.sys.identifierid.supported", "0")) || "1".equals(a("persist.sys.identifierid", "0"));
    }

    public String g() {
        String str = J;
        if (str != null) {
            c(2, str);
            return J;
        }
        e(2, "vivo");
        if (D == null) {
            a(y, 2, "vivo");
        }
        c(2, J);
        return J;
    }

    public String h() {
        String str = J;
        if (str != null) {
            c(2, str);
            return J;
        }
        d(2, "vivo");
        if (D == null) {
            a(y, 2, "vivo");
        }
        c(2, J);
        return J;
    }

    public String i() {
        e(4, null);
        return L;
    }

    public String j() {
        String str = M;
        if (str != null) {
            return str;
        }
        e(5, "vivo");
        return M;
    }

    public String k() {
        String str = M;
        if (str != null) {
            return str;
        }
        d(5, "vivo");
        return M;
    }

    private static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.vivo.vms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public String d() {
        String str = H;
        if (str != null) {
            c(0, str);
            return H;
        }
        d(0, null);
        if (B == null) {
            a(y, 0, null);
        }
        c(0, H);
        return H;
    }

    public String e() {
        String str = I;
        if (str != null) {
            c(1, str);
            return I;
        }
        e(1, "vivo");
        if (C == null) {
            a(y, 1, "vivo");
        }
        c(1, I);
        return I;
    }

    public String f() {
        String str = I;
        if (str != null) {
            c(1, str);
            return I;
        }
        d(1, "vivo");
        if (C == null) {
            a(y, 1, "vivo");
        }
        c(1, I);
        return I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i2, int i3, int i4, int i5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i2);
        stringBuffer.append(",");
        stringBuffer.append(i3);
        stringBuffer.append(";");
        stringBuffer.append(i4);
        stringBuffer.append(",");
        stringBuffer.append(i5);
        return stringBuffer.toString();
    }

    public static IdentifierIdClient b(Context context) {
        if (a()) {
            return a(context);
        }
        return null;
    }

    public static IdentifierIdClient a(Context context) {
        if (y == null) {
            if (context == null) {
                return null;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            y = context;
        }
        if (O == null) {
            synchronized (IdentifierIdClient.class) {
                try {
                    if (O == null) {
                        O = new IdentifierIdClient();
                        O.C();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O;
    }

    public String b() {
        String str = K;
        if (str != null) {
            return str;
        }
        e(3, null);
        return K;
    }

    public String c() {
        String str = H;
        if (str != null) {
            c(0, str);
            return H;
        }
        e(0, null);
        if (B == null) {
            a(y, 0, null);
        }
        c(0, H);
        return H;
    }

    public List b(List<String> list) {
        if (this.Q < A) {
            return null;
        }
        if (list == null || list.size() == 0) {
            Log.e("VMS_SDK_Client", "List is null when delete OAIDBLACK");
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                String[] strArrSplit = list.get(i2).split(":");
                if (strArrSplit.length == 2) {
                    arrayList.add(Boolean.valueOf(P.a(6, "vivo", strArrSplit[0], strArrSplit[1])));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            Log.e("VMS_SDK_Client", "delete OAIDBLACK failure");
            return null;
        }
    }

    private void d(int i2, String str) {
        a(i2, str);
    }

    private void e(int i2, String str) {
        synchronized (k) {
            a(i2, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                k.wait(2000L);
            } catch (InterruptedException unused) {
                Log.e("VMS_SDK_Client", "queryId: lock error");
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= 2000) {
                Log.d("VMS_SDK_Client", "query timeout");
            }
        }
    }

    public static boolean a() {
        if (!z) {
            E();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i2, String str) {
        if (i2 == 0) {
            if (str == null) {
                S++;
                return;
            } else {
                R++;
                return;
            }
        }
        if (i2 == 1) {
            if (str == null) {
                U++;
                return;
            } else {
                T++;
                return;
            }
        }
        if (i2 == 2) {
            if (str == null) {
                W++;
                return;
            } else {
                V++;
                return;
            }
        }
        switch (i2) {
            case 8:
                if (str != null) {
                    X++;
                } else {
                    Y++;
                }
                break;
            case 9:
                if (str != null) {
                    Z++;
                } else {
                    aa++;
                }
                break;
            case 10:
                if (str != null) {
                    ab++;
                } else {
                    ac++;
                }
                break;
        }
    }

    public boolean a(List<String> list) {
        if (this.Q < A) {
            return false;
        }
        if (list == null || list.size() == 0) {
            Log.e("VMS_SDK_Client", "List is null when insert OAIDBLACK");
            return false;
        }
        try {
            ContentValues[] contentValuesArr = new ContentValues[list.size()];
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
            for (int i2 = 0; i2 < list.size(); i2++) {
                ContentValues contentValues = new ContentValues();
                String[] strArrSplit = list.get(i2).split(":");
                if (strArrSplit.length != 2) {
                    return false;
                }
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                contentValues.put("packageName", str2);
                contentValues.put("uid", str3);
                contentValues.put("value", str);
                contentValuesArr[i2] = contentValues;
            }
            return P.a(6, "vivo", contentValuesArr);
        } catch (Exception unused) {
            Log.e("VMS_SDK_Client", "insert OAIDBLACK failure");
            return false;
        }
    }

    public void a(int i2, String str) {
        Message messageObtainMessage = G.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        if (i2 == 1 || i2 == 2 || i2 == 6) {
            bundle.putString("appid", str);
        }
        messageObtainMessage.setData(bundle);
        G.sendMessage(messageObtainMessage);
    }

    private static String a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "0");
            } catch (Exception e2) {
                Log.e("VMS_SDK_Client", "getProperty: invoke is error" + e2.getMessage());
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    private static synchronized void a(Context context, int i2, String str) {
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (D == null) {
                            D = new IdentifierIdObserver(O, 2, str);
                            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/" + context.getPackageName()), false, D);
                        }
                    }
                } else if (C == null) {
                    C = new IdentifierIdObserver(O, 1, str);
                    context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, C);
                }
            } else if (B == null) {
                B = new IdentifierIdObserver(O, 0, null);
                context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, B);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
