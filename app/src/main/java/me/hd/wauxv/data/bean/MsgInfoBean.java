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
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928301335222158730L, strArr);
        this.msgId = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).longValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300321609876874L, strArr);
        this.msgSvrId = (Long) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300394624320906L, strArr);
        this.type = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4939Ujhhgtgfeyxiexzf()).intValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300484818634122L, strArr);
        this.isSendInt = (Integer) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300428984059274L, strArr);
        this.createTime = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5)).m4939Ujhhgtgfeyxiexzf()).longValue();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300493408568714L, strArr);
        this.talker = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300575012947338L, strArr);
        this.originContent = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf7)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300652322358666L, strArr);
        this.imgPath = (String) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf8)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300729631769994L, strArr);
        this.lvBuffer = (byte[]) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf9)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928300802646214026L, strArr);
        this.talkerId = (Integer) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf10)).m4939Ujhhgtgfeyxiexzf();
        C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj).m2021Ujhhgtgfeyxiexzf();
        c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928299776149030282L, strArr);
        this.msgSeq = (Long) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf11)).m4939Ujhhgtgfeyxiexzf();
    }

    public final List<String> getAtUserList() {
        JSONObject jSONObjectM2619Ujhhgtgfeyxiexzf = AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(getMsgSource());
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Object byPath = jSONObjectM2619Ujhhgtgfeyxiexzf.getByPath(MagicFactory.get(4928299501271123338L, strArr));
        String str = byPath instanceof String ? (String) byPath : null;
        if (str == null || str.length() == 0) {
            return C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        List listM2638Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2638Ujhhgtgfeyxiexzf(str, new String[]{MagicFactory.get(4928299548515763594L, strArr)});
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
            return AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928299917882951050L, strArr), str);
        }
        if (isImage()) {
            String str2 = this.originContent;
            if (str2 != null) {
                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str2, MagicFactory.get(4928299909293016458L, strArr), false) && AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str2, MagicFactory.get(4928299883523212682L, strArr), false)) {
                    str2 = MagicFactory.get(4928300072501773706L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str2, MagicFactory.get(4928299990897395082L, strArr), str2), MagicFactory.get(4928299965127591306L, strArr))) + MagicFactory.get(4928300046731969930L, strArr);
                } else if (str2.length() == 0) {
                    str2 = this.imgPath;
                }
                if (str2 != null) {
                    return str2;
                }
            }
            String str3 = this.imgPath;
            return str3 == null ? MagicFactory.get(4928300016667198858L, strArr) : str3;
        }
        if (isEmoji()) {
            String str4 = this.originContent;
            if (!AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str4, MagicFactory.get(4928300012372231562L, strArr), false) || !AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str4, MagicFactory.get(4928300124041381258L, strArr), false)) {
                return str4;
            }
            return MagicFactory.get(4928300175580988810L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str4, MagicFactory.get(4928300093976610186L, strArr), str4), MagicFactory.get(4928300205645759882L, strArr))) + MagicFactory.get(4928300149811185034L, strArr);
        }
        if (isVoice() || isVideo()) {
            String str5 = this.originContent;
            return (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str5, MagicFactory.get(4928300257185367434L, strArr), false) && AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str5, MagicFactory.get(4928300231415563658L, strArr), false)) ? AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str5, MagicFactory.get(4928299239278118282L, strArr), str5), MagicFactory.get(4928299316587529610L, strArr)) : AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str5, MagicFactory.get(4928299307997595018L, strArr), str5), MagicFactory.get(4928299299407660426L, strArr));
        }
        if (isShareCard()) {
            String str6 = this.originContent;
            return MagicFactory.get(4928299256457987466L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str6, MagicFactory.get(4928299290817725834L, strArr), str6), MagicFactory.get(4928299269342889354L, strArr))) + MagicFactory.get(4928299368127137162L, strArr);
        }
        if (!isShareCard() && !isLocation() && !isApp() && !isLink() && !isTransfer() && !isRedBag() && !isVideoNumberVideo() && !isNote() && !isQuote() && !isFile()) {
            return isPat() ? getPatMsg().getTemplate() : this.originContent;
        }
        String str7 = this.originContent;
        return MagicFactory.get(4928299432551646602L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str7, MagicFactory.get(4928299350947267978L, strArr), str7), MagicFactory.get(4928299325177464202L, strArr))) + MagicFactory.get(4928299406781842826L, strArr);
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
            return MagicFactory.get(4928299514156025226L, strArr);
        }
        C2594feyxiexzfUjhhgtg c2594feyxiexzfUjhhgtg = new C2594feyxiexzfUjhhgtg(0);
        if (bArr.length == 0 || bArr[0] != 123 || bArr[bArr.length - 1] != 125) {
            return MagicFactory.get(4928299509861057930L, strArr);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf = byteBufferWrap;
        ByteBuffer byteBuffer = null;
        if (byteBufferWrap == null) {
            MagicFactory.get(4928338757272208778L, strArr);
            byteBufferWrap = null;
        }
        byteBufferWrap.position(1);
        if (!c2594feyxiexzfUjhhgtg.m3851Ujhhgtgfeyxiexzf()) {
            ByteBuffer byteBuffer2 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
            if (byteBuffer2 == null) {
                MagicFactory.get(4928337846739142026L, strArr);
                byteBuffer2 = null;
            }
            short s = byteBuffer2.getShort();
            if (s > 3072) {
                throw new IllegalArgumentException(MagicFactory.get(4928337816674370954L, strArr).toString());
            }
            if (s != 0) {
                ByteBuffer byteBuffer3 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
                if (byteBuffer3 == null) {
                    MagicFactory.get(4928337975588160906L, strArr);
                    byteBuffer3 = null;
                }
                ByteBuffer byteBuffer4 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
                if (byteBuffer4 == null) {
                    MagicFactory.get(4928337945523389834L, strArr);
                    byteBuffer4 = null;
                }
                byteBuffer3.position(byteBuffer4.position() + s);
            }
        }
        if (!c2594feyxiexzfUjhhgtg.m3851Ujhhgtgfeyxiexzf()) {
            ByteBuffer byteBuffer5 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
            if (byteBuffer5 == null) {
                MagicFactory.get(4928337705005221258L, strArr);
                byteBuffer5 = null;
            }
            ByteBuffer byteBuffer6 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
            if (byteBuffer6 == null) {
                MagicFactory.get(4928337674940450186L, strArr);
                byteBuffer6 = null;
            }
            byteBuffer5.position(byteBuffer6.position() + 4);
        }
        if (c2594feyxiexzfUjhhgtg.m3851Ujhhgtgfeyxiexzf()) {
            return MagicFactory.get(4928299505566090634L, strArr);
        }
        ByteBuffer byteBuffer7 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
        if (byteBuffer7 == null) {
            MagicFactory.get(4928337524616594826L, strArr);
            byteBuffer7 = null;
        }
        int i = byteBuffer7.getShort();
        if (i > 3072) {
            throw new IllegalArgumentException(MagicFactory.get(4928337494551823754L, strArr).toString());
        }
        if (i == 0) {
            return MagicFactory.get(4928337653465613706L, strArr);
        }
        byte[] bArr2 = new byte[i];
        ByteBuffer byteBuffer8 = c2594feyxiexzfUjhhgtg.f8397Ujhhgtgfeyxiexzf;
        if (byteBuffer8 == null) {
            MagicFactory.get(4928337649170646410L, strArr);
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
            return MagicFactory.get(4928299857753408906L, strArr);
        }
        if (isRecalled()) {
            return MagicFactory.get(4928299827688637834L, strArr);
        }
        if (isPat()) {
            return getPatMsg().getFromUser();
        }
        if (!isSend()) {
            return isGroupChat() ? AbstractC1152feyxiexzfUjhhgtg.m2641Ujhhgtgfeyxiexzf(this.originContent, MagicFactory.get(4928299926472885642L, strArr)) : this.talker;
        }
        Object objM4271feyxiexzfUjhhgtg = C2882Ujhhgtgfeyxiexzf.m4271feyxiexzfUjhhgtg(C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, EnumC1857Ujhhgtgfeyxiexzf.f6228Ujhhgtgfeyxiexzf.f6233Ujhhgtgfeyxiexzf);
        MagicFactory.get(4928274324172834186L, strArr);
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
        return getAtUserList().contains(MagicFactory.get(4928299539925829002L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
    }

    public final boolean isApp() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7414Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isAtMe() {
        List<String> atUserList = getAtUserList();
        Object objM4271feyxiexzfUjhhgtg = C2882Ujhhgtgfeyxiexzf.m4271feyxiexzfUjhhgtg(C2882Ujhhgtgfeyxiexzf.f9150Ujhhgtgfeyxiexzf, EnumC1857Ujhhgtgfeyxiexzf.f6228Ujhhgtgfeyxiexzf.f6233Ujhhgtgfeyxiexzf);
        MagicFactory.get(4928274324172834186L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
        return atUserList.contains((String) objM4271feyxiexzfUjhhgtg);
    }

    public final boolean isChatroom() {
        return this.talker.endsWith(MagicFactory.get(4928285783145579914L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
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
        boolean zEndsWith = str.endsWith(MagicFactory.get(4928285740195906954L, strArr));
        C2903feyxiexzfUjhhgtg c2903feyxiexzfUjhhgtg = C2903feyxiexzfUjhhgtg.f9182Ujhhgtgfeyxiexzf;
        String str2 = this.talker;
        c2903feyxiexzfUjhhgtg.getClass();
        Object objM4279feyxiexzfUjhhgtg = C2903feyxiexzfUjhhgtg.m4279feyxiexzfUjhhgtg(str2);
        if (objM4279feyxiexzfUjhhgtg != null) {
            C2759feyxiexzfUjhhgtg.f8740Ujhhgtgfeyxiexzf.getClass();
            int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM4279feyxiexzfUjhhgtg).m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928214246170297738L, strArr);
            boolean z = this.talker.endsWith(MagicFactory.get(4928285821800285578L, strArr)) && (((Number) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf)).m4939Ujhhgtgfeyxiexzf()).intValue() & 131072) == 131072;
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
        MagicFactory.get(4928274324172834186L, strArr);
        List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf((String) objM4271feyxiexzfUjhhgtg, MagicFactory.get(4928299604350338442L, strArr));
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
        List listM4192Ujhhgtgfeyxiexzf2 = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(MagicFactory.get(4928299694544651658L, strArr), MagicFactory.get(4928299673069815178L, strArr));
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
        return this.talker.startsWith(MagicFactory.get(4928285916289566090L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
    }

    public final boolean isOpenIM() {
        return this.talker.endsWith(MagicFactory.get(4928285680066364810L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
    }

    public final boolean isPat() {
        return this.type == EnumC2267feyxiexzfUjhhgtg.f7427Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf;
    }

    public final boolean isPrivateChat() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Set setM3654feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3654feyxiexzfUjhhgtg(new String[]{MagicFactory.get(4928285461023032714L, strArr), MagicFactory.get(4928285443843163530L, strArr), MagicFactory.get(4928285538332444042L, strArr), MagicFactory.get(4928285645706626442L, strArr), MagicFactory.get(4928285598461986186L, strArr)});
        if (!this.talker.startsWith(MagicFactory.get(4928285705836168586L, strArr)) && !setM3654feyxiexzfUjhhgtg.isEmpty()) {
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
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(getContent(), MagicFactory.get(4928285954944271754L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
    }

    public final boolean isVoipVoice() {
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(getContent(), MagicFactory.get(4928285899109696906L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        jSONObject.put(MagicFactory.get(4928284911267218826L, strArr), Long.valueOf(this.msgId));
        jSONObject.put(MagicFactory.get(4928285022936368522L, strArr), this.msgSvrId);
        jSONObject.put(MagicFactory.get(4928284984281662858L, strArr), Integer.valueOf(this.type));
        jSONObject.put(MagicFactory.get(4928284962806826378L, strArr), Boolean.valueOf(isSend()));
        jSONObject.put(MagicFactory.get(4928285070181008778L, strArr), Long.valueOf(this.createTime));
        jSONObject.put(MagicFactory.get(4928285160375321994L, strArr), this.talker);
        jSONObject.put(MagicFactory.get(4928285130310550922L, strArr), getSendTalker());
        jSONObject.put(MagicFactory.get(4928285220504864138L, strArr), this.imgPath);
        jSONObject.put(MagicFactory.get(4928285186145125770L, strArr), getMsgSource());
        jSONObject.put(MagicFactory.get(4928285280634406282L, strArr), this.talkerId);
        jSONObject.put(MagicFactory.get(4928285241979700618L, strArr), this.msgSeq);
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
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(MagicFactory.get(4928293642935731594L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928293561331352970L, strArr), str), MagicFactory.get(4928293673000502666L, strArr))) + MagicFactory.get(4928292655093253514L, strArr)));
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
            jSONObject.put(MagicFactory.get(4928292625028482442L, strArr), this.title);
            jSONObject.put(MagicFactory.get(4928292599258678666L, strArr), Integer.valueOf(jSONObject.size()));
            jSONObject.put(MagicFactory.get(4928292715222795658L, strArr), this.ext);
            jSONObject.put(MagicFactory.get(4928292698042926474L, strArr), this.md5);
            jSONObject.put(MagicFactory.get(4928292680863057290L, strArr), this.url);
            jSONObject.put(MagicFactory.get(4928292663683188106L, strArr), this.key);
            return jSONObject.toString();
        }

        public FileMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this.title = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928294081022395786L, strArr)));
            this.size = Long.parseLong(String.valueOf(jSONObject.getByPath(MagicFactory.get(4928294145446905226L, strArr))));
            this.ext = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928293191964165514L, strArr)));
            this.md5 = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928293342288020874L, strArr)));
            this.url = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928293277863511434L, strArr)));
            this.key = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928293544151483786L, strArr)));
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
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(MagicFactory.get(4928296469024212362L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928293088884950410L, strArr), str), MagicFactory.get(4928296499088983434L, strArr))) + MagicFactory.get(4928296443254408586L, strArr)));
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
            jSONObject.put(MagicFactory.get(4928296550628590986L, strArr), this.md5);
            jSONObject.put(MagicFactory.get(4928296533448721802L, strArr), this.bigImgUrl);
            jSONObject.put(MagicFactory.get(4928296627938002314L, strArr), this.midImgUrl);
            jSONObject.put(MagicFactory.get(4928296584988329354L, strArr), this.thumbUrl);
            jSONObject.put(MagicFactory.get(4928296683772577162L, strArr), this.key);
            return jSONObject.toString();
        }

        public ImageMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this.md5 = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928292783942272394L, strArr)));
            this.bigImgUrl = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928292732402664842L, strArr)));
            this.midImgUrl = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928292917086258570L, strArr)));
            this.thumbUrl = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928292964330898826L, strArr)));
            this.key = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928293015870506378L, strArr)));
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
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(MagicFactory.get(4928299106134132106L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928299024529753482L, strArr), str), MagicFactory.get(4928298998759949706L, strArr))) + MagicFactory.get(4928299080364328330L, strArr)));
        }

        public final String getContent() {
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            int i = this.type;
            if (i == EnumC2267feyxiexzfUjhhgtg.f7407Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return this.originContent;
            }
            if (i == EnumC2267feyxiexzfUjhhgtg.f7408Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return MagicFactory.get(4928299050299557258L, strArr);
            }
            if (i == EnumC2267feyxiexzfUjhhgtg.f7411Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return MagicFactory.get(4928299174853608842L, strArr);
            }
            if (i == EnumC2267feyxiexzfUjhhgtg.f7412Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf) {
                return MagicFactory.get(4928299161968706954L, strArr);
            }
            return i == EnumC2267feyxiexzfUjhhgtg.f7414Ujhhgtgfeyxiexzf.f7430Ujhhgtgfeyxiexzf ? String.valueOf(this.json.getByPath(MagicFactory.get(4928299149083805066L, strArr))) : this.originContent;
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
            jSONObject.put(MagicFactory.get(4928298268615509386L, strArr), this.title);
            jSONObject.put(MagicFactory.get(4928298242845705610L, strArr), this.msgSource);
            jSONObject.put(MagicFactory.get(4928298337334986122L, strArr), Long.valueOf(this.svrId));
            jSONObject.put(MagicFactory.get(4928298311565182346L, strArr), this.sendTalker);
            jSONObject.put(MagicFactory.get(4928298401759495562L, strArr), this.displayName);
            jSONObject.put(MagicFactory.get(4928298487658841482L, strArr), this.talker);
            jSONObject.put(MagicFactory.get(4928298457594070410L, strArr), Integer.valueOf(this.type));
            jSONObject.put(MagicFactory.get(4928298436119233930L, strArr), getContent());
            return jSONObject.toString();
        }

        public QuoteMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this.title = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928295820484150666L, strArr)));
            this.msgSource = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928294922835985802L, strArr)));
            Long lM2674feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2674feyxiexzfUjhhgtg(String.valueOf(jSONObject.getByPath(MagicFactory.get(4928294931425920394L, strArr))));
            this.svrId = lM2674feyxiexzfUjhhgtg != null ? lM2674feyxiexzfUjhhgtg.longValue() : 0L;
            this.sendTalker = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928295094634677642L, strArr)));
            this.displayName = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928295249253500298L, strArr)));
            this.talker = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928298685227337098L, strArr)));
            this.type = Integer.parseInt(String.valueOf(jSONObject.getByPath(MagicFactory.get(4928298839846159754L, strArr))));
            this.originContent = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928298869910930826L, strArr)));
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
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(MagicFactory.get(4928300875660658058L, strArr) + AbstractC1150feyxiexzfUjhhgtg.m2615Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2642Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928297495521396106L, strArr), str), MagicFactory.get(4928297469751592330L, strArr))) + MagicFactory.get(4928300849890854282L, strArr)));
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
            jSONObject.put(MagicFactory.get(4928300957265036682L, strArr), this.title);
            jSONObject.put(MagicFactory.get(4928300931495232906L, strArr), this.des);
            jSONObject.put(MagicFactory.get(4928300914315363722L, strArr), this.feeDesc);
            jSONObject.put(MagicFactory.get(4928301017394578826L, strArr), this.transactionId);
            jSONObject.put(MagicFactory.get(4928301094703990154L, strArr), this.transferId);
            jSONObject.put(MagicFactory.get(4928301047459349898L, strArr), Integer.valueOf(this.invalidTime));
            jSONObject.put(MagicFactory.get(4928301133358695818L, strArr), Long.valueOf(this.beginTransferTime));
            jSONObject.put(MagicFactory.get(4928301193488237962L, strArr), this.receiverUsername);
            jSONObject.put(MagicFactory.get(4928301257912747402L, strArr), this.payerUsername);
            return jSONObject.toString();
        }

        public TransferMsg(JSONObject jSONObject) {
            this.json = jSONObject;
            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
            this.title = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928298539198449034L, strArr)));
            this.des = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928298603622958474L, strArr)));
            this.feeDesc = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928297577125774730L, strArr)));
            this.transactionId = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928297727449630090L, strArr)));
            this.transferId = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928297852003681674L, strArr)));
            this.invalidTime = Integer.parseInt(String.valueOf(jSONObject.getByPath(MagicFactory.get(4928297989442635146L, strArr))));
            this.beginTransferTime = Long.parseLong(String.valueOf(jSONObject.getByPath(MagicFactory.get(4928297023074993546L, strArr))));
            this.receiverUsername = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928297130449175946L, strArr)));
            this.payerUsername = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928297375262311818L, strArr)));
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
            this.talker = String.valueOf(jSONObject.getByPath(MagicFactory.get(4928296666592707978L, strArr)));
            this.recordNum = Integer.parseInt(String.valueOf(jSONObject.getByPath(MagicFactory.get(4928296825506497930L, strArr))));
            this.fromUser = String.valueOf(getRecordObj().getByPath(MagicFactory.get(4928296945765582218L, strArr)));
            this.pattedUser = String.valueOf(getRecordObj().getByPath(MagicFactory.get(4928295945038202250L, strArr)));
            this.template = String.valueOf(getRecordObj().getByPath(MagicFactory.get(4928295897793561994L, strArr)));
            this.createTime = Long.parseLong(String.valueOf(getRecordObj().getByPath(MagicFactory.get(4928295996577809802L, strArr))));
            this.readStatus = Integer.parseInt(String.valueOf(getRecordObj().getByPath(MagicFactory.get(4928296086772123018L, strArr))));
            this.svrId = Long.parseLong(String.valueOf(getRecordObj().getByPath(MagicFactory.get(4928296039527482762L, strArr))));
            this.showModifyTip = Integer.parseInt(String.valueOf(getRecordObj().getByPath(MagicFactory.get(4928296151196632458L, strArr))));
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
            Object byPath = jSONObject.getByPath(MagicFactory.get(4928296228506043786L, strArr));
            if (byPath instanceof JSONArray) {
                return ((JSONArray) byPath).getJSONObject(0);
            }
            MagicFactory.get(4928296361650029962L, strArr);
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
            jSONObject.put(MagicFactory.get(4928295511246505354L, strArr), this.talker);
            jSONObject.put(MagicFactory.get(4928295481181734282L, strArr), Integer.valueOf(this.recordNum));
            jSONObject.put(MagicFactory.get(4928295575671014794L, strArr), this.fromUser);
            jSONObject.put(MagicFactory.get(4928295674455262602L, strArr), this.pattedUser);
            jSONObject.put(MagicFactory.get(4928295627210622346L, strArr), this.template);
            jSONObject.put(MagicFactory.get(4928295725994870154L, strArr), Long.valueOf(this.createTime));
            jSONObject.put(MagicFactory.get(4928295816189183370L, strArr), Integer.valueOf(this.readStatus));
            jSONObject.put(MagicFactory.get(4928295768944543114L, strArr), Long.valueOf(this.svrId));
            jSONObject.put(MagicFactory.get(4928295880613692810L, strArr), Integer.valueOf(this.showModifyTip));
            return jSONObject.toString();
        }

        public PatMsg(String str) {
            this(AbstractC1150feyxiexzfUjhhgtg.m2619Ujhhgtgfeyxiexzf(str));
        }
    }
}
