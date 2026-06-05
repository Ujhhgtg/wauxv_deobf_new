package me.hd.wauxv.data.bean;

import com.alibaba.fastjson2.JSONObject;
import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.C1395feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class PayMsgBean {
    private final String displayName;
    private final Double fee;
    private final Object origin;
    private final Integer status;
    private final String statusDesc;
    private final Integer timestamp;
    private final String username;

    public PayMsgBean(C1395feyxiexzfUjhhgtg c1395feyxiexzfUjhhgtg) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        this.origin = c1395feyxiexzfUjhhgtg;
        this.timestamp = c1395feyxiexzfUjhhgtg.f4903Ujhhgtgfeyxiexzf;
        this.username = c1395feyxiexzfUjhhgtg.f4899Ujhhgtgfeyxiexzf;
        this.displayName = c1395feyxiexzfUjhhgtg.f4906Ujhhgtgfeyxiexzf;
        this.fee = c1395feyxiexzfUjhhgtg.f4901Ujhhgtgfeyxiexzf;
        Integer num = c1395feyxiexzfUjhhgtg.f4905Ujhhgtgfeyxiexzf;
        this.status = num;
        this.statusDesc = (num != null && num.intValue() == 0) ? MagicFactory.get(4928285349353883018L, strArr) : (num != null && num.intValue() == 1) ? MagicFactory.get(4928285319289111946L, strArr) : (num != null && num.intValue() == 2) ? MagicFactory.get(4928285435253228938L, strArr) : MagicFactory.get(4928285413778392458L, strArr);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Double getFee() {
        return this.fee;
    }

    public final Object getOrigin() {
        return this.origin;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final Integer getTimestamp() {
        return this.timestamp;
    }

    public final String getUsername() {
        return this.username;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        jSONObject.put(MagicFactory.get(4928285392303555978L, strArr), this.timestamp);
        jSONObject.put(MagicFactory.get(4928284387281208714L, strArr), this.username);
        jSONObject.put(MagicFactory.get(4928284348626503050L, strArr), this.displayName);
        jSONObject.put(MagicFactory.get(4928284434525848970L, strArr), this.fee);
        jSONObject.put(MagicFactory.get(4928284417345979786L, strArr), this.status);
        jSONObject.put(MagicFactory.get(4928284524720162186L, strArr), this.statusDesc);
        return jSONObject.toString();
    }
}
