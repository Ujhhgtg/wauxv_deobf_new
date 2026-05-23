package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.regex.Pattern;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲁᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1837 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6130;

    public /* synthetic */ C1837(int i) {
        this.f6130 = i;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        Object c2586;
        Object c2587;
        Object c2588;
        int i = this.f6130;
        int i2 = 2;
        int i3 = 17;
        int i4 = 21;
        C2022 c2022 = null;
        int i5 = 3;
        int i6 = 1;
        int i7 = 4;
        int i8 = 0;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                C1333 c1333 = (C1333) obj;
                C1981 c1981M4739 = AbstractC2784.m4739(c1333);
                String[] strArr = AbstractC1574.f5469;
                c1981M4739.m3826("onLocationChanged");
                c1981M4739.m3827("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s");
                c1333.f4794 = c1981M4739;
                return unit;
            case 1:
                C1333 c1334 = (C1333) obj;
                C1981 c1981M47310 = AbstractC2784.m4739(c1334);
                String[] strArr2 = AbstractC1574.f5469;
                c1981M47310.m3826("onLocationChanged");
                c1981M47310.m3827("MicroMsg.SLocationListener");
                c1334.f4794 = c1981M47310;
                return unit;
            case 2:
                C1563 c1563 = (C1563) obj;
                
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(((View) c2585).getContext());
                String[] strArr3 = AbstractC1574.f5469;
                builder.setTitle("修改经纬度");
                LinearLayout linearLayout = new LinearLayout(builder.getContext());
                linearLayout.setGravity(17);
                linearLayout.setOrientation(0);
                EditText editText = new EditText(linearLayout.getContext());
                editText.setInputType(12290);
                editText.setText(String.valueOf(C1842.f6135.m2537()));
                editText.addTextChangedListener(new C1844(editText, 0));
                linearLayout.addView(editText);
                EditText editText2 = new EditText(linearLayout.getContext());
                editText2.setInputType(12290);
                editText2.setText(String.valueOf(C1843.f6136.m2537()));
                editText2.addTextChangedListener(new C1844(editText2, 1));
                linearLayout.addView(editText2);
                builder.setView(linearLayout);
                builder.setPositiveButton("确定", (DialogInterface.OnClickListener) null);
                builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                builder.show();
                return unit;
            case 3:
                C1333 c1335 = (C1333) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1335.m3053("com.tencent.mm.plugin.location.ui.impl");
                C1981 c1981 = new C1981(4);
                c1981.m3827("MicroMsg.MMPoiMapUI", "invalid lat lng");
                c1335.f4794 = c1981;
                return unit;
            case 4:
                C1333 c1336 = (C1333) obj;
                C1981 c1981M47311 = AbstractC2784.m4739(c1336);
                String[] strArr5 = AbstractC1574.f5469;
                c1981M47311.m3826("onLocationChanged");
                c1981M47311.m3827("MicroMsg.SLocationListenerWgs84");
                c1336.f4794 = c1981M47311;
                return unit;
            case 5:
                ((C1563) obj).setReturn(Double.valueOf(C1843.f6136.m2537()));
                return unit;
            case 6:
                View view = (View) obj;
                String[] strArr6 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676(view, R.layout.module_dialog_location, null, false);
                int i9 = R.id.moduleDialogBtnLocationSelect;
                MaterialButton materialButton = (MaterialButton) AbstractC3681.m5325(viewM4676, R.id.moduleDialogBtnLocationSelect);
                if (materialButton != null) {
                    i9 = R.id.moduleDialogEdtLocationLatitude;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtLocationLatitude);
                    if (textInputEditText != null) {
                        i9 = R.id.moduleDialogEdtLocationLongitude;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC3681.m5325(viewM4676, R.id.moduleDialogEdtLocationLongitude);
                        if (textInputEditText2 != null) {
                            i9 = R.id.moduleDialogInputLocationLatitude;
                            if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputLocationLatitude)) != null) {
                                i9 = R.id.moduleDialogInputLocationLongitude;
                                if (((TextInputLayout) AbstractC3681.m5325(viewM4676, R.id.moduleDialogInputLocationLongitude)) != null) {
                                    C1846.f6142 = new C2022((LinearLayout) viewM4676, materialButton, textInputEditText, textInputEditText2);
                                    materialButton.setOnClickListener(new ViewOnClickListenerC1836(view, 0));
                                    C2022 c2023 = C1846.f6142;
                                    if (c2023 == null) {
                                        "binding";
                                        c2023 = null;
                                    }
                                    c2023.f6775.setText(String.valueOf(C1842.f6135.m2537()));
                                    C2022 c2024 = C1846.f6142;
                                    if (c2024 == null) {
                                        "binding";
                                        c2024 = null;
                                    }
                                    c2024.f6776.setText(String.valueOf(C1843.f6136.m2537()));
                                    C2007 c2007 = new C2007();
                                    
                                    c2007.f6678 = C1846.f6145;
                                    C2022 c2025 = C1846.f6142;
                                    if (c2025 == null) {
                                        "binding";
                                        c2025 = null;
                                    }
                                    c2007.f6680 = c2025.f6774;
                                    c2007.m3870("保存", new C1354(20));
                                    c2007.m3869("重置", new C1354(21));
                                    C2007.m3866(c2007, null, 3);
                                    c2007.m3868().m3791();
                                    return unit;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i9)));
            case 7:
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
                int iIntValue = ((Number) c2586).intValue();
                try {
                    c2587 = c1564.m3267()[1];
                    if (c2587 == null) {
                        c2587 = null;
                    }
                } catch (Throwable th3) {
                    c2587 = new C2585(th3);
                }
                if (c2587 instanceof C2585) {
                    c2587 = null;
                }
                int iIntValue2 = ((Number) c2587).intValue();
                if (iIntValue == 6 && iIntValue2 == -1) {
                    try {
                        c2588 = c1564.m3267()[2];
                        if (c2588 == null) {
                            c2588 = null;
                        }
                    } catch (Throwable th4) {
                        c2588 = new C2585(th4);
                    }
                    if (c2588 instanceof C2585) {
                        c2588 = null;
                    }
                    String[] strArr7 = AbstractC1574.f5469;
                    Parcelable parcelableExtra = ((Intent) c2588).getParcelableExtra("KLocationIntent");
                    int i10 = 0;
                    MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(parcelableExtra).m3492();
                    c1973M3492.returnType = AbstractC2519.classToKClass(String.class);
                    String str = (String) ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).invoke(new Object[0]);
                    C1904 c1904M4123 = AbstractC2209.m4123(Pattern.compile("lat ([-+]?[0-9]*\\.?[0-9]+);lng ([-+]?[0-9]*\\.?[0-9]+);").matcher(str), 0, str);
                    if (c1904M4123 == null || ((AbstractC0063) c1904M4123.m3699()).mo943() != 3) {
                        C2022 c2026 = C1846.f6142;
                        if (c2026 == null) {
                            "binding";
                            c2026 = null;
                        }
                        c2026.f6775.setText("31.135633");
                        C2022 c2027 = C1846.f6142;
                        if (c2027 == null) {
                            "binding";
                        } else {
                            c2022 = c2027;
                        }
                        c2022.f6776.setText("121.66625");
                    } else {
                        C2022 c2028 = C1846.f6142;
                        if (c2028 == null) {
                            "binding";
                            c2028 = null;
                        }
                        TextInputEditText textInputEditText3 = c2028.f6775;
                        Float fM4851 = AbstractC2847.m4851((String) ((C1903) c1904M4123.m3699()).get(1));
                        textInputEditText3.setText(String.valueOf(fM4851 != null ? fM4851.floatValue() : 31.135633f));
                        C2022 c2029 = C1846.f6142;
                        if (c2029 == null) {
                            "binding";
                        } else {
                            c2022 = c2029;
                        }
                        TextInputEditText textInputEditText4 = c2022.f6776;
                        Float fM4852 = AbstractC2847.m4851((String) ((C1903) c1904M4123.m3699()).get(2));
                        textInputEditText4.setText(String.valueOf(fM4852 != null ? fM4852.floatValue() : 121.66625f));
                    }
                }
                return unit;
            case 8:
                C1846 c1846 = C1846.f6140;
                C3689 c3689M4172 = C2309.createHook(c1846, Collections.singletonList((Method) obj));
                c1846.hookBefore(c3689M4172, new C0055(5, c3689M4172));
                c3689M4172.applyHook();
                return unit;
            case 9:
                C1846 c1847 = C1846.f6140;
                C3689 c3689M4173 = C2309.createHook(c1847, Collections.singletonList((Method) obj));
                c1847.hookBefore(c3689M4173, new C1837(2));
                c3689M4173.applyHook();
                return unit;
            case 10:
                ((C1020) obj).thisMethodMatcher = new C1837(1);
                return unit;
            case 11:
                ((C1020) obj).thisMethodMatcher = new C1837(4);
                return unit;
            case 12 /* 12 */:
                ((C1020) obj).thisMethodMatcher = new C1837(0);
                return unit;
            case 13:
                ((C1020) obj).thisMethodMatcher = new C1837(3);
                return unit;
            case 14 /* 14 */:
                ((C1020) obj).thisMethodMatcher = new C1837(15);
                return unit;
            case 15:
                C1333 c1337 = (C1333) obj;
                String[] strArr8 = AbstractC1574.f5469;
                c1337.m3053("com.tencent.mm.plugin.luckymoney.model");
                C1981 c1982 = new C1981(4);
                c1982.m3827("MicroMsg.LuckyMoneyUtil", "exception:%s");
                c1337.f4794 = c1982;
                return unit;
            case 16:
                ((C1020) obj).declaringClassMatcher = new C1837(17);
                return unit;
            case 17 /* 17 */:
                ((C1332) obj).m3050(new C1837(18));
                return unit;
            case 18 /* 18 */:
                ((C0705) obj).m2127("MicroMsg.MMAlert");
                return unit;
            case 19:
                ((C1020) obj).declaringClassMatcher = new C1837(21);
                return unit;
            case 20:
                ((C1020) obj).thisMethodMatcher = new C1837(22);
                return unit;
            case 21 /* 21 */:
                ((C1332) obj).m3050(new C1837(23));
                return unit;
            case 22 /* 22 */:
                C1333 c1338 = (C1333) obj;
                C1981 c1981M47312 = AbstractC2784.m4739(c1338);
                
                c1981M47312.m3820(AbstractC1574.dexToClass(C1876.f6223));
                Class<Class> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Class.class));
                c1981M47312.paramTypes(clsM2183 != null ? clsM2183 : Class.class);
                c1338.f4794 = c1981M47312;
                return unit;
            case 23 /* 23 */:
                String[] strArr9 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.MMKernel", "Kernel not null, has initialized.");
                return unit;
            case 24 /* 24 */:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C1837(25);
                c1020.thisMethodMatcher = new C1837(26);
                return unit;
            case 25 /* 25 */:
                ((C1332) obj).m3050(new C1837(28));
                return unit;
            case 26:
                ((C1333) obj).m3052(new C1837(27));
                return unit;
            case 27:
                C1981 c1983 = (C1981) obj;
                Class clsM4369 = C2391.f7652.m4369();
                Class<Integer> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(Integer.class));
                c1983.paramTypes(clsM4369, clsM2184 != null ? clsM2184 : Integer.class);
                C1984 c1984 = new C1984(4);
                C1981 c1985 = new C1981(4);
                c1985.m3826("notifyDataSetChanged");
                c1984.m3848(c1985);
                c1983.f6564 = c1984;
                return unit;
            case 28:
                String[] strArr10 = AbstractC1574.f5469;
                ((C0705) obj).m2127("MicroMsg.MMPreferenceAdapter", "ignore notifyDataSetChanged(%s %s), had:%s");
                return unit;
            default:
                ((C1020) obj).thisMethodMatcher = new C1884(1);
                return unit;
        }
    }
}
