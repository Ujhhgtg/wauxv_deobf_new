package me.hd.wauxv.data.bean;

import com.alibaba.fastjson2.JSONObject;
import p000.AbstractC0968;
import p000.AbstractC1574;
import p000.AbstractC2784;
import p000.C1299;
import p000.C1315;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ContactBean {
    private final String alias;
    private final String conRemark;
    private final String nickname;
    private final Object origin;
    private final String username;

    public ContactBean(Object obj) {
        this.origin = obj;
        int i = 0;
        C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj).m3490();
        String[] strArr = AbstractC1574.f5469;
        c1299M3490.name = "field_username";
        this.username = (String) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024();
        C1299 c1299M3491 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3491.name = "field_alias";
        this.alias = (String) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024();
        C1299 c1299M3492 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3492.name = "field_conRemark";
        this.conRemark = (String) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024();
        C1299 c1299M3493 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3493.name = "field_nickname";
        this.nickname = (String) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024();
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getConRemark() {
        return this.conRemark;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final Object getOrigin() {
        return this.origin;
    }

    public final String getUsername() {
        return this.username;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = AbstractC1574.f5469;
        jSONObject.put("username", this.username);
        jSONObject.put("alias", this.alias);
        jSONObject.put("conRemark", this.conRemark);
        jSONObject.put("nickname", this.nickname);
        return jSONObject.toString();
    }
}
