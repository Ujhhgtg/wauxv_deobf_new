package p000;

import java.util.Map;
import java.util.function.Consumer;

import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᤞᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2415 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f7743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public /* synthetic */ Object f7744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f7745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ Map f7746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ Map f7747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ long f7748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f7749;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415(String str, Map map, Map map2, long j, Consumer consumer, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f7745 = str;
        this.f7746 = map;
        this.f7747 = map2;
        this.f7748 = j;
        this.f7749 = consumer;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        return ((C2415) mo1343((InterfaceC0841) obj2, (InterfaceC0882) obj)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        C2415 c2415 = new C2415(this.f7745, this.f7746, this.f7747, this.f7748, this.f7749, interfaceC0841);
        c2415.f7744 = obj;
        return c2415;
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Exception {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f7744;
        int i = this.f7743;
        if (i == 0) {
            AbstractC1470.m3372(obj);
            C2410 c2410 = new C2410(this.f7746, this.f7747, this.f7748, 1);
            C1006 c1006 = AbstractC1080.f3904;
            C2180 c2180 = new C2180(AbstractC1470.m3361(interfaceC0882, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(this.f7745, c2410, null, 2)));
            this.f7744 = null;
            this.f7743 = 1;
            obj = c2180.m4138(this);
            EnumC0883 enumC0883 = EnumC0883.f3332;
            if (obj == enumC0883) {
                return enumC0883;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1470.m3372(obj);
        }
        ResponseBody responseBodyBody = ((Response) obj).body();
        this.f7749.accept(responseBodyBody != null ? responseBodyBody.string() : null);
        return C3554.UNIT;
    }
}
