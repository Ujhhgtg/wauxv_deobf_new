package me.hd.wauxv.data.bean;

import com.alibaba.fastjson2.JSONObject;
import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC1471;
import p000.AbstractC1768;
import p000.AbstractC2727;
import p000.AbstractC2844;
import p000.C1300;
import p000.C1316;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ContactLabelBean {
    private final int id;
    private final String name;
    private final Object origin;

    public ContactLabelBean(Object obj) {
        this.origin = obj;
        int i = AbstractC1768.f5906;
        C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
        String[] strArr = AbstractC1471.f5234;
        c1300M3558.f6475 = "field_labelID";
        this.id = ((Number) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).intValue();
        C1300 c1300M3559 = AbstractC2727.m4713(obj).m3558();
        c1300M3559.f6475 = "field_labelName";
        this.name = (String) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127();
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getOrigin() {
        return this.origin;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = AbstractC1471.f5234;
        jSONObject.put("id", Integer.valueOf(this.id));
        jSONObject.put("name", this.name);
        return jSONObject.toString();
    }
}
