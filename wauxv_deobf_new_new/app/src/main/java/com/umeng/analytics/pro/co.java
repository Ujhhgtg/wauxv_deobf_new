package com.umeng.analytics.pro;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class co implements cu {
    private String a;
    private ArrayList<cp> b;

    public co(String str, ArrayList<cp> arrayList) {
        this.a = null;
        new ArrayList();
        this.a = str;
        this.b = arrayList;
    }

    public String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, org.json.JSONObject] */
    @Override // com.umeng.analytics.pro.cu
    public JSONObject b() {
        try {
            ?? size = this.b.size();
            try {
                if (size == 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("actionName", this.a);
                    jSONObject.put("delay", 0L);
                    return jSONObject;
                }
                for (int i = 0; i < size; i++) {
                    if (this.b.get(i).b()) {
                        return null;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("actionName", this.a);
                jSONObject2.put("delay", 0L);
                return jSONObject2;
            } catch (Throwable unused) {
                return size;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
