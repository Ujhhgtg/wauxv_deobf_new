package me.hd.wauxv.data.bean;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC0145Ujhhgtgfeyxiexzf;
import p000.AbstractC1150feyxiexzfUjhhgtg;
import p000.AbstractC1152feyxiexzfUjhhgtg;
import p000.AbstractC1184feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC2391Ujhhgtgfeyxiexzf;
import p000.AbstractC2852feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C2594feyxiexzfUjhhgtg;
import p000.C2759feyxiexzfUjhhgtg;
import p000.C2882Ujhhgtgfeyxiexzf;
import p000.C2903feyxiexzfUjhhgtg;
import p000.C3052Ujhhgtgfeyxiexzf;
import p000.C3312feyxiexzfUjhhgtg;
import p000.C3438feyxiexzfUjhhgtg;
import p000.C3442feyxiexzfUjhhgtg;
import p000.EnumC1857Ujhhgtgfeyxiexzf;
import p000.EnumC2267feyxiexzfUjhhgtg;

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
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_msgId";
        this.msgId = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).longValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "field_msgSvrId";
        this.msgSvrId = (Long) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "field_type";
        this.type = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf()).intValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "field_isSend";
        this.isSendInt = (Integer) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "field_createTime";
        this.createTime = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5)).m4939Ujhhgtgfeyxiexzf()).longValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.f1479Ujhhgtgfeyxiexzf = "field_talker";
        this.talker = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7.f1479Ujhhgtgfeyxiexzf = "field_content";
        this.originContent = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8.f1479Ujhhgtgfeyxiexzf = "field_imgPath";
        this.imgPath = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9.f1479Ujhhgtgfeyxiexzf = "field_lvbuffer";
        this.lvBuffer = (byte[]) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10.f1479Ujhhgtgfeyxiexzf = "field_talkerId";
        this.talkerId = (Integer) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11.f1479Ujhhgtgfeyxiexzf = "field_msgSeq";
        this.msgSeq = (Long) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11)).m4939Ujhhgtgfeyxiexzf();
    }

    public final List<String> getAtUserList() {
        JSONObject jSONObjectM2619Ujhhgtgfeyxiexzf = AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(getMsgSource());
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Object byPath = jSONObjectM2619Ujhhgtgfeyxiexzf.getByPath("msgsource.atuserlist");
        String str = byPath instanceof String ? (String) byPath : null;
        if (str == null || str.length() == 0) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        List listM2638Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(str, new String[]{","});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2638Ujhhgtgfeyxiexzf) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getContent() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (isText()) {
            if (!isGroupChat()) {
                return this.originContent;
            }
            if (isSend()) {
                return this.originContent;
            }
            String str = this.originContent;
            return AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, "\n", str);
        }
        if (isImage()) {
            String str2 = this.originContent;
            if (str2 != null) {
                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str2, "<msg>", false) && AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str2, "</msg>", false)) {
                    str2 = "<msg>" + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str2, "<msg>", str2), "</msg>")) + "</msg>";
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
            if (!AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str4, "<msg>", false) || !AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str4, "</msg>", false)) {
                return str4;
            }
            return "<msg>" + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str4, "<msg>", str4), "</msg>")) + "</msg>";
        }
        if (isVoice() || isVideo()) {
            String str5 = this.originContent;
            return (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str5, "<msg>", false) && AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str5, "</msg>", false)) ? AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str5, "voicelength=\"", str5), "\"") : AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str5, ":", str5), ":");
        }
        if (isShareCard()) {
            String str6 = this.originContent;
            return "<msg " + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str6, "<msg", str6), "/>")) + " />";
        }
        if (!isShareCard() && !isLocation() && !isApp() && !isLink() && !isTransfer() && !isRedBag() && !isVideoNumberVideo() && !isNote() && !isQuote() && !isFile()) {
            return isPat() ? getPatMsg().getTemplate() : this.originContent;
        }
        String str7 = this.originContent;
        return "<msg>" + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str7, "<msg>", str7), "</msg>")) + "</msg>";
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

    public final ImageMsg getImageMsg() {
        String str;
        if (!isImage() || (str = this.originContent) == null || str.length() == 0) {
            return null;
        }
        return new ImageMsg(this.originContent);
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
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        byte[] bArr = this.lvBuffer;
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        C2594feyxiexzfUjhhgtg c2594feyxiexzfUjhhgtg = new C2594feyxiexzfUjhhgtg(0);
        if (bArr.length == 0 || bArr[0] != 123 || bArr[bArr.length - 1] != 125) {
            return "";
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf = byteBufferWrap;
        ByteBuffer byteBuffer = null;
        if (byteBufferWrap == null) {
            "buffer";
            byteBufferWrap = null;
        }
        byteBufferWrap.position(1);
        if (!c2594feyxiexzfUjhhgtg.m3851Ujhhgtgfeyxiexzf()) {
            ByteBuffer byteBuffer2 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
            if (byteBuffer2 == null) {
                "buffer";
                byteBuffer2 = null;
            }
            short s = byteBuffer2.getShort();
            if (s > 3072) {
                throw new IllegalArgumentException("Buffer String Length Error".toString());
            }
            if (s != 0) {
                ByteBuffer byteBuffer3 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
                if (byteBuffer3 == null) {
                    "buffer";
                    byteBuffer3 = null;
                }
                ByteBuffer byteBuffer4 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
                if (byteBuffer4 == null) {
                    "buffer";
                    byteBuffer4 = null;
                }
                byteBuffer3.position(byteBuffer4.position() + s);
            }
        }
        if (!c2594feyxiexzfUjhhgtg.m3851Ujhhgtgfeyxiexzf()) {
            ByteBuffer byteBuffer5 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
            if (byteBuffer5 == null) {
                "buffer";
                byteBuffer5 = null;
            }
            ByteBuffer byteBuffer6 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
            if (byteBuffer6 == null) {
                "buffer";
                byteBuffer6 = null;
            }
            byteBuffer5.position(byteBuffer6.position() + 4);
        }
        if (c2594feyxiexzfUjhhgtg.m3851Ujhhgtgfeyxiexzf()) {
            return "";
        }
        ByteBuffer byteBuffer7 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
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
        ByteBuffer byteBuffer8 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
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
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (isSystem()) {
            return "system";
        }
        if (isRecalled()) {
            return "recalled";
        }
        if (isPat()) {
            return getPatMsg().getFromUser();
        }
        if (!isSend()) {
            return isGroupChat() ? AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(this.originContent, ":") : this.talker;
        }
        Object objM4271feyxiexzfUjhhgtg = C2882Ujhhgtgfeyxiexzf.m4271feyxiexzfUjhhgtg(C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, EnumC1857Ujhhgtgfeyxiexzf.f6228Ujhhgtgfeyxiexzf.f6233Ujhhgtgfeyxiexzf);
        "null cannot be cast to non-null type kotlin.String";
        return (String) objM4271feyxiexzfUjhhgtg;
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
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7414Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isAtMe() {
        List<String> atUserList = getAtUserList();
        Object objM4271feyxiexzfUjhhgtg = C2882Ujhhgtgfeyxiexzf.m4271feyxiexzfUjhhgtg(C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, EnumC1857Ujhhgtgfeyxiexzf.f6228Ujhhgtgfeyxiexzf.f6233Ujhhgtgfeyxiexzf);
        "null cannot be cast to non-null type kotlin.String";
        return atUserList.contains((String) objM4271feyxiexzfUjhhgtg);
    }

    public final boolean isChatroom() {
        return this.talker.endsWith("@chatroom");
    }

    public final boolean isEmoji() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7412Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isEnumMsg(EnumC2267feyxiexzfUjhhgtg enumC2267feyxiexzfUjhhgtg) {
        return this.type == enumC2267feyxiexzfUjhhgtg.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isFile() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7428feyxiexzfUjhhgtg.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isGroupChat() {
        return isChatroom() || isImChatroom();
    }

    public final boolean isImChatroom() {
        String str = this.talker;
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        boolean zEndsWith = str.endsWith("@im.chatroom");
        C2903feyxiexzfUjhhgtg c2903feyxiexzfUjhhgtg = C2903feyxiexzfUjhhgtg.f9182Ujhhgtgfeyxiexzf;
        String str2 = this.talker;
        c2903feyxiexzfUjhhgtg.getClass();
        Object objM4279feyxiexzfUjhhgtg = C2903feyxiexzfUjhhgtg.m4279feyxiexzfUjhhgtg(str2);
        if (objM4279feyxiexzfUjhhgtg != null) {
            C2759feyxiexzfUjhhgtg.f8740Ujhhgtgfeyxiexzf.getClass();
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4279feyxiexzfUjhhgtg).m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "field_chatroomStatus";
            boolean z = this.talker.endsWith("@chatroom") && (((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).intValue() & 131072) == 131072;
            if (zEndsWith || z) {
                return true;
            }
        }
        return false;
    }

    public final boolean isImage() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7408Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isLink() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7417Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isLocation() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7413Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isNote() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7425Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isNotifyAll() {
        boolean z;
        boolean z2;
        Object objM4271feyxiexzfUjhhgtg = C2882Ujhhgtgfeyxiexzf.m4271feyxiexzfUjhhgtg(C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, EnumC1857Ujhhgtgfeyxiexzf.f6228Ujhhgtgfeyxiexzf.f6233Ujhhgtgfeyxiexzf);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        "null cannot be cast to non-null type kotlin.String";
        List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf((String) objM4271feyxiexzfUjhhgtg, "notify@all");
        if (!listM4192Ujhhgtgfeyxiexzf.isEmpty()) {
            Iterator it = listM4192Ujhhgtgfeyxiexzf.iterator();
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
        List listM4192Ujhhgtgfeyxiexzf2 = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf("@所有人", "@ all people");
        if (!listM4192Ujhhgtgfeyxiexzf2.isEmpty()) {
            Iterator it2 = listM4192Ujhhgtgfeyxiexzf2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(getContent(), (String) it2.next(), false)) {
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
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7427Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isPrivateChat() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Set setM3654feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3654feyxiexzfUjhhgtg(new String[]{"gh_", "@chatroom", "weixin", "filehelper", "qqmail"});
        if (!this.talker.startsWith("wxid_") && !setM3654feyxiexzfUjhhgtg.isEmpty()) {
            Iterator it = setM3654feyxiexzfUjhhgtg.iterator();
            while (it.hasNext()) {
                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(this.talker, (String) it.next(), true)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean isQuote() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7426Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isRecalled() {
        int i = this.type;
        return i == EnumC2267feyxiexzfUjhhgtg.f7418Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || i == EnumC2267feyxiexzfUjhhgtg.f7419Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isRedBag() {
        int i = this.type;
        return i == EnumC2267feyxiexzfUjhhgtg.f7422Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf || i == EnumC2267feyxiexzfUjhhgtg.f7423Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isSend() {
        Integer num = this.isSendInt;
        return num != null && num.intValue() == 1;
    }

    public final Integer isSendInt() {
        return this.isSendInt;
    }

    public final boolean isShareCard() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7410Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isSystem() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7416Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isText() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isTransfer() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7421Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isVideo() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7411Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isVideoNumberVideo() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7424Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isVoice() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7409Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isVoip() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7415Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isVoipVideo() {
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(getContent(), "voip_content_video");
    }

    public final boolean isVoipVoice() {
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(getContent(), "voip_content_voice");
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        jSONObject.put("msgId", Long.valueOf(this.msgId));
        jSONObject.put("msgSvrId", this.msgSvrId);
        jSONObject.put("type", Integer.valueOf(this.type));
        jSONObject.put("isSend", Boolean.valueOf(isSend()));
        jSONObject.put("createTime", Long.valueOf(this.createTime));
        jSONObject.put("talker", this.talker);
        jSONObject.put("sendTalker", getSendTalker());
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
        private final String key;
        private final String md5;
        private final long size;
        private final String title;
        private final String url;

        /* JADX WARN: Illegal instructions before constructor call */
        public FileMsg(String str) {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf("<msg>" + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, "<msg>", str), "</msg>")) + "</msg>"));
        }

        public final String getExt() {
            return this.ext;
        }

        public final JSONObject getJson() {
            return this.json;
        }

        public final String getKey() {
            return this.key;
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

        public final String getUrl() {
            return this.url;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            jSONObject.put("title", this.title);
            jSONObject.put("size", Integer.valueOf(jSONObject.size()));
            jSONObject.put("ext", this.ext);
            jSONObject.put("md5", this.md5);
            jSONObject.put("url", this.url);
            jSONObject.put("key", this.key);
            return jSONObject.toString();
        }

        public FileMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this.title = String.valueOf(jSONObject.getByPath("msg.appmsg.title"));
            this.size = Long.parseLong(String.valueOf(jSONObject.getByPath("msg.appmsg.appattach.totallen")));
            this.ext = String.valueOf(jSONObject.getByPath("msg.appmsg.appattach.fileext"));
            this.md5 = String.valueOf(jSONObject.getByPath("msg.appmsg.md5"));
            this.url = String.valueOf(jSONObject.getByPath("msg.appmsg.appattach.cdnattachurl"));
            this.key = String.valueOf(jSONObject.getByPath("msg.appmsg.appattach.aeskey"));
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ImageMsg {
        private final String bigImgUrl;
        private final JSONObject json;
        private final String key;
        private final String md5;
        private final String midImgUrl;
        private final String thumbUrl;

        /* JADX WARN: Illegal instructions before constructor call */
        public ImageMsg(String str) {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf("<msg>" + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, "<msg>", str), "</msg>")) + "</msg>"));
        }

        public final String getBigImgUrl() {
            return this.bigImgUrl;
        }

        public final JSONObject getJson() {
            return this.json;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getMd5() {
            return this.md5;
        }

        public final String getMidImgUrl() {
            return this.midImgUrl;
        }

        public final String getThumbUrl() {
            return this.thumbUrl;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            jSONObject.put("md5", this.md5);
            jSONObject.put("bigImgUrl", this.bigImgUrl);
            jSONObject.put("midImgUrl", this.midImgUrl);
            jSONObject.put("thumbUrl", this.thumbUrl);
            jSONObject.put("key", this.key);
            return jSONObject.toString();
        }

        public ImageMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this.md5 = String.valueOf(jSONObject.getByPath("msg.img.md5"));
            this.bigImgUrl = String.valueOf(jSONObject.getByPath("msg.img.cdnbigimgurl"));
            this.midImgUrl = String.valueOf(jSONObject.getByPath("msg.img.cdnmidimgurl"));
            this.thumbUrl = String.valueOf(jSONObject.getByPath("msg.img.cdnthumburl"));
            this.key = String.valueOf(jSONObject.getByPath("msg.img.aeskey"));
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf("<msg>" + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, "<msg>", str), "</msg>")) + "</msg>"));
        }

        public final String getContent() {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            int i = this.type;
            if (i == EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return this.originContent;
            }
            if (i == EnumC2267feyxiexzfUjhhgtg.f7408Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return "图片";
            }
            if (i == EnumC2267feyxiexzfUjhhgtg.f7411Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return "视频";
            }
            if (i == EnumC2267feyxiexzfUjhhgtg.f7412Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return "表情";
            }
            return i == EnumC2267feyxiexzfUjhhgtg.f7414Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf ? String.valueOf(this.json.getByPath("msg.appmsg.refermsg.content.msg.appmsg.title")) : this.originContent;
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this.title = String.valueOf(jSONObject.getByPath("msg.appmsg.title"));
            this.msgSource = String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.msgsource"));
            Long lM2674feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2674feyxiexzfUjhhgtg(String.valueOf(jSONObject.getByPath("msg.appmsg.refermsg.svrid")));
            this.svrId = lM2674feyxiexzfUjhhgtg != null ? lM2674feyxiexzfUjhhgtg.longValue() : 0L;
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf("<msg>" + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, "<msg>", str), "</msg>")) + "</msg>"));
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            Object byPath = jSONObject.getByPath("msg.appmsg.patMsg.records.record");
            if (byPath instanceof JSONArray) {
                return ((JSONArray) byPath).getJSONObject(0);
            }
            "null cannot be cast to non-null type com.alibaba.fastjson2.JSONObject";
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
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
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
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(str));
        }
    }
}
