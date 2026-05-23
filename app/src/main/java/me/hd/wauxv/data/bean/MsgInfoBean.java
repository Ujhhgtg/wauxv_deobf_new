package me.hd.wauxv.data.bean;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import p000.AbstractC0270;
import p000.AbstractC0745;
import p000.AbstractC0968;
import p000.AbstractC1574;
import p000.AbstractC2207;
import p000.AbstractC2784;
import p000.AbstractC2834;
import p000.AbstractC2841;
import p000.AbstractC2848;
import p000.C0505;
import p000.C0674;
import p000.C0772;
import p000.C1189;
import p000.C1299;
import p000.C1315;
import p000.EnumC3517;
import p000.EnumC3673;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MsgInfoBean {
    private final long createTime;
    private final String imgPath;
    private final Integer isSendInt;
    private final byte[] lvBuffer;
    private final long msgId;
    private final Long msgSeq;
    private final Long msgSvrId;
    private final Object origin;
    private final String originContent;
    private final String talker;
    private final Integer talkerId;
    private final int type;

    public MsgInfoBean(Object obj) {
        this.origin = obj;
        int i = 0;
        C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj).m3490();
        String[] strArr = AbstractC1574.f5469;
        c1299M3490.name = "field_msgId";
        this.msgId = ((Number) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).longValue();
        C1299 c1299M3491 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3491.name = "field_msgSvrId";
        this.msgSvrId = (Long) ((C1315) AbstractC2784.m4741(c1299M3491)).m3024();
        C1299 c1299M3492 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3492.name = "field_type";
        this.type = ((Number) ((C1315) AbstractC2784.m4741(c1299M3492)).m3024()).intValue();
        C1299 c1299M3493 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3493.name = "field_isSend";
        this.isSendInt = (Integer) ((C1315) AbstractC2784.m4741(c1299M3493)).m3024();
        C1299 c1299M3494 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3494.name = "field_createTime";
        this.createTime = ((Number) ((C1315) AbstractC2784.m4741(c1299M3494)).m3024()).longValue();
        C1299 c1299M3495 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3495.name = "field_talker";
        this.talker = (String) ((C1315) AbstractC2784.m4741(c1299M3495)).m3024();
        C1299 c1299M3496 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3496.name = "field_content";
        this.originContent = (String) ((C1315) AbstractC2784.m4741(c1299M3496)).m3024();
        C1299 c1299M3497 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3497.name = "field_imgPath";
        this.imgPath = (String) ((C1315) AbstractC2784.m4741(c1299M3497)).m3024();
        C1299 c1299M3498 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3498.name = "field_lvbuffer";
        this.lvBuffer = (byte[]) ((C1315) AbstractC2784.m4741(c1299M3498)).m3024();
        C1299 c1299M3499 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M3499.name = "field_talkerId";
        this.talkerId = (Integer) ((C1315) AbstractC2784.m4741(c1299M3499)).m3024();
        C1299 c1299M34910 = AbstractC0968.startMethodResolution_(obj).m3490();
        c1299M34910.name = "field_msgSeq";
        this.msgSeq = (Long) ((C1315) AbstractC2784.m4741(c1299M34910)).m3024();
    }

    public final List<String> getAtUserList() {
        JSONObject jSONObjectM4821 = AbstractC2834.m4821(getMsgSource());
        String[] strArr = AbstractC1574.f5469;
        Object byPath = jSONObjectM4821.getByPath("msgsource.atuserlist");
        String str = byPath instanceof String ? (String) byPath : null;
        if (str == null || str.length() == 0) {
            return C1189.f4329;
        }
        List listM4843 = AbstractC2841.m4843(str, new String[]{","});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM4843) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getContent() {
        String[] strArr = AbstractC1574.f5469;
        if (isText()) {
            if (!isGroupChat()) {
                return this.originContent;
            }
            if (isSend()) {
                return this.originContent;
            }
            String str = this.originContent;
            return AbstractC2841.m4844(str, "\n", str);
        }
        if (isImage()) {
            String str2 = this.originContent;
            if (str2 != null) {
                if (AbstractC2841.m4828(str2, "<msg>", false) && AbstractC2841.m4828(str2, "</msg>", false)) {
                    str2 = "<msg>" + AbstractC2834.m4817(AbstractC2841.m4846(AbstractC2841.m4844(str2, "<msg>", str2), "</msg>")) + "</msg>";
                } else if (str2.length() == 0) {
                    str2 = this.imgPath;
                }
                if (str2 != null) {
                    return str2;
                }
            }
            String str3 = this.imgPath;
            return str3 == null ? "" : str3;
        }
        if (isEmoji()) {
            String str4 = this.originContent;
            if (!AbstractC2841.m4828(str4, "<msg>", false) || !AbstractC2841.m4828(str4, "</msg>", false)) {
                return str4;
            }
            return "<msg>" + AbstractC2834.m4817(AbstractC2841.m4846(AbstractC2841.m4844(str4, "<msg>", str4), "</msg>")) + "</msg>";
        }
        if (isVoice() || isVideo()) {
            String str5 = this.originContent;
            return (AbstractC2841.m4828(str5, "<msg>", false) && AbstractC2841.m4828(str5, "</msg>", false)) ? AbstractC2841.m4845(AbstractC2841.m4844(str5, "voicelength=\"", str5), "\"") : AbstractC2841.m4845(AbstractC2841.m4844(str5, ":", str5), ":");
        }
        if (isShareCard()) {
            String str6 = this.originContent;
            return "<msg " + AbstractC2834.m4817(AbstractC2841.m4846(AbstractC2841.m4844(str6, "<msg", str6), "/>")) + " />";
        }
        if (true && !isLocation() && !isApp() && !isLink() && !isTransfer() && !isRedBag() && !isVideoNumberVideo() && !isNote() && !isQuote() && !isFile()) {
            return isPat() ? getPatMsg().getTemplate() : this.originContent;
        }
        String str7 = this.originContent;
        return "<msg>" + AbstractC2834.m4817(AbstractC2841.m4846(AbstractC2841.m4844(str7, "<msg>", str7), "</msg>")) + "</msg>";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final FileMsg getFileMsg() {
        if (isFile()) {
            return new FileMsg(this.originContent);
        }
        return null;
    }

    public final String getImgPath() {
        return this.imgPath;
    }

    public final byte[] getLvBuffer() {
        return this.lvBuffer;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final Long getMsgSeq() {
        return this.msgSeq;
    }

    public final String getMsgSource() {
        String[] strArr = AbstractC1574.f5469;
        byte[] bArr = this.lvBuffer;
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        C0505 c0505 = new C0505(0);
        if (false || bArr[0] != 123 || bArr[bArr.length - 1] != 125) {
            return "";
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        c0505.f2174 = byteBufferWrap;
        ByteBuffer byteBuffer = null;
        if (false) {
            "buffer";
            byteBufferWrap = null;
        }
        byteBufferWrap.position(1);
        if (!c0505.m1807()) {
            ByteBuffer byteBuffer2 = c0505.f2174;
            if (byteBuffer2 == null) {
                "buffer";
                byteBuffer2 = null;
            }
            short s = byteBuffer2.getShort();
            if (s > 3072) {
                throw new IllegalArgumentException("Buffer String Length Error".toString());
            }
            if (s != 0) {
                ByteBuffer byteBuffer3 = c0505.f2174;
                if (byteBuffer3 == null) {
                    "buffer";
                    byteBuffer3 = null;
                }
                ByteBuffer byteBuffer4 = c0505.f2174;
                if (byteBuffer4 == null) {
                    "buffer";
                    byteBuffer4 = null;
                }
                byteBuffer3.position(byteBuffer4.position() + s);
            }
        }
        if (!c0505.m1807()) {
            ByteBuffer byteBuffer5 = c0505.f2174;
            if (byteBuffer5 == null) {
                "buffer";
                byteBuffer5 = null;
            }
            ByteBuffer byteBuffer6 = c0505.f2174;
            if (byteBuffer6 == null) {
                "buffer";
                byteBuffer6 = null;
            }
            byteBuffer5.position(byteBuffer6.position() + 4);
        }
        if (c0505.m1807()) {
            return "";
        }
        ByteBuffer byteBuffer7 = c0505.f2174;
        if (byteBuffer7 == null) {
            "buffer";
            byteBuffer7 = null;
        }
        int i = byteBuffer7.getShort();
        if (i > 3072) {
            throw new IllegalArgumentException("Buffer String Length Error".toString());
        }
        if (i == 0) {
            return "";
        }
        byte[] bArr2 = new byte[i];
        ByteBuffer byteBuffer8 = c0505.f2174;
        if (byteBuffer8 == null) {
            "buffer";
        } else {
            byteBuffer = byteBuffer8;
        }
        byteBuffer.get(bArr2);
        return new String(bArr2, StandardCharsets.UTF_8);
    }

    public final Long getMsgSvrId() {
        return this.msgSvrId;
    }

    public final Object getOrigin() {
        return this.origin;
    }

    public final String getOriginContent() {
        return this.originContent;
    }

    public final PatMsg getPatMsg() {
        if (isPat()) {
            return new PatMsg(this.originContent);
        }
        return null;
    }

    public final QuoteMsg getQuoteMsg() {
        if (isQuote()) {
            return new QuoteMsg(this.originContent);
        }
        return null;
    }

    public final String getSendTalker() {
        String[] strArr = AbstractC1574.f5469;
        if (isSystem()) {
            return "system";
        }
        if (isPat()) {
            return getPatMsg().getFromUser();
        }
        if (!isSend()) {
            return isGroupChat() ? AbstractC2841.m4845(this.originContent, ":") : this.talker;
        }
        Object objM2263 = C0772.m2263(C0772.f2872, EnumC3517.f11022.f11027);
        return (String) objM2263;
    }

    public final String getTalker() {
        return this.talker;
    }

    public final Integer getTalkerId() {
        return this.talkerId;
    }

    public final TransferMsg getTransferMsg() {
        if (isTransfer()) {
            return new TransferMsg(this.originContent);
        }
        return null;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isAnnounceAll() {
        return getAtUserList().contains("announcement@all");
    }

    public final boolean isApp() {
        return this.type == EnumC3673.f11476.f11492;
    }

    public final boolean isAtMe() {
        List<String> atUserList = getAtUserList();
        Object objM2263 = C0772.m2263(C0772.f2872, EnumC3517.f11022.f11027);
        return atUserList.contains((String) objM2263);
    }

    public final boolean isChatroom() {
        return this.talker.endsWith("@chatroom");
    }

    public final boolean isEmoji() {
        return this.type == EnumC3673.f11474.f11492;
    }

    public final boolean isEnumMsg(EnumC3673 enumC3673) {
        return this.type == enumC3673.f11492;
    }

    public final boolean isFile() {
        return this.type == EnumC3673.f11490.f11492;
    }

    public final boolean isGroupChat() {
        return isChatroom() || isImChatroom();
    }

    public final boolean isImChatroom() {
        String str = this.talker;
        String[] strArr = AbstractC1574.f5469;
        boolean zEndsWith = str.endsWith("@im.chatroom");
        C0674 c0674 = C0674.f2557;
        String str2 = this.talker;
        
        Object objM2066 = C0674.m2066(str2);
        if (objM2066 != null) {
            
            int i = 0;
            C1299 c1299M3490 = AbstractC0968.startMethodResolution_(objM2066).m3490();
            c1299M3490.name = "field_chatroomStatus";
            boolean z = this.talker.endsWith("@chatroom") && (((Number) ((C1315) AbstractC2784.m4741(c1299M3490)).m3024()).intValue() & 131072) == 131072;
            if (zEndsWith || z) {
                return true;
            }
        }
        return false;
    }

    public final boolean isImage() {
        return this.type == EnumC3673.f11470.f11492;
    }

    public final boolean isLink() {
        return this.type == EnumC3673.f11479.f11492;
    }

    public final boolean isLocation() {
        return this.type == EnumC3673.f11475.f11492;
    }

    public final boolean isNote() {
        return this.type == EnumC3673.f11487.f11492;
    }

    public final boolean isNotifyAll() {
        boolean z;
        boolean z2;
        Object objM2263 = C0772.m2263(C0772.f2872, EnumC3517.f11022.f11027);
        String[] strArr = AbstractC1574.f5469;
        List listM2212 = AbstractC0745.listOf((String) objM2263, "notify@all");
        if (!listM2212.isEmpty()) {
            Iterator it = listM2212.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (getAtUserList().contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        List listM2213 = AbstractC0745.listOf("@所有人", "@ all people");
        if (!listM2213.isEmpty()) {
            Iterator it2 = listM2213.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (AbstractC2841.m4828(getContent(), (String) it2.next(), false)) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        return z && z2;
    }

    public final boolean isOfficialAccount() {
        return this.talker.startsWith("gh_");
    }

    public final boolean isOpenIM() {
        return this.talker.endsWith("@openim");
    }

    public final boolean isPat() {
        return this.type == EnumC3673.f11489.f11492;
    }

    public final boolean isPrivateChat() {
        String[] strArr = AbstractC1574.f5469;
        Set setM1390 = AbstractC0270.m1390(new String[]{"gh_", "@chatroom", "weixin", "filehelper", "qqmail"});
        if (!this.talker.startsWith("wxid_") && !setM1390.isEmpty()) {
            Iterator it = setM1390.iterator();
            while (it.hasNext()) {
                if (AbstractC2841.m4828(this.talker, (String) it.next(), true)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isQuote() {
        return this.type == EnumC3673.f11488.f11492;
    }

    public final boolean isRedBag() {
        int i = this.type;
        return i == EnumC3673.f11484.f11492 || i == EnumC3673.f11485.f11492;
    }

    public final boolean isSend() {
        Integer num = this.isSendInt;
        return num != null && num.intValue() == 1;
    }

    public final Integer isSendInt() {
        return this.isSendInt;
    }

    public final boolean isShareCard() {
        return this.type == EnumC3673.f11472.f11492;
    }

    public final boolean isSystem() {
        return this.type == EnumC3673.f11478.f11492;
    }

    public final boolean isText() {
        return this.type == EnumC3673.f11469.f11492;
    }

    public final boolean isTransfer() {
        return this.type == EnumC3673.f11483.f11492;
    }

    public final boolean isVideo() {
        return this.type == EnumC3673.f11473.f11492;
    }

    public final boolean isVideoNumberVideo() {
        return this.type == EnumC3673.f11486.f11492;
    }

    public final boolean isVoice() {
        return this.type == EnumC3673.f11471.f11492;
    }

    public final boolean isVoip() {
        return this.type == EnumC3673.f11477.f11492;
    }

    public final boolean isVoipVideo() {
        return AbstractC2207.m4087(getContent(), "voip_content_video");
    }

    public final boolean isVoipVoice() {
        return AbstractC2207.m4087(getContent(), "voip_content_voice");
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = AbstractC1574.f5469;
        jSONObject.put("msgId", Long.valueOf(this.msgId));
        jSONObject.put("msgSvrId", this.msgSvrId);
        jSONObject.put("type", Integer.valueOf(this.type));
        jSONObject.put("isSend", Boolean.valueOf(isSend()));
        jSONObject.put("createTime", Long.valueOf(this.createTime));
        jSONObject.put("talker", this.talker);
        jSONObject.put("sendTalker", getSendTalker());
        jSONObject.put("content", getContent());
        jSONObject.put("imgPath", this.imgPath);
        jSONObject.put("msgSource", getMsgSource());
        jSONObject.put("talkerId", this.talkerId);
        jSONObject.put("msgSeq", this.msgSeq);
        return jSONObject.toString();
    }

    /* JADX INFO: compiled from: obf */
    public static final class FileMsg {
        private final String ext;
        private final JSONObject json;
        private final String md5;
        private final long size;
        private final String title;

        /* JADX WARN: Illegal instructions before constructor call */
        public FileMsg(String str) {
            String[] strArr = AbstractC1574.f5469;
            this(AbstractC2834.m4821("<msg>" + AbstractC2834.m4817(AbstractC2841.m4846(AbstractC2841.m4844(str, "<msg>", str), "</msg>")) + "</msg>"));
        }

        public final String getExt() {
            return this.ext;
        }

        public final JSONObject getJson() {
            return this.json;
        }

        public final String getMd5() {
            return this.md5;
        }

        public final long getSize() {
            return this.size;
        }

        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = AbstractC1574.f5469;
            jSONObject.put("title", this.title);
            jSONObject.put("size", Integer.valueOf(jSONObject.size()));
            jSONObject.put("ext", this.ext);
            jSONObject.put("md5", this.md5);
            return jSONObject.toString();
        }

        public FileMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC1574.f5469;
            this.title = String.valueOf(jSONObject.getByPath("msg.appmsg.title"));
            this.size = Long.parseLong(String.valueOf(jSONObject.getByPath("msg.appmsg.appattach.totallen")));
            this.ext = String.valueOf(jSONObject.getByPath("msg.appmsg.appattach.fileext"));
            this.md5 = String.valueOf(jSONObject.getByPath("msg.appmsg.md5"));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class QuoteMsg {
        private final String displayName;
        private final JSONObject json;
        private final String msgSource;
        private final String originContent;
        private final String sendTalker;
        private final long svrId;
        private final String talker;
        private final String title;
        private final int type;

        /* JADX WARN: Illegal instructions before constructor call */
        public QuoteMsg(String str) {
            String[] strArr = AbstractC1574.f5469;
            this(AbstractC2834.m4821("<msg>" + AbstractC2834.m4817(AbstractC2841.m4846(AbstractC2841.m4844(str, "<msg>", str), "</msg>")) + "</msg>"));
        }

        public final String getContent() {
            String[] strArr = AbstractC1574.f5469;
            int i = this.type;
            if (i == EnumC3673.f11469.f11492) {
                return this.originContent;
            }
            if (i == EnumC3673.f11470.f11492) {
                return "图片";
            }
            if (i == EnumC3673.f11473.f11492) {
                return "视频";
            }
            if (i == EnumC3673.f11474.f11492) {
                return "表情";
            }
            return i == EnumC3673.f11476.f11492 ? String.valueOf(this.json.getByPath("msg.appmsg.refermsg.content.msg.appmsg.title")) : this.originContent;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final JSONObject getJson() {
            return this.json;
        }

        public final String getMsgSource() {
            return this.msgSource;
        }

        public final String getOriginContent() {
            return this.originContent;
        }

        public final String getSendTalker() {
            return this.sendTalker;
        }

        public final long getSvrId() {
            return this.svrId;
        }

        public final String getTalker() {
            return this.talker;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getType() {
            return this.type;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = AbstractC1574.f5469;
            jSONObject.put("title", this.title);
            jSONObject.put("msgSource", this.msgSource);
            jSONObject.put("svrId", Long.valueOf(this.svrId));
            jSONObject.put("sendTalker", this.sendTalker);
            jSONObject.put("displayName", this.displayName);
            jSONObject.put("talker", this.talker);
            jSONObject.put("type", Integer.valueOf(this.type));
            jSONObject.put("content", getContent());
            return jSONObject.toString();
        }

        public QuoteMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC1574.f5469;
            this.title = String.valueOf(jSONObject.getByPath("msg.appmsg.title"));
            this.msgSource = String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.msgsource"));
            Long lM4854 = AbstractC2848.m4854(String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.svrid")));
            this.svrId = lM4854 != null ? lM4854.longValue() : 0L;
            this.sendTalker = String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.chatusr"));
            this.displayName = String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.displayname"));
            this.talker = String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.fromusr"));
            this.type = Integer.parseInt(String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.type")));
            this.originContent = String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.content"));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class TransferMsg {
        private final long beginTransferTime;
        private final String des;
        private final String feeDesc;
        private final int invalidTime;
        private final JSONObject json;
        private final String payerUsername;
        private final String receiverUsername;
        private final String title;
        private final String transactionId;
        private final String transferId;

        /* JADX WARN: Illegal instructions before constructor call */
        public TransferMsg(String str) {
            String[] strArr = AbstractC1574.f5469;
            this(AbstractC2834.m4821("<msg>" + AbstractC2834.m4817(AbstractC2841.m4846(AbstractC2841.m4844(str, "<msg>", str), "</msg>")) + "</msg>"));
        }

        public final long getBeginTransferTime() {
            return this.beginTransferTime;
        }

        public final String getDes() {
            return this.des;
        }

        public final String getFeeDesc() {
            return this.feeDesc;
        }

        public final int getInvalidTime() {
            return this.invalidTime;
        }

        public final JSONObject getJson() {
            return this.json;
        }

        public final String getPayerUsername() {
            return this.payerUsername;
        }

        public final String getReceiverUsername() {
            return this.receiverUsername;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTransactionId() {
            return this.transactionId;
        }

        public final String getTransferId() {
            return this.transferId;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = AbstractC1574.f5469;
            jSONObject.put("title", this.title);
            jSONObject.put("des", this.des);
            jSONObject.put("feeDesc", this.feeDesc);
            jSONObject.put("transactionId", this.transactionId);
            jSONObject.put("transferId", this.transferId);
            jSONObject.put("invalidTime", Integer.valueOf(this.invalidTime));
            jSONObject.put("beginTransferTime", Long.valueOf(this.beginTransferTime));
            jSONObject.put("receiverUsername", this.receiverUsername);
            jSONObject.put("payerUsername", this.payerUsername);
            return jSONObject.toString();
        }

        public TransferMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            this.title = String.valueOf(jSONObject.getByPath("msg.appmsg.title"));
            this.des = String.valueOf(jSONObject.getByPath("msg.appmsg.des"));
            this.feeDesc = String.valueOf(jSONObject.getByPath("msg.appmsg.wcpayinfo.feedesc"));
            this.transactionId = String.valueOf(jSONObject.getByPath("msg.appmsg.wcpayinfo.transcationid"));
            this.transferId = String.valueOf(jSONObject.getByPath("msg.appmsg.wcpayinfo.transferid"));
            this.invalidTime = Integer.parseInt(String.valueOf(jSONObject.getByPath("msg.appmsg.wcpayinfo.invalidtime")));
            this.beginTransferTime = Long.parseLong(String.valueOf(jSONObject.getByPath("msg.appmsg.wcpayinfo.begintransfertime")));
            this.receiverUsername = String.valueOf(jSONObject.getByPath("msg.appmsg.wcpayinfo.receiver_username"));
            this.payerUsername = String.valueOf(jSONObject.getByPath("msg.appmsg.wcpayinfo.payer_username"));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class PatMsg {
        private final long createTime;
        private final String fromUser;
        private final JSONObject json;
        private final String pattedUser;
        private final int readStatus;
        private final int recordNum;
        private final int showModifyTip;
        private final long svrId;
        private final String talker;
        private final String template;

        public PatMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC1574.f5469;
            this.talker = String.valueOf(jSONObject.getByPath("msg.appmsg.patMsg.chatUser"));
            this.recordNum = Integer.parseInt(String.valueOf(jSONObject.getByPath("msg.appmsg.patMsg.records.recordNum")));
            this.fromUser = String.valueOf(getRecordObj().getByPath("fromUser"));
            this.pattedUser = String.valueOf(getRecordObj().getByPath("pattedUser"));
            this.template = String.valueOf(getRecordObj().getByPath("template"));
            this.createTime = Long.parseLong(String.valueOf(getRecordObj().getByPath("createTime")));
            this.readStatus = Integer.parseInt(String.valueOf(getRecordObj().getByPath("readStatus")));
            this.svrId = Long.parseLong(String.valueOf(getRecordObj().getByPath("svrId")));
            this.showModifyTip = Integer.parseInt(String.valueOf(getRecordObj().getByPath("showModifyTip")));
        }

        public final long getCreateTime() {
            return this.createTime;
        }

        public final String getFromUser() {
            return this.fromUser;
        }

        public final JSONObject getJson() {
            return this.json;
        }

        public final String getPattedUser() {
            return this.pattedUser;
        }

        public final int getReadStatus() {
            return this.readStatus;
        }

        public final int getRecordNum() {
            return this.recordNum;
        }

        public final JSONObject getRecordObj() {
            JSONObject jSONObject = this.json;
            String[] strArr = AbstractC1574.f5469;
            Object byPath = jSONObject.getByPath("msg.appmsg.patMsg.records.record");
            if (byPath instanceof JSONArray) {
                return ((JSONArray) byPath).getJSONObject(0);
            }
            return (JSONObject) byPath;
        }

        public final int getShowModifyTip() {
            return this.showModifyTip;
        }

        public final long getSvrId() {
            return this.svrId;
        }

        public final String getTalker() {
            return this.talker;
        }

        public final String getTemplate() {
            return this.template;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = AbstractC1574.f5469;
            jSONObject.put("talker", this.talker);
            jSONObject.put("recordNum", Integer.valueOf(this.recordNum));
            jSONObject.put("fromUser", this.fromUser);
            jSONObject.put("pattedUser", this.pattedUser);
            jSONObject.put("template", this.template);
            jSONObject.put("createTime", Long.valueOf(this.createTime));
            jSONObject.put("readStatus", Integer.valueOf(this.readStatus));
            jSONObject.put("svrId", Long.valueOf(this.svrId));
            jSONObject.put("showModifyTip", Integer.valueOf(this.showModifyTip));
            return jSONObject.toString();
        }

        public PatMsg(String str) {
            this(AbstractC2834.m4821(str));
        }
    }
}
