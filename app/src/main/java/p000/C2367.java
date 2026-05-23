package p000;

import java.util.Map;
import java.util.function.Consumer;

import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲇᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2367 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public int f7609;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f7610;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f7611;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Map f7612;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Map f7613;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ long f7614;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f7615;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2367(String str, Map map, Map map2, long j, Consumer consumer, InterfaceC0842 interfaceC0842) {
        super(2, interfaceC0842);
        this.f7611 = str;
        this.f7612 = map;
        this.f7613 = map2;
        this.f7614 = j;
        this.f7615 = consumer;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        return ((C2367) mo1197((InterfaceC0842) obj2, (InterfaceC0883) obj)).mo1198(Unit.INSTANCE);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        C2367 c2367 = new C2367(this.f7611, this.f7612, this.f7613, this.f7614, this.f7615, interfaceC0842);
        c2367.f7610 = obj;
        return c2367;
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Exception {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f7610;
        int i = this.f7609;
        if (i == 0) {
            AbstractC0743.m2188(obj);
            C2362 c2362 = new C2362(this.f7612, this.f7613, this.f7614, 1);
            C1002 c1002 = AbstractC1075.f3893;
            C2146 c2146 = new C2146(AbstractC2203.m4025(interfaceC0883, AbstractC2209.m4140(ExecutorC0990.f3609, new C2857()), new C2363(this.f7611, c2362, null, 2)));
            this.f7610 = null;
            this.f7609 = 1;
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
        this.f7615.accept(responseBodyBody != null ? responseBodyBody.string() : null);
        return Unit.INSTANCE;
    }
}
