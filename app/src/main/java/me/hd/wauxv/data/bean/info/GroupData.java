package me.hd.wauxv.data.bean.info;

import com.umeng.analytics.pro.bc;
import java.util.List;
import java.util.Map;
import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class GroupData {
    private int memberCount;
    private List<String> memberIds;
    private List<String> memberNames;
    private Map<String, String> membersHash;
    private String mineRoomName;
    private String notice;
    private String noticeEditor;
    private long noticeTime;
    private String owner;
    private String roomId;

    public GroupData(String str, List<String> list, List<String> list2, int i, Map<String, String> map, String str2, String str3, String str4, String str5, long j) {
        this.roomId = str;
        this.memberIds = list;
        this.memberNames = list2;
        this.memberCount = i;
        this.membersHash = map;
        this.mineRoomName = str2;
        this.owner = str3;
        this.notice = str4;
        this.noticeEditor = str5;
        this.noticeTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupData copy$default(GroupData groupData, String str, List list, List list2, int i, Map map, String str2, String str3, String str4, String str5, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = groupData.roomId;
        }
        if ((i2 & 2) != 0) {
            list = groupData.memberIds;
        }
        if ((i2 & 4) != 0) {
            list2 = groupData.memberNames;
        }
        if ((i2 & 8) != 0) {
            i = groupData.memberCount;
        }
        if ((i2 & 16) != 0) {
            map = groupData.membersHash;
        }
        if ((i2 & 32) != 0) {
            str2 = groupData.mineRoomName;
        }
        if ((i2 & 64) != 0) {
            str3 = groupData.owner;
        }
        if ((i2 & 128) != 0) {
            str4 = groupData.notice;
        }
        if ((i2 & bc.e) != 0) {
            str5 = groupData.noticeEditor;
        }
        if ((i2 & 512) != 0) {
            j = groupData.noticeTime;
        }
        long j2 = j;
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        Map map2 = map;
        List list3 = list2;
        return groupData.copy(str, list, list3, i, map2, str8, str9, str6, str7, j2);
    }

    public final String component1() {
        return this.roomId;
    }

    public final long component10() {
        return this.noticeTime;
    }

    public final List<String> component2() {
        return this.memberIds;
    }

    public final List<String> component3() {
        return this.memberNames;
    }

    public final int component4() {
        return this.memberCount;
    }

    public final Map<String, String> component5() {
        return this.membersHash;
    }

    public final String component6() {
        return this.mineRoomName;
    }

    public final String component7() {
        return this.owner;
    }

    public final String component8() {
        return this.notice;
    }

    public final String component9() {
        return this.noticeEditor;
    }

    public final GroupData copy(String str, List<String> list, List<String> list2, int i, Map<String, String> map, String str2, String str3, String str4, String str5, long j) {
        return new GroupData(str, list, list2, i, map, str2, str3, str4, str5, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupData)) {
            return false;
        }
        GroupData groupData = (GroupData) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.roomId, groupData.roomId) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.memberIds, groupData.memberIds) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.memberNames, groupData.memberNames) && this.memberCount == groupData.memberCount && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.membersHash, groupData.membersHash) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.mineRoomName, groupData.mineRoomName) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.owner, groupData.owner) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.notice, groupData.notice) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.noticeEditor, groupData.noticeEditor) && this.noticeTime == groupData.noticeTime;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final List<String> getMemberIds() {
        return this.memberIds;
    }

    public final List<String> getMemberNames() {
        return this.memberNames;
    }

    public final Map<String, String> getMembersHash() {
        return this.membersHash;
    }

    public final String getMineRoomName() {
        return this.mineRoomName;
    }

    public final String getNotice() {
        return this.notice;
    }

    public final String getNoticeEditor() {
        return this.noticeEditor;
    }

    public final long getNoticeTime() {
        return this.noticeTime;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        return Long.hashCode(this.noticeTime) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf((this.membersHash.hashCode() + ((Integer.hashCode(this.memberCount) + ((this.memberNames.hashCode() + ((this.memberIds.hashCode() + (this.roomId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.mineRoomName), 31, this.owner), 31, this.notice), 31, this.noticeEditor);
    }

    public final void setMemberCount(int i) {
        this.memberCount = i;
    }

    public final void setMemberIds(List<String> list) {
        this.memberIds = list;
    }

    public final void setMemberNames(List<String> list) {
        this.memberNames = list;
    }

    public final void setMembersHash(Map<String, String> map) {
        this.membersHash = map;
    }

    public final void setMineRoomName(String str) {
        this.mineRoomName = str;
    }

    public final void setNotice(String str) {
        this.notice = str;
    }

    public final void setNoticeEditor(String str) {
        this.noticeEditor = str;
    }

    public final void setNoticeTime(long j) {
        this.noticeTime = j;
    }

    public final void setOwner(String str) {
        this.owner = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("GroupData(roomId=");
        sb.append(this.roomId);
        sb.append(", memberIds=");
        sb.append(this.memberIds);
        sb.append(", memberNames=");
        sb.append(this.memberNames);
        sb.append(", memberCount=");
        sb.append(this.memberCount);
        sb.append(", membersHash=");
        sb.append(this.membersHash);
        sb.append(", mineRoomName=");
        sb.append(this.mineRoomName);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", notice=");
        sb.append(this.notice);
        sb.append(", noticeEditor=");
        sb.append(this.noticeEditor);
        sb.append(", noticeTime=");
        sb.append(this.noticeTime);
        sb.append(')');
        return sb.toString();
    }
}
