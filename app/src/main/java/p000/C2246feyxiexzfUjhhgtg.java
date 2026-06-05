package p000;

import android.os.Process;
import android.widget.TextView;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2246feyxiexzfUjhhgtg extends AbstractC1181feyxiexzfUjhhgtg implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f7302Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ TextView f7303Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2246feyxiexzfUjhhgtg(TextView textView, InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) {
        super(2, interfaceC3704Ujhhgtgfeyxiexzf);
        this.f7303Ujhhgtgfeyxiexzf = textView;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        return ((C2246feyxiexzfUjhhgtg) mo1767Ujhhgtgfeyxiexzf((InterfaceC3704Ujhhgtgfeyxiexzf) obj2, (InterfaceC3745Ujhhgtgfeyxiexzf) obj)).mo1208Ujhhgtgfeyxiexzf(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final InterfaceC3704Ujhhgtgfeyxiexzf mo1767Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, Object obj) {
        return new C2246feyxiexzfUjhhgtg(this.f7303Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final Object mo1208Ujhhgtgfeyxiexzf(Object obj) throws Throwable {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        int i = this.f7302Ujhhgtgfeyxiexzf;
        if (i == 0) {
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
            this.f7303Ujhhgtgfeyxiexzf.setText("加载完成, 准备重启...");
            this.f7302Ujhhgtgfeyxiexzf = 1;
            Object objM2750Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2750Ujhhgtgfeyxiexzf(1000L, this);
            EnumC3746Ujhhgtgfeyxiexzf enumC3746Ujhhgtgfeyxiexzf = EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf;
            if (objM2750Ujhhgtgfeyxiexzf == enumC3746Ujhhgtgfeyxiexzf) {
                return enumC3746Ujhhgtgfeyxiexzf;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
        }
        Process.killProcess(Process.myPid());
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}
