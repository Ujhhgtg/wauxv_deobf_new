package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲁᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1733 extends AbstractC2584 implements InterfaceC1430 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f5832;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public /* synthetic */ C0977 f5833;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ C0408 f5834;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733(C0408 c0408, InterfaceC0842 interfaceC0842) {
        super(3, interfaceC0842);
        this.f5834 = c0408;
    }

    @Override // p000.InterfaceC1430
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo3133(Object obj, Object obj2, Object obj3) {
        C1733 c1733 = new C1733(this.f5834, (InterfaceC0842) obj3);
        c1733.f5833 = (C0977) obj;
        return c1733.mo1198(C3497.f10997);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Throwable {
        C0408 c0408 = this.f5834;
        C0146 c0146 = (C0146) c0408.f1922;
        C0977 c0977 = this.f5833;
        int i = this.f5832;
        if (i == 0) {
            AbstractC0743.m2188(obj);
            byte bM1180 = c0146.m1180();
            if (bM1180 == 1) {
                return c0408.m1606(true);
            }
            if (bM1180 == 0) {
                return c0408.m1606(false);
            }
            if (bM1180 != 6) {
                if (bM1180 == 8) {
                    return c0408.m1605();
                }
                C0146.m1152(c0146, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f5833 = null;
            this.f5832 = 1;
            obj = C0408.m1601(c0408, c0977, this);
            EnumC0884 enumC0884 = EnumC0884.f3325;
            if (obj == enumC0884) {
                return enumC0884;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0743.m2188(obj);
        }
        return (AbstractC1715) obj;
    }
}
