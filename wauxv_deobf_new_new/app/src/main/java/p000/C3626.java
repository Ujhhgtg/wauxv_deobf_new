package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᲇᛸᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3626 extends AbstractC1915 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11328;

    public C3626(int i, Class cls, int i2, int i3, int i4) {
        this.f11328 = i4;
        this.f6312 = i;
        this.f6315 = cls;
        this.f6314 = i2;
        this.f6313 = i3;
    }

    @Override // p000.AbstractC1915
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Object mo3852(View view) {
        switch (this.f11328) {
            case 0:
                return AbstractC3634.m5162(view);
            default:
                return AbstractC3636.m5169(view);
        }
    }

    @Override // p000.AbstractC1915
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo3853(View view, Object obj) {
        switch (this.f11328) {
            case 0:
                AbstractC3634.m5165(view, (CharSequence) obj);
                break;
            default:
                AbstractC3636.m5170(view, (CharSequence) obj);
                break;
        }
    }

    @Override // p000.AbstractC1915
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo3858(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f11328) {
            case 0:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
        }
        return !zEquals;
    }
}
