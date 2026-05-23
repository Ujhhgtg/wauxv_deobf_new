package p000;

import com.google.android.material.checkbox.MaterialCheckBox;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0153 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1160 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f1161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public /* synthetic */ Object f1162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1163;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153(C0542 c0542, C0719 c0719, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f1162 = c0542;
        this.f1163 = c0719;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object mo1196(Object obj, Object obj2) {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f1160) {
            case 0:
                break;
        }
        return ((C0153) mo1197(interfaceC0842, interfaceC0883)).mo1198(C3497.f10997);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᛸᲇ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲇᲁᤝ] */
    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (this.f1160) {
            case 0:
                C0153 c0153 = new C0153((AbstractC2862) this.f1163, interfaceC0842);
                c0153.f1162 = obj;
                return c0153;
            default:
                return new C0153((C0542) this.f1162, (C0719) this.f1163, interfaceC0842);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᛸᲇ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲇᲁᤝ] */
    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object mo1198(Object obj) throws Throwable {
        int i = this.f1160;
        C3497 c3497 = C3497.f10997;
        EnumC0884 enumC0884 = EnumC0884.f3325;
        Object obj2 = this.f1163;
        switch (i) {
            case 0:
                int i2 = this.f1161;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                    return c3497;
                }
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f1162;
                this.f1161 = 1;
                return ((AbstractC2862) obj2).mo1196(interfaceC0883, this) == enumC0884 ? enumC0884 : c3497;
            default:
                C0719 c0719 = (C0719) obj2;
                String[] strArr = AbstractC1574.f5469;
                int i3 = this.f1161;
                if (i3 == 0) {
                    AbstractC0743.m2188(obj);
                    C0717 c0717 = new C0717(c0719, null, 0);
                    this.f1161 = 1;
                    C2873 c2873 = AbstractC2861.f9168;
                    C1002 c1002 = AbstractC1075.f3893;
                    obj = AbstractC2203.m4045(ExecutorC0990.f3609, c0717, this);
                    if (obj == enumC0884) {
                        return enumC0884;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                }
                ((MaterialCheckBox) ((C0542) this.f1162).f2253).setText(c0719.f2728 + " (" + ((String) obj) + ')');
                return c3497;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0153(InterfaceC1429 interfaceC1429, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f1163 = (AbstractC2862) interfaceC1429;
    }
}
