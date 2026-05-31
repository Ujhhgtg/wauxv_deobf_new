package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲈᲇᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1661 extends AbstractC0573 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final View f5619;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f5620;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f5621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int[] f5622;

    public C1661(View view) {
        super(0);
        this.f5622 = new int[2];
        this.f5619 = view;
    }

    @Override // p000.AbstractC0573
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲇᲈ */
    public final void mo2116() {
        this.f5619.setTranslationY(0.0f);
    }

    @Override // p000.AbstractC0573
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᤞᲈᲇ */
    public final void mo2117() {
        View view = this.f5619;
        int[] iArr = this.f5622;
        view.getLocationOnScreen(iArr);
        this.f5620 = iArr[1];
    }

    @Override // p000.AbstractC0573
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᤞᲈ */
    public final C3729 mo2118(C3729 c3729, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3707 c3707 = (C3707) it.next();
            if ((c3707.f11565.mo5248() & 8) != 0) {
                this.f5619.setTranslationY(AbstractC0172.m1359(this.f5621, 0, c3707.f11565.mo5247()));
                break;
            }
        }
        return c3729;
    }

    @Override // p000.AbstractC0573
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲇᲈᤞ */
    public final C2885 mo2119(C2885 c2885) {
        View view = this.f5619;
        int[] iArr = this.f5622;
        view.getLocationOnScreen(iArr);
        int i = this.f5620 - iArr[1];
        this.f5621 = i;
        view.setTranslationY(i);
        return c2885;
    }
}
