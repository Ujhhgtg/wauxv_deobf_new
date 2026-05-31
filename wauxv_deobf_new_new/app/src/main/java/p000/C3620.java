package p000;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲀᤞᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3620 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11317;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ CompoundButton f11318;

    public /* synthetic */ C3620(CompoundButton compoundButton, int i) {
        this.f11317 = i;
        this.f11318 = compoundButton;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        switch (this.f11317) {
            case 0:
                this.f11318.setChecked(false);
                break;
            default:
                this.f11318.setChecked(false);
                break;
        }
        return C3554.UNIT;
    }
}
