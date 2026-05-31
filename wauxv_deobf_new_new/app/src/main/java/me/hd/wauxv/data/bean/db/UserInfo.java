package me.hd.wauxv.data.bean.db;

import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC1095;
import p000.AbstractC1469;
import p000.AbstractC1471;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class UserInfo {
    private int id;
    private int type;
    private String value;

    public UserInfo(int i, int i2, String str) {
        this.id = i;
        this.type = i2;
        this.value = str;
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = userInfo.id;
        }
        if ((i3 & 2) != 0) {
            i2 = userInfo.type;
        }
        if ((i3 & 4) != 0) {
            str = userInfo.value;
        }
        return userInfo.copy(i, i2, str);
    }

    public final int component1() {
        return this.id;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.value;
    }

    public final UserInfo copy(int i, int i2, String str) {
        return new UserInfo(i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return this.id == userInfo.id && this.type == userInfo.type && AbstractC1469.m3322(this.value, userInfo.value);
    }

    public final int getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ((Integer.hashCode(this.type) + (Integer.hashCode(this.id) * 31)) * 31);
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("UserInfo(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", value=");
        return AbstractC1095.m2801(sb, this.value, ')');
    }
}
