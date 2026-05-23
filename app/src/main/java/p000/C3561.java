package p000;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᤞᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3561 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ CompoundButton f11169;

    public /* synthetic */ C3561(CompoundButton compoundButton, int i) {
        this.f11168 = i;
        this.f11169 = compoundButton;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f11168) {
            case 0:
                this.f11169.setChecked(false);
                break;
            default:
                this.f11169.setChecked(false);
                break;
        }
        return Unit.INSTANCE;
    }
}
