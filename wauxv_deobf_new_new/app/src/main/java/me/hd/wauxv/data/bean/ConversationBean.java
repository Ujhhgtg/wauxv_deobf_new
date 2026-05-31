package me.hd.wauxv.data.bean;

import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC1471;
import p000.AbstractC1768;
import p000.AbstractC2727;
import p000.AbstractC2844;
import p000.C1300;
import p000.C1316;

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
        int i = AbstractC1768.f5906;
        C1300 c1300M3558 = AbstractC2727.m4713(obj).m3558();
        String[] strArr = AbstractC1471.f5234;
        c1300M3558.f6475 = "field_msgCount";
        this.msgCount = ((Number) ((C1316) AbstractC2844.m4775(c1300M3558)).m3127()).intValue();
        C1300 c1300M3559 = AbstractC2727.m4713(obj).m3558();
        c1300M3559.f6475 = "field_username";
        this.username = (String) ((C1316) AbstractC2844.m4775(c1300M3559)).m3127();
        C1300 c1300M35510 = AbstractC2727.m4713(obj).m3558();
        c1300M35510.f6475 = "field_unReadCount";
        this.unReadCount = ((Number) ((C1316) AbstractC2844.m4775(c1300M35510)).m3127()).intValue();
        C1300 c1300M35511 = AbstractC2727.m4713(obj).m3558();
        c1300M35511.f6475 = "field_isSend";
        this.isSendInt = ((Number) ((C1316) AbstractC2844.m4775(c1300M35511)).m3127()).intValue();
        C1300 c1300M35512 = AbstractC2727.m4713(obj).m3558();
        c1300M35512.f6475 = "field_conversationTime";
        this.conversationTime = ((Number) ((C1316) AbstractC2844.m4775(c1300M35512)).m3127()).longValue();
        C1300 c1300M35513 = AbstractC2727.m4713(obj).m3558();
        c1300M35513.f6475 = "field_content";
        this.content = (String) ((C1316) AbstractC2844.m4775(c1300M35513)).m3127();
        C1300 c1300M35514 = AbstractC2727.m4713(obj).m3558();
        c1300M35514.f6475 = "field_msgType";
        this.msgType = (String) ((C1316) AbstractC2844.m4775(c1300M35514)).m3127();
        C1300 c1300M35515 = AbstractC2727.m4713(obj).m3558();
        c1300M35515.f6475 = "field_flag";
        this.flag = ((Number) ((C1316) AbstractC2844.m4775(c1300M35515)).m3127()).longValue();
        C1300 c1300M35516 = AbstractC2727.m4713(obj).m3558();
        c1300M35516.f6475 = "field_digest";
        this.digest = (String) ((C1316) AbstractC2844.m4775(c1300M35516)).m3127();
        C1300 c1300M35517 = AbstractC2727.m4713(obj).m3558();
        c1300M35517.f6475 = "field_digestUser";
        this.digestUser = (String) ((C1316) AbstractC2844.m4775(c1300M35517)).m3127();
        C1300 c1300M35518 = AbstractC2727.m4713(obj).m3558();
        c1300M35518.f6475 = "field_parentRef";
        this.parentRef = (String) ((C1316) AbstractC2844.m4775(c1300M35518)).m3127();
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
