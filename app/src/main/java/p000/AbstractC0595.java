package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0595 implements Iterable, InterfaceC1737 {

    public final char f2404 = (char) AbstractC2201.m3971(1, 0, 1);

    public final int f2405 = 1;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0596(this.f2404, 1);
    }
}
