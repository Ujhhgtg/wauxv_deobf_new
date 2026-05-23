package p000;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲀᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0944 extends AbstractC1213 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3457;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0944(C1212 c1212, int i) {
        super(c1212);
        this.f3457 = i;
    }

    @Override // p000.AbstractC1213
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ */
    public void mo2153() {
        switch (this.f3457) {
            case 0:
                C1212 c1212 = this.f4374;
                c1212.f4365 = null;
                CheckableImageButton checkableImageButton = c1212.f4357;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC1574.m3311(checkableImageButton, null);
                break;
        }
    }
}
