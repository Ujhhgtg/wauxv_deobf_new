package p000;

import android.content.Context;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Response;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛲᛴᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1418feyxiexzfUjhhgtg extends AbstractC1181feyxiexzfUjhhgtg implements InterfaceC3553feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4981Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public /* synthetic */ Object f4982Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ String f4983Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3549feyxiexzfUjhhgtg f4984Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1418feyxiexzfUjhhgtg(String str, InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg, InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, int i) {
        super(2, interfaceC3704Ujhhgtgfeyxiexzf);
        this.f4981Ujhhgtgfeyxiexzf = i;
        this.f4983Ujhhgtgfeyxiexzf = str;
        this.f4984Ujhhgtgfeyxiexzf = interfaceC3549feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC3553feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Object mo1179Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf = (InterfaceC3745Ujhhgtgfeyxiexzf) obj;
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = (InterfaceC3704Ujhhgtgfeyxiexzf) obj2;
        switch (this.f4981Ujhhgtgfeyxiexzf) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return ((C1418feyxiexzfUjhhgtg) mo1767Ujhhgtgfeyxiexzf(interfaceC3704Ujhhgtgfeyxiexzf, interfaceC3745Ujhhgtgfeyxiexzf)).mo1208Ujhhgtgfeyxiexzf(C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final InterfaceC3704Ujhhgtgfeyxiexzf mo1767Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, Object obj) {
        switch (this.f4981Ujhhgtgfeyxiexzf) {
            case 0:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C1419feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 0);
                c1418feyxiexzfUjhhgtg.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg;
            case 1:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg2 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C1427feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 1);
                c1418feyxiexzfUjhhgtg2.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg2;
            case 2:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg3 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C1419feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 2);
                c1418feyxiexzfUjhhgtg3.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg3;
            case 3:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg4 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C0998feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 3);
                c1418feyxiexzfUjhhgtg4.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg4;
            case 4:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg5 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C0998feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 4);
                c1418feyxiexzfUjhhgtg5.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg5;
            case 5:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg6 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C0998feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 5);
                c1418feyxiexzfUjhhgtg6.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg6;
            case 6:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg7 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C0998feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 6);
                c1418feyxiexzfUjhhgtg7.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg7;
            case 7:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg8 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C0998feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 7);
                c1418feyxiexzfUjhhgtg8.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg8;
            case 8:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg9 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C0998feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 8);
                c1418feyxiexzfUjhhgtg9.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg9;
            default:
                C1418feyxiexzfUjhhgtg c1418feyxiexzfUjhhgtg10 = new C1418feyxiexzfUjhhgtg(this.f4983Ujhhgtgfeyxiexzf, (C0998feyxiexzfUjhhgtg) this.f4984Ujhhgtgfeyxiexzf, interfaceC3704Ujhhgtgfeyxiexzf, 9);
                c1418feyxiexzfUjhhgtg10.f4982Ujhhgtgfeyxiexzf = obj;
                return c1418feyxiexzfUjhhgtg10;
        }
    }

    @Override // p000.AbstractC2483feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final Object mo1208Ujhhgtgfeyxiexzf(Object obj) throws Throwable {
        int i = this.f4981Ujhhgtgfeyxiexzf;
        InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg = this.f4984Ujhhgtgfeyxiexzf;
        String str = this.f4983Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf.m3713Ujhhgtgfeyxiexzf();
                ((C1419feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf);
                Context context = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                C0955feyxiexzfUjhhgtg c0955feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.f3826Ujhhgtgfeyxiexzf;
                C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(File.class);
                List list = Collections.EMPTY_LIST;
                c0955feyxiexzfUjhhgtg.getClass();
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf.f8005Ujhhgtgfeyxiexzf, new C1775Ujhhgtgfeyxiexzf(c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf, true));
                Response responseExecute = c1855Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    C0428Ujhhgtgfeyxiexzf c0428UjhhgtgfeyxiexzfM2783Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute.request());
                    C2839feyxiexzfUjhhgtg c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf2 = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(File.class);
                    c0955feyxiexzfUjhhgtg.getClass();
                    return (File) c0428UjhhgtgfeyxiexzfM2783Ujhhgtgfeyxiexzf.m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(new C1775Ujhhgtgfeyxiexzf(c2839feyxiexzfUjhhgtgM2443Ujhhgtgfeyxiexzf2, true)), responseExecute);
                } catch (NetException e) {
                    throw e;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new ConvertException(responseExecute, MagicFactory.get(4928445899526374794L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), th, null, 8, null);
                }
            case 1:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf2 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf2.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf2 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf2.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf2.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf2.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf2.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf2.m3713Ujhhgtgfeyxiexzf();
                ((C1427feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf2);
                Context context2 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf2.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(Response.class));
                Response responseExecute2 = c1855Ujhhgtgfeyxiexzf2.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf2.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute2.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(Response.class)), responseExecute2);
                    if (objM1747Ujhhgtgfeyxiexzf != null) {
                        return (Response) objM1747Ujhhgtgfeyxiexzf;
                    }
                    throw new NullPointerException(MagicFactory.get(4928445289641018762L, strArr));
                } catch (NetException e3) {
                    throw e3;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th2) {
                    throw new ConvertException(responseExecute2, MagicFactory.get(4928444507956970890L, strArr), th2, null, 8, null);
                }
            case 2:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf3 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf3.mo96Ujhhgtgfeyxiexzf());
                C2653Ujhhgtgfeyxiexzf c2653Ujhhgtgfeyxiexzf = new C2653Ujhhgtgfeyxiexzf();
                c2653Ujhhgtgfeyxiexzf.f8513Ujhhgtgfeyxiexzf = new MultipartBody.Builder(null, 1, null);
                c2653Ujhhgtgfeyxiexzf.f8514Ujhhgtgfeyxiexzf = new FormBody.Builder(null, 1, null);
                c2653Ujhhgtgfeyxiexzf.f8515Ujhhgtgfeyxiexzf = AbstractC0232Ujhhgtgfeyxiexzf.f1554Ujhhgtgfeyxiexzf;
                c2653Ujhhgtgfeyxiexzf.f8516Ujhhgtgfeyxiexzf = 5;
                c2653Ujhhgtgfeyxiexzf.m3712Ujhhgtgfeyxiexzf(str);
                c2653Ujhhgtgfeyxiexzf.f8516Ujhhgtgfeyxiexzf = 5;
                c2653Ujhhgtgfeyxiexzf.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf3.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c2653Ujhhgtgfeyxiexzf.m3713Ujhhgtgfeyxiexzf();
                ((C1419feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c2653Ujhhgtgfeyxiexzf);
                Context context3 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c2653Ujhhgtgfeyxiexzf.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(Response.class));
                Response responseExecute3 = c2653Ujhhgtgfeyxiexzf.f8006Ujhhgtgfeyxiexzf.newCall(c2653Ujhhgtgfeyxiexzf.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf2 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute3.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(Response.class)), responseExecute3);
                    if (objM1747Ujhhgtgfeyxiexzf2 != null) {
                        return (Response) objM1747Ujhhgtgfeyxiexzf2;
                    }
                    throw new NullPointerException(MagicFactory.get(4928448433557079434L, strArr2));
                } catch (NetException e5) {
                    throw e5;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th3) {
                    throw new ConvertException(responseExecute3, MagicFactory.get(4928448613945705866L, strArr2), th3, null, 8, null);
                }
            case 3:
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf4 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf4.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf3 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf3.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf3.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf3.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf4.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf3.m3713Ujhhgtgfeyxiexzf();
                ((C0998feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf3);
                Context context4 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf3.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class));
                Response responseExecute4 = c1855Ujhhgtgfeyxiexzf3.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf3.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf3 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute4.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class)), responseExecute4);
                    if (objM1747Ujhhgtgfeyxiexzf3 != null) {
                        return (File) objM1747Ujhhgtgfeyxiexzf3;
                    }
                    throw new NullPointerException(MagicFactory.get(4928899186079827338L, strArr3));
                } catch (NetException e7) {
                    throw e7;
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th4) {
                    throw new ConvertException(responseExecute4, MagicFactory.get(4928899383648322954L, strArr3), th4, null, 8, null);
                }
            case 4:
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf5 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf5.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf4 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf4.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf4.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf4.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf5.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf4.m3713Ujhhgtgfeyxiexzf();
                ((C0998feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf4);
                Context context5 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf4.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class));
                Response responseExecute5 = c1855Ujhhgtgfeyxiexzf4.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf4.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf4 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute5.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class)), responseExecute5);
                    if (objM1747Ujhhgtgfeyxiexzf4 != null) {
                        return (File) objM1747Ujhhgtgfeyxiexzf4;
                    }
                    throw new NullPointerException(MagicFactory.get(4928837566184031626L, strArr4));
                } catch (NetException e9) {
                    throw e9;
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th5) {
                    throw new ConvertException(responseExecute5, MagicFactory.get(4928837763752527242L, strArr4), th5, null, 8, null);
                }
            case 5:
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf6 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf6.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf5 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf5.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf5.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf5.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf6.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf5.m3713Ujhhgtgfeyxiexzf();
                ((C0998feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf5);
                Context context6 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf5.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class));
                Response responseExecute6 = c1855Ujhhgtgfeyxiexzf5.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf5.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf5 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute6.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class)), responseExecute6);
                    if (objM1747Ujhhgtgfeyxiexzf5 != null) {
                        return (File) objM1747Ujhhgtgfeyxiexzf5;
                    }
                    throw new NullPointerException(MagicFactory.get(4928837372910503306L, strArr5));
                } catch (NetException e11) {
                    throw e11;
                } catch (CancellationException e12) {
                    throw e12;
                } catch (Throwable th6) {
                    throw new ConvertException(responseExecute6, MagicFactory.get(4928836470967371146L, strArr5), th6, null, 8, null);
                }
            case 6:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf7 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf7.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf6 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf6.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf6.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf6.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf7.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf6.m3713Ujhhgtgfeyxiexzf();
                ((C0998feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf6);
                Context context7 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf6.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class));
                Response responseExecute7 = c1855Ujhhgtgfeyxiexzf6.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf6.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf6 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute7.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class)), responseExecute7);
                    if (objM1747Ujhhgtgfeyxiexzf6 != null) {
                        return (File) objM1747Ujhhgtgfeyxiexzf6;
                    }
                    throw new NullPointerException(MagicFactory.get(4928836153139791242L, strArr6));
                } catch (NetException e13) {
                    throw e13;
                } catch (CancellationException e14) {
                    throw e14;
                } catch (Throwable th7) {
                    throw new ConvertException(responseExecute7, MagicFactory.get(4928822057057125770L, strArr6), th7, null, 8, null);
                }
            case 7:
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf8 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf8.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf7 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf7.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf7.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf7.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf8.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf7.m3713Ujhhgtgfeyxiexzf();
                ((C0998feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf7);
                Context context8 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf7.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class));
                Response responseExecute8 = c1855Ujhhgtgfeyxiexzf7.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf7.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf7 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute8.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class)), responseExecute8);
                    if (objM1747Ujhhgtgfeyxiexzf7 != null) {
                        return (File) objM1747Ujhhgtgfeyxiexzf7;
                    }
                    throw new NullPointerException(MagicFactory.get(4928824479418680714L, strArr7));
                } catch (NetException e15) {
                    throw e15;
                } catch (CancellationException e16) {
                    throw e16;
                } catch (Throwable th8) {
                    throw new ConvertException(responseExecute8, MagicFactory.get(4928823714914502026L, strArr7), th8, null, 8, null);
                }
            case 8:
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf9 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf9.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf8 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf8.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf8.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf8.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf9.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf8.m3713Ujhhgtgfeyxiexzf();
                ((C0998feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf8);
                Context context9 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf8.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class));
                Response responseExecute9 = c1855Ujhhgtgfeyxiexzf8.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf8.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf8 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute9.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class)), responseExecute9);
                    if (objM1747Ujhhgtgfeyxiexzf8 != null) {
                        return (File) objM1747Ujhhgtgfeyxiexzf8;
                    }
                    throw new NullPointerException(MagicFactory.get(4928823186633524618L, strArr8));
                } catch (NetException e17) {
                    throw e17;
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Throwable th9) {
                    throw new ConvertException(responseExecute9, MagicFactory.get(4928823384202020234L, strArr8), th9, null, 8, null);
                }
            default:
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                AbstractC1937feyxiexzfUjhhgtg.m3285Ujhhgtgfeyxiexzf(obj);
                InterfaceC3745Ujhhgtgfeyxiexzf interfaceC3745Ujhhgtgfeyxiexzf10 = (InterfaceC3745Ujhhgtgfeyxiexzf) this.f4982Ujhhgtgfeyxiexzf;
                AbstractC3085Ujhhgtgfeyxiexzf.m4556Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf10.mo96Ujhhgtgfeyxiexzf());
                C1855Ujhhgtgfeyxiexzf c1855Ujhhgtgfeyxiexzf9 = new C1855Ujhhgtgfeyxiexzf();
                c1855Ujhhgtgfeyxiexzf9.m3712Ujhhgtgfeyxiexzf(str);
                c1855Ujhhgtgfeyxiexzf9.f8004Ujhhgtgfeyxiexzf = 1;
                c1855Ujhhgtgfeyxiexzf9.m3711Ujhhgtgfeyxiexzf(interfaceC3745Ujhhgtgfeyxiexzf10.mo96Ujhhgtgfeyxiexzf().mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10557Ujhhgtgfeyxiexzf));
                c1855Ujhhgtgfeyxiexzf9.m3713Ujhhgtgfeyxiexzf();
                ((C0998feyxiexzfUjhhgtg) interfaceC3549feyxiexzfUjhhgtg).invoke(c1855Ujhhgtgfeyxiexzf9);
                Context context10 = AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf;
                AbstractC0990feyxiexzfUjhhgtg.m2481Ujhhgtgfeyxiexzf(c1855Ujhhgtgfeyxiexzf9.f8005Ujhhgtgfeyxiexzf, AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class));
                Response responseExecute10 = c1855Ujhhgtgfeyxiexzf9.f8006Ujhhgtgfeyxiexzf.newCall(c1855Ujhhgtgfeyxiexzf9.mo3709Ujhhgtgfeyxiexzf()).execute();
                try {
                    Object objM1747Ujhhgtgfeyxiexzf9 = AbstractC1252feyxiexzfUjhhgtg.m2783Ujhhgtgfeyxiexzf(responseExecute10.request()).m1747Ujhhgtgfeyxiexzf(AbstractC1937feyxiexzfUjhhgtg.m3281Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2444Ujhhgtgfeyxiexzf(File.class)), responseExecute10);
                    if (objM1747Ujhhgtgfeyxiexzf9 != null) {
                        return (File) objM1747Ujhhgtgfeyxiexzf9;
                    }
                    throw new NullPointerException(MagicFactory.get(4928823066374440330L, strArr9));
                } catch (NetException e19) {
                    throw e19;
                } catch (CancellationException e20) {
                    throw e20;
                } catch (Throwable th10) {
                    throw new ConvertException(responseExecute10, MagicFactory.get(4928826562477819274L, strArr9), th10, null, 8, null);
                }
        }
    }
}
