package p000;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1003feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3922Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1003feyxiexzfUjhhgtg(int i) {
        this.f3922Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        Object c0919feyxiexzfUjhhgtg6;
        int i = this.f3922Ujhhgtgfeyxiexzf;
        Class<Activity> cls = Activity.class;
        int i2 = 10;
        int i3 = 16;
        int i4 = 17;
        int i5 = 15;
        int i6 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.pluginsdk.model.app");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg("checkAppSignature get local signature failed");
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1852Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                Object objM1849Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf();
                Activity activity = (Activity) (!(objM1849Ujhhgtgfeyxiexzf instanceof Activity) ? null : objM1849Ujhhgtgfeyxiexzf);
                if (activity == null) {
                    Class<Activity> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Activity.class).getName()).toString());
                }
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(activity).m2024Ujhhgtgfeyxiexzf();
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "getPreferenceScreen";
                BaseAdapter baseAdapter = (BaseAdapter) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                String stringExtra = activity.getIntent().getStringExtra("Chat_User");
                if (stringExtra == null) {
                    stringExtra = "异常";
                }
                AbstractC3590Ujhhgtgfeyxiexzf.m5117Ujhhgtgfeyxiexzf(baseAdapter, AbstractC3590Ujhhgtgfeyxiexzf.m5127Ujhhgtgfeyxiexzf(activity, "WAuxiliary_chatroom_info_pref", "ID: " + stringExtra), 1);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                Object objM1849Ujhhgtgfeyxiexzf2 = c0578Ujhhgtgfeyxiexzf.m1849Ujhhgtgfeyxiexzf();
                if (!(objM1849Ujhhgtgfeyxiexzf2 instanceof Activity)) {
                    objM1849Ujhhgtgfeyxiexzf2 = null;
                }
                Activity activity2 = (Activity) objM1849Ujhhgtgfeyxiexzf2;
                if (activity2 == null) {
                    Class<Activity> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Activity.class).getName()).toString());
                }
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                Object obj2 = c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg;
                int i8 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2).m2021Ujhhgtgfeyxiexzf();
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class);
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m1306Ujhhgtgfeyxiexzf();
                Iterator it = c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf().iterator();
                while (it.hasNext()) {
                    String str = (String) ((C3438feyxiexzfUjhhgtg) it.next()).m4939Ujhhgtgfeyxiexzf();
                    if (str != null) {
                        String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                        if (str.equals("WAuxiliary_chatroom_info_pref")) {
                            String stringExtra2 = activity2.getIntent().getStringExtra("Chat_User");
                            if (stringExtra2 == null) {
                                stringExtra2 = "异常";
                            }
                            AbstractC1150feyxiexzfUjhhgtg.m2616Ujhhgtgfeyxiexzf(activity2, stringExtra2);
                            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(activity2, 2, "复制成功");
                            c0578Ujhhgtgfeyxiexzf.m1852Ujhhgtgfeyxiexzf();
                        }
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(5);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1003feyxiexzfUjhhgtg(7));
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                Object objM1850Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1850Ujhhgtgfeyxiexzf();
                if (!(objM1850Ujhhgtgfeyxiexzf instanceof List) || ((objM1850Ujhhgtgfeyxiexzf instanceof InterfaceC0140Ujhhgtgfeyxiexzf) && !(objM1850Ujhhgtgfeyxiexzf instanceof InterfaceC0139Ujhhgtgfeyxiexzf))) {
                    objM1850Ujhhgtgfeyxiexzf = null;
                }
                List list = (List) objM1850Ujhhgtgfeyxiexzf;
                C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = new C2065feyxiexzfUjhhgtg(new C0478Ujhhgtgfeyxiexzf(i5));
                List list2 = C1041feyxiexzfUjhhgtg.f4058Ujhhgtgfeyxiexzf;
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(list2, 10));
                for (Object obj3 : list2) {
                    int i9 = i6 + 1;
                    if (i6 < 0) {
                        AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                        throw null;
                    }
                    arrayList.add(new C3660Ujhhgtgfeyxiexzf(((C3660Ujhhgtgfeyxiexzf) c2065feyxiexzfUjhhgtg.getValue()).f11654Ujhhgtgfeyxiexzf).m5357Ujhhgtgfeyxiexzf(Integer.valueOf(list.size() + i6), ((C1039feyxiexzfUjhhgtg) obj3).f4053Ujhhgtgfeyxiexzf));
                    i6 = i9;
                }
                list.addAll(arrayList);
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("MicroMsg.EmojiResHelper", "parseSmileyPanelConfig parseXML exception:%s");
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                String str2 = (String) c0919feyxiexzfUjhhgtg2;
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[3];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                if (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg3 = null;
                }
                int iIntValue = ((Number) c0919feyxiexzfUjhhgtg3).intValue();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[4];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg4 = null;
                }
                int iIntValue2 = ((Number) c0919feyxiexzfUjhhgtg4).intValue();
                try {
                    c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[6];
                    if (c0919feyxiexzfUjhhgtg5 == null) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                }
                Object obj4 = c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg5;
                int i10 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj4).m2021Ujhhgtgfeyxiexzf();
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "d";
                C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf());
                if (iIntValue == 4 && iIntValue2 == -2005 && ((String) c3438feyxiexzfUjhhgtg.m4939Ujhhgtgfeyxiexzf()).startsWith("https://weixin110.qq.com/")) {
                    new C2501feyxiexzfUjhhgtg(3, 6, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(0);
                    new C2501feyxiexzfUjhhgtg(4, 6, c0578Ujhhgtgfeyxiexzf2).m3786Ujhhgtgfeyxiexzf(0);
                    c3438feyxiexzfUjhhgtg.m4940Ujhhgtgfeyxiexzf(str2);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.webview.permission");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg("MicroMsg.LuggageGetA8Key", "WebView-Trace onSceneEnd resp or cb not found(%b/%b), reqUrl: %s, reason: %d");
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                C0319Ujhhgtgfeyxiexzf c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf = C0319Ujhhgtgfeyxiexzf.m1533Ujhhgtgfeyxiexzf(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(((View) obj).getContext()));
                c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1877Ujhhgtgfeyxiexzf.setText(C1033feyxiexzfUjhhgtg.f4038Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                C1066feyxiexzfUjhhgtg.f4127Ujhhgtgfeyxiexzf.getClass();
                c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C1066feyxiexzfUjhhgtg.f4130Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf.f1876Ujhhgtgfeyxiexzf;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf("保存", new C3289Ujhhgtgfeyxiexzf(c0319UjhhgtgfeyxiexzfM1533Ujhhgtgfeyxiexzf, 2));
                c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf("重置", new C0478Ujhhgtgfeyxiexzf(i3));
                C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                int i11 = 1;
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                Object objM1849Ujhhgtgfeyxiexzf3 = c0578Ujhhgtgfeyxiexzf3.m1849Ujhhgtgfeyxiexzf();
                ViewGroup viewGroup = (ViewGroup) (!(objM1849Ujhhgtgfeyxiexzf3 instanceof ViewGroup) ? null : objM1849Ujhhgtgfeyxiexzf3);
                if (viewGroup == null) {
                    Class<ViewGroup> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(ViewGroup.class));
                    throw new IllegalStateException("HookParam instance cannot cast to ".concat((clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : ViewGroup.class).getName()).toString());
                }
                viewGroup.setOnLongClickListener(new ViewOnLongClickListenerC3075Ujhhgtgfeyxiexzf(i11, c0578Ujhhgtgfeyxiexzf3));
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(14);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.sns.model");
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf("MicroMsg.SnsCore", "do SnsCore preload");
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg3.m4951Ujhhgtgfeyxiexzf("com.tencent.mm.plugin.sns.model");
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1655Ujhhgtgfeyxiexzf(4);
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1003feyxiexzfUjhhgtg(23));
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1003feyxiexzfUjhhgtg(22));
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                int i12 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf4.m1849Ujhhgtgfeyxiexzf());
                try {
                    c0919feyxiexzfUjhhgtg6 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg6 == null) {
                        c0919feyxiexzfUjhhgtg6 = null;
                    }
                } catch (Throwable th6) {
                    c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th6);
                }
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg6).m2021Ujhhgtgfeyxiexzf();
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f10724Ujhhgtgfeyxiexzf = "com.tencent.mm.plugin.sns.storage.SnsInfo";
                Object objM4938Ujhhgtgfeyxiexzf = ((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3)).m4938Ujhhgtgfeyxiexzf();
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "getPublishTimeText";
                TextView textView = (TextView) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                C1059feyxiexzfUjhhgtg.f4112Ujhhgtgfeyxiexzf.getClass();
                textView.setText(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(C1059feyxiexzfUjhhgtg.m2548feyxiexzfUjhhgtg(objM4938Ujhhgtgfeyxiexzf), "${originalText}", AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(textView)));
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "getGroupImageStub";
                View view = (View) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                if (view != null && (view instanceof ImageView)) {
                    ((ImageView) view).setVisibility(C1054feyxiexzfUjhhgtg.f4105Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf() ? 8 : 0);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C1003feyxiexzfUjhhgtg(i4));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure");
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr14 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_sns_info, null, false);
                int i13 = R.id.moduleDialogCbSnsInfoHideGroupIcon;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbSnsInfoHideGroupIcon);
                if (materialCheckBox != null) {
                    i13 = R.id.moduleDialogEdtSnsInfoTextFormat;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtSnsInfoTextFormat);
                    if (textInputEditText != null) {
                        i13 = R.id.moduleDialogEdtSnsInfoTextPlaceholders;
                        MaterialTextView materialTextView = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtSnsInfoTextPlaceholders);
                        if (materialTextView != null) {
                            i13 = R.id.moduleDialogEdtSnsInfoTimeFormat;
                            TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtSnsInfoTimeFormat);
                            if (textInputEditText2 != null) {
                                i13 = R.id.moduleDialogInputSnsInfoTextFormat;
                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputSnsInfoTextFormat)) != null) {
                                    i13 = R.id.moduleDialogInputSnsInfoTimeFormat;
                                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputSnsInfoTimeFormat)) != null) {
                                        C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = new C0701Ujhhgtgfeyxiexzf((LinearLayout) viewM2416Ujhhgtgfeyxiexzf, materialCheckBox, textInputEditText, materialTextView, textInputEditText2);
                                        textInputEditText.setText(C1050feyxiexzfUjhhgtg.f4101Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                        textInputEditText2.setText(C1051feyxiexzfUjhhgtg.f4102Ujhhgtgfeyxiexzf.m4623Ujhhgtgfeyxiexzf());
                                        materialCheckBox.setChecked(C1054feyxiexzfUjhhgtg.f4105Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                                        materialTextView.setMovementMethod(LinkMovementMethod.getInstance());
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("点击占位符自动添加以下字段:\n");
                                        String[] strArr15 = C1059feyxiexzfUjhhgtg.f4113Ujhhgtgfeyxiexzf;
                                        int length = strArr15.length;
                                        while (i6 < length) {
                                            String str3 = strArr15[i6];
                                            int length2 = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) (str3 + ' '));
                                            spannableStringBuilder.setSpan(new C2738Ujhhgtgfeyxiexzf(c0701Ujhhgtgfeyxiexzf, str3, 4), length2, spannableStringBuilder.length() + (-1), 33);
                                            i6++;
                                        }
                                        materialTextView.setText(spannableStringBuilder);
                                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                                        C1059feyxiexzfUjhhgtg.f4112Ujhhgtgfeyxiexzf.getClass();
                                        c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C1059feyxiexzfUjhhgtg.f4115Ujhhgtgfeyxiexzf;
                                        c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = c0701Ujhhgtgfeyxiexzf.f2875Ujhhgtgfeyxiexzf;
                                        c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf("保存", new C0350Ujhhgtgfeyxiexzf(i5, c0701Ujhhgtgfeyxiexzf));
                                        c0290Ujhhgtgfeyxiexzf2.m1501Ujhhgtgfeyxiexzf("重置", new C0478Ujhhgtgfeyxiexzf(i4));
                                        C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                                        c0290Ujhhgtgfeyxiexzf2.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                        return c1943Ujhhgtgfeyxiexzf;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i13)));
            case Opcodes.ALOAD /* 25 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(21);
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(19);
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1003feyxiexzfUjhhgtg(18);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                int i14 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(((C0578Ujhhgtgfeyxiexzf) obj).m1849Ujhhgtgfeyxiexzf());
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2.m2021Ujhhgtgfeyxiexzf();
                C1053feyxiexzfUjhhgtg c1053feyxiexzfUjhhgtg = C1053feyxiexzfUjhhgtg.f4104Ujhhgtgfeyxiexzf;
                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4.f10724Ujhhgtgfeyxiexzf = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c1053feyxiexzfUjhhgtg).getDeclaringClass();
                Object objInvoke = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(c1053feyxiexzfUjhhgtg).invoke(((C3438feyxiexzfUjhhgtg) AbstractC1225feyxiexzfUjhhgtg.m2696Ujhhgtgfeyxiexzf(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf4)).m4938Ujhhgtgfeyxiexzf(), null);
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2.m2024Ujhhgtgfeyxiexzf();
                String[] strArr16 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "getPublishTimeText";
                TextView textView2 = (TextView) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                C1059feyxiexzfUjhhgtg.f4112Ujhhgtgfeyxiexzf.getClass();
                textView2.setText(AbstractC1192feyxiexzfUjhhgtg.m2681feyxiexzfUjhhgtg(C1059feyxiexzfUjhhgtg.m2548feyxiexzfUjhhgtg(objInvoke), "${originalText}", AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(textView2)));
                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2.m2024Ujhhgtgfeyxiexzf();
                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5.f1479Ujhhgtgfeyxiexzf = "getGroupImageStub";
                View view2 = (View) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf5)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                if (view2 != null && (view2 instanceof ImageView)) {
                    ((ImageView) view2).setVisibility(C1054feyxiexzfUjhhgtg.f4105Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf() ? 8 : 0);
                }
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1058feyxiexzfUjhhgtg(i6);
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
