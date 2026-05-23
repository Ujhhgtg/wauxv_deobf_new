package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0552 implements InterfaceC1735, Serializable {

    public transient InterfaceC1735 f2267;

    public final Object f2268;

    public final Class f2269;

    public final String f2270;

    public final String f2271;

    public final boolean f2272;

    public AbstractC0552(Object obj, Class cls, String str, String str2, boolean z) {
        this.f2268 = obj;
        this.f2269 = cls;
        this.f2270 = str;
        this.f2271 = str2;
        this.f2272 = z;
    }

    public InterfaceC1735 mo1930() {
        InterfaceC1735 interfaceC1735 = this.f2267;
        if (interfaceC1735 != null) {
            return interfaceC1735;
        }
        InterfaceC1735 interfaceC1735Mo1931 = mo1931();
        this.f2267 = interfaceC1735Mo1931;
        return interfaceC1735Mo1931;
    }

    public abstract InterfaceC1735 mo1931();

    public final InterfaceC0696 m1932() {
        boolean z = this.f2272;
        Class cls = this.f2269;
        if (!z) {
            return AbstractC2519.classToKClass(cls);
        }
        
        return new C2311(cls);
    }
}
