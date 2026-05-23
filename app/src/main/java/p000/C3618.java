package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.google.android.material.slider.Slider;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.umeng.commonsdk.UMConfigure;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.core.p001native.LoaderNative;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3618 implements InterfaceC1425 {

    public final /* synthetic */ int f11316;

    public /* synthetic */ C3618(int i) {
        this.f11316 = i;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:188:0x07d0  */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        Object c2585;
        Object obj2;
        Object c2586;
        String strM1338;
        String string;
        Object c2587;
        int i = this.f11316;
        Class cls = Integer.TYPE;
        Class<Context> cls2 = Context.class;
        Class<String> cls3 = String.class;
        int i2 = 3;
        char c = 0;
        z = false;
        z = false;
        boolean z = false;
        int i3 = 7;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_voice_length, null, false);
                Slider slider = (Slider) AbstractC3681.m5325(viewM4676, R.id.moduleDialogSliderVoiceLength);
                if (slider == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(R.id.moduleDialogSliderVoiceLength)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM4676;
                C2023 c2023 = new C2023(linearLayout, slider);
                slider.setValue(C3620.f11318.m2538());
                C2007 c2007 = new C2007();
                
                c2007.f6678 = C3621.f11321;
                c2007.f6680 = linearLayout;
                c2007.m3870("保存", new C2042(19, c2023));
                AbstractC2784.m4755(c2007, null, 3);
                return unit;
            case 1:
                ((C1020) obj).thisMethodMatcher = new C3618(3);
                return unit;
            case 2:
                C1563 c1563 = (C1563) obj;
                int length = c1563.m3267().length;
                if (length == 1) {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                    if (c2585 instanceof C2585) {
                    }
                    int i4 = 0;
                    C1299 c1299M3490 = AbstractC0968.startMethodResolution_(obj2).m3490();
                    c1299M3490.name = "l";
                    c1299M3490.fieldType = AbstractC2519.classToKClass(cls);
                    ((C1315) AbstractC0744.firstInList(c1299M3490.resolve())).set(Integer.valueOf(C3620.f11318.m2538() * 1000));
                } else if (length == 2 && (c1563.m3267()[0] instanceof String)) {
                    c = 1;
                    try {
                        c2585 = c1563.m3267()[1];
                        if (c2585 == null) {
                            c2585 = null;
                        }
                    } catch (Throwable th) {
                        c2585 = new C2585(th);
                    }
                    obj2 = c2585 instanceof C2585 ? null : c2585;
                    int i5 = 0;
                    C1299 c1299M3491 = AbstractC0968.startMethodResolution_(obj2).m3490();
                    c1299M3491.name = "l";
                    c1299M3491.fieldType = AbstractC2519.classToKClass(cls);
                    ((C1315) AbstractC0744.firstInList(c1299M3491.resolve())).set(Integer.valueOf(C3620.f11318.m2538() * 1000));
                }
                return unit;
            case 3:
                ((C1333) obj).m3052(new C3424(29));
                return unit;
            case 4:
                ((C1020) obj).declaringClassMatcher = new C3618(7);
                return unit;
            case 5:
                ((C1020) obj).thisMethodMatcher = new C3618(6);
                return unit;
            case 6:
                ((C1333) obj).m3052(new C3618(9));
                return unit;
            case 7:
                ((C1332) obj).m3050(new C3618(8));
                return unit;
            case 8:
                String[] strArr2 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
                return unit;
            case 9:
                ((C1981) obj).m3827("getAmrFullPath cost: ");
                return unit;
            case 10:
                List list = (List) obj;
                Object obj3 = list.get(0);
                Class<String> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (AbstractC2207.m4087(obj3, clsM2183 != null ? clsM2183 : String.class)) {
                    Object obj4 = list.get(1);
                    Class<Integer> cls4 = Integer.class;
                    Class<Integer> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                    if (clsM2184 == null) {
                        clsM2184 = Integer.class;
                    }
                    if (AbstractC2207.m4087(obj4, clsM2184)) {
                        Object obj5 = list.get(2);
                        Class<Integer> clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                        if (AbstractC2207.m4087(obj5, clsM2185 != null ? clsM2185 : Integer.class)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                C2011 c2011M3872 = C2011.m3872(LayoutInflater.from(((View) obj).getContext()));
                c2011M3872.f6708.setText(C3625.f11327.m2542());
                C2007 c2008 = new C2007();
                
                c2008.f6678 = C3626.f11331;
                c2008.f6680 = c2011M3872.f6707;
                String[] strArr3 = AbstractC1574.f5469;
                c2008.m3870("保存", new C1173(c2011M3872, 5));
                c2008.m3869("重置", new C3369(6));
                C2007.m3866(c2008, null, 3);
                c2008.m3868().m3791();
                return unit;
            case 12 /* 12 */:
                ((C1020) obj).thisMethodMatcher = new C3618(13);
                return unit;
            case 13:
                ((C1333) obj).m3052(new C3618(14));
                return unit;
            case 14 /* 14 */:
                C1981 c1981 = (C1981) obj;
                c1981.m3821(1);
                String[] strArr4 = AbstractC1574.f5469;
                c1981.m3827("MicroMsg.SceneVoiceService", "Start Recv[%s] :%s", "Start Send :");
                return unit;
            case 15:
                C1563 c1564 = (C1563) obj;
                
                try {
                    c2586 = c1564.m3267()[0];
                    if (c2586 == null) {
                        c2586 = null;
                    }
                } catch (Throwable th2) {
                    c2586 = new C2585(th2);
                }
                if (c2586 instanceof C2585) {
                    c2586 = null;
                }
                Context baseContext = ((Application) c2586).getBaseContext();
                C3635 c3635 = C3635.f11372;
                
                AbstractC2207.m4098(baseContext);
                C1565 c1565 = C1565.f5440;
                String str = C3692.f11609;
                
                C0091 c0091 = C1565.f5442;
                InterfaceC1742[] interfaceC1742Arr = C1565.f5441;
                InterfaceC1742 interfaceC1742 = interfaceC1742Arr[0];
                c0091.f1044 = str;
                C0091 c0092 = C1565.f5443;
                InterfaceC1742 interfaceC1743 = interfaceC1742Arr[1];
                c0092.f1044 = baseContext;
                String packageName = baseContext.getPackageName();
                C0091 c0093 = C1565.f5444;
                InterfaceC1742 interfaceC1744 = interfaceC1742Arr[2];
                c0093.f1044 = packageName;
                ClassLoader classLoader = baseContext.getClassLoader();
                C0091 c0094 = C1565.f5445;
                InterfaceC1742 interfaceC1745 = interfaceC1742Arr[3];
                c0094.f1044 = classLoader;
                String str2 = baseContext.getApplicationInfo().sourceDir;
                C0091 c0095 = C1565.f5446;
                InterfaceC1742 interfaceC1746 = interfaceC1742Arr[4];
                c0095.f1044 = str2;
                String string2 = baseContext.getPackageManager().getApplicationLabel(baseContext.getApplicationInfo()).toString();
                C0091 c0096 = C1565.f5447;
                InterfaceC1742 interfaceC1747 = interfaceC1742Arr[5];
                c0096.f1044 = string2;
                int i6 = 0;
                String[] strArr5 = AbstractC1574.f5469;
                C1744 c1744M2483 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.boot.BuildConfig"));
                C1299 c1299M3492 = c1744M2483.m3490();
                c1299M3492.name = "VERSION_NAME";
                String str3 = (String) ((C1315) AbstractC0744.firstInList(c1299M3492.resolve())).m3024();
                C0091 c0097 = C1565.f5448;
                InterfaceC1742 interfaceC1748 = interfaceC1742Arr[6];
                c0097.f1044 = str3;
                C1299 c1299M3493 = c1744M2483.m3490();
                c1299M3493.name = "VERSION_CODE";
                int iIntValue = ((Number) ((C1315) AbstractC0744.firstInList(c1299M3493.resolve())).m3024()).intValue();
                C0091 c0098 = C1565.f5449;
                InterfaceC1742 interfaceC1749 = interfaceC1742Arr[7];
                c0098.f1044 = Integer.valueOf(iIntValue);
                C1299 c1299M3494 = c1744M2483.m3490();
                c1299M3494.name = "CLIENT_VERSION_ARM64";
                String str4 = (String) ((C1315) AbstractC0744.firstInList(c1299M3494.resolve())).m3024();
                C0091 c0099 = C1565.f5450;
                InterfaceC1742 interfaceC17410 = interfaceC1742Arr[8];
                c0099.f1044 = str4;
                C1299 c1299M3495 = c1744M2483.m3490();
                c1299M3495.name = "BUILD_TAG";
                boolean zM4828 = AbstractC2841.m4828((CharSequence) ((C1315) AbstractC0744.firstInList(c1299M3495.resolve())).m3024(), "_GP_", false);
                C0091 c00910 = C1565.f5451;
                InterfaceC1742 interfaceC17411 = interfaceC1742Arr[9];
                c00910.f1044 = Boolean.valueOf(zM4828);
                AbstractC2205 abstractC2205 = AbstractC1034.f3778;
                AbstractC0027.m741(baseContext);
                AbstractC1034.f3782 = 3;
                AbstractC1034.f3778 = new C1919(1);
                AbstractC1034.f3783 = 2;
                AbstractC1460.f5199 = C3692.f11609;
                AbstractC2140.f7078 = baseContext;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builder.connectTimeout(30L, TimeUnit.SECONDS);
                builder.readTimeout(30L, TimeUnit.SECONDS);
                builder.writeTimeout(30L, TimeUnit.SECONDS);
                AbstractC2271.m4154(builder);
                OkHttpClient okHttpClientM4155 = AbstractC2272.m4155(builder.build());
                AbstractC2140.f7079 = okHttpClientM4155;
                Cache cache = okHttpClientM4155.cache();
                AbstractC2140.f7080 = cache != null ? new C1391(OkHttpUtils.diskLruCache(cache)) : null;
                AbstractC1458.f5192 = new C0542(baseContext, "WAuxiliary_config_default");
                AbstractC2665.f8589 = new C0542(baseContext, "WAuxiliary_config_dex_desc");
                AbstractC0968.f3516 = new C0542(baseContext, "WAuxiliary_config_plugin");
                C2310 c2310 = c3635.f7437;
                if (c2310 != null) {
                    strM1338 = c2310.f7439;
                } else {
                    
                    strM1338 = C0251.m1338();
                }
                if (c3635.m4173().equals(AbstractC2841.m4848(strM1338).toString())) {
                    UMConfigure.preInit(baseContext, "68393b1dbc47b67d83776862", (String) c0096.m1086(interfaceC1742Arr[5]));
                    ArrayList arrayList = C3678.f11549;
                    C3678.m5305(14, "running on: Android" + Build.VERSION.RELEASE + '-' + C1565.m3281());
                    C3678.m5305(14, "loading module: WAuxiliary1.2.7.r1356.3e63484");
                    StringBuilder sb = new StringBuilder();
                    sb.append("compile timestamp: ");
                    sb.append(AbstractC3691.f11600);
                    C3678.m5305(14, sb.toString());
                    System.loadLibrary("wauxv-core");
                    LoaderNative.f970.loaderInit((String) c0091.m1086(interfaceC1742Arr[0]), baseContext.getDataDir().getAbsolutePath(), C1565.m3280(), C1565.m3279(), C1565.m3278(), (String) c0099.m1086(interfaceC1742Arr[8]));
                    C2873 c2873 = AbstractC2342.f7529;
                    AbstractC1459.f5195 = AbstractC2342.m4330("Cache");
                    String str5 = AbstractC1459.f5195;
                    if (false) {
                        throw new IllegalArgumentException("AudioUtil must be init".toString());
                    }
                    File file = new File(str5);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("init: 缓存目录创建失败");
                    }
                    if (!file.canWrite()) {
                        throw new IOException("init: 缓存目录无写入权限");
                    }
                    if (!C3635.m5221()) {
                        String str6 = "initDexObfKey";
                        String str7 = "";
                        C0542 c0542 = AbstractC2665.f8589;
                        if (c0542 == null) {
                            throw new IllegalArgumentException("DexDescConfig must be init".toString());
                        }
                        String string3 = c0542.m1891().getString("initDexObfKey", "");
                        if (AbstractC2841.m4836(string3)) {
                            string = AbstractC1194.m2786(new StringBuilder(), "核心丢失, 正在重载...", '\n');
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            C3447 c3447M5223 = C3635.m5223(string3);
                            Object obj6 = c3447M5223.f10863;
                            Object obj7 = c3447M5223.f10862;
                            C3447 c3447M5224 = C3635.m5223((String) C3635.f11373.getValue());
                            Object obj8 = c3447M5224.f10863;
                            Object obj9 = c3447M5224.f10862;
                            sb2.append("宿主：" + ((String) obj7));
                            sb2.append('\n');
                            if (!AbstractC2207.m4087(obj9, obj7)) {
                                sb2.append("变更 -> " + ((String) obj9));
                                sb2.append('\n');
                            }
                            sb2.append("模块：" + ((String) obj6));
                            sb2.append('\n');
                            if (!AbstractC2207.m4087(obj8, obj6)) {
                                sb2.append("变更 -> " + ((String) obj8));
                                sb2.append('\n');
                            }
                            string = sb2.toString();
                        }
                        C3634 c3634 = new C3634(string, null);
                        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.ui.conversation.MainUI")).m3492();
                        c1973M3492.name = "onCreate";
                        C3689 c3689M4174 = c3635.m4174((C1982) AbstractC0744.firstInList(c1973M3492.resolve()), 1);
                        c3689M4174.m5350(new C1514(c3689M4174, 4, c3634));
                        c3689M4174.applyHook();
                    }
                }
                if (C3635.m5221()) {
                    C3635.m5222();
                }
                return unit;
            case 16:
                C1563 c1566 = (C1563) obj;
                Object obj10 = ((C1559) c1566.f5438.f5661).f5430.thisObject;
                Class<?> cls5 = obj10 != null ? obj10.getClass() : null;
                String[] strArr6 = AbstractC1574.f5469;
                if (AbstractC2207.m4087(cls5, AbstractC2201.m3988("com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI"))) {
                    Object objM3268 = c1566.m3268();
                    Activity activity = (Activity) (objM3268 instanceof Activity ? objM3268 : null);
                    if (activity == null) {
                        Class<Activity> clsM2186 = AbstractC0743.m2183(AbstractC2519.classToKClass(Activity.class));
                        throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2186 != null ? clsM2186 : Activity.class).getName()).toString());
                    }
                    C3636 c3636 = C3636.f11374;
                    String str8 = "WA";
                    MenuItemOnMenuItemClickListenerC2751 menuItemOnMenuItemClickListenerC2751 = new MenuItemOnMenuItemClickListenerC2751(1, activity);
                    
                    int i7 = 0;
                    MethodResolver c1973M3493 = AbstractC0968.startMethodResolution_(activity).m3492();
                    c1973M3493.name = "addTextOptionMenu";
                    c1973M3493.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(cls), AbstractC2519.classToKClass(String.class), AbstractC2519.classToKClass(MenuItem.OnMenuItemClickListener.class)}, 3));
                    c1973M3493.superclass();
                    ((C1982) AbstractC0744.firstInList(c1973M3493.resolve())).m3831(Integer.valueOf(R.id.Wauxv_Entry_Item), "WA", menuItemOnMenuItemClickListenerC2751);
                }
                return unit;
            case 17 /* 17 */:
                new C2675((Context) obj).m4686();
                return unit;
            case 18 /* 18 */:
                Object objM3269 = ((C1563) obj).m3268();
                Context context = (Context) (objM3269 instanceof Context ? objM3269 : null);
                if (context == null) {
                    Class<Context> clsM2187 = AbstractC0743.m2183(AbstractC2519.classToKClass(Context.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2187 != null ? clsM2187 : Context.class).getName()).toString());
                }
                int i8 = 0;
                C1299 c1299M3496 = AbstractC0968.startMethodResolution_(context).m3490();
                c1299M3496.name = "adapter";
                BaseAdapter baseAdapter = (BaseAdapter) ((C1315) AbstractC2784.m4741(c1299M3496)).m3024();
                for (C3637 c3637 : C3638.f11379) {
                    AbstractC1574.m3288(baseAdapter, AbstractC1574.m3299(context, c3637.f11375, c3637.f11376), 0);
                }
                return unit;
            default:
                C1563 c1567 = (C1563) obj;
                Object objM32610 = c1567.m3268();
                if (!(objM32610 instanceof Context)) {
                    objM32610 = null;
                }
                Context context2 = (Context) objM32610;
                if (context2 == null) {
                    Class<Context> clsM2188 = AbstractC0743.m2183(AbstractC2519.classToKClass(Context.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM2188 != null ? clsM2188 : Context.class).getName()).toString());
                }
                try {
                    c2587 = c1567.m3267()[1];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                obj2 = c2587 instanceof C2585 ? null : c2587;
                int i9 = 0;
                C1299 c1299M3497 = AbstractC0968.startMethodResolution_(obj2).m3490();
                c1299M3497.fieldType = AbstractC2519.classToKClass(String.class);
                c1299M3497.superclass();
                Iterator it = c1299M3497.resolve().iterator();
                while (it.hasNext()) {
                    String str9 = (String) ((C1315) it.next()).m3024();
                    if (str9 != null) {
                        for (C3637 c3638 : C3638.f11379) {
                            if (str9.equals(c3638.f11375)) {
                                c3638.f11377.invoke(context2);
                                c1567.setReturnTrue();
                            }
                        }
                    }
                }
                return unit;
        }
    }
}
