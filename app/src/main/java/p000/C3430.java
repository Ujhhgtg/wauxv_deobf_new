package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3430 implements Iterator, InterfaceC1737 {

    public final /* synthetic */ int f10803;

    public Iterator f10804;

    public final Object f10805;

    public C3430(C0060 c0060) {
        this.f10803 = 1;
        this.f10805 = new ArrayList();
        this.f10804 = c0060;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10803) {
            case 0:
                break;
        }
        return this.f10804.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10803) {
            case 0:
                return ((InterfaceC1425) ((C1009) this.f10805).f3684).invoke(this.f10804.next());
            default:
                Object next = this.f10804.next();
                ArrayList arrayList = (ArrayList) this.f10805;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                C0060 c0060 = viewGroup != null ? new C0060(7, viewGroup) : null;
                if (c0060 == null || !c0060.hasNext()) {
                    while (!this.f10804.hasNext() && !arrayList.isEmpty()) {
                        this.f10804 = (Iterator) AbstractC0744.m2197(arrayList);
                        AbstractC0750.m2219(arrayList);
                    }
                } else {
                    arrayList.add(this.f10804);
                    this.f10804 = c0060;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10803) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3430(C1009 c1009) {
        this.f10803 = 0;
        this.f10805 = c1009;
        this.f10804 = ((InterfaceC2650) c1009.f3683).iterator();
    }
}
