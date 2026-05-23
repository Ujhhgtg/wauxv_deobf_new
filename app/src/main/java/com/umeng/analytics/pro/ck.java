package com.umeng.analytics.pro;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.analytics.pro.cj;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ck {
    private static cj g;
    private static Object a = new Object();
    private static Object b = new Object();
    private static ArrayList<cg> c = new ArrayList<>();
    private static ArrayList<ci> d = new ArrayList<>();
    private static volatile int e = 0;
    private static volatile long f = 0;
    private static ArrayList<cj.a> h = new ArrayList<>();

    public static void a(cg cgVar) {
        if (cgVar != null) {
            synchronized (a) {
                c.add(cgVar);
            }
        }
    }

    public static void b(JSONObject jSONObject) {
        synchronized (a) {
            try {
                int size = c.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        c.get(i).a(jSONObject);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(ci ciVar) {
        if (ciVar != null) {
            synchronized (b) {
                d.add(ciVar);
            }
        }
    }

    private static void b(Context context) {
        if (g == null) {
            synchronized (ck.class) {
                try {
                    if (g == null) {
                        cj cjVar = new cj();
                        g = cjVar;
                        if (context instanceof Application) {
                            ((Application) context).registerActivityLifecycleCallbacks(cjVar);
                        } else {
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext instanceof Application) {
                                ((Application) applicationContext).registerActivityLifecycleCallbacks(g);
                            } else {
                                UMRTLog.e("MobclickRT", "[ncc]: Failed to register ActivityLifecycleCallbacks, context is not Application");
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (b) {
            try {
                int size = d.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        d.get(i).a(jSONObject);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(ch chVar) {
        if (chVar != null) {
            chVar.a(cn.a().b(UMGlobalContext.getAppContext()));
        }
    }

    public static void a(Context context) {
        b(context);
        cn.a().a(context);
    }

    public static void a(cj.a aVar) {
        if (aVar != null) {
            synchronized (h) {
                try {
                    if (!h.contains(aVar)) {
                        h.add(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            cj cjVar = g;
            if (cjVar != null) {
                cjVar.a(aVar);
            }
        }
    }

    public static void b(cj.a aVar) {
        if (aVar != null) {
            synchronized (h) {
                h.remove(aVar);
            }
            cj cjVar = g;
            if (cjVar != null) {
                cjVar.b(aVar);
            }
        }
    }

    public static Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("flag", String.valueOf(e));
        map.put("ts", String.valueOf(f));
        return map;
    }

    public static int b() {
        return e;
    }

    public static void a(String str, String str2, Bundle bundle) {
        UMRTLog.e("MobclickRT", "[ncc]: umc_cfg: call b a.");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String string = "";
            if (bundle != null) {
                try {
                    string = bundle.getString("ss");
                } catch (Throwable unused) {
                    return;
                }
            }
            String str3 = string;
            boolean z = true;
            e = 1;
            f = System.currentTimeMillis();
            long initCompleteTs = UMConfigure.getInitCompleteTs();
            if (initCompleteTs != 0 && System.currentTimeMillis() - initCompleteTs > 6000) {
                z = false;
            }
            boolean z2 = z;
            JSONObject jSONObjectA = cn.a().a(str, str2, str3, f, z2);
            if (jSONObjectA != null) {
                UMRTLog.e("MobclickRT", "[ncc]: umc_cfg: upload b a. cd_flag is " + z2);
                aw.a(new ar("https://cnlogs.umeng.com/ext_event", jSONObjectA), 0L, TimeUnit.SECONDS);
                Thread.sleep(2000L);
                return;
            }
            return;
        }
        UMRTLog.e("MobclickRT", "[ncc]: onActUpEvent: type or token agument is empty string, pls check!");
    }
}
