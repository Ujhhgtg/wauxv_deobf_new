package p000;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᛸᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0947 extends AbstractC1214 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3472;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0947(C1213 c1213, int i) {
        super(c1213);
        this.f3472 = i;
    }

    @Override // p000.AbstractC1214
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public void mo2245() {
        switch (this.f3472) {
            case 0:
                C1213 c1213 = this.f4371;
                c1213.f4362 = null;
                CheckableImageButton checkableImageButton = c1213.f4354;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC3744.m5346(checkableImageButton, null);
                break;
        }
    }
}
