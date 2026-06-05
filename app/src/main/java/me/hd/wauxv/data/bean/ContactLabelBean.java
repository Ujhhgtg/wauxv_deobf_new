package me.hd.wauxv.data.bean;

import com.alibaba.fastjson2.JSONObject;
import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC0145Ujhhgtgfeyxiexzf;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C3438feyxiexzfUjhhgtg;
import p000.C3442feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ContactLabelBean {
    private final int id;
    private final String name;
    private final Object origin;

    public ContactLabelBean(Object obj) {
        this.origin = obj;
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_labelID";
        this.id = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).intValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "field_labelName";
        this.name = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf();
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
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        jSONObject.put("id", Integer.valueOf(this.id));
        jSONObject.put("name", this.name);
        return jSONObject.toString();
    }
}
