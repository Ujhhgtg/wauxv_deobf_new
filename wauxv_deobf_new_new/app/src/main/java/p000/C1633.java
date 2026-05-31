package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᛸᲈᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1633 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5527;

    public /* synthetic */ C1633(int i) {
        this.f5527 = i;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        Object c2642;
        Object c2643;
        Object c2644;
        int i = this.f5527;
        int i2 = 14;
        int i3 = 2;
        int i4 = 18;
        int i5 = 16;
        C2048 c2048 = null;
        int i6 = 17;
        boolean z = true;
        int i7 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                C1334 c1334 = (C1334) obj;
                String[] strArr = AbstractC1471.f5234;
                c1334.m3154("com.tencent.mm.pluginsdk.model");
                C0700 c0700 = new C0700();
                c0700.m2220("MicroMsg.GetVideoMetadata", "get video file name, dataString ");
                c1334.f4791 = c0700;
                return c3554;
            case 1:
                ((C1335) obj).m3155(new C1633(i3));
                return c3554;
            case 2:
                C2012 c2012 = (C2012) obj;
                Class clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Context.class));
                Class cls = clsM4232 == null ? Context.class : clsM4232;
                Class clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(List.class));
                Class cls2 = clsM4233 == null ? List.class : clsM4233;
                Class clsM4234 = AbstractC2236.m4232(AbstractC2574.m4549(Intent.class));
                Class cls3 = clsM4234 == null ? Intent.class : clsM4234;
                Class clsM4235 = AbstractC2236.m4232(AbstractC2574.m4549(String.class));
                Class cls4 = clsM4235 == null ? String.class : clsM4235;
                Class clsM4236 = AbstractC2236.m4232(AbstractC2574.m4549(Integer.class));
                Class cls5 = clsM4236 == null ? Integer.class : clsM4236;
                Class clsM4237 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                c2012.m4017(cls, cls2, cls3, cls4, cls5, null, clsM4237 == null ? Boolean.class : clsM4237);
                return c3554;
            case 3:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 4:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 5:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 7:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 8:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 9:
                C0703 c0703 = (C0703) obj;
                C0703.m2222(c0703, "JsonPrimitive", new C1741(new C1356(14)));
                C0703.m2222(c0703, "JsonNull", new C1741(new C1356(15)));
                C0703.m2222(c0703, "JsonLiteral", new C1741(new C1356(16)));
                C0703.m2222(c0703, "JsonObject", new C1741(new C1356(17)));
                C0703.m2222(c0703, "JsonArray", new C1741(new C1356(18)));
                return c3554;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                AbstractC1736 abstractC1736 = (AbstractC1736) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC2898.m4857(sb, str);
                sb.append(':');
                sb.append(abstractC1736);
                return sb.toString();
            case 11:
                ((C1023) obj).f3740 = new C1633(i2);
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                ((C1023) obj).f3740 = new C1633(13);
                return c3554;
            case 13:
                C1335 c1335 = (C1335) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2013 = new C2012();
                c2013.m4021("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                c1335.f4794 = c2013;
                return c3554;
            case Opcodes.DCONST_0 /* 14 */:
                C1335 c1336 = (C1335) obj;
                String[] strArr3 = AbstractC1471.f5234;
                c1336.m3156("com.tencent.mm.plugin.sns.model");
                C2012 c2014 = new C2012();
                c2014.m4021("getSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                c1336.f4794 = c2014;
                return c3554;
            case 15:
                ((C1574) obj).m3452(Double.valueOf(C1868.f6209.m2661()));
                return c3554;
            case 16:
                C1335 c1337 = (C1335) obj;
                C2012 c2012M4773 = AbstractC2844.m4773(c1337);
                String[] strArr4 = AbstractC1471.f5234;
                c2012M4773.m4020("onLocationChanged");
                c2012M4773.m4021("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s");
                c1337.f4794 = c2012M4773;
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1335 c1338 = (C1335) obj;
                C2012 c2012M4774 = AbstractC2844.m4773(c1338);
                String[] strArr5 = AbstractC1471.f5234;
                c2012M4774.m4020("onLocationChanged");
                c2012M4774.m4021("MicroMsg.SLocationListener");
                c1338.f4794 = c2012M4774;
                return c3554;
            case Opcodes.LDC /* 18 */:
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
                AlertDialog.Builder builder = new AlertDialog.Builder(((View) c2641).getContext());
                String[] strArr6 = AbstractC1471.f5234;
                builder.setTitle("修改经纬度");
                LinearLayout linearLayout = new LinearLayout(builder.getContext());
                linearLayout.setGravity(17);
                linearLayout.setOrientation(0);
                EditText editText = new EditText(linearLayout.getContext());
                editText.setInputType(12290);
                editText.setText(String.valueOf(C1868.f6209.m2661()));
                editText.addTextChangedListener(new C1870(editText, 0));
                linearLayout.addView(editText);
                EditText editText2 = new EditText(linearLayout.getContext());
                editText2.setInputType(12290);
                editText2.setText(String.valueOf(C1869.f6210.m2661()));
                editText2.addTextChangedListener(new C1870(editText2, 1));
                linearLayout.addView(editText2);
                builder.setView(linearLayout);
                builder.setPositiveButton("确定", (DialogInterface.OnClickListener) null);
                builder.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                builder.show();
                return c3554;
            case 19:
                C1335 c1339 = (C1335) obj;
                String[] strArr7 = AbstractC1471.f5234;
                c1339.m3156("com.tencent.mm.plugin.location.ui.impl");
                C2012 c2015 = new C2012();
                c2015.m4021("MicroMsg.MMPoiMapUI", "invalid lat lng");
                c1339.f4794 = c2015;
                return c3554;
            case 20:
                C1335 c13310 = (C1335) obj;
                C2012 c2012M4775 = AbstractC2844.m4773(c13310);
                String[] strArr8 = AbstractC1471.f5234;
                c2012M4775.m4020("onLocationChanged");
                c2012M4775.m4021("MicroMsg.SLocationListenerWgs84");
                c13310.f4794 = c2012M4775;
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                ((C1574) obj).m3452(Double.valueOf(C1869.f6210.m2661()));
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                View view = (View) obj;
                String[] strArr9 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622(view, R.layout.module_dialog_location, null, false);
                int i8 = R.id.moduleDialogBtnLocationSelect;
                MaterialButton materialButton = (MaterialButton) AbstractC1272.m3098(viewM4622, R.id.moduleDialogBtnLocationSelect);
                if (materialButton != null) {
                    i8 = R.id.moduleDialogEdtLocationLatitude;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtLocationLatitude);
                    if (textInputEditText != null) {
                        i8 = R.id.moduleDialogEdtLocationLongitude;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1272.m3098(viewM4622, R.id.moduleDialogEdtLocationLongitude);
                        if (textInputEditText2 != null) {
                            i8 = R.id.moduleDialogInputLocationLatitude;
                            if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputLocationLatitude)) != null) {
                                i8 = R.id.moduleDialogInputLocationLongitude;
                                if (((TextInputLayout) AbstractC1272.m3098(viewM4622, R.id.moduleDialogInputLocationLongitude)) != null) {
                                    C1872.f6216 = new C2048((LinearLayout) viewM4622, materialButton, textInputEditText, textInputEditText2);
                                    materialButton.setOnClickListener(new ViewOnClickListenerC1863(view, i7));
                                    C2048 c2049 = C1872.f6216;
                                    if (c2049 == null) {
                                        "binding";
                                        c2049 = null;
                                    }
                                    c2049.f6858.setText(String.valueOf(C1868.f6209.m2661()));
                                    C2048 c20410 = C1872.f6216;
                                    if (c20410 == null) {
                                        "binding";
                                        c20410 = null;
                                    }
                                    c20410.f6859.setText(String.valueOf(C1869.f6210.m2661()));
                                    C2037 c2037 = new C2037();
                                    C1872.f6214.getClass();
                                    c2037.f6779 = C1872.f6219;
                                    C2048 c20411 = C1872.f6216;
                                    if (c20411 == null) {
                                        "binding";
                                        c20411 = null;
                                    }
                                    c2037.f6781 = c20411.f6857;
                                    c2037.m4057("保存", new C1356(21));
                                    c2037.m4056("重置", new C1356(22));
                                    C2037.m4053(c2037, null, 3);
                                    c2037.m4055().m3985();
                                    return c3554;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i8)));
            case Opcodes.FLOAD /* 23 */:
                C1574 c1575 = (C1574) obj;
                c1575.getClass();
                try {
                    c2642 = c1575.m3447()[0];
                    if (c2642 == null) {
                        c2642 = null;
                    }
                } catch (Throwable th2) {
                    c2642 = new C2641(th2);
                }
                if (c2642 instanceof C2641) {
                    c2642 = null;
                }
                int iIntValue = ((Number) c2642).intValue();
                try {
                    c2643 = c1575.m3447()[1];
                    if (c2643 == null) {
                        c2643 = null;
                    }
                } catch (Throwable th3) {
                    c2643 = new C2641(th3);
                }
                if (c2643 instanceof C2641) {
                    c2643 = null;
                }
                int iIntValue2 = ((Number) c2643).intValue();
                if (iIntValue == 6 && iIntValue2 == -1) {
                    try {
                        c2644 = c1575.m3447()[2];
                        if (c2644 == null) {
                            c2644 = null;
                        }
                    } catch (Throwable th4) {
                        c2644 = new C2641(th4);
                    }
                    if (c2644 instanceof C2641) {
                        c2644 = null;
                    }
                    String[] strArr10 = AbstractC1471.f5234;
                    Parcelable parcelableExtra = ((Intent) c2644).getParcelableExtra("KLocationIntent");
                    int i9 = AbstractC1768.f5906;
                    C2004 c2004M3560 = AbstractC2727.m4713(parcelableExtra).m3560();
                    c2004M3560.f6648 = AbstractC2574.m4549(String.class);
                    String str2 = (String) ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4026(new Object[0]);
                    C1931 c1931M3093 = AbstractC1272.m3093(Pattern.compile("lat ([-+]?[0-9]*\\.?[0-9]+);lng ([-+]?[0-9]*\\.?[0-9]+);").matcher(str2), 0, str2);
                    if (c1931M3093 == null || ((AbstractC0070) c1931M3093.m3883()).mo1087() != 3) {
                        C2048 c20412 = C1872.f6216;
                        if (c20412 == null) {
                            "binding";
                            c20412 = null;
                        }
                        c20412.f6858.setText("31.135633");
                        C2048 c20413 = C1872.f6216;
                        if (c20413 == null) {
                            "binding";
                        } else {
                            c2048 = c20413;
                        }
                        c2048.f6859.setText("121.66625");
                    } else {
                        C2048 c20414 = C1872.f6216;
                        if (c20414 == null) {
                            "binding";
                            c20414 = null;
                        }
                        TextInputEditText textInputEditText3 = c20414.f6858;
                        Float fM4912 = AbstractC2907.m4912((String) ((C1930) c1931M3093.m3883()).get(1));
                        textInputEditText3.setText(String.valueOf(fM4912 != null ? fM4912.floatValue() : 31.135633f));
                        C2048 c20415 = C1872.f6216;
                        if (c20415 == null) {
                            "binding";
                        } else {
                            c2048 = c20415;
                        }
                        TextInputEditText textInputEditText4 = c2048.f6859;
                        Float fM4913 = AbstractC2907.m4912((String) ((C1930) c1931M3093.m3883()).get(2));
                        textInputEditText4.setText(String.valueOf(fM4913 != null ? fM4913.floatValue() : 121.66625f));
                    }
                }
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                C1872 c1872 = C1872.f6214;
                C3752 c3752M4301 = C2342.m4301(c1872, Collections.singletonList((Method) obj));
                c1872.m3444(c3752M4301, new C0062(c3752M4301, 7));
                c3752M4301.m5360();
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C1872 c1873 = C1872.f6214;
                C3752 c3752M4302 = C2342.m4301(c1873, Collections.singletonList((Method) obj));
                c1873.m3444(c3752M4302, new C1633(i4));
                c3752M4302.m5360();
                return c3554;
            case 26:
                ((C1023) obj).f3740 = new C1633(i6);
                return c3554;
            case 27:
                ((C1023) obj).f3740 = new C1633(20);
                return c3554;
            case 28:
                ((C1023) obj).f3740 = new C1633(i5);
                return c3554;
            default:
                ((C1023) obj).f3740 = new C1633(19);
                return c3554;
        }
    }
}
