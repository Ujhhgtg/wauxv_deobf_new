package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲁᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1024 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3742;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2933 f3743 = new C2933(new C0114(this, 19));

    public AbstractC1024(String str) {
        this.f3742 = str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String m2718() {
        String[] strArr = AbstractC1471.f5234;
        String str = (String) this.f3743.getValue();
        String str2 = "";
        C0519 c0519 = AbstractC0738.f2837;
        if (c0519 != null) {
            return c0519.m1985().getString(str, str2);
        }
        throw new IllegalArgumentException("DexDescConfig must be init".toString());
    }
}
