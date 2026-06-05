package me.hd.wauxv.data.bean;

import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC0145Ujhhgtgfeyxiexzf;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C3438feyxiexzfUjhhgtg;
import p000.C3442feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ConversationBean {
    private final String content;
    private final long conversationTime;
    private final String digest;
    private final String digestUser;
    private final long flag;
    private final int isSendInt;
    private final int msgCount;
    private final String msgType;
    private final Object origin;
    private final String parentRef;
    private final int unReadCount;
    private final String username;

    public ConversationBean(Object obj) {
        this.origin = obj;
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_msgCount";
        this.msgCount = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).intValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "field_username";
        this.username = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "field_unReadCount";
        this.unReadCount = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf()).intValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "field_isSend";
        this.isSendInt = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4939Ujhhgtgfeyxiexzf()).intValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "field_conversationTime";
        this.conversationTime = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5)).m4939Ujhhgtgfeyxiexzf()).longValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.f1479Ujhhgtgfeyxiexzf = "field_content";
        this.content = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7.f1479Ujhhgtgfeyxiexzf = "field_msgType";
        this.msgType = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8.f1479Ujhhgtgfeyxiexzf = "field_flag";
        this.flag = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8)).m4939Ujhhgtgfeyxiexzf()).longValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9.f1479Ujhhgtgfeyxiexzf = "field_digest";
        this.digest = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10.f1479Ujhhgtgfeyxiexzf = "field_digestUser";
        this.digestUser = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11.f1479Ujhhgtgfeyxiexzf = "field_parentRef";
        this.parentRef = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11)).m4939Ujhhgtgfeyxiexzf();
    }

    public final String getContent() {
        return this.content;
    }

    public final long getConversationTime() {
        return this.conversationTime;
    }

    public final String getDigest() {
        return this.digest;
    }

    public final String getDigestUser() {
        return this.digestUser;
    }

    public final long getFlag() {
        return this.flag;
    }

    public final int getMsgCount() {
        return this.msgCount;
    }

    public final String getMsgType() {
        return this.msgType;
    }

    public final Object getOrigin() {
        return this.origin;
    }

    public final String getParentRef() {
        return this.parentRef;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean isSend() {
        return this.isSendInt == 1;
    }

    public final int isSendInt() {
        return this.isSendInt;
    }
}
