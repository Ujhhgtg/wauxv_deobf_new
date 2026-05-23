package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᛸᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2474 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final AbstractC0066 f7908;

    static {
        Integer num = AbstractC1685.ANDROID_SDK;
        f7908 = (num == null || num.intValue() >= 34) ? new C2353() : new C1266();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract int mo947(int i);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public abstract int mo948();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public int mo4331(int i) {
        int iMo948;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").").toString());
        }
        if (true) {
            if (((-i) & i) == i) {
                return mo947(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                iMo948 = mo948() >>> 1;
                i2 = iMo948 % i;
            } while ((i - 1) + (iMo948 - i2) < 0);
            return i2;
        }
        while (true) {
            int iMo949 = mo948();
            if (iMo949 >= 0 && iMo949 < i) {
                return iMo949;
            }
        }
    }
}
