package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.kongzue.dialogx.interfaces.AbstractC0034;
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
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᤝᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3681 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f11472;

    public /* synthetic */ C3681(int i) {
        this.f11472 = i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c2641;
        String strM1484;
        String string;
        Object c2642;
        Object c2643;
        int iNextInt;
        int i = this.f11472;
        Class<Context> cls = Context.class;
        int i2 = 14;
        Class<String> cls2 = String.class;
        int i3 = 8;
        int i4 = 5;
        boolean z = false;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Class<String> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls2));
                if (AbstractC1469.m3322(obj2, clsM4232 != null ? clsM4232 : String.class)) {
                    Object obj3 = list.get(1);
                    Class<Integer> cls3 = Integer.class;
                    Class<Integer> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                    if (clsM4233 == null) {
                        clsM4233 = cls3;
                    }
                    if (AbstractC1469.m3322(obj3, clsM4233)) {
                        Object obj4 = list.get(2);
                        Class<Integer> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(cls3));
                        if (AbstractC1469.m3322(obj4, clsM4234 != null ? clsM4234 : Integer.class)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                String[] strArr = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
                return c3554;
            case 2:
                ((C2012) obj).m4021("getAmrFullPath cost: ");
                return c3554;
            case 3:
                C2041 c2041M4059 = C2041.m4059(LayoutInflater.from(((View) obj).getContext()));
                c2041M4059.f6811.setText(C3685.f11476.m2666());
                C2037 c2037 = new C2037();
                C3686.f11477.getClass();
                c2037.f6779 = C3686.f11480;
                c2037.f6781 = c2041M4059.f6810;
                String[] strArr2 = AbstractC1471.f5234;
                c2037.m4057("保存", new C1175(c2041M4059, 5));
                c2037.m4056("重置", new C3413(i3));
                C2037.m4053(c2037, null, 3);
                c2037.m4055().m3985();
                return c3554;
            case 4:
                ((C1023) obj).f3740 = new C3681(5);
                return c3554;
            case 5:
                ((C1335) obj).m3155(new C3681(6));
                return c3554;
            case 6:
                C2012 c2012 = (C2012) obj;
                c2012.m4015(1);
                String[] strArr3 = AbstractC1471.f5234;
                c2012.m4021("MicroMsg.SceneVoiceService", "Start Recv[%s] :%s", "Start Send :");
                return c3554;
            case 7:
                C1574 c1574 = (C1574) obj;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Context baseContext = ((Application) c2641).getBaseContext();
                C3695 c3695 = C3695.f11521;
                c3695.getClass();
                AbstractC2902.m4896(baseContext);
                C1576 c1576 = C1576.f5470;
                String str = C3755.f11766;
                c1576.getClass();
                C0099 c0099 = C1576.f5472;
                InterfaceC1766[] interfaceC1766Arr = C1576.f5471;
                InterfaceC1766 interfaceC1766 = interfaceC1766Arr[0];
                c0099.f1112 = str;
                C0099 c00910 = C1576.f5473;
                InterfaceC1766 interfaceC1767 = interfaceC1766Arr[1];
                c00910.f1112 = baseContext;
                String packageName = baseContext.getPackageName();
                C0099 c00911 = C1576.f5474;
                InterfaceC1766 interfaceC1768 = interfaceC1766Arr[2];
                c00911.f1112 = packageName;
                ClassLoader classLoader = baseContext.getClassLoader();
                C0099 c00912 = C1576.f5475;
                InterfaceC1766 interfaceC1769 = interfaceC1766Arr[3];
                c00912.f1112 = classLoader;
                String str2 = baseContext.getApplicationInfo().sourceDir;
                C0099 c00913 = C1576.f5476;
                InterfaceC1766 interfaceC17610 = interfaceC1766Arr[4];
                c00913.f1112 = str2;
                String string2 = baseContext.getPackageManager().getApplicationLabel(baseContext.getApplicationInfo()).toString();
                C0099 c00914 = C1576.f5477;
                InterfaceC1766 interfaceC17611 = interfaceC1766Arr[5];
                c00914.f1112 = string2;
                int i5 = AbstractC1768.f5906;
                String[] strArr4 = AbstractC1471.f5234;
                C1681 c1681M4712 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.boot.BuildConfig"));
                C1300 c1300M3558 = c1681M4712.m3558();
                c1300M3558.f6475 = "VERSION_NAME";
                String str3 = (String) ((C1316) AbstractC0739.m2290(c1300M3558.m3117())).m3127();
                C0099 c00915 = C1576.f5478;
                InterfaceC1766 interfaceC17612 = interfaceC1766Arr[6];
                c00915.f1112 = str3;
                C1300 c1300M3559 = c1681M4712.m3558();
                c1300M3559.f6475 = "VERSION_CODE";
                int iIntValue = ((Number) ((C1316) AbstractC0739.m2290(c1300M3559.m3117())).m3127()).intValue();
                C0099 c00916 = C1576.f5479;
                InterfaceC1766 interfaceC17613 = interfaceC1766Arr[7];
                c00916.f1112 = Integer.valueOf(iIntValue);
                C1300 c1300M35510 = c1681M4712.m3558();
                c1300M35510.f6475 = "CLIENT_VERSION_ARM64";
                String str4 = (String) ((C1316) AbstractC0739.m2290(c1300M35510.m3117())).m3127();
                C0099 c00917 = C1576.f5480;
                InterfaceC1766 interfaceC17614 = interfaceC1766Arr[8];
                c00917.f1112 = str4;
                C1300 c1300M35511 = c1681M4712.m3558();
                c1300M35511.f6475 = "BUILD_TAG";
                boolean zM4861 = AbstractC2901.m4861((CharSequence) ((C1316) AbstractC0739.m2290(c1300M35511.m3117())).m3127(), "_GP_", false);
                C0099 c00918 = C1576.f5481;
                InterfaceC1766 interfaceC17615 = interfaceC1766Arr[9];
                c00918.f1112 = Boolean.valueOf(zM4861);
                AbstractC1469 abstractC1469 = AbstractC1037.f3785;
                AbstractC0034.m885(baseContext);
                AbstractC1037.f3789 = 3;
                AbstractC1037.f3785 = new C1950(1);
                AbstractC1037.f3790 = 2;
                AbstractC2902.f9279 = C3755.f11766;
                AbstractC2174.f7202 = baseContext;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builder.connectTimeout(30L, timeUnit);
                builder.readTimeout(30L, timeUnit);
                builder.writeTimeout(30L, timeUnit);
                AbstractC2303.m4283(builder);
                OkHttpClient okHttpClientM4284 = AbstractC2304.m4284(builder.build());
                AbstractC2174.f7203 = okHttpClientM4284;
                Cache cache = okHttpClientM4284.cache();
                AbstractC2174.f7204 = cache != null ? new C1399(OkHttpUtils.diskLruCache(cache)) : null;
                AbstractC2902.f9278 = new C0519(baseContext, "WAuxiliary_config_default");
                AbstractC0738.f2837 = new C0519(baseContext, "WAuxiliary_config_dex_desc");
                AbstractC1586.f5502 = new C0519(baseContext, "WAuxiliary_config_plugin");
                C2343 c2343 = c3695.f7559;
                if (c2343 != null) {
                    strM1484 = c2343.f7561;
                } else {
                    C0261.f1489.getClass();
                    strM1484 = C0261.m1484();
                }
                if (c3695.m4302().equals(AbstractC2901.m4882(strM1484).toString())) {
                    UMConfigure.preInit(baseContext, "68393b1dbc47b67d83776862", (String) c00914.m1232(interfaceC1766Arr[5]));
                    ArrayList arrayList = C3741.f11709;
                    C3741.m5314(14, "running on: Android" + Build.VERSION.RELEASE + '-' + C1576.m3461());
                    C3741.m5314(14, "loading module: WAuxiliary1.2.7.r1405.70100cc");
                    StringBuilder sb = new StringBuilder();
                    sb.append("compile timestamp: ");
                    sb.append(AbstractC3754.f11757);
                    C3741.m5314(14, sb.toString());
                    System.loadLibrary("wauxv-core");
                    LoaderNative.f1035.loaderInit((String) c0099.m1232(interfaceC1766Arr[0]), baseContext.getDataDir().getAbsolutePath(), C1576.m3460(), C1576.m3459(), C1576.m3458(), (String) c00917.m1232(interfaceC1766Arr[8]));
                    if (!C3695.m5227()) {
                        String str5 = "initDexObfKey";
                        String str6 = "";
                        C0519 c0519 = AbstractC0738.f2837;
                        if (c0519 == null) {
                            throw new IllegalArgumentException("DexDescConfig must be init".toString());
                        }
                        String string3 = c0519.m1985().getString(str5, str6);
                        if (AbstractC2901.m4869(string3)) {
                            string = AbstractC1095.m2801(new StringBuilder(), "核心丢失, 正在重载...", '\n');
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            C3504 c3504M5229 = C3695.m5229(string3);
                            Object obj5 = c3504M5229.f11023;
                            Object obj6 = c3504M5229.f11022;
                            C3504 c3504M52210 = C3695.m5229((String) C3695.f11522.getValue());
                            Object obj7 = c3504M52210.f11023;
                            Object obj8 = c3504M52210.f11022;
                            sb2.append("宿主：" + ((String) obj6));
                            sb2.append('\n');
                            if (!AbstractC1469.m3322(obj8, obj6)) {
                                sb2.append("变更 -> " + ((String) obj8));
                                sb2.append('\n');
                            }
                            sb2.append("模块：" + ((String) obj5));
                            sb2.append('\n');
                            if (!AbstractC1469.m3322(obj7, obj5)) {
                                sb2.append("变更 -> " + ((String) obj7));
                                sb2.append('\n');
                            }
                            string = sb2.toString();
                        }
                        C3694 c3694 = new C3694(string, null);
                        C2004 c2004M3560 = AbstractC2727.m4712(AbstractC0972.m2606("com.tencent.mm.ui.conversation.MainUI")).m3560();
                        c2004M3560.f6475 = "onCreate";
                        C3752 c3752M4303 = c3695.m4303((C2013) AbstractC0739.m2290(c2004M3560.m3993()), 1);
                        c3752M4303.m5358(new C1526(c3752M4303, i4, c3694));
                        c3752M4303.m5360();
                    }
                }
                if (C3695.m5227()) {
                    C3695.m5228();
                }
                return c3554;
            case 8:
                C1574 c1575 = (C1574) obj;
                Object obj9 = ((C1571) c1575.f5468.f6345).f5461.thisObject;
                Class<?> cls4 = obj9 != null ? obj9.getClass() : null;
                String[] strArr5 = AbstractC1471.f5234;
                if (AbstractC1469.m3322(cls4, AbstractC0972.m2606("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI"))) {
                    Object objM3448 = c1575.m3448();
                    Activity activity = (Activity) (objM3448 instanceof Activity ? objM3448 : null);
                    if (activity == null) {
                        Class<Activity> clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(Activity.class));
                        throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4235 != null ? clsM4235 : Activity.class).getName()).toString());
                    }
                    C3696 c3696 = C3696.f11523;
                    String str7 = "WA";
                    MenuItemOnMenuItemClickListenerC2811 menuItemOnMenuItemClickListenerC2811 = new MenuItemOnMenuItemClickListenerC2811(activity, 1);
                    c3696.getClass();
                    int i6 = AbstractC1768.f5906;
                    C2004 c2004M3561 = AbstractC2727.m4713(activity).m3560();
                    c2004M3561.f6475 = "addTextOptionMenu";
                    c2004M3561.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(Integer.TYPE), AbstractC2574.m4549(cls2), AbstractC2574.m4549(MenuItem.OnMenuItemClickListener.class)}, 3));
                    c2004M3561.m3926();
                    ((C2013) AbstractC0739.m2290(c2004M3561.m3993())).m4025(Integer.valueOf(R.id.Wauxv_Entry_Item), str7, menuItemOnMenuItemClickListenerC2811);
                }
                return c3554;
            case 9:
                new C2735((Context) obj).m4720();
                return c3554;
            case 10:
                Object objM3449 = ((C1574) obj).m3448();
                Context context = (Context) (objM3449 instanceof Context ? objM3449 : null);
                if (context == null) {
                    Class<Context> clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4236 != null ? clsM4236 : Context.class).getName()).toString());
                }
                int i7 = AbstractC1768.f5906;
                C1300 c1300M35512 = AbstractC2727.m4713(context).m3558();
                c1300M35512.f6475 = "adapter";
                BaseAdapter baseAdapter = (BaseAdapter) ((C1316) AbstractC2844.m4775(c1300M35512)).m3127();
                for (C3697 c3697 : C3698.f11528) {
                    AbstractC2240.m4239(baseAdapter, AbstractC2240.m4254(context, c3697.f11524, c3697.f11525), 0);
                }
                return c3554;
            case 11:
                C1574 c1577 = (C1574) obj;
                Object objM34410 = c1577.m3448();
                if (!(objM34410 instanceof Context)) {
                    objM34410 = null;
                }
                Context context2 = (Context) objM34410;
                if (context2 == null) {
                    Class<Context> clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM4237 != null ? clsM4237 : Context.class).getName()).toString());
                }
                try {
                    c2642 = c1577.m3447()[1];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                Object obj10 = c2642 instanceof C2641 ? null : c2642;
                int i8 = AbstractC1768.f5906;
                C1300 c1300M35513 = AbstractC2727.m4713(obj10).m3558();
                c1300M35513.f4724 = AbstractC2574.m4549(cls2);
                c1300M35513.m3926();
                Iterator it = c1300M35513.m3117().iterator();
                while (it.hasNext()) {
                    String str8 = (String) ((C1316) it.next()).m3127();
                    if (str8 != null) {
                        for (C3697 c3698 : C3698.f11528) {
                            if (str8.equals(c3698.f11524)) {
                                c3698.f11526.invoke(context2);
                                c1577.m3451();
                            }
                        }
                    }
                }
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3740 = new C3681(i2);
                return c3554;
            case 13:
                C1574 c1578 = (C1574) obj;
                c1578.getClass();
                try {
                    c2643 = c1578.m3447()[0];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                byte[] bArr = (byte[]) (c2643 instanceof C2641 ? null : c2643);
                if (bArr != null) {
                    String[] strArr6 = AbstractC1471.f5234;
                    byte[] bytes = "wxgf".getBytes(AbstractC0580.UTF_8);
                    "getBytes(...)";
                    if (bArr.length >= bytes.length) {
                        Iterable c1679 = new C1679(0, bytes.length - 1, 1);
                        if (!(c1679 instanceof Collection) || !((Collection) c1679).isEmpty()) {
                            Iterator it2 = c1679.iterator();
                            do {
                                C1678 c1678 = (C1678) it2;
                                if (c1678.f5655) {
                                    iNextInt = c1678.nextInt();
                                } else if (bArr.length >= 11) {
                                    C3739.f11697.getClass();
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
                            C3739.f11697.getClass();
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
                return c3554;
            default:
                C1335 c1335 = (C1335) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.gif");
                C2012 c2013 = new C2012();
                c2013.m4023("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d");
                Class<byte[]> clsM4238 = AbstractC2236.m4232(AbstractC2574.m4549(byte[].class));
                c2013.m4017(clsM4238 != null ? clsM4238 : byte[].class);
                c1335.f4794 = c2013;
                return c3554;
        }
    }
}
