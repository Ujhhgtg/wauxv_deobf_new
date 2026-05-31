package me.hd.wauxv.data.bean.info;

import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC1469;
import p000.AbstractC1471;
import p000.AbstractC2647;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class GroupInfo {
    private GroupData groupData;
    private String name;
    private String remark;
    private String roomId;

    public GroupInfo(String str, String str2, String str3, GroupData groupData) {
        this.roomId = str;
        this.remark = str2;
        this.name = str3;
        this.groupData = groupData;
    }

    public static /* synthetic */ GroupInfo copy$default(GroupInfo groupInfo, String str, String str2, String str3, GroupData groupData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupInfo.roomId;
        }
        if ((i & 2) != 0) {
            str2 = groupInfo.remark;
        }
        if ((i & 4) != 0) {
            str3 = groupInfo.name;
        }
        if ((i & 8) != 0) {
            groupData = groupInfo.groupData;
        }
        return groupInfo.copy(str, str2, str3, groupData);
    }

    public final String component1() {
        return this.roomId;
    }

    public final String component2() {
        return this.remark;
    }

    public final String component3() {
        return this.name;
    }

    public final GroupData component4() {
        return this.groupData;
    }

    public final GroupInfo copy(String str, String str2, String str3, GroupData groupData) {
        return new GroupInfo(str, str2, str3, groupData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInfo)) {
            return false;
        }
        GroupInfo groupInfo = (GroupInfo) obj;
        return AbstractC1469.m3322(this.roomId, groupInfo.roomId) && AbstractC1469.m3322(this.remark, groupInfo.remark) && AbstractC1469.m3322(this.name, groupInfo.name) && AbstractC1469.m3322(this.groupData, groupInfo.groupData);
    }

    public final GroupData getGroupData() {
        return this.groupData;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        return this.groupData.hashCode() + AbstractC2647.m4621(AbstractC2647.m4621(this.roomId.hashCode() * 31, 31, this.remark), 31, this.name);
    }

    public final void setGroupData(GroupData groupData) {
        this.groupData = groupData;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("GroupInfo(roomId=");
        sb.append(this.roomId);
        sb.append(", remark=");
        sb.append(this.remark);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", groupData=");
        sb.append(this.groupData);
        sb.append(')');
        return sb.toString();
    }
}
