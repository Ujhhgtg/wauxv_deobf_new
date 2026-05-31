package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲈᲁᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0989 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final InterfaceC1010 f3619;

    static {
        String property;
        C1527 c1527;
        InterfaceC1010 interfaceC1010;
        int i = AbstractC2942.f9404;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C1006 c1006 = AbstractC1080.f3904;
            c1527 = AbstractC1908.f6303;
            C1527 c1528 = c1527.f5375;
            if (c1527 == null) {
                interfaceC1010 = c1527;
                interfaceC1010 = RunnableC0988.f3617;
            }
        } else {
            interfaceC1010 = RunnableC0988.f3617;
        }
        interfaceC1010 = c1527;
        f3619 = interfaceC1010;
    }
}
