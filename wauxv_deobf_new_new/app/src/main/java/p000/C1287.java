package p000;

import android.view.ContextMenu;
import android.view.MenuItem;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲀᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1287 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ContextMenu f4697;

    public /* synthetic */ C1287(ContextMenu contextMenu, int i) {
        this.f4696 = i;
        this.f4697 = contextMenu;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() {
        int i = this.f4696;
        Class cls = Integer.TYPE;
        ContextMenu contextMenu = this.f4697;
        switch (i) {
            case 0:
                int i2 = AbstractC1768.f5906;
                C2004 c2004M3560 = AbstractC2727.m4713(contextMenu).m3560();
                c2004M3560.f6648 = AbstractC2574.m4549(MenuItem.class);
                return (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(CharSequence.class), AbstractC2574.m4549(cls)}, 5, c2004M3560);
            case 1:
                int i3 = AbstractC1768.f5906;
                C2004 c2004M3561 = AbstractC2727.m4713(contextMenu).m3560();
                c2004M3561.f6648 = AbstractC2574.m4549(MenuItem.class);
                return (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(cls), AbstractC2574.m4549(CharSequence.class), AbstractC2574.m4549(cls)}, 5, c2004M3561);
            case 2:
                int i4 = AbstractC1768.f5906;
                C2004 c2004M3562 = AbstractC2727.m4713(contextMenu).m3560();
                c2004M3562.f6648 = AbstractC2574.m4549(MenuItem.class);
                return (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(CharSequence.class), AbstractC2574.m4549(cls)}, 3, c2004M3562);
            case 3:
                int i5 = AbstractC1768.f5906;
                C2004 c2004M3563 = AbstractC2727.m4713(contextMenu).m3560();
                c2004M3563.f6648 = AbstractC2574.m4549(MenuItem.class);
                return (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(CharSequence.class), AbstractC2574.m4549(cls)}, 3, c2004M3563);
            default:
                int i6 = AbstractC1768.f5906;
                C2004 c2004M3564 = AbstractC2727.m4713(contextMenu).m3560();
                c2004M3564.f6648 = AbstractC2574.m4549(MenuItem.class);
                return (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls), AbstractC2574.m4549(CharSequence.class)}, 2, c2004M3564);
        }
    }
}
