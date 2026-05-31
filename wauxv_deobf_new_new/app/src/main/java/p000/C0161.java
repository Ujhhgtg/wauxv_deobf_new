package p000;

import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0161 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1228 = 2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f1229;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f1230;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f1231;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161(InterfaceC1433 interfaceC1433, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f1231 = interfaceC1433;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object mo1342(Object obj, Object obj2) {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f1228) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0161) mo1343(interfaceC0841, interfaceC0882)).mo1344(C3554.UNIT);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᲇᛸ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤝᲁᛸᤞ] */
    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f1228) {
            case 0:
                C0161 c0161 = new C0161((InterfaceC1437) this.f1231, interfaceC0841);
                c0161.f1230 = obj;
                return c0161;
            case 1:
                return new C0161((C1692) this.f1230, (C0714) this.f1231, interfaceC0841);
            default:
                C0161 c0162 = new C0161((InterfaceC1433) this.f1231, interfaceC0841);
                c0162.f1230 = obj;
                return c0162;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᲇᛸ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤝᲁᛸᤞ] */
    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object mo1344(Object obj) throws Throwable {
        Object c2641;
        int i = this.f1228;
        InterfaceC0841 interfaceC0841 = null;
        Object obj2 = this.f1231;
        EnumC0883 enumC0883 = EnumC0883.f3332;
        C3554 c3554 = C3554.UNIT;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f1229;
                if (i3 == 0) {
                    AbstractC1470.m3372(obj);
                    InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f1230;
                    this.f1229 = 1;
                    if (((AbstractC2922) obj2).mo1342(interfaceC0882, this) == enumC0883) {
                        return enumC0883;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                }
                return c3554;
            case 1:
                C0714 c0714 = (C0714) obj2;
                String[] strArr = AbstractC1471.f5234;
                int i4 = this.f1229;
                if (i4 == 0) {
                    AbstractC1470.m3372(obj);
                    C0712 c0712 = new C0712(c0714, interfaceC0841, 0);
                    this.f1229 = 1;
                    C2933 c2933 = AbstractC2921.f9338;
                    C1006 c1006 = AbstractC1080.f3904;
                    obj = AbstractC1470.m3374(ExecutorC0994.f3625, c0712, this);
                    if (obj == enumC0883) {
                        return enumC0883;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                }
                ((MaterialCheckBox) ((C1692) this.f1230).f5693).setText(c0714.f2722 + " (" + ((String) obj) + ')');
                return c3554;
            default:
                int i5 = this.f1229;
                int i6 = 2;
                if (i5 == 0) {
                    AbstractC1470.m3372(obj);
                    InterfaceC1433 interfaceC1433 = (InterfaceC1433) obj2;
                    try {
                        C0814 c0814 = new C0814();
                        C0815 c0815 = new C0815(c0814);
                        interfaceC1433.invoke(c0815);
                        c0814.f3188 = c0815;
                        c2641 = c0814;
                    } catch (Throwable th) {
                        c2641 = new C2641(th);
                    }
                    if (C2642.m4616(c2641) == null) {
                        C0712 c0713 = new C0712((C0814) c2641, interfaceC0841, i2);
                        this.f1230 = null;
                        this.f1229 = 2;
                        C2933 c2934 = AbstractC2921.f9338;
                        C1006 c1007 = AbstractC1080.f3904;
                        if (AbstractC1470.m3374(AbstractC1908.f6303, c0713, this) == enumC0883) {
                            return enumC0883;
                        }
                    } else {
                        C0314 c0314 = new C0314(i6, interfaceC0841, 3);
                        this.f1230 = null;
                        this.f1229 = 1;
                        C2933 c2935 = AbstractC2921.f9338;
                        C1006 c1008 = AbstractC1080.f3904;
                        if (AbstractC1470.m3374(AbstractC1908.f6303, c0314, this) == enumC0883) {
                            return enumC0883;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                }
                return c3554;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0161(InterfaceC1437 interfaceC1437, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f1231 = (AbstractC2922) interfaceC1437;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161(C1692 c1692, C0714 c0714, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f1230 = c1692;
        this.f1231 = c0714;
    }
}
