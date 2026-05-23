package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3344 {
    public static final C3343 Companion = new C3343();

    public final Long f10548;

    public final Integer f10549;

    public final String f10550;

    public final String f10551;

    public /* synthetic */ C3344(int i, Long l, Integer num, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3342.f10547.mo1363());
            throw null;
        }
        this.f10548 = l;
        this.f10549 = num;
        this.f10550 = str;
        this.f10551 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3344)) {
            return false;
        }
        C3344 c3344 = (C3344) obj;
        return AbstractC2207.m4087(this.f10548, c3344.f10548) && AbstractC2207.m4087(this.f10549, c3344.f10549) && AbstractC2207.m4087(this.f10550, c3344.f10550) && AbstractC2207.m4087(this.f10551, c3344.f10551);
    }

    public final int hashCode() {
        Long l = this.f10548;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.f10549;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10550;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10551;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("wq0Proto(highest_reward=");
        sb.append(this.f10548);
        sb.append(", share_percentage=");
        sb.append(this.f10549);
        sb.append(", share_wording=");
        sb.append(this.f10550);
        sb.append(", highest_reward_suffix_wording=");
        return AbstractC1194.m2786(sb, this.f10551, ')');
    }
}
