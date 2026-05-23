package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.be;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.r;
import com.umeng.ccg.CcgAgent;
import com.umeng.ccg.ConfigListener;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.UMInnerManager;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.SelfChecker;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.InfoPreferenceAgent;
import com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.i;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.commonsdk.vchannel.Sender;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class c implements UMLogDataProtocol {
    public static final String b = "preInitInvokedFlag";
    public static final String c = "policyGrantInvokedFlag";
    public static final String d = "policyGrantResult";
    private static int f = 1;
    private Context e;
    public static final String a = be.b().b("upg");
    private static Class<?> g = null;
    private static Method h = null;
    private static Method i = null;
    private static Method j = null;
    private static volatile String k = "";
    private static volatile String l = "";
    private static boolean m = false;

    static {
        c();
    }

    public c(Context context) {
        if (context != null) {
            this.e = context.getApplicationContext();
        }
    }

    public static String b() {
        Method method;
        if (!TextUtils.isEmpty(l)) {
            return l;
        }
        Class<?> cls = g;
        if (cls == null || (method = h) == null || j == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, null);
            if (objInvoke == null) {
                return "";
            }
            String str = (String) j.invoke(objInvoke, null);
            try {
                l = str;
                return str;
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static void c() {
        try {
            g = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", null);
            if (true) {
                h = declaredMethod;
            }
            Method declaredMethod2 = g.getDeclaredMethod("getZID", Context.class);
            if (true) {
                i = declaredMethod2;
            }
            Method declaredMethod3 = g.getDeclaredMethod("getSDKVersion", null);
            if (true) {
                j = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        bx bxVarA = bx.a(this.e);
        by byVarA = bxVarA.a("stf");
        if (byVarA != null) {
            UMRTLog.e("MobclickRT", "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = byVarA.a;
                String str2 = byVarA.b;
                JSONObject jSONObjectA = new com.umeng.commonsdk.statistics.b().a(this.e.getApplicationContext(), new JSONObject(byVarA.c), new JSONObject(byVarA.d), byVarA.e, str2, byVarA.f);
                if (jSONObjectA == null || !jSONObjectA.has("exception")) {
                    UMRTLog.e("MobclickRT", "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    UMRTLog.e("MobclickRT", "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                bxVarA.a("stf", str);
                bxVarA.b();
            } catch (Throwable unused) {
            }
        }
    }

    private void e() {
        if (m) {
            if (FieldManager.allow("header_device_oaid")) {
                return;
            }
            m = false;
        } else if (FieldManager.allow("header_device_oaid")) {
            m = true;
            a(this.e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    UMRTLog.e("MobclickRT", "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                    if (TextUtils.isEmpty(str)) {
                        UMRTLog.e("MobclickRT", "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = c.this.e.getSharedPreferences(i.a, 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(i.b, str);
                            editorEdit.commit();
                        }
                    } catch (Throwable unused) {
                    }
                    UMWorkDispatch.sendEvent(c.this.e, a.w, "preInitInvokedFlag".a(c.this.e).a(), null);
                }
            });
        }
    }

    private void f() {
        if (FieldManager.allow("header_device_oaid")) {
            m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.e);
            f++;
            UMRTLog.e("MobclickRT", "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
                @Override // com.umeng.commonsdk.utils.onMessageSendListener
                public void onMessageSend() {
                    if (c.this.e != null) {
                        UMWorkDispatch.sendEvent(c.this.e, a.x, "preInitInvokedFlag".a(c.this.e).a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            a(this.e, true);
        }
    }

    private void g() {
        if (f <= 0) {
            h();
            e(this.e);
        }
    }

    private void h() {
        UMRTLog.e("MobclickRT", "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.e)) {
            f(this.e);
            UMInnerManager.sendInnerPackage(this.e);
            if (!FieldManager.allow("ccg_switch") && SdkVersion.SDK_TYPE == 0 && UMUtils.isMainProgress(this.e)) {
                Context context = this.e;
                UMWorkDispatch.sendEvent(context, a.G, "preInitInvokedFlag".a(context).a(), null, 5000L);
            }
            Context context2 = this.e;
            UMWorkDispatch.sendEvent(context2, 8208, CoreProtocol.getInstance(context2), null);
            Context context3 = this.e;
            UMWorkDispatch.sendEvent(context3, a.t, "preInitInvokedFlag".a(context3).a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02e3  */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i2) throws JSONException, IllegalAccessException, InvocationTargetException {
        SharedPreferences.Editor editorEdit;
        ULog.i("walle", "[internal] workEvent");
        if (com.umeng.commonsdk.utils.c.a()) {
            if (32802 == i2) {
                UMRTLog.e("MobclickRT", "--->>> 静默模式：进入心跳处理逻辑!");
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jB = com.umeng.commonsdk.utils.c.b(this.e);
                boolean zE = com.umeng.commonsdk.utils.c.e(this.e);
                if (com.umeng.commonsdk.utils.c.a(jB, jCurrentTimeMillis, com.umeng.commonsdk.utils.c.a(this.e))) {
                    if (UMFrUtils.hasEnvelopeFile(this.e, UMLogDataProtocol.UMBusinessType.U_Silent)) {
                        UMRTLog.e("MobclickRT", "--->>> 静默心跳信封文件已存在，尝试发送之!");
                    } else {
                        UMRTLog.e("MobclickRT", "--->>> 构建静默心跳信封.");
                        b(this.e);
                    }
                    UMEnvelopeBuild.registerNetReceiver(this.e);
                }
                if (zE) {
                    return;
                }
                UMRTLog.i("MobclickRT", "--->>> send REBUILD_DB msg in silent mode.");
                Context context = this.e;
                UMWorkDispatch.sendEvent(context, 4357, CoreProtocol.getInstance(context), null, 2000L);
            }
            return;
        }
        boolean z = true;
        boolean z2 = false;
        try {
            switch (i2) {
                case a.f /* 32769 */:
                    ULog.i("walle", "[internal] workEvent send envelope");
                    UMInternalManagerAgent.class.getMethod("sendInternalEnvelopeByStateful2", Context.class).invoke(UMInternalManagerAgent.class, this.e);
                    break;
                case a.h /* 32771 */:
                    if (obj != null && (obj instanceof com.umeng.commonsdk.internal.utils.b)) {
                        JSONObject jSONObject = new JSONObject();
                        com.umeng.commonsdk.internal.utils.b bVar = (com.umeng.commonsdk.internal.utils.b) obj;
                        try {
                            jSONObject.put("le", bVar.a);
                            jSONObject.put("vol", bVar.b);
                            jSONObject.put("temp", bVar.c);
                            jSONObject.put("st", bVar.d);
                            jSONObject.put("ct", bVar.e);
                            jSONObject.put("ts", bVar.f);
                            break;
                        } catch (Throwable unused) {
                        }
                        String string = jSONObject.toString();
                        UMRTLog.i("MobclickRT", "battery info: " + string);
                        UMInternalUtilsAgent.class.getMethod("saveBattery", Context.class, String.class).invoke(UMInternalUtilsAgent.class, this.e, string);
                        break;
                    }
                    break;
                case a.l /* 32775 */:
                    InfoPreferenceAgent.class.getMethod("saveUA", Context.class, String.class).invoke(InfoPreferenceAgent.class, this.e, (String) obj);
                    break;
                case a.n /* 32777 */:
                    ULog.i("walle", "[internal] workEvent send envelope");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("i_sdk_v", a.e);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("inner", new JSONObject());
                    JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.e, jSONObject2, jSONObject3);
                    if (jSONObjectBuildEnvelopeWithExtHeader != null && !jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                        ULog.i("walle", "[internal] workEvent send envelope back, result is ok");
                        break;
                    }
                    break;
                case a.o /* 32779 */:
                    Sender.handleEvent(this.e, (com.umeng.commonsdk.vchannel.b) obj);
                    break;
                case a.p /* 32781 */:
                    if (!UMFrUtils.hasEnvelopeFile(this.e, UMLogDataProtocol.UMBusinessType.U_ZeroEnv)) {
                        UMRTLog.e("MobclickRT", "--->>> 构建零号报文");
                        a(this.e);
                    } else {
                        UMRTLog.e("MobclickRT", "--->>> 零号报文信封文件已存在，尝试发送之!");
                    }
                    break;
                case a.s /* 32784 */:
                    UMRTLog.e("MobclickRT", "--->>> 零号报文流程，接收到云控配置加载成功通知(成功收到零号报文应答)。");
                    f();
                    f--;
                    g();
                    UMUtils.saveSDKComponent();
                    break;
                case a.t /* 32785 */:
                    UMRTLog.e("MobclickRT", "--->>> [有状态]接收到消费二级缓存数据通知.");
                    if (!bx.a(this.e).c()) {
                        d();
                        if (!UMWorkDispatch.eventHasExist(a.t)) {
                            Context context2 = this.e;
                            UMWorkDispatch.sendEvent(context2, a.t, "preInitInvokedFlag".a(context2).a(), null);
                        }
                    } else {
                        UMRTLog.e("MobclickRT", "--->>> [有状态]已消费完毕,二级缓存数据库为空.");
                    }
                    break;
                case a.u /* 32786 */:
                    UMCrashManager.buildEnvelope(this.e, obj);
                    break;
                case a.v /* 32787 */:
                    UMRTLog.e("MobclickRT", "--->>> 触发2号仓遗留信封检查动作。");
                    String strA = com.umeng.commonsdk.stateless.d.a(this.e, false);
                    String strA2 = com.umeng.commonsdk.stateless.d.a(this.e, true);
                    if (!TextUtils.isEmpty(strA)) {
                        File file = new File(strA);
                        if (file.exists() && file.isDirectory()) {
                            z2 = true;
                        }
                    }
                    if (TextUtils.isEmpty(strA2)) {
                        z = z2;
                    } else {
                        File file2 = new File(strA2);
                        if (!file2.exists() || !file2.isDirectory()) {
                            z = z2;
                        }
                    }
                    if (!z) {
                        UMRTLog.e("MobclickRT", "--->>> 触发2号仓遗留信封检查，没有需要处理的目录，不需要处理。");
                    } else if (!com.umeng.commonsdk.stateless.b.a()) {
                        new com.umeng.commonsdk.stateless.b(this.e);
                        com.umeng.commonsdk.stateless.b.b();
                    } else {
                        UMRTLog.e("MobclickRT", "--->>> 触发2号仓遗留信封检查，Sender已创建，不需要处理。");
                    }
                    break;
                case a.w /* 32788 */:
                    UMRTLog.e("MobclickRT", "--->>> 云控下发参数更新，触发 伪冷启动。");
                    com.umeng.commonsdk.statistics.b.a();
                    e();
                    if (FieldManager.allow("header_foreground_count") && !UMWorkDispatch.eventHasExist()) {
                        UMRTLog.e("MobclickRT", "--->>> 云控下发参数更新 前台计数器功能 打开，触发 5秒周期检查机制");
                        Context context3 = this.e;
                        UMWorkDispatch.sendEventEx(context3, 8213, CoreProtocol.getInstance(context3), null, 5000L);
                    }
                    if (FieldManager.allow("header_first_resume")) {
                        UMRTLog.e("MobclickRT", "--->>> 云控下发参数更新 FirstResume功能 打开，触发 trigger");
                        o.a(this.e).b(this.e);
                    }
                    break;
                case a.x /* 32790 */:
                    UMRTLog.e("MobclickRT", "--->>> 成功接收到(OAID)读取结束通知。");
                    f--;
                    g();
                    break;
                case a.y /* 32791 */:
                    UMRTLog.e("MobclickRT", "--->>> 正常冷启动流程，接收到云控配置加载成功通知。");
                    UMInnerManager.sendInnerPackage(this.e);
                    if (!FieldManager.allow("ccg_switch") && SdkVersion.SDK_TYPE == 0 && UMUtils.isMainProgress(this.e)) {
                        Context context4 = this.e;
                        UMWorkDispatch.sendEvent(context4, a.G, "preInitInvokedFlag".a(context4).a(), null, 5000L);
                    }
                    e(this.e);
                    UMUtils.saveSDKComponent();
                    break;
                case a.z /* 32792 */:
                    UMRTLog.e("MobclickRT", "--->>> 保存隐私授权结果.");
                    if (obj instanceof Integer) {
                        int iIntValue = ((Integer) obj).intValue();
                        SharedPreferences sharedPreferences = this.e.getApplicationContext().getSharedPreferences(a, 0);
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putInt("policyGrantResult", iIntValue).commit();
                        }
                    }
                    break;
                case a.A /* 32793 */:
                    UMRTLog.e("MobclickRT", "--->>> 保存preInit执行结果及授权API是否调用结果.");
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject4 = (JSONObject) obj;
                        if (jSONObject4.has(a.J)) {
                            int i3 = jSONObject4.getInt(a.J);
                            int i4 = jSONObject4.getInt(a.K);
                            int i5 = jSONObject4.getInt("policyGrantResult");
                            SharedPreferences sharedPreferences2 = this.e.getApplicationContext().getSharedPreferences(a, 0);
                            if (sharedPreferences2 != null && (editorEdit = sharedPreferences2.edit()) != null) {
                                editorEdit.putInt("preInitInvokedFlag", i3);
                                editorEdit.putInt("policyGrantInvokedFlag", i4);
                                editorEdit.putInt("policyGrantResult", i5);
                                editorEdit.commit();
                            }
                            File file3 = new File(this.e.getFilesDir().getAbsolutePath() + File.separator + bz.m);
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                        }
                    }
                    break;
                case a.B /* 32800 */:
                    File file4 = new File(this.e.getFilesDir().getAbsolutePath() + File.separator + bz.m);
                    if (file4.exists()) {
                        file4.delete();
                    }
                    break;
                case a.C /* 32801 */:
                    SelfChecker.doCheck(this.e);
                    break;
                case a.E /* 32803 */:
                    ConnectivityManager connectivityManager = (ConnectivityManager) this.e.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        UMRTLog.e("MobclickRT", "--->>> ConnectivityManager is null!");
                        com.umeng.commonsdk.framework.a.a(false);
                        com.umeng.commonsdk.stateless.b.a(false);
                    } else {
                        try {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo == null) {
                                UMRTLog.e("MobclickRT", "--->>> NetworkInfo is null!");
                                com.umeng.commonsdk.framework.a.a(false);
                                com.umeng.commonsdk.stateless.b.a(false);
                                if (UMUtils.isMainProgress(this.e)) {
                                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 401, com.umeng.ccg.d.a(), null, 0L);
                                }
                            } else if (activeNetworkInfo.isAvailable()) {
                                UMRTLog.i("MobclickRT", "--->>> network state changed: Available");
                                com.umeng.commonsdk.framework.a.a(true);
                                com.umeng.commonsdk.stateless.b.a(true);
                                if (UMUtils.isMainProgress(this.e)) {
                                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 401, com.umeng.ccg.d.a(), null, 0L);
                                }
                            } else {
                                UMRTLog.i("MobclickRT", "--->>> network state changed: unAvailable");
                                com.umeng.commonsdk.framework.a.a(false);
                                com.umeng.commonsdk.stateless.b.a(false);
                            }
                        } catch (Throwable unused2) {
                            com.umeng.commonsdk.framework.a.a(false);
                            com.umeng.commonsdk.stateless.b.a(false);
                            return;
                        }
                    }
                    break;
                case a.F /* 32804 */:
                    d(this.e);
                    break;
                case a.G /* 32805 */:
                    UMRTLog.i("MobclickRT", "recv CLOUD_CONFIG_TRIGGER msg.");
                    CcgAgent.registerConfigListener(new ConfigListener() { // from class: com.umeng.commonsdk.internal.c.6
                        @Override // com.umeng.ccg.ConfigListener
                        public void onConfigReady(JSONObject jSONObject5) {
                            if (jSONObject5 == null) {
                                UMRTLog.i("MobclickRT", "onConfigReady: empty config!");
                                return;
                            }
                            UMRTLog.i("MobclickRT", "onConfigReady:" + jSONObject5.toString());
                            com.umeng.ccg.c.a(c.this.e, 201, com.umeng.ccg.d.a(), jSONObject5);
                        }
                    });
                    SharedPreferences sharedPreferencesA = av.a(this.e);
                    if (sharedPreferencesA != null) {
                        long j2 = sharedPreferencesA.getLong("cl_count", 0L);
                        if (j2 < 9223372036854775807L) {
                            j2++;
                        }
                        sharedPreferencesA.edit().putLong("cl_count", j2).commit();
                    }
                    CcgAgent.init(this.e);
                    break;
            }
        } catch (Throwable unused3) {
        }
    }

    public String a() {
        Method method;
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        Class<?> cls = g;
        if (cls == null || (method = h) == null || i == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, null);
            if (objInvoke == null) {
                return "";
            }
            String str = (String) i.invoke(objInvoke, this.e);
            try {
                k = str;
                return str;
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    private void b(Context context) {
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "umid", "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("umid"), strImprintProperty);
            JSONObject jSONObjectBuildSilentEnvelopeWithExtHeader = UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.SILENT_HEART_BEAT);
            if (jSONObjectBuildSilentEnvelopeWithExtHeader == null || !jSONObjectBuildSilentEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e("MobclickRT", "--->>> 构建心跳报文 成功!!!");
            } else {
                UMRTLog.e("MobclickRT", "--->>> 构建心跳报文失败.");
            }
        } catch (Throwable unused) {
        }
    }

    private void a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("app_version"), UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(com.umeng.commonsdk.statistics.b.a("os"), "Android");
            JSONObject jSONObjectBuildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (jSONObjectBuildZeroEnvelopeWithExtHeader == null || !jSONObjectBuildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.e("MobclickRT", "--->>> 构建零号报文 成功!!!");
            } else {
                UMRTLog.e("MobclickRT", "--->>> 构建零号报文失败.");
            }
        } catch (Throwable unused) {
        }
    }

    private void e(Context context) {
        Object objInvoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> clsA = a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = clsA.getDeclaredMethod("getInstance", null);
            if (false || (objInvoke = declaredMethod2.invoke(clsA, null)) == null || (declaredMethod = clsA.getDeclaredMethod("init", Context.class, String.class, a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(objInvoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }

    private static void c(final Context context) {
        if (FieldManager.allow("header_device_oaid")) {
            a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(i.a, 0);
                        if (sharedPreferences == null || sharedPreferences.getString(i.b, "").equalsIgnoreCase(str)) {
                            return;
                        }
                        UMRTLog.e("MobclickRT", "--->>> 更新本地缓存OAID");
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(i.b, str);
                        editorEdit.commit();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static void f(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + bz.l);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    public static void a(final Context context, final boolean z) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(i.a, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = bg.a(context);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(strA) && sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(i.c, (jCurrentTimeMillis2 - jCurrentTimeMillis) + "");
                        editorEdit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString(i.b, strA);
                        editorEdit2.commit();
                        UMRTLog.i("MobclickRT", "[ncc]: write oaid to sp complete.");
                    }
                    if (DeviceConfig.isHonorDevice() && sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                        editorEdit3.putString("key_umeng_sp_honor_oaid", strA);
                        editorEdit3.commit();
                        UMRTLog.i("MobclickRT", "[ncc]: write oaid to sp complete.");
                    }
                    if (z) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    private void d(Context context) {
        long jLongValue;
        long jLongValue2;
        if (context == null) {
            return;
        }
        String str = AnalyticsConfig.RTD_SP_FILE;
        String strA = com.umeng.common.b.a(context, str, "debugkey");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        String strA2 = com.umeng.common.b.a(context, str, "startTime");
        String strA3 = com.umeng.common.b.a(context, str, "period");
        if (TextUtils.isEmpty(strA2)) {
            jLongValue = 0;
        } else {
            try {
                jLongValue = Long.valueOf(strA2).longValue();
            } catch (Throwable unused) {
                jLongValue = 0;
            }
        }
        if (TextUtils.isEmpty(strA3)) {
            jLongValue2 = 0;
        } else {
            try {
                jLongValue2 = Long.valueOf(strA3).longValue();
            } catch (Throwable unused2) {
                jLongValue2 = 0;
            }
        }
        if (jLongValue == 0 || jLongValue2 == 0) {
            UMRTLog.i("MobclickRT", "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据");
            com.umeng.common.b.a(context, AnalyticsConfig.RTD_SP_FILE);
            return;
        }
        if (System.currentTimeMillis() - jLongValue > jLongValue2 * 60000) {
            UMRTLog.i("MobclickRT", "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。");
            com.umeng.common.b.a(context, AnalyticsConfig.RTD_SP_FILE);
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                AnalyticsConfig.turnOffRealTimeDebug();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("debugkey", strA);
        if (AnalyticsConfig.isRealTimeDebugMode()) {
            return;
        }
        UMRTLog.i("MobclickRT", "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。");
        AnalyticsConfig.turnOnRealTimeDebug(map);
    }

    private static void a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String strA = bg.a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(strA);
                }
            }
        }).start();
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }
}
