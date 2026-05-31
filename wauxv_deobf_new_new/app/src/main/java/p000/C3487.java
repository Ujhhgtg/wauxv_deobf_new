package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᲈᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3487 implements Iterator, InterfaceC1761 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f10963;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Iterator f10964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f10965;

    public C3487(C0067 c0067) {
        this.f10963 = 1;
        this.f10965 = new ArrayList();
        this.f10964 = c0067;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10963) {
            case 0:
                break;
        }
        return this.f10964.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10963) {
            case 0:
                return ((InterfaceC1433) ((C1012) this.f10965).f3691).invoke(this.f10964.next());
            default:
                Object next = this.f10964.next();
                ArrayList arrayList = (ArrayList) this.f10965;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C0067 c0067 = viewGroup != null ? new C0067(viewGroup, 7) : null;
                if (c0067 == null || !c0067.hasNext()) {
                    while (!this.f10964.hasNext() && !arrayList.isEmpty()) {
                        this.f10964 = (Iterator) AbstractC0739.m2296(arrayList);
                        AbstractC0745.m2319(arrayList);
                    }
                } else {
                    arrayList.add(this.f10964);
                    this.f10964 = c0067;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10963) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3487(C1012 c1012) {
        this.f10963 = 0;
        this.f10965 = c1012;
        this.f10964 = ((InterfaceC2711) c1012.f3690).iterator();
    }
}
