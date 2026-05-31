package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤞᛸᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3645 extends AbstractC2640 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f11368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f11369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ View f11370;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3645(View view, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f11370 = view;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        return ((C3645) mo1343((InterfaceC0841) obj2, (C2712) obj)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        C3645 c3645 = new C3645(this.f11370, interfaceC0841);
        c3645.f11369 = obj;
        return c3645;
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        Object obj2;
        int i = this.f11368;
        View view = this.f11370;
        EnumC0883 enumC0883 = EnumC0883.f3332;
        if (i == 0) {
            AbstractC1470.m3372(obj);
            C2712 c2712 = (C2712) this.f11369;
            this.f11369 = c2712;
            this.f11368 = 1;
            c2712.f8719 = view;
            c2712.f8718 = 3;
            c2712.f8721 = this;
            return enumC0883;
        }
        C3554 c3554 = C3554.UNIT;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1470.m3372(obj);
            return c3554;
        }
        C2712 c2713 = (C2712) this.f11369;
        AbstractC1470.m3372(obj);
        if (view instanceof ViewGroup) {
            this.f11369 = null;
            this.f11368 = 2;
            c2713.getClass();
            C3487 c3487 = new C3487(new C0067((ViewGroup) view, 7));
            if (c3487.f10964.hasNext()) {
                c2713.f8720 = c3487;
                c2713.f8718 = 2;
                c2713.f8721 = this;
                obj2 = enumC0883;
            } else {
                obj2 = c3554;
            }
            if (obj2 != enumC0883) {
                obj2 = c3554;
            }
            if (obj2 == enumC0883) {
                return enumC0883;
            }
        }
        return c3554;
    }
}
