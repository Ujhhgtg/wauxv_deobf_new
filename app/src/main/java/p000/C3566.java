package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3566 extends AbstractC1889 {

    public final /* synthetic */ int f11179;

    public C3566(int i, Class cls, int i2, int i3, int i4) {
        this.f11179 = i4;
        this.f6238 = i;
        this.f6241 = cls;
        this.f6240 = i2;
        this.f6239 = i3;
    }

    @Override // p000.AbstractC1889
    public final Object mo3674(View view) {
        switch (this.f11179) {
            case 0:
                return AbstractC3574.m5156(view);
            default:
                return AbstractC3576.m5163(view);
        }
    }

    @Override // p000.AbstractC1889
    public final void mo3675(View view, Object obj) {
        switch (this.f11179) {
            case 0:
                AbstractC3574.m5159(view, (CharSequence) obj);
                break;
            default:
                AbstractC3576.m5164(view, (CharSequence) obj);
                break;
        }
    }

    @Override // p000.AbstractC1889
    public final boolean mo3680(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f11179) {
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
