package p000;

import java.util.Map;
import java.util.function.Consumer;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛴᛱUjhhgtgᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1422feyxiexzfUjhhgtg extends AbstractC1181feyxiexzfUjhhgtg implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f4996Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public /* synthetic */ Object f4997Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ String f4998Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ Map f4999Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final /* synthetic */ Map f5000Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ long f5001Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Consumer f5002Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422feyxiexzfUjhhgtg(String str, Map map, Map map2, long j, Consumer consumer, InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) {
        super(2, interfaceC3704Ujhhgtgfeyxiexzf);
        this.f4998Ujhhgtgfeyxiexzf = str;
        this.f4999Ujhhgtgfeyxiexzf = map;
        this.f5000Ujhhgtgfeyxiexzf = map2;
        this.f5001Ujhhgtgfeyxiexzf = j;
        this.f5002Ujhhgtgfeyxiexzf = consumer;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        return ((C1422feyxiexzfUjhhgtg) mo1767Ujhhgtgfeyxiexzf((InterfaceC3704Ujhhgtgfeyxiexzf) obj2, (InterfaceC3745Ujhhgtgfeyxiexzf) obj)).mo1208Ujhhgtgfeyxiexzf(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final InterfaceC3704Ujhhgtgfeyxiexzf mo1767Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, Object obj) {
        C1422feyxiexzfUjhhgtg c1422feyxiexzfUjhhgtg = new C1422feyxiexzfUjhhgtg(this.f4998Ujhhgtgfeyxiexzf, this.f4999Ujhhgtgfeyxiexzf, this.f5000Ujhhgtgfeyxiexzf, this.f5001Ujhhgtgfeyxiexzf, this.f5002Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf);
        c1422feyxiexzfUjhhgtg.f4997Ujhhgtgfeyxiexzf = obj;
        return c1422feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final Object mo1208Ujhhgtgfeyxiexzf(Object obj) throws Exception {
        InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4997Ujhhgtgfeyxiexzf;
        int i = this.f4996Ujhhgtgfeyxiexzf;
        if (i == 0) {
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
            C1419feyxiexzfUjhhgtg c1419feyxiexzfUjhhgtg = new C1419feyxiexzfUjhhgtg(this.f4999Ujhhgtgfeyxiexzf, this.f5000Ujhhgtgfeyxiexzf, this.f5001Ujhhgtgfeyxiexzf, 1);
            C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
            C0433Ujhhgtgfeyxiexzf c0433Ujhhgtgfeyxiexzf = new C0433Ujhhgtgfeyxiexzf(AbstractC3612feyxiexzfUjhhgtg.m5232Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf, AbstractC3593Ujhhgtgfeyxiexzf.m5163feyxiexzfUjhhgtg(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C1175feyxiexzfUjhhgtg()), new C1418feyxiexzfUjhhgtg(this.f4998Ujhhgtgfeyxiexzf, c1419feyxiexzfUjhhgtg, null, 2)));
            this.f4997Ujhhgtgfeyxiexzf = null;
            this.f4996Ujhhgtgfeyxiexzf = 1;
            obj = c0433Ujhhgtgfeyxiexzf.m1757Ujhhgtgfeyxiexzf(this);
            EnumC3746Ujhhgtgfeyxiexzf enumC3746Ujhhgtgfeyxiexzf = EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
            if (obj == enumC3746Ujhhgtgfeyxiexzf) {
                return enumC3746Ujhhgtgfeyxiexzf;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
        }
        ResponseBody responseBodyBody = ((Response) obj).body();
        this.f5002Ujhhgtgfeyxiexzf.accept(responseBodyBody != null ? responseBodyBody.string() : null);
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}
