package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import com.umeng.commonsdk.UMConfigure;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.core.p001native.LoaderNative;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2208Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7185Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2208Ujhhgtgfeyxiexzf(int i) {
        this.f7185Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c0919feyxiexzfUjhhgtg;
        String strM3617Ujhhgtgfeyxiexzf;
        String string;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        int iNextInt;
        int i = this.f7185Ujhhgtgfeyxiexzf;
        Class<Context> cls = Context.class;
        int i2 = 14;
        Class<String> cls2 = String.class;
        int i3 = 9;
        int i4 = 5;
        boolean z = false;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Class<String> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2));
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj2, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : String.class)) {
                    Object obj3 = list.get(1);
                    Class<Integer> cls3 = Integer.class;
                    Class<Integer> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                    if (clsM5159Ujhhgtgfeyxiexzf2 == null) {
                        clsM5159Ujhhgtgfeyxiexzf2 = cls3;
                    }
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj3, clsM5159Ujhhgtgfeyxiexzf2)) {
                        Object obj4 = list.get(2);
                        Class<Integer> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls3));
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj4, clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : Integer.class)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("getAmrFullPath cost: ");
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C0319Ujhhgtgfeyxiexzf c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf = C0319Ujhhgtgfeyxiexzf.m1533Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(((View) obj).getContext()));
                c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf.setText(C2219Ujhhgtgfeyxiexzf.f7204Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                C2215Ujhhgtgfeyxiexzf.f7196Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2215Ujhhgtgfeyxiexzf.f7199Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1876Ujhhgtgfeyxiexzf;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C3289Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf, 5));
                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf("重置", new C1795Ujhhgtgfeyxiexzf(i3));
                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2208Ujhhgtgfeyxiexzf(5);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2208Ujhhgtgfeyxiexzf(6));
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                c0394Ujhhgtgfeyxiexzf.m1655Ujhhgtgfeyxiexzf(1);
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("MicroMsg.SceneVoiceService", "Start Recv[%s] :%s", "Start Send :");
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                Context baseContext = ((Application) c0919feyxiexzfUjhhgtg).getBaseContext();
                C2249feyxiexzfUjhhgtg c2249feyxiexzfUjhhgtg = C2249feyxiexzfUjhhgtg.f7327Ujhhgtgfeyxiexzf;
                c2249feyxiexzfUjhhgtg.getClass();
                AbstractC3590Ujhhgtgfeyxiexzf.m5133Ujhhgtgfeyxiexzf(baseContext);
                C0580Ujhhgtgfeyxiexzf c0580Ujhhgtgfeyxiexzf = C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf;
                String str = C2283feyxiexzfUjhhgtg.f7486Ujhhgtgfeyxiexzf;
                c0580Ujhhgtgfeyxiexzf.getClass();
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg = C0580Ujhhgtgfeyxiexzf.f2602Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf[] interfaceC0150UjhhgtgfeyxiexzfArr = C0580Ujhhgtgfeyxiexzf.f2601Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf = interfaceC0150UjhhgtgfeyxiexzfArr[0];
                c2962feyxiexzfUjhhgtg.f9271Ujhhgtgfeyxiexzf = str;
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg2 = C0580Ujhhgtgfeyxiexzf.f2603Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf2 = interfaceC0150UjhhgtgfeyxiexzfArr[1];
                c2962feyxiexzfUjhhgtg2.f9271Ujhhgtgfeyxiexzf = baseContext;
                String packageName = baseContext.getPackageName();
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg3 = C0580Ujhhgtgfeyxiexzf.f2604Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf3 = interfaceC0150UjhhgtgfeyxiexzfArr[2];
                c2962feyxiexzfUjhhgtg3.f9271Ujhhgtgfeyxiexzf = packageName;
                ClassLoader classLoader = baseContext.getClassLoader();
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg4 = C0580Ujhhgtgfeyxiexzf.f2605Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf4 = interfaceC0150UjhhgtgfeyxiexzfArr[3];
                c2962feyxiexzfUjhhgtg4.f9271Ujhhgtgfeyxiexzf = classLoader;
                String str2 = baseContext.getApplicationInfo().sourceDir;
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg5 = C0580Ujhhgtgfeyxiexzf.f2606Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf5 = interfaceC0150UjhhgtgfeyxiexzfArr[4];
                c2962feyxiexzfUjhhgtg5.f9271Ujhhgtgfeyxiexzf = str2;
                String string2 = baseContext.getPackageManager().getApplicationLabel(baseContext.getApplicationInfo()).toString();
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg6 = C0580Ujhhgtgfeyxiexzf.f2607Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf6 = interfaceC0150UjhhgtgfeyxiexzfArr[5];
                c2962feyxiexzfUjhhgtg6.f9271Ujhhgtgfeyxiexzf = string2;
                int i5 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf("com.tencent.mm.boot.BuildConfig"));
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "VERSION_NAME";
                String str3 = (String) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg7 = C0580Ujhhgtgfeyxiexzf.f2608Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf7 = interfaceC0150UjhhgtgfeyxiexzfArr[6];
                c2962feyxiexzfUjhhgtg7.f9271Ujhhgtgfeyxiexzf = str3;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "VERSION_CODE";
                int iIntValue = ((Number) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf()).intValue();
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg8 = C0580Ujhhgtgfeyxiexzf.f2609Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf8 = interfaceC0150UjhhgtgfeyxiexzfArr[7];
                c2962feyxiexzfUjhhgtg8.f9271Ujhhgtgfeyxiexzf = Integer.valueOf(iIntValue);
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "CLIENT_VERSION_ARM64";
                String str4 = (String) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf();
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg9 = C0580Ujhhgtgfeyxiexzf.f2610Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf9 = interfaceC0150UjhhgtgfeyxiexzfArr[8];
                c2962feyxiexzfUjhhgtg9.f9271Ujhhgtgfeyxiexzf = str4;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "BUILD_TAG";
                boolean zM2623feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg((CharSequence) ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.m4942Ujhhgtgfeyxiexzf())).m4939Ujhhgtgfeyxiexzf(), "_GP_", false);
                C2962feyxiexzfUjhhgtg c2962feyxiexzfUjhhgtg10 = C0580Ujhhgtgfeyxiexzf.f2611Ujhhgtgfeyxiexzf;
                InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf10 = interfaceC0150UjhhgtgfeyxiexzfArr[9];
                c2962feyxiexzfUjhhgtg10.f9271Ujhhgtgfeyxiexzf = Boolean.valueOf(zM2623feyxiexzfUjhhgtg);
                AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
                Ujhhgtgfeyxiexzf.m886Ujhhgtgfeyxiexzf(baseContext);
                AbstractC3177feyxiexzfUjhhgtg.f9826Ujhhgtgfeyxiexzf = 3;
                AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf = new C0233Ujhhgtgfeyxiexzf(1);
                AbstractC3177feyxiexzfUjhhgtg.f9827Ujhhgtgfeyxiexzf = 2;
                AbstractC0217Ujhhgtgfeyxiexzf.f1493Ujhhgtgfeyxiexzf = C2283feyxiexzfUjhhgtg.f7486Ujhhgtgfeyxiexzf;
                AbstractC0427Ujhhgtgfeyxiexzf.f2275Ujhhgtgfeyxiexzf = baseContext;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builder.connectTimeout(30L, timeUnit);
                builder.readTimeout(30L, timeUnit);
                builder.writeTimeout(30L, timeUnit);
                AbstractC1336feyxiexzfUjhhgtg.m2862Ujhhgtgfeyxiexzf(builder);
                OkHttpClient okHttpClientM2863Ujhhgtgfeyxiexzf = AbstractC1337feyxiexzfUjhhgtg.m2863Ujhhgtgfeyxiexzf(builder.build());
                AbstractC0427Ujhhgtgfeyxiexzf.f2276Ujhhgtgfeyxiexzf = okHttpClientM2863Ujhhgtgfeyxiexzf;
                Cache cache = okHttpClientM2863Ujhhgtgfeyxiexzf.cache();
                AbstractC0427Ujhhgtgfeyxiexzf.f2277Ujhhgtgfeyxiexzf = cache != null ? new C3521Ujhhgtgfeyxiexzf(OkHttpUtils.diskLruCache(cache)) : null;
                AbstractC1246feyxiexzfUjhhgtg.f4593Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(baseContext, "WAuxiliary_config_default");
                AbstractC1252feyxiexzfUjhhgtg.f4604Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(baseContext, "WAuxiliary_config_dex_desc");
                AbstractC3085Ujhhgtgfeyxiexzf.f9546Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(baseContext, "WAuxiliary_config_plugin");
                C1478feyxiexzfUjhhgtg c1478feyxiexzfUjhhgtg = c2249feyxiexzfUjhhgtg.f5128Ujhhgtgfeyxiexzf;
                if (c1478feyxiexzfUjhhgtg != null) {
                    strM3617Ujhhgtgfeyxiexzf = c1478feyxiexzfUjhhgtg.f5130Ujhhgtgfeyxiexzf;
                } else {
                    C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                    strM3617Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3617Ujhhgtgfeyxiexzf();
                }
                if (c2249feyxiexzfUjhhgtg.m2995Ujhhgtgfeyxiexzf().equals(AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(strM3617Ujhhgtgfeyxiexzf).toString())) {
                    UMConfigure.preInit(baseContext, "68393b1dbc47b67d83776862", (String) c2962feyxiexzfUjhhgtg6.m4430Ujhhgtgfeyxiexzf(interfaceC0150UjhhgtgfeyxiexzfArr[5]));
                    ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                    C2290feyxiexzfUjhhgtg.m3494Ujhhgtgfeyxiexzf(14, "running on: Android" + Build.VERSION.RELEASE + '-' + C0580Ujhhgtgfeyxiexzf.m1860Ujhhgtgfeyxiexzf());
                    C2290feyxiexzfUjhhgtg.m3494Ujhhgtgfeyxiexzf(14, "loading module: WAuxiliary1.2.7.r1418.e65079c");
                    StringBuilder sb = new StringBuilder();
                    sb.append("compile timestamp: ");
                    sb.append(AbstractC2280feyxiexzfUjhhgtg.f7475Ujhhgtgfeyxiexzf);
                    C2290feyxiexzfUjhhgtg.m3494Ujhhgtgfeyxiexzf(14, sb.toString());
                    System.loadLibrary("wauxv-core");
                    LoaderNative.f1049Ujhhgtgfeyxiexzf.loaderInit((String) c2962feyxiexzfUjhhgtg.m4430Ujhhgtgfeyxiexzf(interfaceC0150UjhhgtgfeyxiexzfArr[0]), baseContext.getDataDir().getAbsolutePath(), C0580Ujhhgtgfeyxiexzf.m1859Ujhhgtgfeyxiexzf(), C0580Ujhhgtgfeyxiexzf.m1858Ujhhgtgfeyxiexzf(), C0580Ujhhgtgfeyxiexzf.m1857Ujhhgtgfeyxiexzf(), (String) c2962feyxiexzfUjhhgtg9.m4430Ujhhgtgfeyxiexzf(interfaceC0150UjhhgtgfeyxiexzfArr[8]));
                    if (!C2249feyxiexzfUjhhgtg.m3417feyxiexzfUjhhgtg()) {
                        String str5 = "initDexObfKey";
                        String str6 = "";
                        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.f4604Ujhhgtgfeyxiexzf;
                        if (c2629Ujhhgtgfeyxiexzf == null) {
                            throw new IllegalArgumentException("DexDescConfig must be init".toString());
                        }
                        String string3 = c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getString(str5, str6);
                        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(string3)) {
                            string = AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(new StringBuilder(), "核心丢失, 正在重载...", '\n');
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            C1785feyxiexzfUjhhgtg c1785feyxiexzfUjhhgtgM3419feyxiexzfUjhhgtg = C2249feyxiexzfUjhhgtg.m3419feyxiexzfUjhhgtg(string3);
                            Object obj5 = c1785feyxiexzfUjhhgtgM3419feyxiexzfUjhhgtg.f6025Ujhhgtgfeyxiexzf;
                            Object obj6 = c1785feyxiexzfUjhhgtgM3419feyxiexzfUjhhgtg.f6024Ujhhgtgfeyxiexzf;
                            C1785feyxiexzfUjhhgtg c1785feyxiexzfUjhhgtgM3419feyxiexzfUjhhgtg2 = C2249feyxiexzfUjhhgtg.m3419feyxiexzfUjhhgtg((String) C2249feyxiexzfUjhhgtg.f7328Ujhhgtgfeyxiexzf.getValue());
                            Object obj7 = c1785feyxiexzfUjhhgtgM3419feyxiexzfUjhhgtg2.f6025Ujhhgtgfeyxiexzf;
                            Object obj8 = c1785feyxiexzfUjhhgtgM3419feyxiexzfUjhhgtg2.f6024Ujhhgtgfeyxiexzf;
                            sb2.append("宿主：" + ((String) obj6));
                            sb2.append('\n');
                            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj8, obj6)) {
                                sb2.append("变更 -> " + ((String) obj8));
                                sb2.append('\n');
                            }
                            sb2.append("模块：" + ((String) obj5));
                            sb2.append('\n');
                            if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(obj7, obj5)) {
                                sb2.append("变更 -> " + ((String) obj7));
                                sb2.append('\n');
                            }
                            string = sb2.toString();
                        }
                        C2248feyxiexzfUjhhgtg c2248feyxiexzfUjhhgtg = new C2248feyxiexzfUjhhgtg(string, null);
                        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf("com.tencent.mm.ui.conversation.MainUI")).m2024Ujhhgtgfeyxiexzf();
                        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "onCreate";
                        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf = c2249feyxiexzfUjhhgtg.m2996Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf()), 1);
                        c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3483Ujhhgtgfeyxiexzf(new C0530Ujhhgtgfeyxiexzf(c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf, i4, c2248feyxiexzfUjhhgtg));
                        c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
                    }
                }
                if (C2249feyxiexzfUjhhgtg.m3417feyxiexzfUjhhgtg()) {
                    C2249feyxiexzfUjhhgtg.m3418feyxiexzfUjhhgtg();
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                Object obj9 = ((C0573Ujhhgtgfeyxiexzf) c0578Ujhhgtgfeyxiexzf2.f2598Ujhhgtgfeyxiexzf.f1471Ujhhgtgfeyxiexzf).f2590Ujhhgtgfeyxiexzf.thisObject;
                Class<?> cls4 = obj9 != null ? obj9.getClass() : null;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls4, AbstractC1252feyxiexzfUjhhgtg.m2792Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI"))) {
                    Object objM1849Ujhhgtgfeyxiexzf = c0578Ujhhgtgfeyxiexzf2.m1849Ujhhgtgfeyxiexzf();
                    Activity activity = (Activity) (objM1849Ujhhgtgfeyxiexzf instanceof Activity ? objM1849Ujhhgtgfeyxiexzf : null);
                    if (activity == null) {
                        Class<Activity> clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Activity.class));
                        throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf4 != null ? clsM5159Ujhhgtgfeyxiexzf4 : Activity.class).getName()).toString());
                    }
                    C2230feyxiexzfUjhhgtg c2230feyxiexzfUjhhgtg = C2230feyxiexzfUjhhgtg.f7264Ujhhgtgfeyxiexzf;
                    String str7 = "WA";
                    MenuItemOnMenuItemClickListenerC1217feyxiexzfUjhhgtg menuItemOnMenuItemClickListenerC1217feyxiexzfUjhhgtg = new MenuItemOnMenuItemClickListenerC1217feyxiexzfUjhhgtg(1, activity);
                    c2230feyxiexzfUjhhgtg.getClass();
                    int i6 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(activity).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "addTextOptionMenu";
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.TYPE), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2), AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(MenuItem.OnMenuItemClickListener.class)}, 3));
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1306Ujhhgtgfeyxiexzf();
                    ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf())).m1649Ujhhgtgfeyxiexzf(Integer.valueOf(R.id.Wauxv_Entry_Item), str7, menuItemOnMenuItemClickListenerC1217feyxiexzfUjhhgtg);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                new C1019feyxiexzfUjhhgtg((Context) obj).m2518Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                Object objM1849Ujhhgtgfeyxiexzf2 = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                Context context = (Context) (objM1849Ujhhgtgfeyxiexzf2 instanceof Context ? objM1849Ujhhgtgfeyxiexzf2 : null);
                if (context == null) {
                    Class<Context> clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf5 != null ? clsM5159Ujhhgtgfeyxiexzf5 : Context.class).getName()).toString());
                }
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(context).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "adapter";
                BaseAdapter baseAdapter = (BaseAdapter) ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf5)).m4939Ujhhgtgfeyxiexzf();
                for (C2231feyxiexzfUjhhgtg c2231feyxiexzfUjhhgtg : C2227feyxiexzfUjhhgtg.f7248Ujhhgtgfeyxiexzf) {
                    AbstractC3590Ujhhgtgfeyxiexzf.m5117Ujhhgtgfeyxiexzf(baseAdapter, AbstractC3590Ujhhgtgfeyxiexzf.m5127Ujhhgtgfeyxiexzf(context, c2231feyxiexzfUjhhgtg.f7265Ujhhgtgfeyxiexzf, c2231feyxiexzfUjhhgtg.f7266Ujhhgtgfeyxiexzf), 0);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                Object objM1849Ujhhgtgfeyxiexzf3 = c0578Ujhhgtgfeyxiexzf3.m1849Ujhhgtgfeyxiexzf();
                if (!(objM1849Ujhhgtgfeyxiexzf3 instanceof Context)) {
                    objM1849Ujhhgtgfeyxiexzf3 = null;
                }
                Context context2 = (Context) objM1849Ujhhgtgfeyxiexzf3;
                if (context2 == null) {
                    Class<Context> clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf6 != null ? clsM5159Ujhhgtgfeyxiexzf6 : Context.class).getName()).toString());
                }
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                Object obj10 = c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2;
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj10).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls2);
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.m1306Ujhhgtgfeyxiexzf();
                Iterator it = c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf6.m4942Ujhhgtgfeyxiexzf().iterator();
                while (it.hasNext()) {
                    String str8 = (String) ((C3438feyxiexzfUjhhgtg) it.next()).m4939Ujhhgtgfeyxiexzf();
                    if (str8 != null) {
                        for (C2231feyxiexzfUjhhgtg c2231feyxiexzfUjhhgtg2 : C2227feyxiexzfUjhhgtg.f7248Ujhhgtgfeyxiexzf) {
                            if (str8.equals(c2231feyxiexzfUjhhgtg2.f7265Ujhhgtgfeyxiexzf)) {
                                c2231feyxiexzfUjhhgtg2.f7267Ujhhgtgfeyxiexzf.invoke(context2);
                                c0578Ujhhgtgfeyxiexzf3.m1852Ujhhgtgfeyxiexzf();
                            }
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2208Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                byte[] bArr = (byte[]) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                if (bArr != null) {
                    String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    byte[] bytes = "wxgf".getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
                    "getBytes(...)";
                    if (bArr.length >= bytes.length) {
                        Iterable c0682Ujhhgtgfeyxiexzf = new C0682Ujhhgtgfeyxiexzf(0, bytes.length - 1, 1);
                        if (!(c0682Ujhhgtgfeyxiexzf instanceof Collection) || !((Collection) c0682Ujhhgtgfeyxiexzf).isEmpty()) {
                            Iterator it2 = c0682Ujhhgtgfeyxiexzf.iterator();
                            do {
                                C0679Ujhhgtgfeyxiexzf c0679Ujhhgtgfeyxiexzf = (C0679Ujhhgtgfeyxiexzf) it2;
                                if (c0679Ujhhgtgfeyxiexzf.f2803Ujhhgtgfeyxiexzf) {
                                    iNextInt = c0679Ujhhgtgfeyxiexzf.nextInt();
                                } else if (bArr.length >= 11) {
                                    C2288Ujhhgtgfeyxiexzf.f7499Ujhhgtgfeyxiexzf.getClass();
                                    if (((long) (((bArr[7] & 255) << 8) | (bArr[8] & 255))) * ((long) (((bArr[9] & 255) << 8) | (bArr[10] & 255))) * 4 > 52428800) {
                                        byte b = (byte) 0;
                                        bArr[7] = b;
                                        byte b2 = (byte) 32;
                                        bArr[8] = b2;
                                        bArr[9] = b;
                                        bArr[10] = b2;
                                    }
                                }
                            } while (bArr[iNextInt] == bytes[iNextInt]);
                        } else if (bArr.length >= 11) {
                            C2288Ujhhgtgfeyxiexzf.f7499Ujhhgtgfeyxiexzf.getClass();
                            if (((long) (((bArr[7] & 255) << 8) | (bArr[8] & 255))) * ((long) (((bArr[9] & 255) << 8) | (bArr[10] & 255))) * 4 > 52428800) {
                                byte b3 = (byte) 0;
                                bArr[7] = b3;
                                byte b4 = (byte) 32;
                                bArr[8] = b4;
                                bArr[9] = b3;
                                bArr[10] = b4;
                            }
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.gif");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1663feyxiexzfUjhhgtg("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d");
                Class<byte[]> clsM5159Ujhhgtgfeyxiexzf7 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(byte[].class));
                c0394Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(clsM5159Ujhhgtgfeyxiexzf7 != null ? clsM5159Ujhhgtgfeyxiexzf7 : byte[].class);
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
