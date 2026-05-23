package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3585 extends AbstractC2584 implements InterfaceC1429 {

    public int f11219;

    public /* synthetic */ Object f11220;

    public final /* synthetic */ View f11221;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3585(View view, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f11221 = view;
    }

    @Override // p000.InterfaceC1429
    public final Object mo1196(Object obj, Object obj2) {
        return ((C3585) mo1197((InterfaceC0842) obj2, (C2651) obj)).mo1198(Unit.INSTANCE);
    }

    @Override // p000.AbstractC0370
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        C3585 c3585 = new C3585(this.f11221, interfaceC0842);
        c3585.f11220 = obj;
        return c3585;
    }

    @Override // p000.AbstractC0370
    public final Object mo1198(Object obj) throws Throwable {
        Object obj2;
        int i = this.f11219;
        View view = this.f11221;
        EnumC0884 enumC0884 = EnumC0884.f3325;
        if (i == 0) {
            AbstractC0743.m2188(obj);
            C2651 c2651 = (C2651) this.f11220;
            this.f11220 = c2651;
            this.f11219 = 1;
            c2651.f8554 = view;
            c2651.f8553 = 3;
            c2651.f8556 = this;
            return enumC0884;
        }
        Unit unit = Unit.INSTANCE;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0743.m2188(obj);
            return unit;
        }
        C2651 c2652 = (C2651) this.f11220;
        AbstractC0743.m2188(obj);
        if (view instanceof ViewGroup) {
            this.f11220 = null;
            this.f11219 = 2;
            
            C3430 c3430 = new C3430(new C0060(7, (ViewGroup) view));
            if (c3430.f10804.hasNext()) {
                c2652.f8555 = c3430;
                c2652.f8553 = 2;
                c2652.f8556 = this;
                obj2 = enumC0884;
            } else {
                obj2 = unit;
            }
            if (obj2 != enumC0884) {
                obj2 = unit;
            }
            if (obj2 == enumC0884) {
                return enumC0884;
            }
        }
        return unit;
    }
}
