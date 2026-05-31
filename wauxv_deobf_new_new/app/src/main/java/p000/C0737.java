package p000;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᤞᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0737 implements Iterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f2827 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f2828;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2829;

    public C0737(Object obj) {
        this.f2829 = obj;
        this.f2828 = Array.getLength(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2827 < this.f2828;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object obj = this.f2829;
            int i = this.f2827;
            this.f2827 = i + 1;
            return Array.get(obj, i);
        } catch (Throwable th) {
            throw new NoSuchElementException(th.getMessage());
        }
    }
}
