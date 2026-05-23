package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲈᛸᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3115 {
    public static final C3114 Companion = new C3114();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9936;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9937;

    public /* synthetic */ C3115(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3113.f9935.mo1363());
            throw null;
        }
        this.f9936 = num;
        this.f9937 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3115)) {
            return false;
        }
        C3115 c3115 = (C3115) obj;
        return AbstractC2207.m4087(this.f9936, c3115.f9936) && AbstractC2207.m4087(this.f9937, c3115.f9937);
    }

    public final int hashCode() {
        Integer num = this.f9936;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9937;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("k71Proto(effect_type=");
        sb.append(this.f9936);
        sb.append(", effect_text=");
        return AbstractC1194.m2786(sb, this.f9937, ')');
    }
}
