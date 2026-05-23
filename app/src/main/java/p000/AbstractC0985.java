package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᛸᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0985 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final InterfaceC1006 f3603;

    static {
        String property;
        C1515 c1515;
        InterfaceC1006 interfaceC1006;
        int i = AbstractC2883.f9237;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C1002 c1002 = AbstractC1075.f3893;
            c1515 = AbstractC1881.f6228;
            C1515 c1516 = c1515.f5344;
            if (c1515 == null) {
                interfaceC1006 = c1515;
                interfaceC1006 = RunnableC0984.f3601;
            }
        } else {
            interfaceC1006 = RunnableC0984.f3601;
        }
        interfaceC1006 = c1515;
        f3603 = interfaceC1006;
    }
}
