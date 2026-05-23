package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class be {
    public static final String A = "rtd";
    public static final String B = "lepd";
    public static final String C = "ccfg";
    public static final String D = "pi_sw";
    private static Map<String, String> E = null;
    private static String F = null;
    public static final String a = "env";
    public static final String b = "exp";
    public static final String c = "imp";
    public static final String d = "ua";
    public static final String e = "zc";
    public static final String f = "id";
    public static final String g = "zf";
    public static final String h = "exid";
    public static final String i = "ucc";
    public static final String j = "ugc";
    public static final String k = "usi";
    public static final String l = "uso";
    public static final String m = "user";
    public static final String n = "uspi";
    public static final String o = "dtfn";
    public static final String p = "pr";
    public static final String q = "upg";
    public static final String r = "pri";
    public static final String s = "probe";
    public static final String t = "bl";
    public static final String u = "wl";
    public static final String v = "subp";
    public static final String w = "subua";
    public static final String x = "sta";
    public static final String y = "emi";
    public static final String z = "sli";

    /* JADX INFO: compiled from: obf */
    public static class a {
        private static final be a = new be();

        private a() {
        }
    }

    static {
        HashMap map = new HashMap();
        E = map;
        F = "";
        map.put(a, "envelope");
        E.put(b, ".umeng");
        E.put(c, ".imprint");
        E.put(d, "ua.db");
        E.put(e, "umeng_zero_cache.db");
        E.put("id", "umeng_it.cache");
        E.put(g, "umeng_zcfg_flag");
        E.put(h, "exid.dat");
        E.put(i, "umeng_common_config");
        E.put(j, "umeng_general_config");
        E.put(k, "um_session_id");
        E.put(l, "umeng_sp_oaid");
        E.put(m, "mobclick_agent_user_");
        E.put(n, "umeng_subprocess_info");
        E.put(o, "delayed_transmission_flag_new");
        E.put("pr", "umeng_policy_result_flag");
        E.put(q, "um_policy_grant");
        E.put(r, "um_pri");
        E.put(s, "UM_PROBE_DATA");
        E.put(t, "ekv_bl");
        E.put(u, "ekv_wl");
        E.put(v, h.a);
        E.put(w, "ua_");
        E.put(x, "stateless");
        E.put(y, ".emitter");
        E.put(z, "um_slmode_sp");
        E.put(A, "um_rtd_conf");
        E.put(B, "");
        E.put(C, ".dmpvedpogjhejs.cfg");
        E.put(D, ".pisw02fl");
    }

    private be() {
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(F)) {
            if (str.length() <= 3) {
                F = str.concat("_");
                return;
            }
            F = str.substring(0, 3) + "_";
        }
    }

    public String b(String str) {
        if (!E.containsKey(str)) {
            return "";
        }
        String str2 = E.get(str);
        if (!b.equalsIgnoreCase(str) && !c.equalsIgnoreCase(str) && !y.equalsIgnoreCase(str)) {
            return AbstractC2784.m4752(new StringBuilder(), F, str2);
        }
        return "." + F + str2.substring(1);
    }

    public void a() {
        F = "";
    }

    public static be b() {
        return a.a;
    }
}
