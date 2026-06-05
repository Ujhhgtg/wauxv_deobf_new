package com.uyumao.sdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.uyumao.b;
import com.uyumao.c;
import com.uyumao.d;
import com.uyumao.e;
import com.uyumao.g;
import com.uyumao.h;
import com.uyumao.l;
import com.uyumao.q;
import com.uyumao.s;
import com.uyumao.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class UYMManager {
    public static UYMManager a;

    /* JADX INFO: compiled from: obf */
    public class a implements ActionInfo {
        public a(UYMManager uYMManager) {
        }

        @Override // com.umeng.ccg.ActionInfo
        public String getModule(Context context) {
            return "anti";
        }

        @Override // com.umeng.ccg.ActionInfo
        public String[] getSupportAction(Context context) {
            return new String[]{com.umeng.ccg.a.e, com.umeng.ccg.a.d, com.umeng.ccg.a.c, com.umeng.ccg.a.b};
        }

        @Override // com.umeng.ccg.ActionInfo
        public boolean getSwitchState(Context context, String str) {
            boolean z = com.umeng.ccg.a.e.equals(str) ? d.f : false;
            if (com.umeng.ccg.a.d.equals(str)) {
                boolean z2 = d.a;
                boolean z3 = d.b;
                if (z2 || z3) {
                    z = true;
                }
            }
            if (com.umeng.ccg.a.c.equals(str)) {
                z = d.e;
            }
            if (com.umeng.ccg.a.b.equals(str)) {
                boolean z4 = d.c;
                boolean z5 = d.d;
                if (z4 || z5) {
                    return true;
                }
            }
            return z;
        }

        @Override // com.umeng.ccg.ActionInfo
        public void onCommand(Context context, String str, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean z = d.a;
            d.g = context.getApplicationContext();
            if (jSONObject == null) {
                return;
            }
            try {
                if (jSONObject.has("actionName")) {
                    Integer num = d.m.get(jSONObject.optString("actionName"));
                    if (num != null) {
                        g.a(context, num.intValue(), d.e.a, jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void enableYm1(Context context, boolean z) {
        d.a = z;
    }

    public static void enableYm2(Context context, boolean z) {
        d.b = z;
    }

    public static void enableYm3(Context context, boolean z) {
        d.c = z;
    }

    public static void enableYm4(Context context, boolean z) {
        d.d = z;
    }

    public static void enableYm5(Context context, boolean z) {
        d.e = z;
    }

    public static void enableYm6(Context context, boolean z) {
        d.f = z;
        try {
            Method methodA = t.a("com.umeng.commonsdk.UMConfigure", "enableAplCollection", (Class<?>[]) new Class[]{Boolean.TYPE});
            if (methodA != null) {
                t.a(methodA, (Object) null, new Object[]{Boolean.valueOf(z)});
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized UYMManager getInstance() {
        try {
            if (a == null) {
                a = new UYMManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static String getSdkVersion() {
        return "1.1.4";
    }

    public static void processEvent(Context context, String str) {
        boolean z = d.a;
        d.g = context.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("actionName")) {
                Integer num = d.m.get(jSONObject.optString("actionName"));
                if (num != null) {
                    g.a(context, num.intValue(), d.e.a, jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized void init(Context context) {
        Future<?> future;
        if (context == null) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (!c.a) {
                c.a = true;
                if (applicationContext.getSharedPreferences("uyumao_info", 0).getBoolean(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()), false)) {
                    new Thread(new com.uyumao.a(applicationContext)).start();
                } else {
                    l.a().b().execute(new b(applicationContext));
                }
                try {
                    h hVar = c.b;
                    if (hVar != null) {
                        applicationContext.unregisterReceiver(hVar);
                    }
                    c.b = new h();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    applicationContext.registerReceiver(c.b, intentFilter);
                } catch (Throwable unused) {
                }
            }
            e.a = context;
            try {
                UMLog uMLog = UMConfigure.umDebugLog;
                if (UMConfigure.class.getDeclaredMethod("registerActionInfo", ActionInfo.class) != null) {
                    UMConfigure.registerActionInfo(new a(this));
                }
            } catch (Throwable unused2) {
            }
            if (d.f) {
                try {
                    WeakReference<Future<?>> weakReference = e.b;
                    if (weakReference == null || (future = weakReference.get()) == null || future.isDone() || future.isCancelled()) {
                        e.b = new WeakReference<>(s.a(new q()));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
