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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲇᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2363 extends AbstractC2862 implements InterfaceC1429 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public /* synthetic */ Object f7590;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f7591;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1425 f7592;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2363(String str, InterfaceC1425 interfaceC1425, InterfaceC0842 interfaceC0842, int i) {
        super(2, interfaceC0842);
        this.f7589 = i;
        this.f7591 = str;
        this.f7592 = interfaceC1425;
    }

    @Override // p000.InterfaceC1429
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo1196(Object obj, Object obj2) {
        InterfaceC0883 interfaceC0883 = (InterfaceC0883) obj;
        InterfaceC0842 interfaceC0842 = (InterfaceC0842) obj2;
        switch (this.f7589) {
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
        return ((C2363) mo1197(interfaceC0842, interfaceC0883)).mo1198(C3497.f10997);
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        switch (this.f7589) {
            case 0:
                C2363 c2363 = new C2363(this.f7591, (C2362) this.f7592, interfaceC0842, 0);
                c2363.f7590 = obj;
                return c2363;
            case 1:
                C2363 c2364 = new C2363(this.f7591, (C2365) this.f7592, interfaceC0842, 1);
                c2364.f7590 = obj;
                return c2364;
            case 2:
                C2363 c2365 = new C2363(this.f7591, (C2362) this.f7592, interfaceC0842, 2);
                c2365.f7590 = obj;
                return c2365;
            case 3:
                C2363 c2366 = new C2363(this.f7591, (C2536) this.f7592, interfaceC0842, 3);
                c2366.f7590 = obj;
                return c2366;
            case 4:
                C2363 c2367 = new C2363(this.f7591, (C2536) this.f7592, interfaceC0842, 4);
                c2367.f7590 = obj;
                return c2367;
            case 5:
                C2363 c2368 = new C2363(this.f7591, (C2536) this.f7592, interfaceC0842, 5);
                c2368.f7590 = obj;
                return c2368;
            case 6:
                C2363 c2369 = new C2363(this.f7591, (C2536) this.f7592, interfaceC0842, 6);
                c2369.f7590 = obj;
                return c2369;
            case 7:
                C2363 c23610 = new C2363(this.f7591, (C2536) this.f7592, interfaceC0842, 7);
                c23610.f7590 = obj;
                return c23610;
            case 8:
                C2363 c23611 = new C2363(this.f7591, (C2536) this.f7592, interfaceC0842, 8);
                c23611.f7590 = obj;
                return c23611;
            default:
                C2363 c23612 = new C2363(this.f7591, (C2536) this.f7592, interfaceC0842, 9);
                c23612.f7590 = obj;
                return c23612;
        }
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final Object mo1198(Object obj) throws Throwable {
        int i = this.f7589;
        InterfaceC1425 interfaceC1425 = this.f7592;
        String str = this.f7591;
        switch (i) {
            case 0:
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0883 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC0883.mo96());
                C3515 c3515 = new C3515();
                c3515.m1523(str);
                c3515.f1763 = 1;
                c3515.m1522(interfaceC0883.mo96().mo942(C1133.f4203));
                c3515.m1524();
                ((C2362) interfaceC1425).invoke(c3515);
                Context context = AbstractC2140.f7078;
                C2520 c2520 = AbstractC2519.f8046;
                C0707 c0707M4527 = AbstractC2519.m4527(File.class);
                List list = Collections.EMPTY_LIST;
                c2520.getClass();
                AbstractC2557.m4574(c3515.f1764, new C3457(c0707M4527, true));
                Response responseExecute = c3515.f1765.newCall(c3515.mo1520()).execute();
                try {
                    C2141 c2141M5070 = AbstractC3471.m5070(responseExecute.request());
                    C0707 c0707M4528 = AbstractC2519.m4527(File.class);
                    c2520.getClass();
                    return (File) c2141M5070.m3953(AbstractC3471.m5077(new C3457(c0707M4528, true)), responseExecute);
                } catch (NetException e) {
                    throw e;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    throw new ConvertException(responseExecute, "An unexpected error occurred in the converter", th, null, 8, null);
                }
            case 1:
                String[] strArr = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0884 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC0884.mo96());
                C3515 c3516 = new C3515();
                c3516.m1523(str);
                c3516.f1763 = 1;
                c3516.m1522(interfaceC0884.mo96().mo942(C1133.f4203));
                c3516.m1524();
                ((C2365) interfaceC1425).invoke(c3516);
                Context context2 = AbstractC2140.f7078;
                AbstractC2557.m4574(c3516.f1764, AbstractC2519.m4528(Response.class));
                Response responseExecute2 = c3516.f1765.newCall(c3516.mo1520()).execute();
                try {
                    Object objM3953 = AbstractC3471.m5070(responseExecute2.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(Response.class)), responseExecute2);
                    if (objM3953 != null) {
                        return (Response) objM3953;
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
                String[] strArr2 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0885 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC0885.mo96());
                C0438 c0438 = new C0438();
                c0438.f2001 = new MultipartBody.Builder(null, 1, null);
                c0438.f2002 = new FormBody.Builder(null, 1, null);
                c0438.f2003 = AbstractC1923.f6357;
                c0438.f2004 = 5;
                c0438.m1523(str);
                c0438.f2004 = 5;
                c0438.m1522(interfaceC0885.mo96().mo942(C1133.f4203));
                c0438.m1524();
                ((C2362) interfaceC1425).invoke(c0438);
                Context context3 = AbstractC2140.f7078;
                AbstractC2557.m4574(c0438.f1764, AbstractC2519.m4528(Response.class));
                Response responseExecute3 = c0438.f1765.newCall(c0438.mo1520()).execute();
                try {
                    Object objM3954 = AbstractC3471.m5070(responseExecute3.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(Response.class)), responseExecute3);
                    if (objM3954 != null) {
                        return (Response) objM3954;
                    }
                    throw new NullPointerException(MagicFactory.get(-417728519207604L, strArr2));
                } catch (NetException e5) {
                    throw e5;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th3) {
                    throw new ConvertException(responseExecute3, MagicFactory.get(-417960447441588L, strArr2), th3, null, 8, null);
                }
            case 3:
                String[] strArr3 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0886 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC0886.mo96());
                C3515 c3517 = new C3515();
                c3517.m1523(str);
                c3517.f1763 = 1;
                c3517.m1522(interfaceC0886.mo96().mo942(C1133.f4203));
                c3517.m1524();
                ((C2536) interfaceC1425).invoke(c3517);
                Context context4 = AbstractC2140.f7078;
                AbstractC2557.m4574(c3517.f1764, AbstractC2519.m4528(File.class));
                Response responseExecute4 = c3517.f1765.newCall(c3517.mo1520()).execute();
                try {
                    Object objM3955 = AbstractC3471.m5070(responseExecute4.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(File.class)), responseExecute4);
                    if (objM3955 != null) {
                        return (File) objM3955;
                    }
                    throw new NullPointerException(MagicFactory.get(-588277375564468L, strArr3));
                } catch (NetException e7) {
                    throw e7;
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Throwable th4) {
                    throw new ConvertException(responseExecute4, MagicFactory.get(-588492123929268L, strArr3), th4, null, 8, null);
                }
            case 4:
                String[] strArr4 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0887 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC0887.mo96());
                C3515 c3518 = new C3515();
                c3518.m1523(str);
                c3518.f1763 = 1;
                c3518.m1522(interfaceC0887.mo96().mo942(C1133.f4203));
                c3518.m1524();
                ((C2536) interfaceC1425).invoke(c3518);
                Context context5 = AbstractC2140.f7078;
                AbstractC2557.m4574(c3518.f1764, AbstractC2519.m4528(File.class));
                Response responseExecute5 = c3518.f1765.newCall(c3518.mo1520()).execute();
                try {
                    Object objM3956 = AbstractC3471.m5070(responseExecute5.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(File.class)), responseExecute5);
                    if (objM3956 != null) {
                        return (File) objM3956;
                    }
                    throw new NullPointerException(MagicFactory.get(-646796304972468L, strArr4));
                } catch (NetException e9) {
                    throw e9;
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th5) {
                    throw new ConvertException(responseExecute5, MagicFactory.get(-647011053337268L, strArr4), th5, null, 8, null);
                }
            case 5:
                String[] strArr5 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0888 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC0888.mo96());
                C3515 c3519 = new C3515();
                c3519.m1523(str);
                c3519.f1763 = 1;
                c3519.m1522(interfaceC0888.mo96().mo942(C1133.f4203));
                c3519.m1524();
                ((C2536) interfaceC1425).invoke(c3519);
                Context context6 = AbstractC2140.f7078;
                AbstractC2557.m4574(c3519.f1764, AbstractC2519.m4528(File.class));
                Response responseExecute6 = c3519.f1765.newCall(c3519.mo1520()).execute();
                try {
                    Object objM3957 = AbstractC3471.m5070(responseExecute6.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(File.class)), responseExecute6);
                    if (objM3957 != null) {
                        return (File) objM3957;
                    }
                    throw new NullPointerException(MagicFactory.get(-647676773268148L, strArr5));
                } catch (NetException e11) {
                    throw e11;
                } catch (CancellationException e12) {
                    throw e12;
                } catch (Throwable th6) {
                    throw new ConvertException(responseExecute6, MagicFactory.get(-647891521632948L, strArr5), th6, null, 8, null);
                }
            case 6:
                String[] strArr6 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC0889 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC0889.mo96());
                C3515 c35110 = new C3515();
                c35110.m1523(str);
                c35110.f1763 = 1;
                c35110.m1522(interfaceC0889.mo96().mo942(C1133.f4203));
                c35110.m1524();
                ((C2536) interfaceC1425).invoke(c35110);
                Context context7 = AbstractC2140.f7078;
                AbstractC2557.m4574(c35110.f1764, AbstractC2519.m4528(File.class));
                Response responseExecute7 = c35110.f1765.newCall(c35110.mo1520()).execute();
                try {
                    Object objM3958 = AbstractC3471.m5070(responseExecute7.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(File.class)), responseExecute7);
                    if (objM3958 != null) {
                        return (File) objM3958;
                    }
                    throw new NullPointerException(MagicFactory.get(-648621666073268L, strArr6));
                } catch (NetException e13) {
                    throw e13;
                } catch (CancellationException e14) {
                    throw e14;
                } catch (Throwable th7) {
                    throw new ConvertException(responseExecute7, MagicFactory.get(-648836414438068L, strArr6), th7, null, 8, null);
                }
            case 7:
                String[] strArr7 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC08810 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC08810.mo96());
                C3515 c35111 = new C3515();
                c35111.m1523(str);
                c35111.f1763 = 1;
                c35111.m1522(interfaceC08810.mo96().mo942(C1133.f4203));
                c35111.m1524();
                ((C2536) interfaceC1425).invoke(c35111);
                Context context8 = AbstractC2140.f7078;
                AbstractC2557.m4574(c35111.f1764, AbstractC2519.m4528(File.class));
                Response responseExecute8 = c35111.f1765.newCall(c35111.mo1520()).execute();
                try {
                    Object objM3959 = AbstractC3471.m5070(responseExecute8.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(File.class)), responseExecute8);
                    if (objM3959 != null) {
                        return (File) objM3959;
                    }
                    throw new NullPointerException(MagicFactory.get(-651361855208116L, strArr7));
                } catch (NetException e15) {
                    throw e15;
                } catch (CancellationException e16) {
                    throw e16;
                } catch (Throwable th8) {
                    throw new ConvertException(responseExecute8, MagicFactory.get(-651576603572916L, strArr7), th8, null, 8, null);
                }
            case 8:
                String[] strArr8 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC08811 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC08811.mo96());
                C3515 c35112 = new C3515();
                c35112.m1523(str);
                c35112.f1763 = 1;
                c35112.m1522(interfaceC08811.mo96().mo942(C1133.f4203));
                c35112.m1524();
                ((C2536) interfaceC1425).invoke(c35112);
                Context context9 = AbstractC2140.f7078;
                AbstractC2557.m4574(c35112.f1764, AbstractC2519.m4528(File.class));
                Response responseExecute9 = c35112.f1765.newCall(c35112.mo1520()).execute();
                try {
                    Object objM39510 = AbstractC3471.m5070(responseExecute9.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(File.class)), responseExecute9);
                    if (objM39510 != null) {
                        return (File) objM39510;
                    }
                    throw new NullPointerException(MagicFactory.get(-652242323503796L, strArr8));
                } catch (NetException e17) {
                    throw e17;
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Throwable th9) {
                    throw new ConvertException(responseExecute9, MagicFactory.get(-652457071868596L, strArr8), th9, null, 8, null);
                }
            default:
                String[] strArr9 = AbstractC1574.f5469;
                AbstractC0743.m2188(obj);
                InterfaceC0883 interfaceC08812 = (InterfaceC0883) this.f7590;
                AbstractC3453.m4991(interfaceC08812.mo96());
                C3515 c35113 = new C3515();
                c35113.m1523(str);
                c35113.f1763 = 1;
                c35113.m1522(interfaceC08812.mo96().mo942(C1133.f4203));
                c35113.m1524();
                ((C2536) interfaceC1425).invoke(c35113);
                Context context10 = AbstractC2140.f7078;
                AbstractC2557.m4574(c35113.f1764, AbstractC2519.m4528(File.class));
                Response responseExecute10 = c35113.f1765.newCall(c35113.mo1520()).execute();
                try {
                    Object objM39511 = AbstractC3471.m5070(responseExecute10.request()).m3953(AbstractC3471.m5077(AbstractC2519.m4528(File.class)), responseExecute10);
                    if (objM39511 != null) {
                        return (File) objM39511;
                    }
                    throw new NullPointerException(MagicFactory.get(-653187216308916L, strArr9));
                } catch (NetException e19) {
                    throw e19;
                } catch (CancellationException e20) {
                    throw e20;
                } catch (Throwable th10) {
                    throw new ConvertException(responseExecute10, MagicFactory.get(-653401964673716L, strArr9), th10, null, 8, null);
                }
        }
    }
}
