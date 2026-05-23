package p000;

import java.util.Map;
import java.util.function.Consumer;

import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲇᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2366 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7603;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f7604;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f7605;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Map f7606;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ long f7607;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f7608;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2366(String str, Map map, long j, Consumer consumer, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f7605 = str;
        this.f7606 = map;
        this.f7607 = j;
        this.f7608 = consumer;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        return ((C2366) mo1197((InterfaceC0842) obj2, (InterfaceC0883) obj)).mo1198(Unit.INSTANCE);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        C2366 c2366 = new C2366(this.f7605, this.f7606, this.f7607, this.f7608, interfaceC0842);
        c2366.f7604 = obj;
        return c2366;
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Exception {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f7604;
        int i = this.f7603;
        if (i == 0) {
            AbstractC0743.m2188(obj);
            C2365 c2365 = new C2365(this.f7606, this.f7607, 0);
            C1002 c1002 = AbstractC1075.f3893;
            C2146 c2146 = new C2146(AbstractC2203.m4025(interfaceC0883, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(this.f7605, c2365, null, 1)));
            this.f7604 = null;
            this.f7603 = 1;
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
        ResponseBody responseBodyBody = ((Response) obj).body();
        this.f7608.accept(responseBodyBody != null ? responseBodyBody.string() : null);
        return Unit.INSTANCE;
    }
}
