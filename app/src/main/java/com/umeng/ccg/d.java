package com.umeng.ccg;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.ac;
import com.umeng.analytics.pro.ad;
import com.umeng.analytics.pro.ae;
import com.umeng.analytics.pro.af;
import com.umeng.analytics.pro.ag;
import com.umeng.analytics.pro.ah;
import com.umeng.analytics.pro.ai;
import com.umeng.analytics.pro.aj;
import com.umeng.analytics.pro.al;
import com.umeng.analytics.pro.an;
import com.umeng.analytics.pro.ap;
import com.umeng.analytics.pro.ar;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.av;
import com.umeng.analytics.pro.aw;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.be;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.cl;
import com.umeng.analytics.pro.o;
import com.umeng.ccg.c;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC2668;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class d implements c.a {
    private static final String a = "iucc";
    private static final String b = be.b().b("ccfg");
    private static JSONObject c = null;
    private static final String[] d = {"screen_on", "screen_off", "screen_unlock"};
    private static final String[] e = {"screen_on", "screen_off", "screen_unlock", "umc_cfg", "ap_mode"};
    private static ArrayList<ad> f = null;
    private static ArrayList<ad> g = null;
    private static ArrayList<ad> h = null;
    private static ArrayList<ad> i = null;
    private static ac j = null;
    private static f n = new f();
    private volatile String k = "";
    private volatile boolean l = false;
    private Map<String, c> m = new HashMap();

    /* JADX INFO: compiled from: obf */
    public class a {
        private long b;
        private long c;

        public a(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public long a() {
            return this.b;
        }

        public long b() {
            return this.c;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class b extends BroadcastReceiver {
        public long a(ArrayList<ad> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return 0L;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ad adVar = arrayList.get(i);
                if (adVar instanceof ag) {
                    return ((ag) adVar).c();
                }
            }
            return 0L;
        }

        public boolean b(ArrayList<ad> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (!TextUtils.isEmpty(action) && action.equals("android.intent.action.SCREEN_ON") && d.j != null && (d.j instanceof af)) {
                    if (!b(d.i)) {
                        UMRTLog.i("MobclickRT", "don't send INVOKE_APPACT_WHEN_SCREEN_ON msg.");
                    } else {
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 304, d.a(), null, a(d.i) * 1000);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public class c {
        private JSONArray b;
        private String c;

        public c(JSONArray jSONArray, String str) {
            this.b = jSONArray;
            this.c = str;
        }

        public JSONArray a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }
    }

    /* JADX INFO: renamed from: com.umeng.ccg.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: obf */
    public class C0034d {
        public String a;
        public int b;
        public int c;

        public C0034d(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class e {
        private static final d a = new d();

        private e() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class f extends BroadcastReceiver {
        public long a(ArrayList<ad> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return 0L;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ad adVar = arrayList.get(i);
                if (adVar instanceof ag) {
                    return ((ag) adVar).c();
                }
            }
            return 0L;
        }

        public boolean b(ArrayList<ad> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    UMRTLog.i("MobclickRT", "recv intent : ACTION_SCREEN_ON");
                    if (b(d.f)) {
                        UMRTLog.i("MobclickRT", "report screen_on event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 301, d.a(), null, a(d.f) * 1000);
                    } else {
                        UMRTLog.i("MobclickRT", "don't report screen_on event.");
                    }
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    UMRTLog.i("MobclickRT", "recv intent : ACTION_SCREEN_OFF");
                    if (b(d.g)) {
                        UMRTLog.i("MobclickRT", "report screen_off event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 302, d.a(), null, a(d.g) * 1000);
                    } else {
                        UMRTLog.i("MobclickRT", "don't report screen_off event.");
                    }
                }
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    UMRTLog.i("MobclickRT", "recv intent : ACTION_USER_PRESENT");
                    if (!b(d.h)) {
                        UMRTLog.i("MobclickRT", "don't report screen_unlock event.");
                        return;
                    }
                    UMRTLog.i("MobclickRT", "report screen_unlock event.");
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 303, d.a(), null, a(d.h) * 1000);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private void a(Context context, String str, JSONObject jSONObject) {
    }

    private boolean g() {
        SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
        if (sharedPreferencesA != null) {
            String string = sharedPreferencesA.getString("sdk_type_ver", "");
            if (TextUtils.isEmpty(string)) {
                h();
                return false;
            }
            try {
                if (!at.a().keySet().equals(at.a(new JSONObject(string)).keySet())) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private void h() {
        try {
            SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putString("sdk_type_ver", new JSONObject(at.a()).toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private boolean i() {
        try {
            SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
            return (sharedPreferencesA == null || TextUtils.isEmpty(sharedPreferencesA.getString("should_fetch", ""))) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private JSONObject j() {
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

    public static void a(Context context, String str, BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    private long b(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("ts")) {
            return 0L;
        }
        try {
            return jSONObject.optLong("ts");
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private void c(Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback("iucc", new UMImprintChangeCallback() { // from class: com.umeng.ccg.d.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 107, d.a(), str2);
            }
        });
    }

    private Long d(Context context) {
        try {
            SharedPreferences sharedPreferencesA = av.a(context);
            if (sharedPreferencesA != null) {
                return Long.valueOf(sharedPreferencesA.getLong("iucc_s1", 0L));
            }
        } catch (Throwable unused) {
        }
        return 0L;
    }

    private String e(Context context) {
        try {
            SharedPreferences sharedPreferencesA = av.a(context);
            if (sharedPreferencesA != null) {
                return sharedPreferencesA.getString("iucc_s2", "");
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("cc")) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cc");
            ac acVarA = jSONObjectOptJSONObject.has("col_wifi") ? a("col_wifi", jSONObjectOptJSONObject.optJSONObject("col_wifi")) : null;
            ac acVarA2 = jSONObjectOptJSONObject.has("col_bs") ? a("col_bs", jSONObjectOptJSONObject.optJSONObject("col_bs")) : null;
            ac acVarA3 = jSONObjectOptJSONObject.has("col_lbs") ? a("col_lbs", jSONObjectOptJSONObject.optJSONObject("col_lbs")) : null;
            ac acVarA4 = jSONObjectOptJSONObject.has("col_apl") ? a("col_apl", jSONObjectOptJSONObject.optJSONObject("col_apl")) : null;
            ac acVarA5 = jSONObjectOptJSONObject.has("screen_on") ? a("screen_on", jSONObjectOptJSONObject.optJSONObject("screen_on")) : null;
            ac acVarA6 = jSONObjectOptJSONObject.has("screen_off") ? a("screen_off", jSONObjectOptJSONObject.optJSONObject("screen_off")) : null;
            ac acVarA7 = jSONObjectOptJSONObject.has("screen_unlock") ? a("screen_unlock", jSONObjectOptJSONObject.optJSONObject("screen_unlock")) : null;
            ac acVarA8 = jSONObjectOptJSONObject.has("ap_mode") ? a("ap_mode", jSONObjectOptJSONObject.optJSONObject("ap_mode")) : null;
            ArrayList arrayList = new ArrayList();
            if (acVarA != null) {
                arrayList.add(acVarA);
            }
            if (acVarA2 != null) {
                arrayList.add(acVarA2);
            }
            if (acVarA3 != null) {
                arrayList.add(acVarA3);
            }
            if (acVarA4 != null) {
                arrayList.add(acVarA4);
            }
            if (acVarA5 != null) {
                arrayList.add(acVarA5);
            }
            if (acVarA6 != null) {
                arrayList.add(acVarA6);
            }
            if (acVarA7 != null) {
                arrayList.add(acVarA7);
            }
            if (acVarA8 != null) {
                arrayList.add(acVarA8);
            }
            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 202, a(), arrayList);
        } catch (Throwable unused) {
        }
    }

    public synchronized JSONObject b(Context context) {
        FileInputStream fileInputStreamOpenFileInput;
        JSONObject jSONObject = null;
        try {
            File filesDir = context.getFilesDir();
            String str = b;
            if (!new File(filesDir, str).exists()) {
                return null;
            }
            try {
                fileInputStreamOpenFileInput = context.openFileInput(str);
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

    public static d a() {
        return e.a;
    }

    public void a(Context context) {
        com.umeng.ccg.c.a(context, 105, a(), null);
    }

    private boolean a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has("code")) {
            return false;
        }
        try {
            return 200 == jSONObject.optInt("code") && jSONObject.has("cc") && jSONObject.has("ts");
        } catch (Throwable unused) {
            return false;
        }
    }

    private synchronized void a(Context context, JSONObject jSONObject, String str) {
        try {
            long jB = b(jSONObject);
            byte[] bArrA = ay.a(jSONObject.toString().getBytes(), UMConfigure.sAppkey.getBytes());
            if (bArrA != null && bArrA.length > 1) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), b));
                try {
                    fileOutputStream.write(bArrA);
                    fileOutputStream.flush();
                    at.a(fileOutputStream);
                    a(context, str, jB);
                    UMRTLog.i("MobclickRT", "saveConfigFile success.");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cc");
                    if (jSONObjectOptJSONObject != null) {
                        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + bz.n);
                        if (jSONObjectOptJSONObject.has("col_pi")) {
                            if (!file.exists()) {
                                UMRTLog.i("MobclickRT", "PI: cfg is on, flag not exist, create it.");
                                file.createNewFile();
                            }
                        } else if (file.exists()) {
                            UMRTLog.i("MobclickRT", "PI: cfg is off, flag exist, delete it.");
                            file.delete();
                        }
                    }
                } catch (Throwable th) {
                    at.a(fileOutputStream);
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        String strM4757 = AbstractC2784.m4757("interval_", str);
        SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putLong(strM4757, System.currentTimeMillis()).commit();
        }
    }

    private void a(String str, ad adVar) {
        if ("screen_on".equalsIgnoreCase(str)) {
            if (f == null) {
                f = new ArrayList<>();
            }
            f.add(adVar);
        }
        if ("screen_off".equalsIgnoreCase(str)) {
            if (g == null) {
                g = new ArrayList<>();
            }
            g.add(adVar);
        }
        if ("screen_unlock".equalsIgnoreCase(str)) {
            if (h == null) {
                h = new ArrayList<>();
            }
            h.add(adVar);
        }
        if ("umc_cfg".equalsIgnoreCase(str)) {
            if (i == null) {
                i = new ArrayList<>();
            }
            i.add(adVar);
        }
    }

    private ac a(String str, JSONObject jSONObject) {
        ac acVar;
        JSONArray jSONArrayOptJSONArray;
        ac acVar2;
        JSONArray jSONArrayOptJSONArray2;
        String str2 = "sdk";
        if (jSONObject == null) {
            return null;
        }
        try {
            if (!jSONObject.has("cfg") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("cfg")) == null || jSONArrayOptJSONArray.length() <= 0) {
                return null;
            }
            JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(0);
            boolean zHas = jSONObject2.has("col_delay_times");
            boolean zHas2 = jSONObject2.has("col_interval");
            boolean zHas3 = jSONObject2.has("col_delay_ts");
            if (!zHas || !zHas2 || !zHas3) {
                return null;
            }
            int iOptInt = jSONObject2.optInt("col_delay_times");
            long jOptLong = jSONObject2.optLong("col_interval");
            long jOptLong2 = jSONObject2.optLong("col_delay_ts");
            String strOptString = jSONObject2.optString("hit_sdk");
            ArrayList arrayList = new ArrayList();
            acVar = null;
            if (!jSONObject2.has("week_on")) {
                str2 = "sdk";
            } else {
                try {
                    JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("week_on");
                    HashSet hashSet = new HashSet();
                    if (jSONArrayOptJSONArray3 != null) {
                        int i2 = 0;
                        for (int length = jSONArrayOptJSONArray3.length(); i2 < length; length = length) {
                            hashSet.add(Integer.valueOf(jSONArrayOptJSONArray3.getInt(i2)));
                            i2++;
                        }
                    }
                    if (hashSet.size() > 0) {
                        an anVar = new an(hashSet);
                        if (Arrays.asList(d).contains(str)) {
                            a(str, anVar);
                        } else {
                            arrayList.add(anVar);
                            if ("umc_cfg".equalsIgnoreCase(str)) {
                                a(str, anVar);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (jSONObject2.has("hour_on")) {
                String strOptString2 = jSONObject2.optString("hour_on");
                if (!TextUtils.isEmpty(strOptString2)) {
                    al alVar = new al(strOptString2);
                    HashSet hashSet2 = new HashSet();
                    for (int i3 = 1; i3 <= 24; i3++) {
                        if (alVar.a(i3)) {
                            hashSet2.add(Integer.valueOf(i3));
                        }
                    }
                    if (hashSet2.size() > 0) {
                        ah ahVar = new ah(hashSet2);
                        if (Arrays.asList(d).contains(str)) {
                            a(str, ahVar);
                        } else {
                            arrayList.add(ahVar);
                        }
                        if ("umc_cfg".equalsIgnoreCase(str)) {
                            a(str, ahVar);
                        }
                    }
                }
            }
            arrayList.add(new aj(iOptInt));
            ai aiVar = new ai(str, jOptLong);
            String[] strArr = d;
            if (Arrays.asList(strArr).contains(str)) {
                a(str, aiVar);
            } else {
                arrayList.add(aiVar);
            }
            if ("umc_cfg".equalsIgnoreCase(str)) {
                a(str, aiVar);
            }
            ag agVar = new ag(jOptLong2);
            if (Arrays.asList(strArr).contains(str)) {
                a(str, agVar);
                arrayList.add(agVar);
            } else {
                arrayList.add(agVar);
            }
            if ("umc_cfg".equalsIgnoreCase(str)) {
                a(str, agVar);
            }
            if ("col_apl".equals(str)) {
                acVar2 = new ae("col_apl", arrayList);
            } else if ("umc_cfg".equals(str)) {
                acVar2 = new af("umc_cfg", arrayList);
            } else {
                acVar2 = new ac(str, arrayList);
            }
            ac acVar3 = acVar2;
            try {
                acVar3.b(str, jSONObject2);
                acVar3.a(strOptString);
                String str3 = "";
                String str4 = "sdk";
                if (jSONObject.has("sdk") && (jSONArrayOptJSONArray2 = jSONObject.optJSONArray("sdk")) != null) {
                    Map<String, c> map = this.m;
                    if (map != null && !map.containsKey(str)) {
                        this.m.put(str, new c(new JSONArray(jSONArrayOptJSONArray2.toString()), strOptString));
                    }
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                        str3 = str3 + jSONArrayOptJSONArray2.getString(i4);
                        if (i4 < length2 - 1) {
                            str3 = str3 + ",";
                        }
                    }
                }
                acVar3.b(str3);
                return acVar3;
            } catch (Throwable unused2) {
                return acVar3;
            }
        } catch (Throwable unused3) {
            acVar = null;
        }
        return acVar;
    }

    private void a(Context context, String str, long j2) {
        SharedPreferences sharedPreferencesA;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length != 4 || (sharedPreferencesA = av.a(context)) == null) {
                return;
            }
            long j3 = Long.parseLong(strArrSplit[0]);
            String str2 = strArrSplit[1];
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putLong("config_ts", j2);
            editorEdit.putLong("iucc_s1", j3);
            editorEdit.putString("iucc_s2", str2).commit();
            UMRTLog.i("MobclickRT", "updateTsS1S2 : ts = " + j2 + "; s1 = " + j3 + "; s2 = " + str2);
        } catch (Throwable unused) {
        }
    }

    private void a(String str) {
        try {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length != 4) {
                return;
            }
            long j2 = Long.parseLong(strArrSplit[0]);
            String str2 = strArrSplit[1];
            if (!TextUtils.isEmpty(this.k)) {
                String[] strArrSplit2 = this.k.split("@");
                if (strArrSplit2.length == 2) {
                    long j3 = Long.parseLong(strArrSplit2[0]);
                    String str3 = strArrSplit2[1];
                    if (j3 == j2 && str3.equalsIgnoreCase(str2)) {
                        UMRTLog.i("MobclickRT", "重复的iucc S1 and S2, 忽略本次更新，不发起fetch。");
                        return;
                    }
                }
            }
            SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                if (sharedPreferencesA.getLong("config_ts", 0L) != j2) {
                    UMRTLog.i("MobclickRT", "local config ts != iuccS1, send FETCH_NEW_CONFIG msg.");
                    this.k = String.valueOf(j2) + "@" + str2;
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
                    return;
                }
                d(UMGlobalContext.getAppContext());
                if (e(UMGlobalContext.getAppContext()).equalsIgnoreCase(str2)) {
                    return;
                }
                UMRTLog.i("MobclickRT", "local S2 != iuccS2, send FETCH_NEW_CONFIG msg.");
                this.k = String.valueOf(j2) + "@" + str2;
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
            }
        } catch (Throwable unused) {
        }
    }

    private void a(boolean z) {
        try {
            SharedPreferences sharedPreferencesA = av.a(UMGlobalContext.getAppContext());
            if (sharedPreferencesA != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                if (z) {
                    editorEdit.putString("should_fetch", "1").commit();
                } else {
                    editorEdit.putString("should_fetch", "").commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private JSONObject a(String str, int i2, int i3) {
        c cVar;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put("id", "$$_umc_ev1");
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("tt", str);
            jSONObject.put("mock", i2);
            jSONObject.put("result", i3);
            if (!this.m.containsKey("umc_cfg") || (cVar = this.m.get("umc_cfg")) == null) {
                return null;
            }
            JSONObject jSONObjectA = ap.a(UMGlobalContext.getAppContext(), cVar.a(), cVar.b());
            JSONObject jSONObjectA2 = ap.a(UMGlobalContext.getAppContext(), jSONObject);
            if (jSONObjectA == null || jSONObjectA2 == null) {
                return null;
            }
            return ap.a(jSONObjectA, jSONObjectA2);
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

    /* JADX WARN: Code duplicated, block: B:239:0x0676 A[Catch: all -> 0x06c3, TRY_ENTER, TryCatch #0 {all -> 0x06c3, blocks: (B:224:0x0635, B:226:0x063d, B:228:0x0647, B:230:0x064d, B:232:0x0655, B:239:0x0676, B:240:0x0679, B:242:0x067f, B:243:0x06a0), top: B:340:0x0635 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x074a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v19, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    @Override // com.umeng.ccg.c.a
    public void a(Object obj, int i2) throws Throwable {
        JSONObject jSONObject;
        JSONObject jSONObjectB;
        int i3;
        ArrayList arrayList;
        int size;
        JSONObject jSONObject2;
        JSONObject jSONObjectD;
        c cVar;
        c cVar2;
        c cVar3;
        JSONObject jSONObjectA;
        JSONObject jSONObjectA2;
        try {
            if (i2 == 401) {
                if (this.l) {
                    Context appContext = UMGlobalContext.getAppContext();
                    int iIsAirplaneModeOn = DeviceConfig.isAirplaneModeOn(appContext);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferencesA = av.a(appContext);
                    if (sharedPreferencesA != null) {
                        int i4 = sharedPreferencesA.getInt("last_ap_mode", 0);
                        long j2 = sharedPreferencesA.getLong("last_ap_time", 0L);
                        if (i4 != iIsAirplaneModeOn) {
                            UMRTLog.i("MobclickRT", "--->>> APMode value changed, current value: " + j2 + "; new value: " + iIsAirplaneModeOn);
                            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                            if (editorEdit != null) {
                                editorEdit.putInt("last_ap_mode", iIsAirplaneModeOn);
                                editorEdit.putLong("last_ap_time", jCurrentTimeMillis);
                                editorEdit.commit();
                            }
                            if (i4 == 1 && iIsAirplaneModeOn == 0) {
                                com.umeng.ccg.c.a(appContext, 402, a(), new a(j2, jCurrentTimeMillis), 0L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 != 402) {
                JSONObject jSONObject3 = null;
                switch (i2) {
                    case 101:
                        if (obj != null && (obj instanceof String)) {
                            String str = (String) obj;
                            UMRTLog.i("MobclickRT", "[workEvent]: recv FETCH_NEW_CONFIG msg. source iucc is: ".concat(str));
                            JSONObject jSONObjectA3 = ap.a(UMGlobalContext.getAppContext(), str);
                            if (jSONObjectA3 != null) {
                                UMRTLog.i("MobclickRT", "[imprint] send request. body: " + jSONObjectA3.toString());
                                aw.a(new as("https://ucc.umeng.com/v2/inn/fetch", jSONObjectA3, str), 0L, TimeUnit.SECONDS);
                            }
                            if (i()) {
                                c(UMGlobalContext.getAppContext());
                                String strImprintProperty = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), "iucc", "");
                                UMRTLog.i("MobclickRT", "manual check iucc value: " + strImprintProperty);
                                a(strImprintProperty);
                            }
                            break;
                        }
                        break;
                    case 102:
                        UMRTLog.i("MobclickRT", "[workEvent]: recv FETCH_RESPONSE msg.");
                        this.k = "";
                        if (obj != null && (obj instanceof JSONObject)) {
                            JSONObject jSONObject4 = (JSONObject) obj;
                            if (a(jSONObject4.optJSONObject("config"))) {
                                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 103, a(), jSONObject4);
                            } else {
                                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 104, a(), null);
                            }
                        } else {
                            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 104, a(), null);
                        }
                        break;
                    case 103:
                        UMRTLog.i("MobclickRT", "[workEvent]: recv FETCH_SUCCESS msg.");
                        Context appContext2 = UMGlobalContext.getAppContext();
                        if (obj != null && (obj instanceof JSONObject)) {
                            JSONObject jSONObject5 = (JSONObject) obj;
                            JSONObject jSONObjectOptJSONObject = jSONObject5.optJSONObject("config");
                            String strOptString = jSONObject5.optString("sourceIucc");
                            if (jSONObjectOptJSONObject != null) {
                                if (i()) {
                                    UMRTLog.i("MobclickRT", "--->>> 成功拉取云配参数后，检测到should fetch标志，清除此标志。更新SDK类型集缓存值");
                                    h();
                                    a(false);
                                }
                                a(appContext2, jSONObjectOptJSONObject, strOptString);
                                CcgAgent.notifyConfigChanged(jSONObjectOptJSONObject);
                            }
                            break;
                        }
                        break;
                    case 104:
                        UMRTLog.i("MobclickRT", "[workEvent]: recv FETCH_FAILED msg.");
                        break;
                    case 105:
                        for (String str2 : CcgAgent.getCollectItemList()) {
                            ArrayList<String> forbidSdkArray = CcgAgent.getForbidSdkArray(str2);
                            StringBuilder sbM4679 = AbstractC2668.m4679("[forbid_sdk] 采集项: ", str2, "; 值: ");
                            sbM4679.append(forbidSdkArray.toString());
                            UMRTLog.i("MobclickRT", sbM4679.toString());
                        }
                        UMRTLog.i("MobclickRT", "[workEvent]: recv LOAD_CONFIG msg.");
                        try {
                            try {
                                jSONObjectB = b(UMGlobalContext.getAppContext());
                                if (jSONObjectB == null) {
                                    i3 = 0;
                                } else {
                                    try {
                                        if (!a(jSONObjectB)) {
                                            i3 = 0;
                                        } else {
                                            i3 = 1;
                                        }
                                    } catch (Throwable unused) {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("result", (Object) 0);
                                        jSONObject = jSONObject;
                                        if (true) {
                                        }
                                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 106, a(), jSONObject);
                                        return;
                                    }
                                }
                                jSONObject = new JSONObject();
                                jSONObject.put("result", i3);
                                jSONObject = jSONObject;
                                if (jSONObjectB != null) {
                                    jSONObject.put("config", jSONObjectB);
                                }
                            } catch (Throwable unused2) {
                                jSONObjectB = null;
                            }
                            break;
                        } catch (Throwable unused3) {
                        }
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 106, a(), jSONObject);
                        break;
                    case 106:
                        if (obj != null && (obj instanceof JSONObject)) {
                            try {
                                JSONObject jSONObject6 = (JSONObject) obj;
                                if (jSONObject6.has("result")) {
                                    if ((jSONObject6.optInt("result") & 1) != 0 && jSONObject6.has("config")) {
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject6.optJSONObject("config");
                                        c = jSONObjectOptJSONObject2;
                                        if (jSONObjectOptJSONObject2 != null) {
                                            CcgAgent.notifyConfigReady(jSONObjectOptJSONObject2);
                                            try {
                                                JSONObject jSONObjectOptJSONObject3 = c.optJSONObject("cc");
                                                if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.has("col_po")) {
                                                    o.a(UMGlobalContext.getAppContext()).b();
                                                }
                                                break;
                                            } catch (Throwable unused4) {
                                            }
                                        } else {
                                            CcgAgent.notifyConfigReady(null);
                                        }
                                    } else {
                                        CcgAgent.notifyConfigReady(null);
                                    }
                                }
                                if (g()) {
                                    UMRTLog.i("MobclickRT", "--->>> 检测到集成的SDK类型集合发生变化，发起云配参数拉取请求(设置本地should fetch标志).");
                                    String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), "iucc", "");
                                    a(true);
                                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), strImprintProperty2);
                                } else {
                                    c(UMGlobalContext.getAppContext());
                                    String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), "iucc", "");
                                    UMRTLog.i("MobclickRT", "manual check iucc value: " + strImprintProperty3);
                                    a(strImprintProperty3);
                                }
                            } catch (Throwable unused5) {
                            }
                            if (new File(UMGlobalContext.getAppContext().getFilesDir().getAbsolutePath() + File.separator + bz.n).exists()) {
                                UMRTLog.i("MobclickRT", "PI: flag file exist, start process.");
                                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 310, a(), null, 0L);
                            }
                            break;
                        }
                        break;
                    case 107:
                        if (obj != null) {
                            try {
                                if (obj instanceof String) {
                                    String str3 = (String) obj;
                                    UMRTLog.i("MobclickRT", "[IMPRINT_IUCC_CHANGED] iucc : ".concat(str3));
                                    a(str3);
                                }
                            } catch (Throwable th) {
                                UMRTLog.e("MobclickRT", "[imprint] process error " + th.getMessage());
                                return;
                            }
                        }
                        break;
                    default:
                        switch (i2) {
                            case 201:
                                UMRTLog.i("MobclickRT", "recv PARSE_CONFIG msg.");
                                if (obj != null && (obj instanceof JSONObject)) {
                                    c((JSONObject) obj);
                                    break;
                                }
                                break;
                            case 202:
                                UMRTLog.i("MobclickRT", "recv COLLECTION_JUDGMENT msg.");
                                if (obj != null && (obj instanceof ArrayList) && (size = (arrayList = (ArrayList) obj).size()) > 0) {
                                    int i5 = 0;
                                    while (i5 < size) {
                                        ac acVar = (ac) arrayList.get(i5);
                                        String strA = acVar.a();
                                        if ("umc_cfg".equalsIgnoreCase(strA)) {
                                            jSONObject2 = new JSONObject();
                                            jSONObject2.put("scene", 202);
                                        } else {
                                            jSONObject2 = jSONObject3;
                                        }
                                        JSONObject jSONObjectA4 = acVar.a(strA, jSONObject2);
                                        if (jSONObjectA4 != null) {
                                            long jOptLong = !Arrays.asList(d).contains(acVar.a()) ? jSONObjectA4.optLong("delay") * 1000 : 0L;
                                            if ("umc_cfg".equalsIgnoreCase(acVar.a()) && jSONObjectA4.optInt("act_when") == 0) {
                                                jOptLong = jSONObjectA4.optLong("delay") * 1000;
                                            }
                                            int iOptInt = jSONObjectA4.optInt("sel_policy");
                                            jSONObjectA4.remove("delay");
                                            UMRTLog.i("MobclickRT", "send START_COLLECT msg, delayTs = " + jOptLong);
                                            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), ("umc_cfg".equalsIgnoreCase(acVar.a()) && iOptInt == 2) ? 204 : 203, a(), jSONObjectA4, jOptLong);
                                        }
                                        i5++;
                                        jSONObject3 = jSONObject2;
                                    }
                                    break;
                                }
                                break;
                            case 203:
                                if (obj != null && (obj instanceof JSONObject)) {
                                    JSONObject jSONObject7 = (JSONObject) obj;
                                    String strOptString2 = jSONObject7.optString("actionName");
                                    UMRTLog.i("MobclickRT", "recv START_COLLECT msg. name is : " + strOptString2);
                                    if (!com.umeng.ccg.b.a(strOptString2)) {
                                        UMRTLog.i("MobclickRT", "Local switch of [" + strOptString2 + "] is off, ignore this command.");
                                    } else {
                                        String string = jSONObject7.toString();
                                        if (Arrays.asList(e).contains(strOptString2)) {
                                            if ("screen_on".equalsIgnoreCase(strOptString2)) {
                                                UMRTLog.i("MobclickRT", "register Intent.ACTION_SCREEN_ON");
                                                a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_ON", n);
                                            }
                                            if ("screen_off".equalsIgnoreCase(strOptString2)) {
                                                UMRTLog.i("MobclickRT", "register Intent.ACTION_SCREEN_OFF");
                                                a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_OFF", n);
                                            }
                                            if ("screen_unlock".equalsIgnoreCase(strOptString2)) {
                                                UMRTLog.i("MobclickRT", "register Intent.ACTION_USER_PRESENT");
                                                a(UMGlobalContext.getAppContext(), "android.intent.action.USER_PRESENT", n);
                                            }
                                            if ("umc_cfg".equalsIgnoreCase(strOptString2)) {
                                                int actUpFlag = CcgAgent.getActUpFlag();
                                                UMRTLog.i("MobclickRT", "act up flag: " + actUpFlag);
                                                if (actUpFlag > 0) {
                                                    break;
                                                } else if (jSONObject7.has("act_when")) {
                                                    int iOptInt2 = jSONObject7.optInt("act_when");
                                                    if (iOptInt2 == 0) {
                                                        a(UMGlobalContext.getAppContext(), strOptString2, jSONObject7);
                                                    } else if (iOptInt2 == 1) {
                                                        a(UMGlobalContext.getAppContext(), "android.intent.action.SCREEN_ON", new b());
                                                    }
                                                }
                                            }
                                            if ("ap_mode".equalsIgnoreCase(strOptString2)) {
                                                b(strOptString2);
                                                this.l = true;
                                                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 401, a(), null, 0L);
                                            }
                                        } else {
                                            b(strOptString2);
                                            if (CcgAgent.hasRegistedActionInfo()) {
                                                boolean z = CcgAgent.getActionInfo("anti") != null;
                                                String strOptString3 = jSONObject7.optString("local_hit_sdk");
                                                if (TextUtils.isEmpty(strOptString3)) {
                                                    UMRTLog.i("MobclickRT", "忽略 本次采集项[" + strOptString2 + "]采集请求.");
                                                } else {
                                                    ActionInfo actionInfo = CcgAgent.getActionInfo(strOptString3);
                                                    if (actionInfo != null) {
                                                        UMRTLog.i("MobclickRT", "调用[" + strOptString3 + "] onCommand接口方法, 参数: " + jSONObject7.toString());
                                                        actionInfo.onCommand(UMGlobalContext.getAppContext(), strOptString2, jSONObject7);
                                                    }
                                                }
                                                if (!z) {
                                                    at.a(UMGlobalContext.getAppContext(), string);
                                                }
                                            } else {
                                                at.a(UMGlobalContext.getAppContext(), string);
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 204:
                                if (obj != null && (obj instanceof JSONObject)) {
                                    JSONObject jSONObject8 = (JSONObject) obj;
                                    String strOptString4 = jSONObject8.optString("actionName");
                                    UMRTLog.i("MobclickRT", "recv ACTUP_EVENT msg. name is : " + strOptString4);
                                    if (!com.umeng.ccg.b.a(strOptString4)) {
                                        UMRTLog.i("MobclickRT", "Local switch of [" + strOptString4 + "] is off, ignore this command.");
                                        break;
                                    } else if ("umc_cfg".equalsIgnoreCase(strOptString4)) {
                                        int actUpFlag2 = CcgAgent.getActUpFlag();
                                        int iOptInt3 = jSONObject8.has("index") ? jSONObject8.optInt("index") : 0;
                                        UMRTLog.i("MobclickRT", "act up flag: " + actUpFlag2);
                                        if ((actUpFlag2 <= 0 || iOptInt3 != 0) && jSONObject8.has("act_when")) {
                                            int iOptInt4 = jSONObject8.optInt("act_when");
                                            int iOptInt5 = jSONObject8.optInt("sel_policy");
                                            if (iOptInt4 == 0 && iOptInt5 == 2) {
                                                a(UMGlobalContext.getAppContext(), strOptString4, jSONObject8);
                                                ac acVar2 = j;
                                                if (acVar2 != null && (acVar2 instanceof af) && (jSONObjectD = ((af) acVar2).d("umc_cfg")) != null) {
                                                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 204, a(), jSONObjectD, jSONObjectD.has("delay") ? jSONObjectD.optInt("delay") * 1000 : 0L);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                switch (i2) {
                                    case 301 /* 301 */:
                                        UMRTLog.i("MobclickRT", "recv REPORT_SCREEN_ON msg.");
                                        b("screen_on");
                                        if (this.m.containsKey("screen_on") && (cVar = this.m.get("screen_on")) != null) {
                                            JSONObject jSONObjectA5 = ap.a(UMGlobalContext.getAppContext(), 1, cVar.a(), cVar.b(), this.l);
                                            UMRTLog.i("MobclickRT", "screen_on event param: " + jSONObjectA5.toString());
                                            aw.a(new ar("https://aspect-upush.umeng.com/occa/v1/event/report", jSONObjectA5), 0L, TimeUnit.SECONDS);
                                            break;
                                        }
                                        break;
                                    case 302 /* 302 */:
                                        UMRTLog.i("MobclickRT", "recv REPORT_SCREEN_OFF msg.");
                                        b("screen_off");
                                        if (this.m.containsKey("screen_off") && (cVar2 = this.m.get("screen_off")) != null) {
                                            JSONObject jSONObjectA6 = ap.a(UMGlobalContext.getAppContext(), 3, cVar2.a(), cVar2.b(), this.l);
                                            UMRTLog.i("MobclickRT", "screen_off event param: " + jSONObjectA6.toString());
                                            aw.a(new ar("https://aspect-upush.umeng.com/occa/v1/event/report", jSONObjectA6), 0L, TimeUnit.SECONDS);
                                            break;
                                        }
                                        break;
                                    case 303 /* 303 */:
                                        UMRTLog.i("MobclickRT", "recv REPORT_SCREEN_UNLOCK msg.");
                                        b("screen_unlock");
                                        if (this.m.containsKey("screen_unlock") && (cVar3 = this.m.get("screen_unlock")) != null) {
                                            JSONObject jSONObjectA7 = ap.a(UMGlobalContext.getAppContext(), 2, cVar3.a(), cVar3.b(), this.l);
                                            UMRTLog.i("MobclickRT", "screen_unlock event param: " + jSONObjectA7.toString());
                                            aw.a(new ar("https://aspect-upush.umeng.com/occa/v1/event/report", jSONObjectA7), 0L, TimeUnit.SECONDS);
                                            break;
                                        }
                                        break;
                                    case 304 /* 304 */:
                                        UMRTLog.i("MobclickRT", "recv INVOKE_APPACT_WHEN_SC_ON msg.");
                                        if (!com.umeng.ccg.b.a("umc_cfg")) {
                                            UMRTLog.i("MobclickRT", "Local switch of [umc_cfg] is off, ignore this command.");
                                        } else {
                                            JSONObject jSONObject9 = new JSONObject();
                                            jSONObject9.put("scene", 304);
                                            ac acVar3 = j;
                                            JSONObject jSONObjectA8 = acVar3.a(acVar3.a(), jSONObject9);
                                            if (jSONObjectA8 != null) {
                                                a(UMGlobalContext.getAppContext(), "umc_cfg", jSONObjectA8);
                                            } else {
                                                UMRTLog.i("MobclickRT", "appActAction.process return null !");
                                            }
                                        }
                                        break;
                                    case 305:
                                        C0034d c0034d = (C0034d) obj;
                                        JSONObject jSONObjectA9 = a(c0034d.a, c0034d.b, c0034d.c);
                                        if (jSONObjectA9 != null) {
                                            aw.a(new ar("https://cnlogs.umeng.com/ext_event", jSONObjectA9), 0L, TimeUnit.SECONDS);
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case 310 /* 310 */:
                                                UMRTLog.i("MobclickRT", "PI: recv GET_PI_INFO msg.");
                                                o oVarA = o.a(UMGlobalContext.getAppContext());
                                                if (oVarA != null) {
                                                    ArrayList<o.b> arrayListF = oVarA.f();
                                                    for (int i6 = 0; i6 < arrayListF.size(); i6++) {
                                                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 312, a(), arrayListF.get(i6), 0L);
                                                    }
                                                }
                                                break;
                                            case 311 /* 311 */:
                                                UMRTLog.i("MobclickRT", "PO: recv GET_PO_INFO msg.");
                                                o oVarA2 = o.a(UMGlobalContext.getAppContext());
                                                if (oVarA2 != null) {
                                                    ArrayList<o.c> arrayListG = oVarA2.g();
                                                    for (int i7 = 0; i7 < arrayListG.size(); i7++) {
                                                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 313, a(), arrayListG.get(i7), 3000L);
                                                    }
                                                }
                                                break;
                                            case 312 /* 312 */:
                                                UMRTLog.i("MobclickRT", "PI: recv REPORT_PI_INFO msg.");
                                                if (obj != null && (obj instanceof o.b)) {
                                                    o.b bVar = (o.b) obj;
                                                    String strA2 = bVar.a();
                                                    if (!TextUtils.isEmpty(strA2)) {
                                                        JSONObject jSONObject10 = new JSONObject();
                                                        JSONArray jSONArray = new JSONArray();
                                                        JSONObject jSONObject11 = new JSONObject();
                                                        jSONObject11.put("id", "$$_pi");
                                                        jSONObject11.put("pkg", strA2);
                                                        jSONObject11.put("ts", bVar.b());
                                                        jSONArray.put(jSONObject11);
                                                        jSONObject10.put("ekv", jSONArray);
                                                        JSONObject jSONObjectA10 = ap.a(UMGlobalContext.getAppContext(), new JSONArray(), "");
                                                        if (jSONObjectA10 != null && (jSONObjectA = ap.a(jSONObjectA10, jSONObject10)) != null) {
                                                            aw.a(new ar("https://cnlogs.umeng.com/common_inout_logs", jSONObjectA), 0L, TimeUnit.SECONDS);
                                                            Thread.sleep(1000L);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 313 /* 313 */:
                                                UMRTLog.i("MobclickRT", "PO: recv REPORT_PO_INFO msg.");
                                                if (obj != null && (obj instanceof o.c)) {
                                                    o.c cVar4 = (o.c) obj;
                                                    UMRTLog.i("MobclickRT", "--->>>PO: po: " + cVar4.a() + "; ts: " + cVar4.d());
                                                    String strA3 = cVar4.a();
                                                    String strB = cVar4.b();
                                                    if (!TextUtils.isEmpty(strA3)) {
                                                        JSONObject jSONObject12 = new JSONObject();
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        JSONObject jSONObject13 = new JSONObject();
                                                        jSONObject13.put("id", "$$_po");
                                                        jSONObject13.put("pkg", strA3);
                                                        jSONObject13.put("cls", strB);
                                                        jSONObject13.put("ts", cVar4.d());
                                                        jSONObject13.put("u", cVar4.e());
                                                        if (o.c()) {
                                                            jSONObject13.put("stat", "fg");
                                                        } else {
                                                            jSONObject13.put("stat", "bg");
                                                        }
                                                        jSONArray2.put(jSONObject13);
                                                        jSONObject12.put("ekv", jSONArray2);
                                                        JSONObject jSONObjectA11 = ap.a(UMGlobalContext.getAppContext(), new JSONArray(), "");
                                                        if (jSONObjectA11 != null && (jSONObjectA2 = ap.a(jSONObjectA11, jSONObject12)) != null) {
                                                            aw.a(new ar("https://cnlogs.umeng.com/common_inout_logs", jSONObjectA2), 0L, TimeUnit.SECONDS);
                                                            Thread.sleep(1000L);
                                                            break;
                                                        }
                                                    }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return;
            }
            if (this.l && obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                long jA = aVar.a();
                long jB = aVar.b();
                if (jB <= jA) {
                    return;
                }
                long j3 = jB - jA;
                if (j3 >= 1000) {
                    UMRTLog.i("MobclickRT", "--->>> APMode: 上报退出飞行模式事件：ts1 = " + jA + "; ts2 = " + jB + "; 停留: " + (j3 / 1000) + "秒");
                } else {
                    UMRTLog.i("MobclickRT", "--->>> APMode: 上报退出飞行模式事件：ts1 = " + jA + "; ts2 = " + jB + "; 停留: " + j3 + "毫秒");
                }
                JSONObject jSONObjectA12 = ap.a(UMGlobalContext.getAppContext(), 4, new JSONArray("[\"uapp\"]"), "uapp", this.l);
                jSONObjectA12.put("ts1", jA);
                jSONObjectA12.put("ts2", jB);
                UMRTLog.i("MobclickRT", "APMode event param: " + jSONObjectA12);
                aw.a(new ar("https://aspect-upush.umeng.com/occa/v1/event/report", jSONObjectA12), 0L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused6) {
        }
    }
}
