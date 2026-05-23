package p000;

import java.io.File;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲇᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2364 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f7594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f7595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Map f7596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f7597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ long f7598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f7599;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364(String str, Map map, String str2, long j, Consumer consumer, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f7595 = str;
        this.f7596 = map;
        this.f7597 = str2;
        this.f7598 = j;
        this.f7599 = consumer;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        return ((C2364) mo1197((InterfaceC0842) obj2, (InterfaceC0883) obj)).mo1198(Unit.INSTANCE);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        C2364 c2364 = new C2364(this.f7595, this.f7596, this.f7597, this.f7598, this.f7599, interfaceC0842);
        c2364.f7594 = obj;
        return c2364;
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Exception {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f7594;
        int i = this.f7593;
        if (i == 0) {
            AbstractC0743.m2188(obj);
            C2362 c2362 = new C2362(this.f7596, this.f7597, this.f7598, 0);
            C1002 c1002 = AbstractC1075.f3893;
            C2146 c2146 = new C2146(AbstractC2203.m4025(interfaceC0883, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(this.f7595, c2362, null, 0)));
            this.f7594 = null;
            this.f7593 = 1;
            obj = c2146.m3954(this);
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
        this.f7599.accept((File) obj);
        return Unit.INSTANCE;
    }
}
