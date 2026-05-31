package p000;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᛸᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0943 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3464;

    public /* synthetic */ C0943(int i) {
        this.f3464 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IllegalAccessException {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        int i = this.f3464;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.MMDensityManager", "newScreenWidth:%s");
                return c3554;
            case 1:
                String[] strArr2 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_custom_dpi, null, false);
                int i5 = R.id.moduleDialogEdtCustomDpi;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtCustomDpi);
                if (textInputEditText != null) {
                    i5 = R.id.moduleDialogInputCustomDpi;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputCustomDpi)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4622;
                        C2041 c2041 = new C2041(linearLayout, textInputEditText, i4);
                        textInputEditText.setText(String.valueOf(C0945.f3466.m2662()));
                        C2037 c2037 = new C2037();
                        C0946.f3467.getClass();
                        c2037.f6779 = C0946.f3469;
                        c2037.f6781 = linearLayout;
                        c2037.m4057("保存", new C0114(c2041, 16));
                        AbstractC2844.m4788(c2037, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i5)));
            case 2:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C0943(6);
                c1023.f3740 = new C0943(7);
                return c3554;
            case 3:
                C0946 c0946 = C0946.f3467;
                C3752 c3752M4301 = C2342.m4301(c0946, Collections.singletonList((Method) obj));
                c0946.m3443(c3752M4301, new C0943(i2));
                c3752M4301.m5360();
                return c3554;
            case 4:
                float fM2662 = (C0945.f3466.m2662() * 1.1666666f) / 400.0f;
                int i6 = AbstractC1768.f5906;
                C1300 c1300M4772 = AbstractC2844.m4772((C1574) obj);
                c1300M4772.f4724 = AbstractC2574.m4549(Float.TYPE);
                ((C1316) AbstractC0739.m2290(c1300M4772.m3117())).m3128(Float.valueOf(fM2662));
                return c3554;
            case 5:
                Object objM3449 = ((C1574) obj).m3449();
                DisplayMetrics displayMetrics = objM3449 instanceof DisplayMetrics ? (DisplayMetrics) objM3449 : null;
                if (displayMetrics != null) {
                    float f = displayMetrics.scaledDensity / displayMetrics.density;
                    C0945 c0945 = C0945.f3466;
                    displayMetrics.density = c0945.m2662() / 160.0f;
                    displayMetrics.densityDpi = c0945.m2662();
                    displayMetrics.scaledDensity = (c0945.m2662() / 160.0f) * f;
                }
                return c3554;
            case 6:
                ((C1334) obj).m3153(new C0943(objArr == true ? 1 : 0));
                return c3554;
            case 7:
                C1335 c1335 = (C1335) obj;
                c1335.getClass();
                C2012 c2012 = new C2012();
                C0083 c0083 = new C0083(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0);
                c0083.f1085 = 1;
                c0083.f1086 = 2;
                c2012.f6663 = c0083;
                Class<DisplayMetrics> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(DisplayMetrics.class));
                c2012.m4018(clsM4232 != null ? clsM4232 : DisplayMetrics.class);
                c2012.m4015(0);
                c1335.f4794 = c2012;
                return c3554;
            case 8:
                String[] strArr3 = AbstractC1471.f5234;
                View viewM4623 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_custom_unread_count, null, false);
                int i7 = R.id.moduleDialogEdtCustomUnReadCount;
                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4623, R.id.moduleDialogEdtCustomUnReadCount);
                if (textInputEditText2 != null) {
                    i7 = R.id.moduleDialogInputCustomUnReadCount;
                    if (((TextInputLayout) AbstractC1272.m3098(viewM4623, R.id.moduleDialogInputCustomUnReadCount)) != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewM4623;
                        C2041 c2042 = new C2041(linearLayout2, textInputEditText2, i3);
                        textInputEditText2.setText(String.valueOf(C0948.f3473.m2662()));
                        C2037 c2038 = new C2037();
                        C0949.f3474.getClass();
                        c2038.f6779 = C0949.f3476;
                        c2038.f6781 = linearLayout2;
                        c2038.m4057("保存", new C0114(c2042, 17));
                        AbstractC2844.m4788(c2038, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4623.getResources().getResourceName(i7)));
            case 9:
                C0488.f2136.getClass();
                return Boolean.valueOf(((AbstractC2927) obj).mo2715());
            case 10:
                String strMo1275 = ((AbstractC2927) obj).mo1275();
                C2406.f7709.getClass();
                return Boolean.valueOf(!AbstractC1469.m3322(strMo1275, C2406.f7710));
            case 11:
                return ((AbstractC2927) obj).mo1275();
            case Opcodes.FCONST_1 /* 12 */:
                return ((AbstractC2927) obj).mo1274();
            case 13:
                C1574 c1574 = (C1574) obj;
                String[] strArr4 = AbstractC1471.f5234;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[1];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Integer num = (Integer) c2641;
                int iIntValue = num != null ? num.intValue() : 0;
                try {
                    c2642 = c1574.m3447()[2];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                String str = (String) c2642;
                if (str == null) {
                    str = "";
                }
                try {
                    c2643 = c1574.m3447()[9];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                String str2 = (String) (c2643 instanceof C2641 ? null : c2643);
                String str3 = str2 != null ? str2 : "";
                if (iIntValue == 0) {
                    String str4 = "WAuxiliary";
                    StringBuilder sbM4787 = AbstractC2844.m4787(str);
                    sbM4787.append(": ");
                    sbM4787.append(str3);
                    Log.v(str4, sbM4787.toString());
                } else if (iIntValue == 1) {
                    String str5 = "WAuxiliary";
                    StringBuilder sbM4788 = AbstractC2844.m4787(str);
                    sbM4788.append(": ");
                    sbM4788.append(str3);
                    Log.d(str5, sbM4788.toString());
                } else if (iIntValue == 2) {
                    String str6 = "WAuxiliary";
                    StringBuilder sbM4789 = AbstractC2844.m4787(str);
                    sbM4789.append(": ");
                    sbM4789.append(str3);
                    Log.i(str6, sbM4789.toString());
                } else if (iIntValue == 3) {
                    String str7 = "WAuxiliary";
                    StringBuilder sbM47810 = AbstractC2844.m4787(str);
                    sbM47810.append(": ");
                    sbM47810.append(str3);
                    Log.w(str7, sbM47810.toString());
                } else if (iIntValue == 4) {
                    String str8 = "WAuxiliary";
                    StringBuilder sbM47811 = AbstractC2844.m4787(str);
                    sbM47811.append(": ");
                    sbM47811.append(str3);
                    Log.e(str8, sbM47811.toString());
                } else if (iIntValue == 5) {
                    String str9 = "WAuxiliary";
                    StringBuilder sbM47812 = AbstractC2844.m4787(str);
                    sbM47812.append(": ");
                    sbM47812.append(str3);
                    Log.wtf(str9, sbM47812.toString());
                }
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC1031.m2728((String) obj);
            case 15:
                return AbstractC1031.m2727((Class) obj);
            case 16:
                return AbstractC1031.m2727((Class) obj);
            case Opcodes.SIPUSH /* 17 */:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2644 = c1575.m3447()[0];
                    if (c2644 == null) {
                        c2644 = null;
                    }
                } catch (Throwable th4) {
                    c2644 = new C2641(th4);
                }
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) (c2644 instanceof C2641 ? null : c2644);
                if (layoutParams.screenBrightness >= 0.5f) {
                    layoutParams.screenBrightness = -1.0f;
                }
                return c3554;
            case Opcodes.LDC /* 18 */:
                C1023 c1024 = (C1023) obj;
                c1024.f3739 = new C0943(20);
                c1024.f3740 = new C0943(21);
                return c3554;
            case 19:
                C1574 c1576 = (C1574) obj;
                c1576.getClass();
                try {
                    c2645 = c1576.m3447()[2];
                    if (c2645 == null) {
                        c2645 = null;
                    }
                } catch (Throwable th5) {
                    c2645 = new C2641(th5);
                }
                if (AbstractC2901.m4861((c2645 instanceof C2641 ? null : c2645).toString(), " files/fastkv ", false)) {
                    c1576.m3450();
                }
                return c3554;
            case 20:
                C1334 c1334 = (C1334) obj;
                c1334.getClass();
                C0700 c0700 = new C0700();
                String[] strArr5 = AbstractC1471.f5234;
                if (AbstractC0972.m2596(EnumC3737.f11681) || AbstractC0972.m2597(EnumC3734.f11645)) {
                    c0700.m2220("entry", "relPath");
                } else {
                    c0700.m2220("entry", "fe.relPath");
                }
                c1334.f4791 = c0700;
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1335 c1336 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1336);
                Class<Boolean> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                Class<Integer> clsM4774 = AbstractC2844.m4774(c2012M4773, clsM4233 != null ? clsM4233 : Boolean.class, Integer.class);
                Class cls = clsM4774 != null ? clsM4774 : Integer.class;
                Class<String> clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                c2012M4773.m4017(cls, clsM4234 != null ? clsM4234 : String.class, null);
                c1336.f4794 = c2012M4773;
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                C1023 c1025 = (C1023) obj;
                c1025.f3739 = new C0943(23);
                c1025.f3740 = new C0943(24);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                C1334 c1337 = (C1334) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c1337.m3154("com.tencent.mm.ui.chatting.viewitems");
                C0700 c0701 = new C0700();
                c0701.m2220(".msgsource.sec_msg_node.clip-len");
                C2897 c2897 = new C2897("MicroMsg.ChattingItem", 1, false);
                List arrayList = c0701.f2682;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c0701.f2682 = arrayList;
                arrayList.add(c2897);
                c1337.f4791 = c0701;
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                ((C1335) obj).m3155(new C0943(26));
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                ((C1574) obj).m3452(null);
                return c3554;
            case 26:
                ((C2012) obj).m4021(".msgsource.sec_msg_node.clip-len");
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C0943(28);
                return c3554;
            case 28:
                ((C1335) obj).m3155(new C1055(objArr4 == true ? 1 : 0));
                return c3554;
            default:
                ((C1574) obj).m3450();
                return c3554;
        }
    }
}
