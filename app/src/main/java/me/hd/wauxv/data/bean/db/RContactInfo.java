package me.hd.wauxv.data.bean.db;

import com.umeng.analytics.pro.bc;
import java.util.Arrays;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RContactInfo {
    private String alias;
    private int chatroomFlag;
    private String conRemark;
    private String conRemarkPYFull;
    private String conRemarkPYShort;
    private byte[] contactExtra;
    private String contactLabelIds;
    private long createTime;
    private int deleteFlag;
    private String descWordingId;
    private String domainList;
    private String encryptUsername;
    private byte[] lvbuff;
    private String nickname;
    private String openImAppid;
    private String pyInitial;
    private String quanPin;
    private int showHead;
    private String sourceExtInfo;
    private String ticket;
    private int type;
    private long uiType;
    private String username;
    private long usernameFlag;
    private int verifyFlag;
    private int weiboFlag;
    private String weiboNickname;

    public RContactInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, long j, int i3, String str8, String str9, String str10, byte[] bArr, int i4, String str11, int i5, int i6, String str12, String str13, String str14, String str15, String str16, long j2, byte[] bArr2, long j3) {
        this.username = str;
        this.alias = str2;
        this.conRemark = str3;
        this.domainList = str4;
        this.nickname = str5;
        this.pyInitial = str6;
        this.quanPin = str7;
        this.showHead = i;
        this.type = i2;
        this.uiType = j;
        this.weiboFlag = i3;
        this.weiboNickname = str8;
        this.conRemarkPYFull = str9;
        this.conRemarkPYShort = str10;
        this.lvbuff = bArr;
        this.verifyFlag = i4;
        this.encryptUsername = str11;
        this.chatroomFlag = i5;
        this.deleteFlag = i6;
        this.contactLabelIds = str12;
        this.descWordingId = str13;
        this.openImAppid = str14;
        this.sourceExtInfo = str15;
        this.ticket = str16;
        this.usernameFlag = j2;
        this.contactExtra = bArr2;
        this.createTime = j3;
    }

    public static /* synthetic */ RContactInfo copy$default(RContactInfo rContactInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, long j, int i3, String str8, String str9, String str10, byte[] bArr, int i4, String str11, int i5, int i6, String str12, String str13, String str14, String str15, String str16, long j2, byte[] bArr2, long j3, int i7, Object obj) {
        long j4;
        byte[] bArr3;
        String str17 = (i7 & 1) != 0 ? rContactInfo.username : str;
        String str18 = (i7 & 2) != 0 ? rContactInfo.alias : str2;
        String str19 = (i7 & 4) != 0 ? rContactInfo.conRemark : str3;
        String str20 = (i7 & 8) != 0 ? rContactInfo.domainList : str4;
        String str21 = (i7 & 16) != 0 ? rContactInfo.nickname : str5;
        String str22 = (i7 & 32) != 0 ? rContactInfo.pyInitial : str6;
        String str23 = (i7 & 64) != 0 ? rContactInfo.quanPin : str7;
        int i8 = (i7 & 128) != 0 ? rContactInfo.showHead : i;
        int i9 = (i7 & bc.e) != 0 ? rContactInfo.type : i2;
        long j5 = (i7 & 512) != 0 ? rContactInfo.uiType : j;
        int i10 = (i7 & 1024) != 0 ? rContactInfo.weiboFlag : i3;
        String str24 = (i7 & 2048) != 0 ? rContactInfo.weiboNickname : str8;
        String str25 = (i7 & 4096) != 0 ? rContactInfo.conRemarkPYFull : str9;
        String str26 = str17;
        String str27 = (i7 & 8192) != 0 ? rContactInfo.conRemarkPYShort : str10;
        byte[] bArr4 = (i7 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? rContactInfo.lvbuff : bArr;
        int i11 = (i7 & 32768) != 0 ? rContactInfo.verifyFlag : i4;
        String str28 = (i7 & 65536) != 0 ? rContactInfo.encryptUsername : str11;
        int i12 = (i7 & 131072) != 0 ? rContactInfo.chatroomFlag : i5;
        int i13 = (i7 & 262144) != 0 ? rContactInfo.deleteFlag : i6;
        String str29 = (i7 & 524288) != 0 ? rContactInfo.contactLabelIds : str12;
        String str30 = (i7 & 1048576) != 0 ? rContactInfo.descWordingId : str13;
        String str31 = (i7 & 2097152) != 0 ? rContactInfo.openImAppid : str14;
        String str32 = (i7 & 4194304) != 0 ? rContactInfo.sourceExtInfo : str15;
        String str33 = (i7 & 8388608) != 0 ? rContactInfo.ticket : str16;
        byte[] bArr5 = bArr4;
        long j6 = (i7 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? rContactInfo.usernameFlag : j2;
        byte[] bArr6 = (i7 & 33554432) != 0 ? rContactInfo.contactExtra : bArr2;
        if ((i7 & 67108864) != 0) {
            bArr3 = bArr6;
            j4 = rContactInfo.createTime;
        } else {
            j4 = j3;
            bArr3 = bArr6;
        }
        return rContactInfo.copy(str26, str18, str19, str20, str21, str22, str23, i8, i9, j5, i10, str24, str25, str27, bArr5, i11, str28, i12, i13, str29, str30, str31, str32, str33, j6, bArr3, j4);
    }

    public final String component1() {
        return this.username;
    }

    public final long component10() {
        return this.uiType;
    }

    public final int component11() {
        return this.weiboFlag;
    }

    public final String component12() {
        return this.weiboNickname;
    }

    public final String component13() {
        return this.conRemarkPYFull;
    }

    public final String component14() {
        return this.conRemarkPYShort;
    }

    public final byte[] component15() {
        return this.lvbuff;
    }

    public final int component16() {
        return this.verifyFlag;
    }

    public final String component17() {
        return this.encryptUsername;
    }

    public final int component18() {
        return this.chatroomFlag;
    }

    public final int component19() {
        return this.deleteFlag;
    }

    public final String component2() {
        return this.alias;
    }

    public final String component20() {
        return this.contactLabelIds;
    }

    public final String component21() {
        return this.descWordingId;
    }

    public final String component22() {
        return this.openImAppid;
    }

    public final String component23() {
        return this.sourceExtInfo;
    }

    public final String component24() {
        return this.ticket;
    }

    public final long component25() {
        return this.usernameFlag;
    }

    public final byte[] component26() {
        return this.contactExtra;
    }

    public final long component27() {
        return this.createTime;
    }

    public final String component3() {
        return this.conRemark;
    }

    public final String component4() {
        return this.domainList;
    }

    public final String component5() {
        return this.nickname;
    }

    public final String component6() {
        return this.pyInitial;
    }

    public final String component7() {
        return this.quanPin;
    }

    public final int component8() {
        return this.showHead;
    }

    public final int component9() {
        return this.type;
    }

    public final RContactInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, long j, int i3, String str8, String str9, String str10, byte[] bArr, int i4, String str11, int i5, int i6, String str12, String str13, String str14, String str15, String str16, long j2, byte[] bArr2, long j3) {
        return new RContactInfo(str, str2, str3, str4, str5, str6, str7, i, i2, j, i3, str8, str9, str10, bArr, i4, str11, i5, i6, str12, str13, str14, str15, str16, j2, bArr2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RContactInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        MagicFactory.get(4928306059686184330L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
        RContactInfo rContactInfo = (RContactInfo) obj;
        return this.showHead == rContactInfo.showHead && this.type == rContactInfo.type && this.uiType == rContactInfo.uiType && this.weiboFlag == rContactInfo.weiboFlag && this.verifyFlag == rContactInfo.verifyFlag && this.chatroomFlag == rContactInfo.chatroomFlag && this.deleteFlag == rContactInfo.deleteFlag && this.usernameFlag == rContactInfo.usernameFlag && this.createTime == rContactInfo.createTime && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.username, rContactInfo.username) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.alias, rContactInfo.alias) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.conRemark, rContactInfo.conRemark) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.domainList, rContactInfo.domainList) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.nickname, rContactInfo.nickname) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.pyInitial, rContactInfo.pyInitial) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.quanPin, rContactInfo.quanPin) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.weiboNickname, rContactInfo.weiboNickname) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.conRemarkPYFull, rContactInfo.conRemarkPYFull) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.conRemarkPYShort, rContactInfo.conRemarkPYShort) && Arrays.equals(this.lvbuff, rContactInfo.lvbuff) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.encryptUsername, rContactInfo.encryptUsername) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.contactLabelIds, rContactInfo.contactLabelIds) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.descWordingId, rContactInfo.descWordingId) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.openImAppid, rContactInfo.openImAppid) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.sourceExtInfo, rContactInfo.sourceExtInfo) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.ticket, rContactInfo.ticket) && Arrays.equals(this.contactExtra, rContactInfo.contactExtra);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final int getChatroomFlag() {
        return this.chatroomFlag;
    }

    public final String getConRemark() {
        return this.conRemark;
    }

    public final String getConRemarkPYFull() {
        return this.conRemarkPYFull;
    }

    public final String getConRemarkPYShort() {
        return this.conRemarkPYShort;
    }

    public final byte[] getContactExtra() {
        return this.contactExtra;
    }

    public final String getContactLabelIds() {
        return this.contactLabelIds;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDeleteFlag() {
        return this.deleteFlag;
    }

    public final String getDescWordingId() {
        return this.descWordingId;
    }

    public final String getDomainList() {
        return this.domainList;
    }

    public final String getEncryptUsername() {
        return this.encryptUsername;
    }

    public final byte[] getLvbuff() {
        return this.lvbuff;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getOpenImAppid() {
        return this.openImAppid;
    }

    public final String getPyInitial() {
        return this.pyInitial;
    }

    public final String getQuanPin() {
        return this.quanPin;
    }

    public final int getShowHead() {
        return this.showHead;
    }

    public final String getSourceExtInfo() {
        return this.sourceExtInfo;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUiType() {
        return this.uiType;
    }

    public final String getUsername() {
        return this.username;
    }

    public final long getUsernameFlag() {
        return this.usernameFlag;
    }

    public final int getVerifyFlag() {
        return this.verifyFlag;
    }

    public final int getWeiboFlag() {
        return this.weiboFlag;
    }

    public final String getWeiboNickname() {
        return this.weiboNickname;
    }

    public int hashCode() {
        return Arrays.hashCode(this.contactExtra) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf((Arrays.hashCode(this.lvbuff) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf((Long.hashCode(this.createTime) + ((Long.hashCode(this.usernameFlag) + ((((((((((Long.hashCode(this.uiType) + (((this.showHead * 31) + this.type) * 31)) * 31) + this.weiboFlag) * 31) + this.verifyFlag) * 31) + this.chatroomFlag) * 31) + this.deleteFlag) * 31)) * 31)) * 31, 31, this.username), 31, this.alias), 31, this.conRemark), 31, this.domainList), 31, this.nickname), 31, this.pyInitial), 31, this.quanPin), 31, this.weiboNickname), 31, this.conRemarkPYFull), 31, this.conRemarkPYShort)) * 31, 31, this.encryptUsername), 31, this.contactLabelIds), 31, this.descWordingId), 31, this.openImAppid), 31, this.sourceExtInfo), 31, this.ticket);
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setChatroomFlag(int i) {
        this.chatroomFlag = i;
    }

    public final void setConRemark(String str) {
        this.conRemark = str;
    }

    public final void setConRemarkPYFull(String str) {
        this.conRemarkPYFull = str;
    }

    public final void setConRemarkPYShort(String str) {
        this.conRemarkPYShort = str;
    }

    public final void setContactExtra(byte[] bArr) {
        this.contactExtra = bArr;
    }

    public final void setContactLabelIds(String str) {
        this.contactLabelIds = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDeleteFlag(int i) {
        this.deleteFlag = i;
    }

    public final void setDescWordingId(String str) {
        this.descWordingId = str;
    }

    public final void setDomainList(String str) {
        this.domainList = str;
    }

    public final void setEncryptUsername(String str) {
        this.encryptUsername = str;
    }

    public final void setLvbuff(byte[] bArr) {
        this.lvbuff = bArr;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setOpenImAppid(String str) {
        this.openImAppid = str;
    }

    public final void setPyInitial(String str) {
        this.pyInitial = str;
    }

    public final void setQuanPin(String str) {
        this.quanPin = str;
    }

    public final void setShowHead(int i) {
        this.showHead = i;
    }

    public final void setSourceExtInfo(String str) {
        this.sourceExtInfo = str;
    }

    public final void setTicket(String str) {
        this.ticket = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUiType(long j) {
        this.uiType = j;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public final void setUsernameFlag(long j) {
        this.usernameFlag = j;
    }

    public final void setVerifyFlag(int i) {
        this.verifyFlag = i;
    }

    public final void setWeiboFlag(int i) {
        this.weiboFlag = i;
    }

    public final void setWeiboNickname(String str) {
        this.weiboNickname = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928309723293287818L, strArr));
        sb.append(this.username);
        sb.append(MagicFactory.get(4928309899386946954L, strArr));
        sb.append(this.alias);
        sb.append(MagicFactory.get(4928309860732241290L, strArr));
        sb.append(this.conRemark);
        sb.append(MagicFactory.get(4928309942336619914L, strArr));
        sb.append(this.domainList);
        sb.append(MagicFactory.get(4928310019646031242L, strArr));
        sb.append(this.nickname);
        sb.append(MagicFactory.get(4928310105545377162L, strArr));
        sb.append(this.pyInitial);
        sb.append(MagicFactory.get(4928310049710802314L, strArr));
        sb.append(this.quanPin);
        sb.append(MagicFactory.get(4928310139905115530L, strArr));
        sb.append(this.showHead);
        sb.append(MagicFactory.get(4928309126292833674L, strArr));
        sb.append(this.type);
        sb.append(MagicFactory.get(4928309091933095306L, strArr));
        sb.append(this.uiType);
        sb.append(MagicFactory.get(4928309186422375818L, strArr));
        sb.append(this.weiboFlag);
        sb.append(MagicFactory.get(4928309268026754442L, strArr));
        sb.append(this.weiboNickname);
        sb.append(MagicFactory.get(4928309332451263882L, strArr));
        sb.append(this.conRemarkPYFull);
        sb.append(MagicFactory.get(4928309388285838730L, strArr));
        sb.append(this.conRemarkPYShort);
        sb.append(MagicFactory.get(4928309439825446282L, strArr));
        sb.append(Arrays.toString(this.lvbuff));
        sb.append(MagicFactory.get(4928309534314726794L, strArr));
        sb.append(this.verifyFlag);
        sb.append(MagicFactory.get(4928309611624138122L, strArr));
        sb.append(this.encryptUsername);
        sb.append(MagicFactory.get(4928308567947085194L, strArr));
        sb.append(this.chatroomFlag);
        sb.append(MagicFactory.get(4928308636666561930L, strArr));
        sb.append(this.deleteFlag);
        sb.append(MagicFactory.get(4928308713975973258L, strArr));
        sb.append(this.contactLabelIds);
        sb.append(MagicFactory.get(4928308769810548106L, strArr));
        sb.append(this.descWordingId);
        sb.append(MagicFactory.get(4928308834235057546L, strArr));
        sb.append(this.openImAppid);
        sb.append(MagicFactory.get(4928308907249501578L, strArr));
        sb.append(this.sourceExtInfo);
        sb.append(MagicFactory.get(4928308971674011018L, strArr));
        sb.append(this.ticket);
        sb.append(MagicFactory.get(4928309066163291530L, strArr));
        sb.append(this.usernameFlag);
        sb.append(MagicFactory.get(4928308035371140490L, strArr));
        sb.append(Arrays.toString(this.contactExtra));
        sb.append(MagicFactory.get(4928308104090617226L, strArr));
        sb.append(this.createTime);
        sb.append(')');
        return sb.toString();
    }
}
