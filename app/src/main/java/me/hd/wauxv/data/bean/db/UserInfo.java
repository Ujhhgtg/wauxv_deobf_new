package me.hd.wauxv.data.bean.db;

import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.C3052Ujhhgtgfeyxiexzf;

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
        return this.id == userInfo.id && this.type == userInfo.type && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.value, userInfo.value);
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
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("UserInfo(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", value=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.value, ')');
    }
}
