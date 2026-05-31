package p000;

import android.content.Context;
import com.drake.net.exception.ConvertException;
import com.drake.net.exception.NetException;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

import okhttp3.FormBody;
import okhttp3.MultipartBody;
import okhttp3.Response;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲇᛸᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2411 extends AbstractC2922 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7723;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public /* synthetic */ Object f7724;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f7725;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1433 f7726;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2411(String str, InterfaceC1433 interfaceC1433, InterfaceC0841 interfaceC0841, int i) {
        super(2, interfaceC0841);
        this.f7723 = i;
        this.f7725 = str;
        this.f7726 = interfaceC1433;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1342(Object obj, Object obj2) {
        InterfaceC0882 interfaceC0882 = (InterfaceC0882) obj;
        InterfaceC0841 interfaceC0841 = (InterfaceC0841) obj2;
        switch (this.f7723) {
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
        return ((C2411) mo1343(interfaceC0841, interfaceC0882)).mo1344(C3554.UNIT);
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        switch (this.f7723) {
            case 0:
                C2411 c2411 = new C2411(this.f7725, (C2410) this.f7726, interfaceC0841, 0);
                c2411.f7724 = obj;
                return c2411;
            case 1:
                C2411 c2412 = new C2411(this.f7725, (C2413) this.f7726, interfaceC0841, 1);
                c2412.f7724 = obj;
                return c2412;
            case 2:
                C2411 c2413 = new C2411(this.f7725, (C2410) this.f7726, interfaceC0841, 2);
                c2413.f7724 = obj;
                return c2413;
            case 3:
                C2411 c2414 = new C2411(this.f7725, (C2593) this.f7726, interfaceC0841, 3);
                c2414.f7724 = obj;
                return c2414;
            case 4:
                C2411 c2415 = new C2411(this.f7725, (C2593) this.f7726, interfaceC0841, 4);
                c2415.f7724 = obj;
                return c2415;
            case 5:
                C2411 c2416 = new C2411(this.f7725, (C2593) this.f7726, interfaceC0841, 5);
                c2416.f7724 = obj;
                return c2416;
            case 6:
                C2411 c2417 = new C2411(this.f7725, (C2593) this.f7726, interfaceC0841, 6);
                c2417.f7724 = obj;
                return c2417;
            case 7:
                C2411 c2418 = new C2411(this.f7725, (C2593) this.f7726, interfaceC0841, 7);
                c2418.f7724 = obj;
                return c2418;
            case 8:
                C2411 c2419 = new C2411(this.f7725, (C2593) this.f7726, interfaceC0841, 8);
                c2419.f7724 = obj;
                return c2419;
            default:
                C2411 c24110 = new C2411(this.f7725, (C2593) this.f7726, interfaceC0841, 9);
                c24110.f7724 = obj;
                return c24110;
        }
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1344(Object obj) throws Throwable {
        int i = this.f7723;
        InterfaceC1433 interfaceC1433 = this.f7726;
        String str = this.f7725;
        switch (i) {
            case 0:
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0882 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0882.mo96());
                C3573 c3573 = new C3573();
                c3573.m1629(str);
                c3573.f1734 = 1;
                c3573.m1628(interfaceC0882.mo96().mo1086(C1139.f4215));
                c3573.m1630();
                ((C2410) interfaceC1433).invoke(c3573);
                Context context = AbstractC2174.f7202;
                C2575 c2575 = AbstractC2574.f8194;
                C0702 c0702M4549 = AbstractC2574.m4549(File.class);
                List list = Collections.EMPTY_LIST;
                c2575.getClass();
                AbstractC2613.m4596(c3573.f1735, new C3513(c0702M4549, true));
                Response responseExecute = c3573.f1736.newCall(c3573.mo1626()).execute();
                try {
                    C2175 c2175M3302 = AbstractC1468.m3302(responseExecute.request());
                    C0702 c0702M45410 = AbstractC2574.m4549(File.class);
                    c2575.getClass();
                    return (File) c2175M3302.m4137(AbstractC3528.m5096(new C3513(c0702M45410, true)), responseExecute);
                } catch (NetException e) {
                    throw e;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new ConvertException(responseExecute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            case 1:
                String[] strArr = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0883 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0883.mo96());
                C3573 c3574 = new C3573();
                c3574.m1629(str);
                c3574.f1734 = 1;
                c3574.m1628(interfaceC0883.mo96().mo1086(C1139.f4215));
                c3574.m1630();
                ((C2413) interfaceC1433).invoke(c3574);
                Context context2 = AbstractC2174.f7202;
                AbstractC2613.m4596(c3574.f1735, AbstractC2574.m4550(Response.class));
                Response responseExecute2 = c3574.f1736.newCall(c3574.mo1626()).execute();
                try {
                    Object objM4137 = AbstractC1468.m3302(responseExecute2.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(Response.class)), responseExecute2);
                    if (objM4137 != null) {
                        return (Response) objM4137;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.Response");
                } catch (NetException e3) {
                    throw e3;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th2) {
                    throw new ConvertException(responseExecute2, "An unexpected error occurred in the converter", th2, null, 8, null);
                }
            case 2:
                String[] strArr2 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0884 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0884.mo96());
                C0413 c0413 = new C0413();
                c0413.f1973 = new MultipartBody.Builder(null, 1, null);
                c0413.f1974 = new FormBody.Builder(null, 1, null);
                c0413.f1975 = AbstractC1954.f6462;
                c0413.f1976 = 5;
                c0413.m1629(str);
                c0413.f1976 = 5;
                c0413.m1628(interfaceC0884.mo96().mo1086(C1139.f4215));
                c0413.m1630();
                ((C2410) interfaceC1433).invoke(c0413);
                Context context3 = AbstractC2174.f7202;
                AbstractC2613.m4596(c0413.f1735, AbstractC2574.m4550(Response.class));
                Response responseExecute3 = c0413.f1736.newCall(c0413.mo1626()).execute();
                try {
                    Object objM4138 = AbstractC1468.m3302(responseExecute3.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(Response.class)), responseExecute3);
                    if (objM4138 != null) {
                        return (Response) objM4138;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.Response");
                } catch (NetException e5) {
                    throw e5;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th3) {
                    throw new ConvertException(responseExecute3, "An unexpected error occurred in the converter", th3, null, 8, null);
                }
            case 3:
                String[] strArr3 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0885 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0885.mo96());
                C3573 c3575 = new C3573();
                c3575.m1629(str);
                c3575.f1734 = 1;
                c3575.m1628(interfaceC0885.mo96().mo1086(C1139.f4215));
                c3575.m1630();
                ((C2593) interfaceC1433).invoke(c3575);
                Context context4 = AbstractC2174.f7202;
                AbstractC2613.m4596(c3575.f1735, AbstractC2574.m4550(File.class));
                Response responseExecute4 = c3575.f1736.newCall(c3575.mo1626()).execute();
                try {
                    Object objM4139 = AbstractC1468.m3302(responseExecute4.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(File.class)), responseExecute4);
                    if (objM4139 != null) {
                        return (File) objM4139;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                } catch (NetException e7) {
                    throw e7;
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th4) {
                    throw new ConvertException(responseExecute4, "An unexpected error occurred in the converter", th4, null, 8, null);
                }
            case 4:
                String[] strArr4 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0886 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0886.mo96());
                C3573 c3576 = new C3573();
                c3576.m1629(str);
                c3576.f1734 = 1;
                c3576.m1628(interfaceC0886.mo96().mo1086(C1139.f4215));
                c3576.m1630();
                ((C2593) interfaceC1433).invoke(c3576);
                Context context5 = AbstractC2174.f7202;
                AbstractC2613.m4596(c3576.f1735, AbstractC2574.m4550(File.class));
                Response responseExecute5 = c3576.f1736.newCall(c3576.mo1626()).execute();
                try {
                    Object objM41310 = AbstractC1468.m3302(responseExecute5.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(File.class)), responseExecute5);
                    if (objM41310 != null) {
                        return (File) objM41310;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                } catch (NetException e9) {
                    throw e9;
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th5) {
                    throw new ConvertException(responseExecute5, "An unexpected error occurred in the converter", th5, null, 8, null);
                }
            case 5:
                String[] strArr5 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0887 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0887.mo96());
                C3573 c3577 = new C3573();
                c3577.m1629(str);
                c3577.f1734 = 1;
                c3577.m1628(interfaceC0887.mo96().mo1086(C1139.f4215));
                c3577.m1630();
                ((C2593) interfaceC1433).invoke(c3577);
                Context context6 = AbstractC2174.f7202;
                AbstractC2613.m4596(c3577.f1735, AbstractC2574.m4550(File.class));
                Response responseExecute6 = c3577.f1736.newCall(c3577.mo1626()).execute();
                try {
                    Object objM41311 = AbstractC1468.m3302(responseExecute6.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(File.class)), responseExecute6);
                    if (objM41311 != null) {
                        return (File) objM41311;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                } catch (NetException e11) {
                    throw e11;
                } catch (CancellationException e12) {
                    throw e12;
                } catch (Throwable th6) {
                    throw new ConvertException(responseExecute6, "An unexpected error occurred in the converter", th6, null, 8, null);
                }
            case 6:
                String[] strArr6 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0888 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0888.mo96());
                C3573 c3578 = new C3573();
                c3578.m1629(str);
                c3578.f1734 = 1;
                c3578.m1628(interfaceC0888.mo96().mo1086(C1139.f4215));
                c3578.m1630();
                ((C2593) interfaceC1433).invoke(c3578);
                Context context7 = AbstractC2174.f7202;
                AbstractC2613.m4596(c3578.f1735, AbstractC2574.m4550(File.class));
                Response responseExecute7 = c3578.f1736.newCall(c3578.mo1626()).execute();
                try {
                    Object objM41312 = AbstractC1468.m3302(responseExecute7.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(File.class)), responseExecute7);
                    if (objM41312 != null) {
                        return (File) objM41312;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                } catch (NetException e13) {
                    throw e13;
                } catch (CancellationException e14) {
                    throw e14;
                } catch (Throwable th7) {
                    throw new ConvertException(responseExecute7, "An unexpected error occurred in the converter", th7, null, 8, null);
                }
            case 7:
                String[] strArr7 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC0889 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC0889.mo96());
                C3573 c3579 = new C3573();
                c3579.m1629(str);
                c3579.f1734 = 1;
                c3579.m1628(interfaceC0889.mo96().mo1086(C1139.f4215));
                c3579.m1630();
                ((C2593) interfaceC1433).invoke(c3579);
                Context context8 = AbstractC2174.f7202;
                AbstractC2613.m4596(c3579.f1735, AbstractC2574.m4550(File.class));
                Response responseExecute8 = c3579.f1736.newCall(c3579.mo1626()).execute();
                try {
                    Object objM41313 = AbstractC1468.m3302(responseExecute8.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(File.class)), responseExecute8);
                    if (objM41313 != null) {
                        return (File) objM41313;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                } catch (NetException e15) {
                    throw e15;
                } catch (CancellationException e16) {
                    throw e16;
                } catch (Throwable th8) {
                    throw new ConvertException(responseExecute8, "An unexpected error occurred in the converter", th8, null, 8, null);
                }
            case 8:
                String[] strArr8 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC08810 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC08810.mo96());
                C3573 c35710 = new C3573();
                c35710.m1629(str);
                c35710.f1734 = 1;
                c35710.m1628(interfaceC08810.mo96().mo1086(C1139.f4215));
                c35710.m1630();
                ((C2593) interfaceC1433).invoke(c35710);
                Context context9 = AbstractC2174.f7202;
                AbstractC2613.m4596(c35710.f1735, AbstractC2574.m4550(File.class));
                Response responseExecute9 = c35710.f1736.newCall(c35710.mo1626()).execute();
                try {
                    Object objM41314 = AbstractC1468.m3302(responseExecute9.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(File.class)), responseExecute9);
                    if (objM41314 != null) {
                        return (File) objM41314;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                } catch (NetException e17) {
                    throw e17;
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Throwable th9) {
                    throw new ConvertException(responseExecute9, "An unexpected error occurred in the converter", th9, null, 8, null);
                }
            default:
                String[] strArr9 = AbstractC1471.f5234;
                AbstractC1470.m3372(obj);
                InterfaceC0882 interfaceC08811 = (InterfaceC0882) this.f7724;
                AbstractC1471.m3385(interfaceC08811.mo96());
                C3573 c35711 = new C3573();
                c35711.m1629(str);
                c35711.f1734 = 1;
                c35711.m1628(interfaceC08811.mo96().mo1086(C1139.f4215));
                c35711.m1630();
                ((C2593) interfaceC1433).invoke(c35711);
                Context context10 = AbstractC2174.f7202;
                AbstractC2613.m4596(c35711.f1735, AbstractC2574.m4550(File.class));
                Response responseExecute10 = c35711.f1736.newCall(c35711.mo1626()).execute();
                try {
                    Object objM41315 = AbstractC1468.m3302(responseExecute10.request()).m4137(AbstractC3528.m5096(AbstractC2574.m4550(File.class)), responseExecute10);
                    if (objM41315 != null) {
                        return (File) objM41315;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                } catch (NetException e19) {
                    throw e19;
                } catch (CancellationException e20) {
                    throw e20;
                } catch (Throwable th10) {
                    throw new ConvertException(responseExecute10, "An unexpected error occurred in the converter", th10, null, 8, null);
                }
        }
    }
}
