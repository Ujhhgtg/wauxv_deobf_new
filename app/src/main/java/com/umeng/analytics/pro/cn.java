package com.umeng.analytics.pro;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.cj;
import com.umeng.analytics.pro.cm;
import com.umeng.analytics.pro.cx;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class cn implements cm.a {
    private static final String a = "newver";
    private static final String j = ".um_ncc_init_beacon_987654321";
    private static final String k = ".um_ncc_local_config";
    private volatile String b = "";
    private static Map<String, ArrayList<co>> c = new HashMap();
    private static int d = 0;
    private static ArrayList<ArrayList<co>> e = new ArrayList<>();
    private static volatile int f = -1;
    private static volatile boolean g = false;
    private static volatile boolean h = false;
    private static final Object i = new Object();
    private static volatile JSONObject l = null;
    private static final Object m = new Object();

    /* JADX INFO: compiled from: obf */
    public class a {
        public String a;
        public int b;
        public int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class b {
        private static final cn a = new cn();

        private b() {
        }
    }

    public static cn a() {
        return b.a;
    }

    private void c(Context context) {
        try {
            if (new File(context.getFilesDir(), ".um_ncc_init_beacon_987654321").exists()) {
                f = 0;
                UMRTLog.i("MobclickRT", "[ncc]: Beacon file exists, work mode set to init dispatch");
            } else {
                f = 1;
                UMRTLog.i("MobclickRT", "[ncc]: Beacon file not exists, work mode set to foreground dispatch (default)");
            }
        } catch (Throwable th) {
            f = 1;
            UMRTLog.e("MobclickRT", "[ncc]: Error checking beacon file, work mode set to foreground dispatch (default): " + th.getMessage());
        }
    }

    private void d(Context context) {
        try {
            File file = new File(context.getFilesDir(), ".um_ncc_init_beacon_987654321");
            if (file.exists()) {
                return;
            }
            file.createNewFile();
            UMRTLog.i("MobclickRT", "[ncc]: Beacon file created");
        } catch (Throwable th) {
            UMRTLog.e("MobclickRT", "[ncc]: Error creating beacon file: " + th.getMessage());
        }
    }

    private void e(Context context) {
        try {
            File file = new File(context.getFilesDir(), ".um_ncc_init_beacon_987654321");
            if (file.exists()) {
                file.delete();
                UMRTLog.i("MobclickRT", "[ncc]: Beacon file deleted");
            }
        } catch (Throwable th) {
            UMRTLog.e("MobclickRT", "[ncc]: Error deleting beacon file: " + th.getMessage());
        }
    }

    private void f(Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback("newver", new UMImprintChangeCallback() { // from class: com.umeng.analytics.pro.cn.4
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                cm.a(UMGlobalContext.getAppContext(), 107, cn.a(), str2);
            }
        });
    }

    public void b() {
        g = true;
        UMRTLog.i("MobclickRT", "[ncc]: App switched to foreground");
        if (f != 1) {
            if (f == -1) {
                f = 1;
                UMRTLog.i("MobclickRT", "[ncc]: Work mode set to foreground dispatch");
                return;
            }
            return;
        }
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext == null) {
            synchronized (i) {
                h = false;
            }
            return;
        }
        synchronized (m) {
            if (l == null) {
                synchronized (i) {
                    h = false;
                }
            }
            synchronized (i) {
                if (h) {
                    UMRTLog.i("MobclickRT", "[ncc]: Foreground processing is already in progress, ignore new foreground event");
                } else {
                    h = true;
                    cm.a(appContext, 203, a(), l);
                }
            }
        }
    }

    public void a(final Context context) {
        c(context);
        ck.a(new cg() { // from class: com.umeng.analytics.pro.cn.1
            @Override // com.umeng.analytics.pro.cg
            public void a(JSONObject jSONObject) {
                if (jSONObject == null) {
                    UMRTLog.i("MobclickRT", "[ncc]: onConfigReady: empty config!");
                    return;
                }
                UMRTLog.i("MobclickRT", "[ncc]: onConfigReady:" + jSONObject);
                cm.a(context, 201, cn.a(), jSONObject, 3000L);
            }
        });
        if (f == 1) {
            ck.a(new cj.a() { // from class: com.umeng.analytics.pro.cn.2
                @Override // com.umeng.analytics.pro.cj.a
                public void a() {
                    cn.this.b();
                }

                @Override // com.umeng.analytics.pro.cj.a
                public void b() {
                    cn.this.c();
                }
            });
        }
    }

    private boolean a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("code")) {
            return false;
        }
        try {
            return 200 == jSONObject.optInt("code") && jSONObject.has("status") && jSONObject.has("data");
        } catch (Throwable unused) {
            return false;
        }
    }

    private JSONObject d() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ay.b(UMUtils.genUmc(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ay.a(byteArray, UMUtils.genSin());
            String str = new String(byteArray);
            byteArrayOutputStream.reset();
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private synchronized void a(Context context, JSONObject jSONObject, String str) {
        try {
            if (context == null) {
                UMRTLog.e("MobclickRT", "[ncc]: saveConfigFile: context is null!");
                return;
            }
            if (jSONObject == null) {
                UMRTLog.e("MobclickRT", "[ncc]: saveConfigFile: config is null!");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                UMRTLog.e("MobclickRT", "[ncc]: saveConfigFile: version is empty!");
                return;
            }
            long j2 = Long.parseLong(str);
            byte[] bArrA = ay.a(jSONObject.toString().getBytes(), UMConfigure.sAppkey.getBytes());
            if (bArrA != null && bArrA.length > 1) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), ".um_ncc_local_config"));
                try {
                    fileOutputStream.write(bArrA);
                    fileOutputStream.flush();
                    at.a(fileOutputStream);
                    a(context, j2);
                    UMRTLog.i("MobclickRT", "[ncc]: saveConfigFile success.");
                } catch (Throwable th) {
                    at.a(fileOutputStream);
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void c() {
        UMRTLog.i("MobclickRT", "[ncc]: App switched to background");
    }

    public synchronized JSONObject b(Context context) {
        FileInputStream fileInputStreamOpenFileInput;
        JSONObject jSONObject = null;
        try {
            if (!new File(context.getFilesDir(), ".um_ncc_local_config").exists()) {
                return null;
            }
            try {
                fileInputStreamOpenFileInput = context.openFileInput(".um_ncc_local_config");
                try {
                    JSONObject jSONObject2 = new JSONObject(new String(ay.a(HelperUtils.readStreamToByteArray(fileInputStreamOpenFileInput), UMConfigure.sAppkey.getBytes())));
                    try {
                        at.a(fileInputStreamOpenFileInput);
                    } catch (Throwable unused) {
                    }
                    jSONObject = jSONObject2;
                } catch (Throwable unused2) {
                    at.a(fileInputStreamOpenFileInput);
                }
            } catch (Throwable unused3) {
                fileInputStreamOpenFileInput = null;
            }
        } catch (Throwable unused4) {
        }
        return jSONObject;
    }

    private co a(cx cxVar, cx.b bVar) {
        int i2;
        long j2;
        if (bVar == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new cq(bVar.d()));
            if (bVar.a() != null && !bVar.a().isEmpty()) {
                arrayList.add(new cw(new HashSet(bVar.a())));
            }
            if (bVar.c() != null && !bVar.c().isEmpty()) {
                arrayList.add(new cr(new HashSet(bVar.c())));
            }
            if (bVar.e() != null && bVar.f() != null) {
                arrayList.add(new cv(bVar.e(), bVar.f()));
            }
            String strA = cxVar.e().a();
            if (!TextUtils.isEmpty(strA)) {
                try {
                    i2 = Integer.parseInt(strA);
                } catch (NumberFormatException unused) {
                    i2 = 0;
                }
                arrayList.add(new ct(i2));
            }
            if (bVar.g() != null) {
                try {
                    j2 = Long.parseLong(bVar.g());
                } catch (NumberFormatException unused2) {
                    j2 = 0;
                }
                arrayList.add(new cs(bVar.h(), j2));
            }
            return new co(bVar.h(), arrayList);
        } catch (Throwable th) {
            UMRTLog.e("MobclickRT", "[ncc]: buildAction error: " + th.getMessage());
            return null;
        }
    }

    private void b(String str) {
        long j2;
        List<cx.b> listE = null;
        try {
            synchronized (m) {
                try {
                    cx cxVarA = cx.a(l);
                    if (!a(cxVarA)) {
                        UMRTLog.e("MobclickRT", "[ncc]: updateActionExecTime: parse ConfigData error. abort update.");
                        return;
                    }
                    listE = cxVarA.e().e();
                    if (listE != null) {
                        for (cx.b bVar : listE) {
                            if (str.equals(bVar.h())) {
                                if (bVar.g() != null) {
                                    try {
                                        j2 = Long.parseLong(bVar.g());
                                    } catch (NumberFormatException unused) {
                                        j2 = 0;
                                    }
                                    new cs(str, j2).d();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused2) {
        }
    }

    private void a(Context context, long j2) {
        if (j2 > 0) {
            try {
                SharedPreferences sharedPreferencesA = cz.a(context);
                if (sharedPreferencesA != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                    editorEdit.putLong("config_ts", j2);
                    editorEdit.apply();
                    UMRTLog.i("MobclickRT", "[ncc]: updateVersion : ts = " + j2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(cx.a aVar, ArrayList<co> arrayList) {
        int i2;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i3 = 20;
            if (aVar != null) {
                try {
                    String strB = aVar.b();
                    String strC = aVar.c();
                    try {
                        i2 = Integer.parseInt(strB);
                        try {
                            i3 = Integer.parseInt(strC);
                        } catch (NumberFormatException unused) {
                        }
                    } catch (NumberFormatException unused2) {
                        i2 = 1;
                    }
                } catch (Throwable th) {
                    UMRTLog.e("MobclickRT", "[ncc]: processActions error: " + th.getMessage());
                    if (f == 1) {
                        synchronized (i) {
                            h = false;
                            return;
                        }
                    }
                    return;
                }
            } else {
                i2 = 1;
            }
            int size = arrayList.size();
            int iCeil = (int) Math.ceil(((double) size) / ((double) i2));
            if (iCeil > 0) {
                int iMin = Math.min(i2, size);
                ArrayList<co> arrayList2 = new ArrayList<>();
                for (int i4 = 0; i4 < iMin; i4++) {
                    arrayList2.add(arrayList.get(i4));
                }
                if (f == 1) {
                    d = 0;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("batch_");
                int i5 = d + 1;
                d = i5;
                sb.append(i5);
                String string = sb.toString();
                c.put(string, arrayList2);
                a(arrayList, i2, iCeil);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("batchId", string);
                jSONObject.put("appsPerBatch", i2);
                jSONObject.put("batchInterval", i3);
                jSONObject.put("processedCount", 0);
                jSONObject.put("currentBatchIndex", 0);
                jSONObject.put("totalBatches", iCeil);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("batchParams", jSONObject);
                jSONObject2.put("currentIndex", 0);
                cm.a(UMGlobalContext.getAppContext(), 204, a(), jSONObject2);
                return;
            }
            if (f == 1) {
                synchronized (i) {
                    h = false;
                }
                return;
            }
            return;
        }
        if (f == 1) {
            synchronized (i) {
                h = false;
            }
        }
    }

    private void a(ArrayList<co> arrayList, int i2, int i3) {
        e.clear();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * i2;
            int iMin = Math.min(i5 + i2, arrayList.size());
            ArrayList<co> arrayList2 = new ArrayList<>();
            while (i5 < iMin) {
                arrayList2.add(arrayList.get(i5));
                i5++;
            }
            e.add(arrayList2);
        }
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        UMRTLog.i("MobclickRT", "[ncc]: checkFetchCondition: online version = " + str);
        try {
            long j2 = Long.parseLong(str);
            if (!TextUtils.isEmpty(this.b) && this.b.equalsIgnoreCase(str)) {
                UMRTLog.i("MobclickRT", "[ncc]: local cache version == online version, ignore.");
                return;
            }
            SharedPreferences sharedPreferencesA = cz.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                long j3 = sharedPreferencesA.getLong("config_ts", 0L);
                if (j3 != j2) {
                    this.b = str;
                    UMRTLog.i("MobclickRT", "[ncc]: local version != online version, send FETCH_NEW_CONFIG msg. local version = " + j3);
                    cm.a(UMGlobalContext.getAppContext(), 101, a(), str, 5000L);
                    return;
                }
                this.b = str;
                UMRTLog.i("MobclickRT", "[ncc]: local version == online version, ignore.");
            }
        } catch (Throwable unused) {
        }
    }

    private JSONObject a(String str, int i2, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", "$$_umc_ev1");
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("tt", str);
            jSONObject.put("mock", i2);
            jSONObject.put("result", i3);
            JSONObject jSONObjectA = ap.a(UMGlobalContext.getAppContext(), new JSONArray("[\"uapp\"]"), "uapp");
            jSONObjectA.put("wkMode", f);
            JSONObject jSONObjectA2 = ap.a(UMGlobalContext.getAppContext(), jSONObject);
            if (jSONObjectA2 != null) {
                return ap.a(jSONObjectA, jSONObjectA2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public JSONObject a(String str, String str2, String str3, long j2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", "$$_umc_ev2");
            jSONObject.put("ts", j2);
            jSONObject.put("tt", str);
            jSONObject.put("flag", str2);
            jSONObject.put("ss", str3);
            if (z) {
                jSONObject.put("cd", 1);
            } else {
                jSONObject.put("cd", 0);
            }
            JSONObject jSONObjectA = ap.a(UMGlobalContext.getAppContext(), new JSONArray(), "");
            JSONObject jSONObjectA2 = ap.a(UMGlobalContext.getAppContext(), jSONObject);
            if (jSONObjectA == null || jSONObjectA2 == null) {
                return null;
            }
            return ap.a(jSONObjectA, jSONObjectA2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    private void a(Context context, String str, JSONObject jSONObject) {
        Object objA;
        try {
            final String strOptString = jSONObject.has("actionName") ? jSONObject.optString("actionName") : "";
            if (TextUtils.isEmpty(strOptString)) {
                UMRTLog.i("MobclickRT", "--->>>[ncc]: target is empty, ignore umc_cfg process");
                return;
            }
            final int iOptInt = jSONObject.has("mock") ? jSONObject.optInt("mock") : 0;
            if (iOptInt == 0) {
                JSONObject jSONObjectD = d();
                if (jSONObjectD == null || (objA = ax.a(jSONObjectD.optString("c"), jSONObjectD.optString("s"), new Class[]{String.class}, context, new Object[]{jSONObjectD.optString("a")})) == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("ss", Base64.encodeToString(ay.a(DeviceConfig.getPackageName(context).getBytes(), UMUtils.genSin()), 0).trim());
                ax.a(jSONObjectD.optString("m"), jSONObjectD.optString("x"), new Class[]{String.class, String.class, String[].class, Bundle.class, Activity.class, ax.a(jSONObjectD.optString("z")), Handler.class}, objA, new Object[]{strOptString, "u20@24m_PS_DK_ANA", null, bundle, null, new AccountManagerCallback<Bundle>() { // from class: com.umeng.analytics.pro.cn.3
                    @Override // android.accounts.AccountManagerCallback
                    public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
                        int i2 = 1;
                        try {
                            accountManagerFuture.getResult();
                            i2 = 0;
                            UMRTLog.i("MobclickRT", "--->>> [ncc]: umc_cfg p s!");
                        } catch (Throwable unused) {
                            UMRTLog.i("MobclickRT", "--->>> [ncc]: umc_cfg p f!");
                        }
                        cm.a(UMGlobalContext.getAppContext(), 305, cn.a(), cn.this.new a(strOptString, 0, i2));
                    }
                }, null});
                return;
            }
            JSONObject jSONObjectA = a(strOptString, iOptInt, 0);
            if (jSONObjectA != null) {
                aw.a(new ar("https://cnlogs.umeng.com/ext_event", jSONObjectA), 0L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean a(cx cxVar) {
        if (cxVar.a() == 200 && cxVar.e() != null) {
            if (TextUtils.isEmpty(cxVar.c())) {
                UMRTLog.e("MobclickRT", "[ncc]: invalid config version.");
                return false;
            }
            cx.a aVarE = cxVar.e();
            if (aVarE == null) {
                UMRTLog.e("MobclickRT", "[ncc]: config data is null.");
                return false;
            }
            List<cx.b> listE = aVarE.e();
            if (listE != null && !listE.isEmpty()) {
                return true;
            }
            UMRTLog.e("MobclickRT", "[ncc]: targets is empty");
            return false;
        }
        UMRTLog.e("MobclickRT", "[ncc]: invalid config file.");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v123 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v21, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    @Override // com.umeng.analytics.pro.cm.a
    public void a(Object obj, int i2) {
        String str;
        int i3;
        JSONObject jSONObjectOptJSONObject;
        int i4;
        Context appContext;
        try {
            if (i2 != 305) {
                JSONObject jSONObjectB = null;
                switch (i2) {
                    case 101:
                        if (obj == null || !(obj instanceof String)) {
                            return;
                        }
                        JSONObject jSONObjectB2 = ap.b(UMGlobalContext.getAppContext(), (String) obj);
                        if (jSONObjectB2 != null) {
                            UMRTLog.i("MobclickRT", "[ncc] send request. body: " + jSONObjectB2);
                            aw.a(new cy("https://ulogs.umeng.com/push_cloud_activation", jSONObjectB2), 0L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    case 102:
                        UMRTLog.i("MobclickRT", "[ncc]: recv FETCH_RESPONSE msg.");
                        if (obj != null && (obj instanceof JSONObject)) {
                            JSONObject jSONObjectOptJSONObject2 = ((JSONObject) obj).optJSONObject("config");
                            if (a(jSONObjectOptJSONObject2)) {
                                cm.a(UMGlobalContext.getAppContext(), 103, a(), jSONObjectOptJSONObject2);
                                return;
                            } else {
                                cm.a(UMGlobalContext.getAppContext(), 104, a(), null);
                                return;
                            }
                        }
                        cm.a(UMGlobalContext.getAppContext(), 104, a(), null);
                        return;
                    case 103:
                        UMRTLog.i("MobclickRT", "[ncc]: recv FETCH_SUCCESS msg.");
                        Context appContext2 = UMGlobalContext.getAppContext();
                        if (obj == null || !(obj instanceof JSONObject)) {
                            return;
                        }
                        JSONObject jSONObject = (JSONObject) obj;
                        String strOptString = jSONObject.optString("version");
                        if (!TextUtils.isEmpty(strOptString)) {
                            a(appContext2, jSONObject, strOptString);
                            return;
                        } else {
                            UMRTLog.e("MobclickRT", "[ncc]: version field missing.");
                            return;
                        }
                    case 104:
                        UMRTLog.i("MobclickRT", "[ncc]: recv FETCH_FAILED msg.");
                        return;
                    case 105:
                        Object jSONObject2 = "[ncc]: recv LOAD_CONFIG msg.";
                        UMRTLog.i("MobclickRT", "[ncc]: recv LOAD_CONFIG msg.");
                        try {
                            try {
                                jSONObjectB = b(UMGlobalContext.getAppContext());
                                if (jSONObjectB == null || (jSONObject2 = a(jSONObjectB)) == 0) {
                                    i3 = 0;
                                } else {
                                    i3 = 1;
                                }
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("result", i3);
                                if (jSONObjectB != null) {
                                    str = "config";
                                    jSONObject2 = jSONObject2;
                                    jSONObject2.put("config", jSONObjectB);
                                }
                            } catch (Throwable unused) {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("result", (Object) 0);
                                if (jSONObjectB != null) {
                                    str = "config";
                                    jSONObject2 = jSONObject2;
                                }
                            }
                            break;
                        } catch (Throwable unused2) {
                        }
                        cm.a(UMGlobalContext.getAppContext(), 106, a(), jSONObject2);
                        return;
                    case 106:
                        boolean z = false;
                        if (obj == null || !(obj instanceof JSONObject)) {
                            return;
                        }
                        JSONObject jSONObject3 = (JSONObject) obj;
                        if (jSONObject3.has("result") && (jSONObject3.optInt("result") & 1) != 0) {
                            if (jSONObject3.has("config") && (jSONObjectOptJSONObject = jSONObject3.optJSONObject("config")) != null) {
                                ck.b(jSONObjectOptJSONObject);
                                z = true;
                            }
                            if (!z) {
                                ck.b((JSONObject) null);
                            }
                        }
                        f(UMGlobalContext.getAppContext());
                        String strImprintProperty = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), "newver", "");
                        UMRTLog.i("MobclickRT", "[ncc]: manual check imprint newver value: " + strImprintProperty);
                        a(strImprintProperty);
                        return;
                    case 107:
                        UMRTLog.i("MobclickRT", "[ncc]: recv IMPRINT_NEWVER_CHANGED msg.");
                        if (obj != null) {
                            try {
                                if (obj instanceof String) {
                                    String str2 = (String) obj;
                                    UMRTLog.i("MobclickRT", "[ncc]: newver value changed newver : ".concat(str2));
                                    a(str2);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                UMRTLog.e("MobclickRT", "[imprint] process error " + th.getMessage());
                                return;
                            }
                        }
                        return;
                    default:
                        switch (i2) {
                            case 201:
                                try {
                                    UMRTLog.i("MobclickRT", "[ncc]: recv PARSE_CONFIG msg.");
                                    if (obj == null || !(obj instanceof JSONObject)) {
                                        return;
                                    }
                                    JSONObject jSONObject4 = (JSONObject) obj;
                                    if ((jSONObject4.has("status") ? jSONObject4.optInt("status") : 1) == 1) {
                                        UMRTLog.i("MobclickRT", "[ncc]: status is 1, don't dispatch.");
                                        return;
                                    }
                                    if (jSONObject4.has("data")) {
                                        JSONObject jSONObjectOptJSONObject3 = jSONObject4.optJSONObject("data");
                                        if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.length() > 0) {
                                            if (jSONObjectOptJSONObject3.has("actWhen")) {
                                                try {
                                                    if (Integer.parseInt(jSONObjectOptJSONObject3.optString("actWhen", "1")) == 0) {
                                                        Context appContext3 = UMGlobalContext.getAppContext();
                                                        if (appContext3 != null) {
                                                            d(appContext3);
                                                        }
                                                        UMRTLog.i("MobclickRT", "[ncc]: Init dispatch mode, beacon file will be created");
                                                    } else {
                                                        Context appContext4 = UMGlobalContext.getAppContext();
                                                        if (appContext4 != null) {
                                                            e(appContext4);
                                                        }
                                                        UMRTLog.i("MobclickRT", "[ncc]: Foreground dispatch mode, beacon file will be deleted");
                                                    }
                                                } catch (NumberFormatException unused3) {
                                                    Context appContext5 = UMGlobalContext.getAppContext();
                                                    if (appContext5 != null) {
                                                        e(appContext5);
                                                    }
                                                    UMRTLog.i("MobclickRT", "[ncc]: Foreground dispatch mode (default), beacon file will be deleted");
                                                }
                                            } else {
                                                Context appContext6 = UMGlobalContext.getAppContext();
                                                if (appContext6 != null) {
                                                    e(appContext6);
                                                }
                                                UMRTLog.i("MobclickRT", "[ncc]: Foreground dispatch mode (default), beacon file will be deleted");
                                            }
                                            synchronized (m) {
                                                try {
                                                    l = jSONObject4;
                                                    if (f == 0 && l != null) {
                                                        cm.a(UMGlobalContext.getAppContext(), 202, a(), l, 2000L);
                                                    }
                                                    if (f == 1 && g && l != null) {
                                                        synchronized (i) {
                                                            try {
                                                                if (!h && (appContext = UMGlobalContext.getAppContext()) != null) {
                                                                    h = true;
                                                                    UMRTLog.i("MobclickRT", "[ncc]: Supplement sending PROCESS_WHEN_TO_FRONT msg after PARSE_CONFIG");
                                                                    cm.a(appContext, 203, a(), l);
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                                break;
                                            }
                                            return;
                                        }
                                        UMRTLog.i("MobclickRT", "[ncc]: empty config value, don't dispatch.");
                                        return;
                                    }
                                    UMRTLog.i("MobclickRT", "[ncc]: no data field, don't dispatch.");
                                    return;
                                } catch (Throwable th4) {
                                    UMRTLog.e("MobclickRT", "[ncc]: PARSE_CONFIG error: " + th4.getMessage());
                                    return;
                                }
                            case 202:
                                try {
                                    UMRTLog.i("MobclickRT", "[ncc]: recv PROCESS_WHEN_INIT msg.");
                                    if (!com.umeng.ccg.b.a("umc_cfg")) {
                                        UMRTLog.i("MobclickRT", "[ncc]: Local switch of [umc_cfg] is off, ignore this command.");
                                        return;
                                    }
                                    if (f != 0) {
                                        UMRTLog.i("MobclickRT", "[ncc]: Work mode is not init dispatch, ignore PROCESS_WHEN_INIT");
                                        return;
                                    }
                                    int iB = ck.b();
                                    if (iB > 0) {
                                        UMRTLog.i("MobclickRT", "[ncc]: Ignore act up action because act up flag value is: " + iB);
                                        return;
                                    }
                                    if (obj instanceof JSONObject) {
                                        cx cxVarA = cx.a((JSONObject) obj);
                                        if (!a(cxVarA)) {
                                            UMRTLog.i("MobclickRT", "[ncc]: invalid config data, just stop dispatch.");
                                            return;
                                        }
                                        if (cxVarA.d() == 1) {
                                            UMRTLog.i("MobclickRT", "[ncc]: config status is 1, not allow dispatch when INIT");
                                            return;
                                        }
                                        cx.a aVarE = cxVarA.e();
                                        if (aVarE == null) {
                                            UMRTLog.i("MobclickRT", "[ncc]: config data is null when INIT, just stop dispatch.");
                                            return;
                                        }
                                        ArrayList<co> arrayList = new ArrayList<>();
                                        Iterator<cx.b> it = cxVarA.e().e().iterator();
                                        while (it.hasNext()) {
                                            co coVarA = a(cxVarA, it.next());
                                            if (coVarA != null) {
                                                arrayList.add(coVarA);
                                            }
                                        }
                                        if (arrayList.isEmpty()) {
                                            return;
                                        }
                                        a(aVarE, arrayList);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th5) {
                                    UMRTLog.e("MobclickRT", "[ncc]: PROCESS_WHEN_INIT error: " + th5.getMessage());
                                    return;
                                }
                            case 203:
                                UMRTLog.i("MobclickRT", "[ncc]: recv PROCESS_WHEN_TO_FRONT msg.");
                                if (!com.umeng.ccg.b.a("umc_cfg")) {
                                    UMRTLog.i("MobclickRT", "[ncc]: Local switch of [umc_cfg] is off, ignore this command.");
                                    return;
                                }
                                int iB2 = ck.b();
                                if (iB2 > 0) {
                                    UMRTLog.i("MobclickRT", "[ncc]: Ignore act up action because act up flag value is: " + iB2);
                                    return;
                                }
                                if (f != 1) {
                                    UMRTLog.i("MobclickRT", "[ncc]: Work mode is not foreground dispatch, ignore PROCESS_WHEN_TO_FRONT");
                                    synchronized (i) {
                                        h = false;
                                        break;
                                    }
                                    return;
                                }
                                try {
                                    if (obj instanceof JSONObject) {
                                        cx cxVarA2 = cx.a((JSONObject) obj);
                                        if (!a(cxVarA2)) {
                                            UMRTLog.i("MobclickRT", "[ncc]: invalid config data, just stop dispatch.");
                                            return;
                                        }
                                        if (cxVarA2.d() == 1) {
                                            UMRTLog.i("MobclickRT", "[ncc]: config status is 1, not allow dispatch when foreground");
                                            return;
                                        }
                                        cx.a aVarE2 = cxVarA2.e();
                                        if (aVarE2 == null) {
                                            UMRTLog.i("MobclickRT", "[ncc]: config data is null when to foreground");
                                            return;
                                        }
                                        List<cx.b> listE = aVarE2.e();
                                        if (listE != null && !listE.isEmpty()) {
                                            ArrayList<co> arrayList2 = new ArrayList<>();
                                            Iterator<cx.b> it2 = listE.iterator();
                                            while (it2.hasNext()) {
                                                co coVarA2 = a(cxVarA2, it2.next());
                                                if (coVarA2 != null) {
                                                    arrayList2.add(coVarA2);
                                                }
                                            }
                                            if (arrayList2.isEmpty()) {
                                                return;
                                            }
                                            a(aVarE2, arrayList2);
                                            return;
                                        }
                                        UMRTLog.i("MobclickRT", "[ncc]: targets is empty when to foreground");
                                        return;
                                    }
                                    return;
                                } catch (Throwable th6) {
                                    UMRTLog.e("MobclickRT", "[ncc]: PROCESS_WHEN_TO_FRONT error: " + th6.getMessage());
                                    return;
                                }
                            case 204:
                                try {
                                    UMRTLog.i("MobclickRT", "[ncc]: recv PROCESS_ONE_TASK msg.");
                                    if (obj instanceof JSONObject) {
                                        JSONObject jSONObject5 = (JSONObject) obj;
                                        int iOptInt = jSONObject5.optInt("currentIndex", 0);
                                        JSONObject jSONObjectOptJSONObject4 = jSONObject5.optJSONObject("batchParams");
                                        if (jSONObjectOptJSONObject4 == null) {
                                            UMRTLog.e("MobclickRT", "[ncc]: batchParams is null");
                                            return;
                                        }
                                        String strOptString2 = jSONObjectOptJSONObject4.optString("batchId");
                                        int iOptInt2 = jSONObjectOptJSONObject4.optInt("appsPerBatch", 1);
                                        int iOptInt3 = jSONObjectOptJSONObject4.optInt("batchInterval", 20);
                                        int iOptInt4 = jSONObjectOptJSONObject4.optInt("processedCount", 0);
                                        int iOptInt5 = jSONObjectOptJSONObject4.optInt("currentBatchIndex", 0);
                                        int iOptInt6 = jSONObjectOptJSONObject4.optInt("totalBatches", 1);
                                        ArrayList<co> arrayList3 = c.get(strOptString2);
                                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                                            if (iOptInt >= arrayList3.size()) {
                                                i4 = iOptInt4;
                                                UMRTLog.i("MobclickRT", "[ncc]: batch processing completed for batchId: " + strOptString2);
                                                c.remove(strOptString2);
                                                int i5 = iOptInt5 + 1;
                                                if (i5 < iOptInt6) {
                                                    if (i5 < e.size()) {
                                                        ArrayList<co> arrayList4 = e.get(i5);
                                                        StringBuilder sb = new StringBuilder("batch_");
                                                        int i6 = d + 1;
                                                        d = i6;
                                                        sb.append(i6);
                                                        String string = sb.toString();
                                                        c.put(string, arrayList4);
                                                        JSONObject jSONObject6 = new JSONObject();
                                                        jSONObject6.put("batchId", string);
                                                        jSONObject6.put("appsPerBatch", iOptInt2);
                                                        jSONObject6.put("batchInterval", iOptInt3);
                                                        jSONObject6.put("processedCount", 0);
                                                        jSONObject6.put("currentBatchIndex", i5);
                                                        jSONObject6.put("totalBatches", iOptInt6);
                                                        JSONObject jSONObject7 = new JSONObject();
                                                        jSONObject7.put("batchParams", jSONObject6);
                                                        jSONObject7.put("currentIndex", 0);
                                                        cm.a(UMGlobalContext.getAppContext(), 204, a(), jSONObject7, ((long) iOptInt3) * 1000);
                                                    }
                                                } else {
                                                    UMRTLog.i("MobclickRT", "[ncc]: all batches processing completed");
                                                    if (f == 1) {
                                                        synchronized (i) {
                                                            h = false;
                                                        }
                                                    }
                                                }
                                                break;
                                            } else {
                                                i4 = iOptInt4;
                                            }
                                            co coVar = arrayList3.get(iOptInt);
                                            JSONObject jSONObjectB3 = coVar.b();
                                            jSONObjectOptJSONObject4.put("processedCount", i4 + 1);
                                            if (jSONObjectB3 != null) {
                                                String strOptString3 = jSONObjectB3.optString("actionName");
                                                UMRTLog.i("MobclickRT", "[ncc]: processing task: " + strOptString3);
                                                a(UMGlobalContext.getAppContext(), strOptString3, jSONObjectB3);
                                                b(strOptString3);
                                            } else {
                                                UMRTLog.i("MobclickRT", "[ncc]: action " + coVar.a() + " not allowed to execute, skip");
                                            }
                                            int i7 = iOptInt + 1;
                                            if (i7 < arrayList3.size()) {
                                                JSONObject jSONObject8 = new JSONObject();
                                                jSONObject8.put("batchParams", jSONObjectOptJSONObject4);
                                                jSONObject8.put("currentIndex", i7);
                                                cm.a(UMGlobalContext.getAppContext(), 204, a(), jSONObject8);
                                                return;
                                            }
                                            UMRTLog.i("MobclickRT", "[ncc]: batch processing completed for batchId: " + strOptString2);
                                            c.remove(strOptString2);
                                            int i8 = iOptInt5 + 1;
                                            if (i8 < iOptInt6) {
                                                if (i8 < e.size()) {
                                                    ArrayList<co> arrayList5 = e.get(i8);
                                                    StringBuilder sb2 = new StringBuilder("batch_");
                                                    int i9 = d + 1;
                                                    d = i9;
                                                    sb2.append(i9);
                                                    String string2 = sb2.toString();
                                                    c.put(string2, arrayList5);
                                                    JSONObject jSONObject9 = new JSONObject();
                                                    jSONObject9.put("batchId", string2);
                                                    jSONObject9.put("appsPerBatch", iOptInt2);
                                                    jSONObject9.put("batchInterval", iOptInt3);
                                                    jSONObject9.put("processedCount", 0);
                                                    jSONObject9.put("currentBatchIndex", i8);
                                                    jSONObject9.put("totalBatches", iOptInt6);
                                                    JSONObject jSONObject10 = new JSONObject();
                                                    jSONObject10.put("batchParams", jSONObject9);
                                                    jSONObject10.put("currentIndex", 0);
                                                    cm.a(UMGlobalContext.getAppContext(), 204, a(), jSONObject10, ((long) iOptInt3) * 1000);
                                                    return;
                                                }
                                                return;
                                            }
                                            UMRTLog.i("MobclickRT", "[ncc]: all batches processing completed");
                                            if (f == 1) {
                                                synchronized (i) {
                                                    h = false;
                                                    break;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        UMRTLog.e("MobclickRT", "[ncc]: actions is null or empty for batchId: " + strOptString2);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th7) {
                                    UMRTLog.e("MobclickRT", "[ncc]: PROCESS_ONE_TASK error: " + th7.getMessage());
                                    if (f == 1) {
                                        synchronized (i) {
                                            h = false;
                                            return;
                                        }
                                    }
                                    return;
                                }
                            default:
                                return;
                        }
                }
            }
            UMRTLog.i("MobclickRT", "[ncc]: recv GET_UMC_PROCESS_RESULT msg.");
            a aVar = (a) obj;
            JSONObject jSONObjectA = a(aVar.a, aVar.b, aVar.c);
            if (jSONObjectA != null) {
                aw.a(new ar("https://cnlogs.umeng.com/ext_event", jSONObjectA), 0L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused4) {
        }
    }
}
