package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᛸᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2618 extends AbstractC2619 implements Iterator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2617 f8500;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f8501 = true;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2620 f8502;

    public C2618(C2620 c2620) {
        this.f8502 = c2620;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8501) {
            return this.f8502.f8503 != null;
        }
        C2617 c2617 = this.f8500;
        return (c2617 == null || c2617.f8498 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8501) {
            this.f8501 = false;
            this.f8500 = this.f8502.f8503;
        } else {
            C2617 c2617 = this.f8500;
            this.f8500 = c2617 != null ? c2617.f8498 : null;
        }
        return this.f8500;
    }

    @Override // p000.AbstractC2619
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo4631(C2617 c2617) {
        C2617 c2618 = this.f8500;
        if (c2617 == c2618) {
            C2617 c2619 = c2618.f8499;
            this.f8500 = c2619;
            this.f8501 = c2619 == null;
        }
    }
}
