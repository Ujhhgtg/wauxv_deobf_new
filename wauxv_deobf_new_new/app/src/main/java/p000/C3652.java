package p000;

import android.view.View;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᲀᤝᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3652 extends AbstractC1778 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C3652 f11377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C3652 f11378;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11379;

    static {
        int i = 1;
        f11377 = new C3652(i, 0);
        f11378 = new C3652(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3652(int i, int i2) {
        super(i);
        this.f11379 = i2;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f11379) {
            case 0:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                Object tag = ((View) obj).getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof InterfaceC2310) {
                    return (InterfaceC2310) tag;
                }
                return null;
            default:
                return C3554.UNIT;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652(C0163 c0163) {
        super(1);
        this.f11379 = 2;
    }
}
