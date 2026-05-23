package p000;

import android.util.Pair;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᤝᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2142 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7087 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f7088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public /* synthetic */ Object f7089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f7091;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2142(C2144 c2144, InterfaceC1429 interfaceC1429, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f7090 = c2144;
        this.f7091 = (AbstractC2862) interfaceC1429;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (1) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C2142) mo1197(interfaceC0842, interfaceC0883)).mo1198(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᛸᲇ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲇᲁᤝ] */
    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (1) {
            case 0:
                C2142 c2142 = new C2142((C2144) this.f7090, (InterfaceC1429) this.f7091, interfaceC0842);
                c2142.f7089 = obj;
                return c2142;
            case 1:
                return new C2142((Pair) this.f7089, (String) this.f7090, (String) this.f7091, interfaceC0842);
            default:
                C2142 c2143 = new C2142((String) this.f7090, (String) this.f7091, interfaceC0842);
                c2143.f7089 = obj;
                return c2143;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᛸᲇ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲇᲁᤝ] */
    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Throwable {
        InterfaceC0883 interfaceC0883;
        int i = 1;
        int i2 = 2;
        InterfaceC0842 interfaceC0842 = null;
        Unit unit = Unit.INSTANCE;
        Serializable serializable = this.f7091;
        Object obj2 = this.f7090;
        EnumC0884 enumC0884 = EnumC0884.f3325;
        switch (1) {
            case 0:
                C2144 c2144 = (C2144) obj2;
                int i3 = this.f7088;
                if (i3 == 0) {
                    AbstractC0743.m2188(obj);
                    interfaceC0883 = (InterfaceC0883) this.f7089;
                    c2144.mo618();
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0743.m2188(obj);
                        return unit;
                    }
                    interfaceC0883 = (InterfaceC0883) this.f7089;
                    AbstractC0743.m2188(obj);
                }
                this.f7089 = null;
                this.f7088 = 2;
                return ((AbstractC2862) serializable).mo1196(interfaceC0883, this) == enumC0884 ? enumC0884 : unit;
            case 1:
                String str = (String) serializable;
                String str2 = (String) obj2;
                Pair pair = (Pair) this.f7089;
                int i4 = this.f7088;
                if (i4 == 0) {
                    AbstractC0743.m2188(obj);
                    
                    C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2187.f7148).newInstance(pair, str2, str, 1));
                    this.f7088 = 1;
                    if (AbstractC1460.m3215(5000L, this) == enumC0884) {
                        return enumC0884;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                }
                
                C2180.addNetSceneToQueue(AbstractC1574.dexToCtor(C2187.f7148).newInstance(pair, str2, str, 0));
                return unit;
            default:
                InterfaceC0883 interfaceC0884 = (InterfaceC0883) this.f7089;
                int i5 = this.f7088;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0743.m2188(obj);
                    return unit;
                }
                AbstractC0743.m2188(obj);
                C2536 c2536 = new C2536((String) serializable, i2);
                C1002 c1002 = AbstractC1075.f3893;
                C2146 c2146 = new C2146(AbstractC2203.m4025(interfaceC0884, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363((String) obj2, c2536, interfaceC0842, 3)));
                this.f7089 = null;
                this.f7088 = 1;
                return c2146.m3954(this) == enumC0884 ? enumC0884 : unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2142(Pair pair, String str, String str2, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f7089 = pair;
        this.f7090 = str;
        this.f7091 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2142(String str, String str2, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f7090 = str;
        this.f7091 = str2;
    }
}
