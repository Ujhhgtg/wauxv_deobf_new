package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1670 {

    public static final /* synthetic */ int[] f5639;

    static {
        int[] iArr = new int[EnumC1769.values().length];
        try {
            iArr[EnumC1769.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1769.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1769.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5639 = iArr;
    }
}
