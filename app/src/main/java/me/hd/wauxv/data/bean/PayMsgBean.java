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
        this.statusDesc = (num != null && num.intValue() == 0) ? "支付中..." : (num != null && num.intValue() == 1) ? "支付成功" : (num != null && num.intValue() == 2) ? "取消支付" : "未知状态";
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
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put("username", this.username);
        jSONObject.put("displayName", this.displayName);
        jSONObject.put("fee", this.fee);
        jSONObject.put("status", this.status);
        jSONObject.put("statusDesc", this.statusDesc);
        return jSONObject.toString();
    }
}
