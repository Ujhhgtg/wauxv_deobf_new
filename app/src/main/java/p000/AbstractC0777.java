package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0777 implements InterfaceC3407, Comparable {
    @Override // java.lang.Comparable
    public final int compareTo(AbstractC0777 abstractC0777) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC0777.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : mo2267(abstractC0777);
    }

    public abstract int mo2267(AbstractC0777 abstractC0777);

    public abstract boolean mo2268();

    public abstract String mo2269();
}
