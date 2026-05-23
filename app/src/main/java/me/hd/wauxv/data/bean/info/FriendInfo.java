package me.hd.wauxv.data.bean.info;

import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC1194;
import p000.AbstractC1574;
import p000.AbstractC2207;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class FriendInfo {
    private String alias;
    private long createTime;
    private String nickname;
    private String remark;
    private String sourceExtInfo;
    private int type;
    private String wxid;

    public FriendInfo(String str, String str2, String str3, String str4, int i, String str5, long j) {
        this.wxid = str;
        this.alias = str2;
        this.remark = str3;
        this.nickname = str4;
        this.type = i;
        this.sourceExtInfo = str5;
        this.createTime = j;
    }

    public static /* synthetic */ FriendInfo copy$default(FriendInfo friendInfo, String str, String str2, String str3, String str4, int i, String str5, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = friendInfo.wxid;
        }
        if ((i2 & 2) != 0) {
            str2 = friendInfo.alias;
        }
        if ((i2 & 4) != 0) {
            str3 = friendInfo.remark;
        }
        if ((i2 & 8) != 0) {
            str4 = friendInfo.nickname;
        }
        if ((i2 & 16) != 0) {
            i = friendInfo.type;
        }
        if ((i2 & 32) != 0) {
            str5 = friendInfo.sourceExtInfo;
        }
        if ((i2 & 64) != 0) {
            j = friendInfo.createTime;
        }
        long j2 = j;
        int i3 = i;
        String str6 = str5;
        return friendInfo.copy(str, str2, str3, str4, i3, str6, j2);
    }

    public final String component1() {
        return this.wxid;
    }

    public final String component2() {
        return this.alias;
    }

    public final String component3() {
        return this.remark;
    }

    public final String component4() {
        return this.nickname;
    }

    public final int component5() {
        return this.type;
    }

    public final String component6() {
        return this.sourceExtInfo;
    }

    public final long component7() {
        return this.createTime;
    }

    public final FriendInfo copy(String str, String str2, String str3, String str4, int i, String str5, long j) {
        return new FriendInfo(str, str2, str3, str4, i, str5, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendInfo)) {
            return false;
        }
        FriendInfo friendInfo = (FriendInfo) obj;
        return AbstractC2207.m4087(this.wxid, friendInfo.wxid) && AbstractC2207.m4087(this.alias, friendInfo.alias) && AbstractC2207.m4087(this.remark, friendInfo.remark) && AbstractC2207.m4087(this.nickname, friendInfo.nickname) && this.type == friendInfo.type && AbstractC2207.m4087(this.sourceExtInfo, friendInfo.sourceExtInfo) && this.createTime == friendInfo.createTime;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getSourceExtInfo() {
        return this.sourceExtInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final String getWxid() {
        return this.wxid;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + AbstractC1194.m2775((Integer.hashCode(this.type) + AbstractC1194.m2775(AbstractC1194.m2775(AbstractC1194.m2775(this.wxid.hashCode() * 31, 31, this.alias), 31, this.remark), 31, this.nickname)) * 31, 31, this.sourceExtInfo);
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final void setSourceExtInfo(String str) {
        this.sourceExtInfo = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWxid(String str) {
        this.wxid = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("FriendInfo(wxid=");
        sb.append(this.wxid);
        sb.append(", alias=");
        sb.append(this.alias);
        sb.append(", remark=");
        sb.append(this.remark);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", sourceExtInfo=");
        sb.append(this.sourceExtInfo);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(')');
        return sb.toString();
    }
}
