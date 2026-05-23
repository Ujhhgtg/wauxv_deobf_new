package p000;

import android.view.ContextMenu;
import android.view.MenuItem;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲁᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1286 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4697;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ ContextMenu f4698;

    public /* synthetic */ C1286(ContextMenu contextMenu, int i) {
        this.f4697 = i;
        this.f4698 = contextMenu;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        int i = this.f4697;
        Class cls = Integer.TYPE;
        ContextMenu contextMenu = this.f4698;
        switch (i) {
            case 0:
                int i2 = AbstractC1745.f5844;
                C1973 c1973M3492 = AbstractC0968.m2484(contextMenu).m3492();
                c1973M3492.f6543 = AbstractC2519.m4527(MenuItem.class);
                return (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls), AbstractC2519.m4527(cls), AbstractC2519.m4527(cls), AbstractC2519.m4527(CharSequence.class), AbstractC2519.m4527(cls)}, 5, c1973M3492);
            case 1:
                int i3 = AbstractC1745.f5844;
                C1973 c1973M3493 = AbstractC0968.m2484(contextMenu).m3492();
                c1973M3493.f6543 = AbstractC2519.m4527(MenuItem.class);
                return (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls), AbstractC2519.m4527(cls), AbstractC2519.m4527(cls), AbstractC2519.m4527(CharSequence.class), AbstractC2519.m4527(cls)}, 5, c1973M3493);
            case 2:
                int i4 = AbstractC1745.f5844;
                C1973 c1973M3494 = AbstractC0968.m2484(contextMenu).m3492();
                c1973M3494.f6543 = AbstractC2519.m4527(MenuItem.class);
                return (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls), AbstractC2519.m4527(CharSequence.class), AbstractC2519.m4527(cls)}, 3, c1973M3494);
            case 3:
                int i5 = AbstractC1745.f5844;
                C1973 c1973M3495 = AbstractC0968.m2484(contextMenu).m3492();
                c1973M3495.f6543 = AbstractC2519.m4527(MenuItem.class);
                return (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls), AbstractC2519.m4527(CharSequence.class), AbstractC2519.m4527(cls)}, 3, c1973M3495);
            default:
                int i6 = AbstractC1745.f5844;
                C1973 c1973M3496 = AbstractC0968.m2484(contextMenu).m3492();
                c1973M3496.f6543 = AbstractC2519.m4527(MenuItem.class);
                return (C1982) AbstractC2784.m4743(new Object[]{AbstractC2519.m4527(cls), AbstractC2519.m4527(CharSequence.class)}, 2, c1973M3496);
        }
    }
}
