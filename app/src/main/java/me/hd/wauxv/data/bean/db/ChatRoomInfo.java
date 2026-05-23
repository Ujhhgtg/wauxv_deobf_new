package me.hd.wauxv.data.bean.db;

import com.umeng.analytics.pro.bc;
import java.util.Arrays;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import p000.AbstractC0981;
import p000.AbstractC1194;
import p000.AbstractC1574;
import p000.AbstractC2207;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ChatRoomInfo {
    private final Long addtime;
    private final String associateOpenIMRoomName;
    private final long chatroomLocalVersion;
    private final int chatroomNoticeNew;
    private final int chatroomStatus;
    private final int chatroomVersion;
    private final int chatroomdataflag;
    private final long chatroomfamilystatusmodifytime;
    private final String chatroomname;
    private final String chatroomnick;
    private final String chatroomnotice;
    private final String chatroomnoticeEditor;
    private final long chatroomnoticePublishTime;
    private final long compactFlag;
    private final String displayname;
    private final String handleByteVersion;
    private final int isShowname;
    private final byte[] localChatRoomWatchMembers;
    private final int memberCount;
    private final String memberlist;
    private final Long modifytime;
    private final int oldChatroomVersion;
    private final int openIMRoomMigrateStatus;
    private final byte[] roomInfoDetailResByte;
    private final byte[] roomdata;
    private final int roomflag;
    private final String roomowner;
    private final String saveByteVersion;
    private final String selfDisplayName;
    private final int spamStatus;
    private final int style;
    private final String xmlChatroomnotice;

    public ChatRoomInfo(String str, Long l, Long l2, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, int i10, int i11, long j4) {
        this.chatroomname = str;
        this.addtime = l;
        this.modifytime = l2;
        this.chatroomnoticePublishTime = j;
        this.chatroomfamilystatusmodifytime = j2;
        this.memberlist = str2;
        this.displayname = str3;
        this.chatroomnick = str4;
        this.roomowner = str5;
        this.selfDisplayName = str6;
        this.chatroomnotice = str7;
        this.xmlChatroomnotice = str8;
        this.chatroomnoticeEditor = str9;
        this.associateOpenIMRoomName = str10;
        this.saveByteVersion = str11;
        this.handleByteVersion = str12;
        this.roomdata = bArr;
        this.roomInfoDetailResByte = bArr2;
        this.localChatRoomWatchMembers = bArr3;
        this.roomflag = i;
        this.isShowname = i2;
        this.style = i3;
        this.chatroomdataflag = i4;
        this.chatroomStatus = i5;
        this.openIMRoomMigrateStatus = i6;
        this.spamStatus = i7;
        this.chatroomVersion = i8;
        this.chatroomNoticeNew = i9;
        this.chatroomLocalVersion = j3;
        this.memberCount = i10;
        this.oldChatroomVersion = i11;
        this.compactFlag = j4;
    }

    public static /* synthetic */ ChatRoomInfo copy$default(ChatRoomInfo chatRoomInfo, String str, Long l, Long l2, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, int i10, int i11, long j4, int i12, Object obj) {
        long j5;
        int i13;
        int i14;
        String str13 = (i12 & 1) != 0 ? chatRoomInfo.chatroomname : str;
        Long l3 = (i12 & 2) != 0 ? chatRoomInfo.addtime : l;
        Long l4 = (i12 & 4) != 0 ? chatRoomInfo.modifytime : l2;
        long j6 = (i12 & 8) != 0 ? chatRoomInfo.chatroomnoticePublishTime : j;
        long j7 = (i12 & 16) != 0 ? chatRoomInfo.chatroomfamilystatusmodifytime : j2;
        String str14 = (i12 & 32) != 0 ? chatRoomInfo.memberlist : str2;
        String str15 = (i12 & 64) != 0 ? chatRoomInfo.displayname : str3;
        String str16 = (i12 & 128) != 0 ? chatRoomInfo.chatroomnick : str4;
        String str17 = (i12 & 256) != 0 ? chatRoomInfo.roomowner : str5;
        String str18 = (i12 & 512) != 0 ? chatRoomInfo.selfDisplayName : str6;
        String str19 = (i12 & 1024) != 0 ? chatRoomInfo.chatroomnotice : str7;
        String str20 = (i12 & 2048) != 0 ? chatRoomInfo.xmlChatroomnotice : str8;
        String str21 = str13;
        String str22 = (i12 & 4096) != 0 ? chatRoomInfo.chatroomnoticeEditor : str9;
        String str23 = (i12 & 8192) != 0 ? chatRoomInfo.associateOpenIMRoomName : str10;
        String str24 = (i12 & 16384) != 0 ? chatRoomInfo.saveByteVersion : str11;
        String str25 = (i12 & 32768) != 0 ? chatRoomInfo.handleByteVersion : str12;
        byte[] bArr4 = (i12 & 65536) != 0 ? chatRoomInfo.roomdata : bArr;
        byte[] bArr5 = (i12 & 131072) != 0 ? chatRoomInfo.roomInfoDetailResByte : bArr2;
        byte[] bArr6 = (i12 & 262144) != 0 ? chatRoomInfo.localChatRoomWatchMembers : bArr3;
        int i15 = (i12 & 524288) != 0 ? chatRoomInfo.roomflag : i;
        int i16 = (i12 & 1048576) != 0 ? chatRoomInfo.isShowname : i2;
        int i17 = (i12 & 2097152) != 0 ? chatRoomInfo.style : i3;
        int i18 = (i12 & 4194304) != 0 ? chatRoomInfo.chatroomdataflag : i4;
        int i19 = (i12 & 8388608) != 0 ? chatRoomInfo.chatroomStatus : i5;
        int i20 = (i12 & 16777216) != 0 ? chatRoomInfo.openIMRoomMigrateStatus : i6;
        int i21 = (i12 & 33554432) != 0 ? chatRoomInfo.spamStatus : i7;
        int i22 = (i12 & 67108864) != 0 ? chatRoomInfo.chatroomVersion : i8;
        int i23 = (i12 & 134217728) != 0 ? chatRoomInfo.chatroomNoticeNew : i9;
        String str26 = str24;
        long j8 = (i12 & 268435456) != 0 ? chatRoomInfo.chatroomLocalVersion : j3;
        int i24 = (i12 & 536870912) != 0 ? chatRoomInfo.memberCount : i10;
        int i25 = (i12 & 1073741824) != 0 ? chatRoomInfo.oldChatroomVersion : i11;
        if ((i12 & -2147483648) != 0) {
            i13 = i24;
            i14 = i25;
            j5 = chatRoomInfo.compactFlag;
        } else {
            j5 = j4;
            i13 = i24;
            i14 = i25;
        }
        return chatRoomInfo.copy(str21, l3, l4, j6, j7, str14, str15, str16, str17, str18, str19, str20, str22, str23, str26, str25, bArr4, bArr5, bArr6, i15, i16, i17, i18, i19, i20, i21, i22, i23, j8, i13, i14, j5);
    }

    public final String component1() {
        return this.chatroomname;
    }

    public final String component10() {
        return this.selfDisplayName;
    }

    public final String component11() {
        return this.chatroomnotice;
    }

    public final String component12() {
        return this.xmlChatroomnotice;
    }

    public final String component13() {
        return this.chatroomnoticeEditor;
    }

    public final String component14() {
        return this.associateOpenIMRoomName;
    }

    public final String component15() {
        return this.saveByteVersion;
    }

    public final String component16() {
        return this.handleByteVersion;
    }

    public final byte[] component17() {
        return this.roomdata;
    }

    public final byte[] component18() {
        return this.roomInfoDetailResByte;
    }

    public final byte[] component19() {
        return this.localChatRoomWatchMembers;
    }

    public final Long component2() {
        return this.addtime;
    }

    public final int component20() {
        return this.roomflag;
    }

    public final int component21() {
        return this.isShowname;
    }

    public final int component22() {
        return this.style;
    }

    public final int component23() {
        return this.chatroomdataflag;
    }

    public final int component24() {
        return this.chatroomStatus;
    }

    public final int component25() {
        return this.openIMRoomMigrateStatus;
    }

    public final int component26() {
        return this.spamStatus;
    }

    public final int component27() {
        return this.chatroomVersion;
    }

    public final int component28() {
        return this.chatroomNoticeNew;
    }

    public final long component29() {
        return this.chatroomLocalVersion;
    }

    public final Long component3() {
        return this.modifytime;
    }

    public final int component30() {
        return this.memberCount;
    }

    public final int component31() {
        return this.oldChatroomVersion;
    }

    public final long component32() {
        return this.compactFlag;
    }

    public final long component4() {
        return this.chatroomnoticePublishTime;
    }

    public final long component5() {
        return this.chatroomfamilystatusmodifytime;
    }

    public final String component6() {
        return this.memberlist;
    }

    public final String component7() {
        return this.displayname;
    }

    public final String component8() {
        return this.chatroomnick;
    }

    public final String component9() {
        return this.roomowner;
    }

    public final ChatRoomInfo copy(String str, Long l, Long l2, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, int i10, int i11, long j4) {
        return new ChatRoomInfo(str, l, l2, j, j2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, i9, j3, i10, i11, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ChatRoomInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ChatRoomInfo chatRoomInfo = (ChatRoomInfo) obj;
        if (!AbstractC2207.m4087(this.addtime, chatRoomInfo.addtime) || !AbstractC2207.m4087(this.modifytime, chatRoomInfo.modifytime) || this.chatroomnoticePublishTime != chatRoomInfo.chatroomnoticePublishTime || this.chatroomfamilystatusmodifytime != chatRoomInfo.chatroomfamilystatusmodifytime || this.roomflag != chatRoomInfo.roomflag || this.isShowname != chatRoomInfo.isShowname || this.style != chatRoomInfo.style || this.chatroomdataflag != chatRoomInfo.chatroomdataflag || this.chatroomStatus != chatRoomInfo.chatroomStatus || this.openIMRoomMigrateStatus != chatRoomInfo.openIMRoomMigrateStatus || this.spamStatus != chatRoomInfo.spamStatus || this.chatroomVersion != chatRoomInfo.chatroomVersion || this.chatroomNoticeNew != chatRoomInfo.chatroomNoticeNew || this.chatroomLocalVersion != chatRoomInfo.chatroomLocalVersion || this.memberCount != chatRoomInfo.memberCount || this.oldChatroomVersion != chatRoomInfo.oldChatroomVersion || this.compactFlag != chatRoomInfo.compactFlag || !AbstractC2207.m4087(this.chatroomname, chatRoomInfo.chatroomname) || !AbstractC2207.m4087(this.memberlist, chatRoomInfo.memberlist) || !AbstractC2207.m4087(this.displayname, chatRoomInfo.displayname) || !AbstractC2207.m4087(this.chatroomnick, chatRoomInfo.chatroomnick) || !AbstractC2207.m4087(this.roomowner, chatRoomInfo.roomowner) || !AbstractC2207.m4087(this.selfDisplayName, chatRoomInfo.selfDisplayName) || !AbstractC2207.m4087(this.chatroomnotice, chatRoomInfo.chatroomnotice) || !AbstractC2207.m4087(this.xmlChatroomnotice, chatRoomInfo.xmlChatroomnotice) || !AbstractC2207.m4087(this.chatroomnoticeEditor, chatRoomInfo.chatroomnoticeEditor) || !AbstractC2207.m4087(this.associateOpenIMRoomName, chatRoomInfo.associateOpenIMRoomName) || !AbstractC2207.m4087(this.saveByteVersion, chatRoomInfo.saveByteVersion) || !AbstractC2207.m4087(this.handleByteVersion, chatRoomInfo.handleByteVersion)) {
            return false;
        }
        byte[] bArr = this.roomdata;
        if (bArr != null) {
            byte[] bArr2 = chatRoomInfo.roomdata;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (chatRoomInfo.roomdata != null) {
            return false;
        }
        byte[] bArr3 = this.roomInfoDetailResByte;
        if (bArr3 != null) {
            byte[] bArr4 = chatRoomInfo.roomInfoDetailResByte;
            if (bArr4 == null || !Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (chatRoomInfo.roomInfoDetailResByte != null) {
            return false;
        }
        byte[] bArr5 = this.localChatRoomWatchMembers;
        if (bArr5 != null) {
            byte[] bArr6 = chatRoomInfo.localChatRoomWatchMembers;
            if (bArr6 == null || !Arrays.equals(bArr5, bArr6)) {
                return false;
            }
        } else if (chatRoomInfo.localChatRoomWatchMembers != null) {
            return false;
        }
        return true;
    }

    public final Long getAddtime() {
        return this.addtime;
    }

    public final String getAssociateOpenIMRoomName() {
        return this.associateOpenIMRoomName;
    }

    public final long getChatroomLocalVersion() {
        return this.chatroomLocalVersion;
    }

    public final int getChatroomNoticeNew() {
        return this.chatroomNoticeNew;
    }

    public final int getChatroomStatus() {
        return this.chatroomStatus;
    }

    public final int getChatroomVersion() {
        return this.chatroomVersion;
    }

    public final int getChatroomdataflag() {
        return this.chatroomdataflag;
    }

    public final long getChatroomfamilystatusmodifytime() {
        return this.chatroomfamilystatusmodifytime;
    }

    public final String getChatroomname() {
        return this.chatroomname;
    }

    public final String getChatroomnick() {
        return this.chatroomnick;
    }

    public final String getChatroomnotice() {
        return this.chatroomnotice;
    }

    public final String getChatroomnoticeEditor() {
        return this.chatroomnoticeEditor;
    }

    public final long getChatroomnoticePublishTime() {
        return this.chatroomnoticePublishTime;
    }

    public final long getCompactFlag() {
        return this.compactFlag;
    }

    public final String getDisplayname() {
        return this.displayname;
    }

    public final String getHandleByteVersion() {
        return this.handleByteVersion;
    }

    public final byte[] getLocalChatRoomWatchMembers() {
        return this.localChatRoomWatchMembers;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getMemberlist() {
        return this.memberlist;
    }

    public final Long getModifytime() {
        return this.modifytime;
    }

    public final int getOldChatroomVersion() {
        return this.oldChatroomVersion;
    }

    public final int getOpenIMRoomMigrateStatus() {
        return this.openIMRoomMigrateStatus;
    }

    public final byte[] getRoomInfoDetailResByte() {
        return this.roomInfoDetailResByte;
    }

    public final byte[] getRoomdata() {
        return this.roomdata;
    }

    public final int getRoomflag() {
        return this.roomflag;
    }

    public final String getRoomowner() {
        return this.roomowner;
    }

    public final String getSaveByteVersion() {
        return this.saveByteVersion;
    }

    public final String getSelfDisplayName() {
        return this.selfDisplayName;
    }

    public final int getSpamStatus() {
        return this.spamStatus;
    }

    public final int getStyle() {
        return this.style;
    }

    public final String getXmlChatroomnotice() {
        return this.xmlChatroomnotice;
    }

    public int hashCode() {
        Long l = this.addtime;
        int iHashCode = (l != null ? Long.hashCode(l.longValue()) : 0) * 31;
        Long l2 = this.modifytime;
        int iM2775 = AbstractC1194.m2775((Long.hashCode(this.compactFlag) + ((((((Long.hashCode(this.chatroomLocalVersion) + ((((((((((((((((((((Long.hashCode(this.chatroomfamilystatusmodifytime) + ((Long.hashCode(this.chatroomnoticePublishTime) + ((iHashCode + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31)) * 31)) * 31) + this.roomflag) * 31) + this.isShowname) * 31) + this.style) * 31) + this.chatroomdataflag) * 31) + this.chatroomStatus) * 31) + this.openIMRoomMigrateStatus) * 31) + this.spamStatus) * 31) + this.chatroomVersion) * 31) + this.chatroomNoticeNew) * 31)) * 31) + this.memberCount) * 31) + this.oldChatroomVersion) * 31)) * 31, 31, this.chatroomname);
        String str = this.memberlist;
        int iHashCode2 = (iM2775 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.displayname;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.chatroomnick;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.roomowner;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.selfDisplayName;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.chatroomnotice;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.xmlChatroomnotice;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.chatroomnoticeEditor;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.associateOpenIMRoomName;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.saveByteVersion;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.handleByteVersion;
        int iHashCode12 = (iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        byte[] bArr = this.roomdata;
        int iHashCode13 = (iHashCode12 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        byte[] bArr2 = this.roomInfoDetailResByte;
        int iHashCode14 = (iHashCode13 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0)) * 31;
        byte[] bArr3 = this.localChatRoomWatchMembers;
        return iHashCode14 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0);
    }

    public final int isShowname() {
        return this.isShowname;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ChatRoomInfo(chatroomname=");
        sb.append(this.chatroomname);
        sb.append(", addtime=");
        sb.append(this.addtime);
        sb.append(", modifytime=");
        sb.append(this.modifytime);
        sb.append(", chatroomnoticePublishTime=");
        sb.append(this.chatroomnoticePublishTime);
        sb.append(", chatroomfamilystatusmodifytime=");
        sb.append(this.chatroomfamilystatusmodifytime);
        sb.append(", memberlist=");
        sb.append(this.memberlist);
        sb.append(", displayname=");
        sb.append(this.displayname);
        sb.append(", chatroomnick=");
        sb.append(this.chatroomnick);
        sb.append(", roomowner=");
        sb.append(this.roomowner);
        sb.append(", selfDisplayName=");
        sb.append(this.selfDisplayName);
        sb.append(", chatroomnotice=");
        sb.append(this.chatroomnotice);
        sb.append(", xmlChatroomnotice=");
        sb.append(this.xmlChatroomnotice);
        sb.append(", chatroomnoticeEditor=");
        sb.append(this.chatroomnoticeEditor);
        sb.append(", associateOpenIMRoomName=");
        sb.append(this.associateOpenIMRoomName);
        sb.append(", saveByteVersion=");
        sb.append(this.saveByteVersion);
        sb.append(", handleByteVersion=");
        sb.append(this.handleByteVersion);
        sb.append(", roomdata=");
        sb.append(Arrays.toString(this.roomdata));
        sb.append(", roomInfoDetailResByte=");
        sb.append(Arrays.toString(this.roomInfoDetailResByte));
        sb.append(", localChatRoomWatchMembers=");
        sb.append(Arrays.toString(this.localChatRoomWatchMembers));
        sb.append(", roomflag=");
        sb.append(this.roomflag);
        sb.append(", isShowname=");
        sb.append(this.isShowname);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", chatroomdataflag=");
        sb.append(this.chatroomdataflag);
        sb.append(", chatroomStatus=");
        sb.append(this.chatroomStatus);
        sb.append(", openIMRoomMigrateStatus=");
        sb.append(this.openIMRoomMigrateStatus);
        sb.append(", spamStatus=");
        sb.append(this.spamStatus);
        sb.append(", chatroomVersion=");
        sb.append(this.chatroomVersion);
        sb.append(", chatroomNoticeNew=");
        sb.append(this.chatroomNoticeNew);
        sb.append(", chatroomLocalVersion=");
        sb.append(this.chatroomLocalVersion);
        sb.append(", memberCount=");
        sb.append(this.memberCount);
        sb.append(", oldChatroomVersion=");
        sb.append(this.oldChatroomVersion);
        sb.append(", compactFlag=");
        sb.append(this.compactFlag);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ChatRoomInfo(String str, Long l, Long l2, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, int i10, int i11, long j4, int i12, AbstractC0981 abstractC0981) {
        this(str, l, l2, (i12 & 8) != 0 ? 0L : j, (i12 & 16) != 0 ? 0L : j2, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, bArr, bArr2, bArr3, (i12 & 524288) != 0 ? 0 : i, (i12 & 1048576) != 0 ? 0 : i2, (i12 & 2097152) != 0 ? 0 : i3, (i12 & 4194304) != 0 ? 0 : i4, (i12 & 8388608) != 0 ? 0 : i5, (i12 & 16777216) != 0 ? 0 : i6, (i12 & 33554432) != 0 ? 0 : i7, (i12 & 67108864) != 0 ? 0 : i8, (i12 & 134217728) != 0 ? 0 : i9, (i12 & 268435456) != 0 ? 0L : j3, (i12 & 536870912) != 0 ? -1 : i10, (i12 & 1073741824) != 0 ? 0 : i11, (i12 & -2147483648) != 0 ? 0L : j4);
    }
}
