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
public final class ContactBean {
    private final String alias;
    private final String conRemark;
    private final String nickname;
    private final Object origin;
    private final String username;

    public ContactBean(Object obj) {
        this.origin = obj;
        int i = AbstractC1768.f5906;
        C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
        String[] strArr = AbstractC1471.f5234;
        c1300M3558.f6475 = "field_username";
        this.username = (String) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127();
        C1300 c1300M3559 = AbstractC2727.m4713(obj).m3558();
        c1300M3559.f6475 = "field_alias";
        this.alias = (String) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127();
        C1300 c1300M35510 = AbstractC2727.m4713(obj).m3558();
        c1300M35510.f6475 = "field_conRemark";
        this.conRemark = (String) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127();
        C1300 c1300M35511 = AbstractC2727.m4713(obj).m3558();
        c1300M35511.f6475 = "field_nickname";
        this.nickname = (String) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127();
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
        String[] strArr = AbstractC1471.f5234;
        jSONObject.put("username", this.username);
        jSONObject.put("alias", this.alias);
        jSONObject.put("conRemark", this.conRemark);
        jSONObject.put("nickname", this.nickname);
        return jSONObject.toString();
    }
}
