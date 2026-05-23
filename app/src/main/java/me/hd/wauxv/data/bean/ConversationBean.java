package me.hd.wauxv.data.bean;

import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC0968;
import p000.AbstractC1574;
import p000.AbstractC1745;
import p000.AbstractC2784;
import p000.C1299;
import p000.C1315;

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
        int i = AbstractC1745.f5844;
        C1299 c1299M3490 = AbstractC0968.m2484(obj).m3490();
        String[] strArr = AbstractC1574.f5469;
        c1299M3490.f6370 = "field_msgCount";
        this.msgCount = ((Number) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).intValue();
        C1299 c1299M3491 = AbstractC0968.m2484(obj).m3490();
        c1299M3491.f6370 = "field_username";
        this.username = (String) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024();
        C1299 c1299M3492 = AbstractC0968.m2484(obj).m3490();
        c1299M3492.f6370 = "field_unReadCount";
        this.unReadCount = ((Number) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024()).intValue();
        C1299 c1299M3493 = AbstractC0968.m2484(obj).m3490();
        c1299M3493.f6370 = "field_isSend";
        this.isSendInt = ((Number) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024()).intValue();
        C1299 c1299M3494 = AbstractC0968.m2484(obj).m3490();
        c1299M3494.f6370 = "field_conversationTime";
        this.conversationTime = ((Number) ((C1315) AbstractC2784.m4741(c1299M3494)).m3024()).longValue();
        C1299 c1299M3495 = AbstractC0968.m2484(obj).m3490();
        c1299M3495.f6370 = "field_content";
        this.content = (String) ((C1315) AbstractC2784.m4741(c1299M3495)).m3024();
        C1299 c1299M3496 = AbstractC0968.m2484(obj).m3490();
        c1299M3496.f6370 = "field_msgType";
        this.msgType = (String) ((C1315) AbstractC2784.m4741(c1299M3496)).m3024();
        C1299 c1299M3497 = AbstractC0968.m2484(obj).m3490();
        c1299M3497.f6370 = "field_flag";
        this.flag = ((Number) ((C1315) AbstractC2784.m4741(c1299M3497)).m3024()).longValue();
        C1299 c1299M3498 = AbstractC0968.m2484(obj).m3490();
        c1299M3498.f6370 = "field_digest";
        this.digest = (String) ((C1315) AbstractC2784.m4741(c1299M3498)).m3024();
        C1299 c1299M3499 = AbstractC0968.m2484(obj).m3490();
        c1299M3499.f6370 = "field_digestUser";
        this.digestUser = (String) ((C1315) AbstractC2784.m4741(c1299M3499)).m3024();
        C1299 c1299M34910 = AbstractC0968.m2484(obj).m3490();
        c1299M34910.f6370 = "field_parentRef";
        this.parentRef = (String) ((C1315) AbstractC2784.m4741(c1299M34910)).m3024();
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
