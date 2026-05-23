package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1647 extends AbstractC0592 {

    public final View f5584;

    public int f5585;

    public int f5586;

    public final int[] f5587;

    public C1647(View view) {
        super(0);
        this.f5587 = new int[2];
        this.f5584 = view;
    }

    @Override // p000.AbstractC0592
    public final void mo2019() {
        this.f5584.setTranslationY(0.0f);
    }

    @Override // p000.AbstractC0592
    public final void mo2020() {
        View view = this.f5584;
        int[] iArr = this.f5587;
        view.getLocationOnScreen(iArr);
        this.f5585 = iArr[1];
    }

    @Override // p000.AbstractC0592
    public final C3669 mo2021(C3669 c3669, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3647 c3647 = (C3647) it.next();
            if ((c3647.f11416.mo5242() & 8) != 0) {
                this.f5584.setTranslationY(AbstractC0164.m1213(this.f5586, 0, c3647.f11416.mo5241()));
                break;
            }
        }
        return c3669;
    }

    @Override // p000.AbstractC0592
    public final C2825 mo2022(C2825 c2825) {
        View view = this.f5584;
        int[] iArr = this.f5587;
        view.getLocationOnScreen(iArr);
        int i = this.f5585 - iArr[1];
        this.f5586 = i;
        view.setTranslationY(i);
        return c2825;
    }
}
