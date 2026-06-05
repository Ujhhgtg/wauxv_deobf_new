package com.umeng.analytics.pro;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.h;
import com.umeng.analytics.pro.l;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(Opcodes.DCONST_0)
public class o {
    private static byte[] E;
    private static byte[] F;
    private static byte[] G;
    private static byte[] H;
    private static final ComponentCallbacks2 I;
    public static String a;
    private ArrayList<b> B;
    private ArrayList<c> D;
    boolean b;
    boolean c;
    com.umeng.analytics.vshelper.a f;
    Application.ActivityLifecycleCallbacks g;
    private final Map<String, Long> h;
    private boolean u;
    private int v;
    private int w;
    private static JSONArray i = new JSONArray();
    private static Object j = new Object();
    private static Application k = null;
    private static volatile boolean l = true;
    private static volatile boolean m = false;
    private static volatile String n = "";
    private static volatile long o = 0;
    private static volatile boolean p = true;
    private static volatile String q = "";
    private static volatile long r = 0;
    private static Object s = new Object();
    private static boolean t = false;
    static String d = null;
    static int e = -1;
    private static boolean x = true;
    private static Object y = new Object();
    private static cf z = new com.umeng.analytics.vshelper.b();
    private static Object A = new Object();
    private static Object C = new Object();

    /* JADX INFO: compiled from: obf */
    public static class a {
        private static final o a = new o();

        private a() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public class b {
        private String b;
        private long c;

        public b(String str, long j) {
            this.b = str;
            this.c = j;
        }

        public String a() {
            return this.b;
        }

        public long b() {
            return this.c;
        }

        public void a(String str) {
            this.b = str;
        }

        public void a(long j) {
            this.c = j;
        }
    }

    /* JADX INFO: compiled from: obf */
    public class c {
        private String b;
        private String c;
        private boolean d;
        private long e;
        private String f;

        public c(String str, String str2, boolean z, long j, String str3) {
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = j;
            this.f = str3;
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public boolean c() {
            return this.d;
        }

        public long d() {
            return this.e;
        }

        public String e() {
            return this.f;
        }

        public void a(String str) {
            this.b = str;
        }

        public void b(String str) {
            this.c = str;
        }

        public void c(String str) {
            this.f = str;
        }

        public void a(boolean z) {
            this.d = z;
        }

        public void a(long j) {
            this.e = j;
        }
    }

    static {
        byte[] bArr = {95, 101, 90, 111, JSONB.Constants.BC_STR_ASCII_FIX_36, 100, 90, 40, 90, 100, 110, 90, 60, 90, 112, 100, 110, JSONB.Constants.BC_STR_ASCII_FIX_32, 110, 110};
        E = bArr;
        byte[] bArr2 = {100, 75, 90, 70, 82, 110, JSONB.Constants.BC_STR_ASCII_FIX_32, 90, 82};
        F = bArr2;
        byte[] bArr3 = {90, 110, 75, 99, 97, 110, 110, 99, 99, 110, 100, JSONB.Constants.BC_STR_ASCII_FIX_36, 99, JSONB.Constants.BC_STR_ASCII_FIX_36, 99};
        G = bArr3;
        byte[] bArr4 = {100, JSONB.Constants.BC_INT32_SHORT_MIN, 100, 110, 112, 99, 112, 100, 98, 110, 110, 97, 112, 100, 99, 99};
        H = bArr4;
        byte b2 = (byte) (bArr[0] + 2);
        bArr[0] = b2;
        bArr[1] = (byte) (b2 + ek.k);
        byte b3 = (byte) (bArr[2] + 10);
        bArr[2] = b3;
        bArr[3] = (byte) (bArr[3] + 3);
        byte b4 = (byte) (bArr[4] + 2);
        bArr[4] = b4;
        bArr[5] = (byte) (b3 + 5);
        byte b5 = (byte) (bArr[6] + 10);
        bArr[6] = b5;
        byte b6 = (byte) (bArr[7] + 6);
        bArr[7] = b6;
        bArr[8] = b2;
        bArr[9] = (byte) (b4 + 1);
        byte b7 = (byte) (bArr[10] + 2);
        bArr[10] = b7;
        bArr[11] = b6;
        byte b8 = (byte) (bArr[12] + 5);
        bArr[12] = b8;
        bArr[13] = (byte) (b2 + 2);
        byte b9 = (byte) (b7 + 4);
        bArr[14] = b9;
        byte b10 = (byte) (bArr[15] + 5);
        bArr[15] = b10;
        byte b11 = (byte) (bArr[16] + 8);
        bArr[16] = b11;
        bArr[17] = b10;
        bArr[18] = b9;
        byte b12 = (byte) (b11 + 3);
        bArr[19] = b12;
        byte b13 = (byte) (bArr2[0] + 9);
        bArr2[0] = b13;
        bArr2[1] = (byte) (bArr2[1] + 7);
        byte b14 = (byte) (b5 + 1);
        bArr2[2] = b14;
        bArr2[3] = (byte) (b14 + 1);
        bArr2[4] = b14;
        byte b15 = (byte) (bArr2[5] + 4);
        bArr2[5] = b15;
        byte b16 = (byte) (b13 + 5);
        bArr2[6] = b16;
        bArr2[7] = (byte) (bArr2[7] + 11);
        bArr2[8] = b16;
        bArr3[0] = (byte) (bArr3[0] + 9);
        bArr3[1] = (byte) (bArr[1] + 7);
        bArr3[2] = bArr[3];
        bArr3[3] = (byte) (bArr[1] + 4);
        bArr3[4] = bArr2[2];
        bArr3[6] = (byte) (bArr3[6] + 6);
        bArr3[7] = b8;
        bArr3[9] = (byte) (bArr3[9] + 6);
        bArr3[10] = (byte) (bArr3[10] + 5);
        bArr3[11] = b11;
        bArr3[12] = b10;
        bArr3[13] = b9;
        bArr3[14] = b12;
        bArr4[0] = (byte) (bArr4[0] + 9);
        bArr4[1] = (byte) (bArr4[1] + 9);
        byte b17 = bArr[1];
        bArr4[2] = b17;
        bArr4[3] = (byte) (bArr[3] + 1);
        bArr4[4] = b9;
        bArr4[5] = b15;
        byte b18 = bArr2[0];
        bArr4[6] = (byte) (b18 + 8);
        bArr4[7] = b18;
        bArr4[8] = (byte) (bArr4[8] + 3);
        bArr4[10] = (byte) (bArr4[10] + 6);
        bArr4[12] = b9;
        bArr4[13] = bArr3[12];
        bArr4[14] = (byte) (bArr3[5] + 1);
        bArr4[15] = b17;
        I = new ComponentCallbacks2() { // from class: com.umeng.analytics.pro.o.2
            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i2) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "onTrimMemory: " + i2);
                if (i2 == 20) {
                    o.z();
                } else if (i2 == 40) {
                    o.z();
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }
        };
    }

    private void A() {
        if (this.u) {
            return;
        }
        this.u = true;
        if (k != null) {
            k.registerActivityLifecycleCallbacks(this.g);
        }
    }

    public static /* synthetic */ int b(o oVar) {
        int i2 = oVar.w;
        oVar.w = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int c(o oVar) {
        int i2 = oVar.v;
        oVar.v = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int f(o oVar) {
        int i2 = oVar.w;
        oVar.w = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int g(o oVar) {
        int i2 = oVar.v;
        oVar.v = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y() {
        synchronized (s) {
            try {
                if (!t) {
                    t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z() {
        synchronized (s) {
            try {
                if (t) {
                    t = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private o() {
        this.h = new HashMap();
        this.u = false;
        this.b = false;
        this.c = false;
        this.v = 0;
        this.w = 0;
        this.B = new ArrayList<>();
        this.D = new ArrayList<>();
        this.f = PageNameMonitor.getInstance();
        this.g = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.o.3
            @SuppressLint({"DiscouragedPrivateApi"})
            private String a(Activity activity) {
                try {
                    Field declaredField = Class.forName(new String(o.E)).getDeclaredField(new String(o.F));
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(activity);
                    if (obj != null) {
                        return obj.toString();
                    }
                    return null;
                } catch (Throwable unused) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "getPi error.");
                    return null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                o.z.a(activity, bundle);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (o.y) {
                        try {
                            if (o.x) {
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
                    if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                        com.umeng.analytics.b.a().i();
                    }
                } else {
                    o.this.c(activity);
                    com.umeng.analytics.b.a().i();
                    o.this.b = false;
                    o.z.d(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.F)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                    synchronized (o.y) {
                        try {
                            if (o.x) {
                                boolean unused = o.x = false;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    o.this.a(activity);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    o.this.a(activity);
                }
                o.z.c(activity);
                o.y();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (o.this.v <= 0) {
                        if (o.d == null) {
                            o.d = UUID.randomUUID().toString();
                        }
                        if (o.e == -1) {
                            o.e = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (o.e == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap map = new HashMap();
                            map.put("activityName", activity.toString());
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            com.umeng.analytics.b bVarA = com.umeng.analytics.b.a();
                            if (bVarA != null) {
                                bVarA.a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) map);
                            }
                            o.e = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, m.ar);
                            }
                        } else if (o.e == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap map2 = new HashMap();
                            map2.put("pairUUID", o.d);
                            map2.put("pid", Integer.valueOf(Process.myPid()));
                            map2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map2.put("activityName", activity.toString());
                            if (com.umeng.analytics.b.a() != null) {
                                com.umeng.analytics.b.a().a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) map2);
                            }
                        }
                    }
                    if (o.this.w < 0) {
                        o.f(o.this);
                    } else {
                        o.g(o.this);
                    }
                }
                if (!o.l) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "PI: local switch is off!");
                    return;
                }
                if (!o.m) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "PI: cloud switch is off!");
                    return;
                }
                String strA = a(activity);
                if (strA == null || strA.isEmpty()) {
                    return;
                }
                String packageName = DeviceConfig.getPackageName(UMGlobalContext.getAppContext());
                if (packageName.isEmpty() || packageName.equalsIgnoreCase(strA)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> PI: internal path switch, or pkg is null. ignore it.");
                    return;
                }
                long unused = o.o = System.currentTimeMillis();
                String unused2 = o.n = strA;
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>PI: p: " + strA + "; ts: " + o.o);
                synchronized (o.A) {
                    o.this.B.add(o.this.new b(o.n, o.o));
                    String unused3 = o.n = "";
                    long unused4 = o.o = 0L;
                }
                if (UMConfigure.getInitStatus()) {
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), com.umeng.ccg.c.u, com.umeng.ccg.d.a(), null, 0L);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                UMLog uMLog = UMConfigure.umDebugLog;
                MobclickAgent.PageMode pageMode = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        o.b(o.this);
                        return;
                    }
                    o.c(o.this);
                    if (o.this.v <= 0) {
                        if (o.e == 0 && UMUtils.isMainProgress(activity)) {
                            return;
                        }
                        int i2 = o.e;
                        if (i2 == 1 || (i2 == 0 && !UMUtils.isMainProgress(activity))) {
                            HashMap map = new HashMap();
                            map.put("pairUUID", o.d);
                            map.put("reason", "Normal");
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map.put("activityName", activity.toString());
                            com.umeng.analytics.b bVarA = com.umeng.analytics.b.a();
                            if (bVarA != null) {
                                bVarA.a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) map);
                            }
                            if (o.d != null) {
                                o.d = null;
                            }
                        }
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }
        };
        synchronized (this) {
            try {
                if (k != null) {
                    A();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.u = false;
        if (k != null) {
            k.unregisterActivityLifecycleCallbacks(this.g);
            k = null;
        }
    }

    public void e() {
        c((Activity) null);
        d();
    }

    public ArrayList<b> f() {
        ArrayList<b> arrayList = new ArrayList<>();
        synchronized (A) {
            for (int i2 = 0; i2 < this.B.size(); i2++) {
                try {
                    arrayList.add(new b(this.B.get(i2).a(), this.B.get(i2).b()));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.B.clear();
        }
        return arrayList;
    }

    public ArrayList<c> g() throws Throwable {
        ArrayList<c> arrayList = new ArrayList<>();
        synchronized (C) {
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                try {
                    try {
                        arrayList.add(new c(this.D.get(i2).a(), this.D.get(i2).b(), this.D.get(i2).c(), this.D.get(i2).d(), this.D.get(i2).e()));
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            this.D.clear();
            return arrayList;
        }
    }

    public static boolean c() {
        boolean z2;
        synchronized (s) {
            z2 = t;
        }
        return z2;
    }

    public static void b(boolean z2) {
        p = z2;
    }

    public boolean a() {
        return this.u;
    }

    public static void a(boolean z2) {
        l = z2;
    }

    public static void c(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (j) {
                    string = i.toString();
                    i = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put(h.d.a.c, new JSONArray(string));
                    l.a(context).a(x.a().c(), jSONObject, l.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void b() {
        if (p) {
            try {
                final String packageName = DeviceConfig.getPackageName(UMGlobalContext.getAppContext());
                Class<?> cls = Class.forName(new String(E).concat("Thread"));
                Object objInvoke = cls.getMethod(new String(G).concat("Thread"), null).invoke(null, null);
                Field declaredField = cls.getDeclaredField(new String(H));
                declaredField.setAccessible(true);
                Instrumentation instrumentation = (Instrumentation) declaredField.get(objInvoke);
                if (instrumentation != null) {
                    instrumentation.addMonitor(new Instrumentation.ActivityMonitor() { // from class: com.umeng.analytics.pro.o.1
                        @Override // android.app.Instrumentation.ActivityMonitor
                        public Instrumentation.ActivityResult onStartActivity(Intent intent) {
                            if (intent == null) {
                                return super.onStartActivity(null);
                            }
                            if (TextUtils.equals(intent.getPackage(), packageName)) {
                                return super.onStartActivity(intent);
                            }
                            ComponentName component = intent.getComponent();
                            if (component != null && TextUtils.equals(component.getPackageName(), packageName)) {
                                return super.onStartActivity(intent);
                            }
                            if (o.k == null) {
                                return super.onStartActivity(intent);
                            }
                            try {
                                ComponentName componentNameResolveActivity = intent.resolveActivity(o.k.getPackageManager());
                                if (componentNameResolveActivity != null && !TextUtils.equals(componentNameResolveActivity.getPackageName(), packageName)) {
                                    long unused = o.r = System.currentTimeMillis();
                                    String unused2 = o.q = componentNameResolveActivity.getPackageName();
                                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>>PO: p: " + o.q + "; ts: " + o.r);
                                    synchronized (o.C) {
                                        o.this.D.add(o.this.new c(componentNameResolveActivity.getPackageName(), componentNameResolveActivity.getClassName(), o.t, o.r, Base64.encodeToString(ay.a(Log.getStackTraceString(new Throwable()).getBytes(), UMConfigure.sAppkey.getBytes()), 0)));
                                        String unused3 = o.q = "";
                                        long unused4 = o.r = 0L;
                                    }
                                    if (UMConfigure.getInitStatus()) {
                                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), com.umeng.ccg.c.v, com.umeng.ccg.d.a(), null, 0L);
                                    }
                                }
                            } catch (Throwable unused5) {
                            }
                            return super.onStartActivity(intent);
                        }
                    });
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "PO: attach success.");
                } else {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "PO: attach failed.");
                }
            } catch (Throwable unused) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "PO: attach failed.");
            }
        }
    }

    public static synchronized o a(Context context) {
        try {
            if (k == null && context != null) {
                if (context instanceof Activity) {
                    k = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    k = (Application) context;
                }
                k.registerComponentCallbacks(I);
            }
            try {
                if (new File(context.getFilesDir().getAbsolutePath() + File.separator + bz.n).exists()) {
                    m = true;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return a.a;
    }

    public static void a(Context context, String str) {
        if (e == 1 && UMUtils.isMainProgress(context)) {
            HashMap map = new HashMap();
            map.put("pairUUID", d);
            map.put("reason", str);
            if (d != null) {
                d = null;
            }
            if (context != null) {
                map.put("pid", Integer.valueOf(Process.myPid()));
                map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                map.put("Context", context.toString());
                com.umeng.analytics.b.a().a(context, "$$_onUMengEnterBackground", (Map<String, Object>) map);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        long jLongValue;
        long jCurrentTimeMillis;
        try {
            synchronized (this.h) {
                try {
                    if (a == null && activity != null) {
                        a = activity.getPackageName() + "." + activity.getLocalClassName();
                    }
                    if (TextUtils.isEmpty(a) || !this.h.containsKey(a)) {
                        jLongValue = 0;
                        jCurrentTimeMillis = 0;
                    } else {
                        jLongValue = this.h.get(a).longValue();
                        jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                        this.h.remove(a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(g.v, a);
                    jSONObject.put("duration", jCurrentTimeMillis);
                    jSONObject.put(g.x, jLongValue);
                    jSONObject.put(g.y, 0);
                    i.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public void b(Context context) {
        synchronized (y) {
            if (x) {
                x = false;
                Activity globleActivity = DeviceConfig.getGlobleActivity(context);
                if (globleActivity == null) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                    return;
                }
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + globleActivity.getLocalClassName());
                a(globleActivity);
                return;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                synchronized (y) {
                    com.umeng.analytics.b.a().h();
                }
                return;
            }
            return;
        }
        if (activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f.activityResume(str);
            if (this.b) {
                this.b = false;
                if (!TextUtils.isEmpty(a)) {
                    if (a.equals(str)) {
                        return;
                    }
                    b(activity);
                    synchronized (y) {
                        com.umeng.analytics.b.a().h();
                    }
                    return;
                }
                a = str;
                return;
            }
            b(activity);
            synchronized (y) {
                com.umeng.analytics.b.a().h();
            }
        }
    }

    private void b(Activity activity) {
        a = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.h) {
            this.h.put(a, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
