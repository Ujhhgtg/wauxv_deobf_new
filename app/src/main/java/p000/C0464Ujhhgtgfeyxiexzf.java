package p000;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0464Ujhhgtgfeyxiexzf extends AbstractC0056Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f2367Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f2368Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0464Ujhhgtgfeyxiexzf(int i, Object obj) {
        super(0);
        this.f2367Ujhhgtgfeyxiexzf = i;
        this.f2368Ujhhgtgfeyxiexzf = obj;
    }

    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        switch (this.f2367Ujhhgtgfeyxiexzf) {
            case 0:
                return Long.valueOf(((C0466Ujhhgtgfeyxiexzf) this.f2368Ujhhgtgfeyxiexzf).f2371Ujhhgtgfeyxiexzf.contentLength());
            case 1:
                InterfaceC2298Ujhhgtgfeyxiexzf interfaceC2298Ujhhgtgfeyxiexzf = (InterfaceC2298Ujhhgtgfeyxiexzf) this.f2368Ujhhgtgfeyxiexzf;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C2297Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(C1092feyxiexzfUjhhgtg.class).mo2998Ujhhgtgfeyxiexzf()));
                C2297Ujhhgtgfeyxiexzf[] c2297UjhhgtgfeyxiexzfArr = (C2297Ujhhgtgfeyxiexzf[]) arrayList.toArray(new C2297Ujhhgtgfeyxiexzf[0]);
                AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtgMo3507Ujhhgtgfeyxiexzf = interfaceC2298Ujhhgtgfeyxiexzf.mo3507Ujhhgtgfeyxiexzf();
                if (interfaceC2298Ujhhgtgfeyxiexzf instanceof InterfaceC0536Ujhhgtgfeyxiexzf) {
                    ((InterfaceC0536Ujhhgtgfeyxiexzf) interfaceC2298Ujhhgtgfeyxiexzf).mo1831Ujhhgtgfeyxiexzf();
                    throw null;
                }
                C3752Ujhhgtgfeyxiexzf c3752Ujhhgtgfeyxiexzf = C3752Ujhhgtgfeyxiexzf.f11828Ujhhgtgfeyxiexzf;
                abstractC1791feyxiexzfUjhhgtgMo3507Ujhhgtgfeyxiexzf.getClass();
                throw null;
            default:
                Toast toast = AbstractC1243feyxiexzfUjhhgtg.f4584Ujhhgtgfeyxiexzf;
                if (toast != null) {
                    toast.cancel();
                }
                Context context = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                if (context == null) {
                    context = null;
                }
                Toast toastMakeText = Toast.makeText(context, (String) this.f2368Ujhhgtgfeyxiexzf, 0);
                AbstractC1243feyxiexzfUjhhgtg.f4584Ujhhgtgfeyxiexzf = toastMakeText;
                if (toastMakeText != null) {
                    toastMakeText.show();
                }
                return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    }
}
