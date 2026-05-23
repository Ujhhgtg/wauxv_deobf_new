package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class u {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private final long e;

    /* JADX INFO: compiled from: obf */
    public static class a {
        public static final u a = new u();

        private a() {
        }
    }

    public static u a() {
        return 0 .a;
    }

    private JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", ab.a().d(UMGlobalContext.getAppContext(null)));
            jSONObject.put("start_time", jCurrentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    public void b(JSONObject jSONObject, Context context) {
        int iA = a(context);
        if (iA == 1) {
            if (jSONObject.has("active_user")) {
                jSONObject.remove("active_user");
            }
            if (jSONObject.has("sessions")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("sessions");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has("_$sp")) {
                            jSONObject2.remove("_$sp");
                        }
                        if (jSONObject2.has("_$pp")) {
                            jSONObject2.remove("_$pp");
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            l.a(context).a(false, true);
            return;
        }
        if (iA == 2) {
            if (jSONObject.has("active_user")) {
                jSONObject.remove("active_user");
            }
            if (jSONObject.has("sessions")) {
                jSONObject.remove("sessions");
            }
            try {
                jSONObject.put("sessions", c());
            } catch (Exception unused2) {
            }
            l.a(context).a(false, true);
            return;
        }
        if (iA == 3) {
            if (jSONObject.has("active_user")) {
                jSONObject.remove("active_user");
            }
            jSONObject.remove("sessions");
            l.a(context).a(false, true);
        }
    }

    private u() {
        this.e = 60000L;
    }

    public int a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    private void a(JSONObject jSONObject, boolean z) {
        if (!z && jSONObject.has("sessions")) {
            jSONObject.remove("sessions");
        }
        if (jSONObject.has("active_user")) {
            jSONObject.remove("active_user");
        }
        if (jSONObject.has("error")) {
            jSONObject.remove("error");
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has("gkv")) {
            jSONObject.remove("gkv");
        }
        if (jSONObject.has("active_user")) {
            jSONObject.remove("active_user");
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    public void a(JSONObject jSONObject, Context context) {
        int iA = a(context);
        if (iA == 1) {
            a(jSONObject, true);
            l.a(context).b(false, true);
        } else {
            if (iA == 2) {
                jSONObject.remove("sessions");
                try {
                    jSONObject.put("sessions", b());
                } catch (Exception unused) {
                }
                a(jSONObject, true);
                l.a(context).b(false, true);
                return;
            }
            if (iA == 3) {
                a(jSONObject, false);
                l.a(context).b(false, true);
            }
        }
    }

    private JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", ab.a().a(UMGlobalContext.getAppContext(null)));
            jSONObject.put("start_time", jCurrentTimeMillis);
            jSONObject.put("end_time", jCurrentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
