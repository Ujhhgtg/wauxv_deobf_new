package p000;

import android.util.Pair;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᤝᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2176 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7211 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7212;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f7213;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f7214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f7215;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2176(C2178 c2178, InterfaceC1437 interfaceC1437, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f7214 = c2178;
        this.f7215 = (AbstractC2922) interfaceC1437;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f7211) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C2176) mo1343(interfaceC0841, interfaceC0882)).mo1344(C3554.UNIT);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᲇᛸ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤝᲁᛸᤞ] */
    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f7211) {
            case 0:
                C2176 c2176 = new C2176((C2178) this.f7214, (InterfaceC1437) this.f7215, interfaceC0841);
                c2176.f7213 = obj;
                return c2176;
            case 1:
                return new C2176((Pair) this.f7213, (String) this.f7214, (String) this.f7215, interfaceC0841);
            default:
                C2176 c2177 = new C2176((String) this.f7214, (String) this.f7215, interfaceC0841);
                c2177.f7213 = obj;
                return c2177;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᲁᤞᲇᛸ, ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤝᲁᛸᤞ] */
    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        InterfaceC0882 interfaceC0882;
        int i = this.f7211;
        int i2 = 2;
        InterfaceC0841 interfaceC0841 = null;
        C3554 c3554 = C3554.UNIT;
        Serializable serializable = this.f7215;
        Object obj2 = this.f7214;
        EnumC0883 enumC0883 = EnumC0883.f3332;
        switch (i) {
            case 0:
                C2178 c2178 = (C2178) obj2;
                int i3 = this.f7212;
                if (i3 == 0) {
                    AbstractC1470.m3372(obj);
                    interfaceC0882 = (InterfaceC0882) this.f7213;
                    c2178.mo761();
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1470.m3372(obj);
                        return c3554;
                    }
                    interfaceC0882 = (InterfaceC0882) this.f7213;
                    AbstractC1470.m3372(obj);
                }
                this.f7213 = null;
                this.f7212 = 2;
                return ((AbstractC2922) serializable).mo1342(interfaceC0882, this) == enumC0883 ? enumC0883 : c3554;
            case 1:
                String str = (String) serializable;
                String str2 = (String) obj2;
                Pair pair = (Pair) this.f7213;
                int i4 = this.f7212;
                if (i4 == 0) {
                    AbstractC1470.m3372(obj);
                    C2222.f7272.getClass();
                    C2213.m4153(C2213.f7263, AbstractC0972.m2609(C2221.f7271).newInstance(pair, str2, str, 1));
                    this.f7212 = 1;
                    if (AbstractC3744.m5331(5000L, this) == enumC0883) {
                        return enumC0883;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                }
                C2222.f7272.getClass();
                C2213.m4153(C2213.f7263, AbstractC0972.m2609(C2221.f7271).newInstance(pair, str2, str, 0));
                return c3554;
            default:
                InterfaceC0882 interfaceC0883 = (InterfaceC0882) this.f7213;
                int i5 = this.f7212;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1470.m3372(obj);
                    return c3554;
                }
                AbstractC1470.m3372(obj);
                C2593 c2593 = new C2593((String) serializable, i2);
                C1006 c1006 = AbstractC1080.f3904;
                C2180 c2180 = new C2180(AbstractC1470.m3361(interfaceC0883, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411((String) obj2, c2593, interfaceC0841, 3)));
                this.f7213 = null;
                this.f7212 = 1;
                return c2180.m4138(this) == enumC0883 ? enumC0883 : c3554;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176(Pair pair, String str, String str2, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f7213 = pair;
        this.f7214 = str;
        this.f7215 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176(String str, String str2, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f7214 = str;
        this.f7215 = str2;
    }
}
