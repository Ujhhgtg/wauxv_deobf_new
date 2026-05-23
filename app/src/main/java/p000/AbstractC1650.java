package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1650 extends AbstractC1938 {

    public Object f5592;

    public final void m3378(Object obj) {
        if (this.f5592 == null) {
            this.f5592 = obj;
            return;
        }
        throw new IllegalStateException(("Instance already set for this resolver \"" + getClass() + "\" of \"" + mo2350() + "(" + this.f5592 + ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver.").toString());
    }

    public abstract AbstractC1650 mo3022(Object obj);
}
