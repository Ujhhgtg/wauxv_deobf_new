package p000;

import java.util.Map;
import java.util.function.Consumer;

import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᤞᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2414 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f7737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public /* synthetic */ Object f7738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f7739;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ Map f7740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ long f7741;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f7742;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2414(String str, Map map, long j, Consumer consumer, InterfaceC0841 interfaceC0841) {
        super(2, interfaceC0841);
        this.f7739 = str;
        this.f7740 = map;
        this.f7741 = j;
        this.f7742 = consumer;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        return ((C2414) mo1343((InterfaceC0841) obj2, (InterfaceC0882) obj)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        C2414 c2414 = new C2414(this.f7739, this.f7740, this.f7741, this.f7742, interfaceC0841);
        c2414.f7738 = obj;
        return c2414;
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Exception {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f7738;
        int i = this.f7737;
        if (i == 0) {
            AbstractC1470.m3372(obj);
            C2413 c2413 = new C2413(this.f7740, this.f7741, 0);
            C1006 c1006 = AbstractC1080.f3904;
            C2180 c2180 = new C2180(AbstractC1470.m3361(interfaceC0882, AbstractC1586.m3481(ExecutorC0994.f3625, new C2917()), new C2411(this.f7739, c2413, null, 1)));
            this.f7738 = null;
            this.f7737 = 1;
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
        this.f7742.accept(responseBodyBody != null ? responseBodyBody.string() : null);
        return C3554.UNIT;
    }
}
