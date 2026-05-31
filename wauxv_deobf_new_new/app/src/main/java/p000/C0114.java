package p000;

import android.content.Context;
import android.content.Intent;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0114 implements InterfaceC1422 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1123;

    public /* synthetic */ C0114(Object obj, int i) {
        this.f1122 = i;
        this.f1123 = obj;
    }

    @Override // p000.InterfaceC1422
    public final Object invoke() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        switch (this.f1122) {
            case 0:
                C2040 c2040 = (C2040) this.f1123;
                C0120 c0120 = C0120.f1129;
                Integer numM4914 = AbstractC2908.m4914(String.valueOf(c2040.f6802.getText()));
                c0120.m2669(numM4914 != null ? numM4914.intValue() : 40);
                C0119 c0119 = C0119.f1128;
                Integer numM4915 = AbstractC2908.m4914(String.valueOf(c2040.f6801.getText()));
                c0119.m2669(numM4915 != null ? numM4915.intValue() : 80);
                C0118 c0118 = C0118.f1127;
                Float fM4912 = AbstractC2907.m4912(String.valueOf(c2040.f6800.getText()));
                c0118.m2668(fM4912 != null ? fM4912.floatValue() : 0.5f);
                C0124.f1133.m2667(c2040.f6796.isChecked());
                C0125 c0125 = C0125.f1134;
                Integer numM4916 = AbstractC2908.m4914(String.valueOf(c2040.f6806.getText()));
                c0125.m2669(numM4916 != null ? numM4916.intValue() : 4);
                C0123.f1132.m2672(String.valueOf(c2040.f6805.getText()));
                C0116.f1125.m2667(c2040.f6795.isChecked());
                C0117 c0117 = C0117.f1126;
                Integer numM4917 = AbstractC2908.m4914(String.valueOf(c2040.f6799.getText()));
                c0117.m2669(numM4917 != null ? numM4917.intValue() : 4);
                C0115.f1124.m2672(String.valueOf(c2040.f6798.getText()));
                C0127.f1136.m2667(c2040.f6797.isChecked());
                C0128 c0128 = C0128.f1137;
                Integer numM4918 = AbstractC2908.m4914(String.valueOf(c2040.f6808.getText()));
                c0128.m2669(numM4918 != null ? numM4918.intValue() : 4);
                C0126.f1135.m2672(String.valueOf(c2040.f6807.getText()));
                C0122.f1131.m2672(String.valueOf(c2040.f6804.getText()));
                C0121.f1130.m2672(String.valueOf(c2040.f6803.getText()));
                return C3554.UNIT;
            case 1:
                Context context = ((RelativeLayout) this.f1123).getContext();
                Intent intent = new Intent();
                intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI");
                context.startActivity(intent);
                return C3554.UNIT;
            case 2:
                C0209.f1349.m2672(String.valueOf(((C2041) this.f1123).f6811.getText()));
                return C3554.UNIT;
            case 3:
                return new C0067((Object[]) this.f1123, 1);
            case 4:
                C2042 c2042 = (C2042) this.f1123;
                C0320.f1609.m2667(c2042.f6815.isChecked());
                C0321.f1610.m2667(c2042.f6816.isChecked());
                C0319.f1608.m2667(c2042.f6814.isChecked());
                return C3554.UNIT;
            case 5:
                C2044 c2044 = (C2044) this.f1123;
                C0430.f2002.m2672(String.valueOf(c2044.f6826.getText()));
                C0431.f2003.m2672(String.valueOf(c2044.f6827.getText()));
                C0432.f2004.m2672(String.valueOf(c2044.f6828.getText()));
                C0435.f2007.m2672(String.valueOf(c2044.f6829.getText()));
                C0436.f2008.m2667(((MaterialCheckBox) c2044.f6832).isChecked());
                C0437.f2009.m2667(((MaterialCheckBox) c2044.f6833).isChecked());
                C0434.f2006.m2667(((MaterialCheckBox) c2044.f6831).isChecked());
                C0433.f2005.m2667(((MaterialCheckBox) c2044.f6830).isChecked());
                return C3554.UNIT;
            case 6:
                C2043 c2043 = (C2043) this.f1123;
                C0443.f2031.m2672(String.valueOf(c2043.f6819.getText()));
                C0447.f2035.m2672(String.valueOf(c2043.f6823.getText()));
                C0445.f2033.m2672(String.valueOf(c2043.f6821.getText()));
                C0442.f2030.m2672(String.valueOf(c2043.f6818.getText()));
                C0446.f2034.m2672(String.valueOf(c2043.f6822.getText()));
                C0444.f2032.m2672(String.valueOf(c2043.f6820.getText()));
                return C3554.UNIT;
            case 7:
                ((C0590) this.f1123).invoke();
                return C3554.UNIT;
            case 8:
                C2044 c2045 = (C2044) this.f1123;
                C0612.f2452.m2672(String.valueOf(((TextInputEditText) c2045.f6833).getText()));
                C0605.f2445.m2672(String.valueOf(c2045.f6827.getText()));
                C0607.f2447.m2672(String.valueOf(c2045.f6829.getText()));
                C0609.f2449.m2672(String.valueOf(((TextInputEditText) c2045.f6831).getText()));
                C0611.f2451.m2672(String.valueOf(((TextInputEditText) c2045.f6832).getText()));
                C0604.f2444.m2672(String.valueOf(c2045.f6826.getText()));
                C0606.f2446.m2672(String.valueOf(c2045.f6828.getText()));
                C0608.f2448.m2672(String.valueOf(((TextInputEditText) c2045.f6830).getText()));
                C0615.f2456.getClass();
                C0615.m2139();
                return C3554.UNIT;
            case 9:
                ((C0310) this.f1123).invoke();
                return C3554.UNIT;
            case 10:
                C1693 c1693 = (C1693) this.f1123;
                C0621.f2469.m2672(String.valueOf(((TextInputEditText) c1693.f5698).getText()));
                C0620.f2468.m2667(((MaterialCheckBox) c1693.f5697).isChecked());
                return C3554.UNIT;
            case 11:
                C1691 c1691 = (C1691) this.f1123;
                int checkedRadioButtonId = ((RadioGroup) c1691.f5688).getCheckedRadioButtonId();
                if (checkedRadioButtonId == ((MaterialRadioButton) c1691.f5690).getId()) {
                    C0650.f2525.m2669(EnumC0645.f2512.f2516);
                } else if (checkedRadioButtonId == ((MaterialRadioButton) c1691.f5686).getId()) {
                    C0650.f2525.m2669(EnumC0645.f2513.f2516);
                } else if (checkedRadioButtonId == ((MaterialRadioButton) c1691.f5687).getId()) {
                    C0650.f2525.m2669(EnumC0645.f2514.f2516);
                }
                return C3554.UNIT;
            case Opcodes.FCONST_1 /* 12 */:
                return new C1022(((C0694) this.f1123).f2650);
            case 13:
                C2046 c2046 = (C2046) this.f1123;
                C0717.f2727.m2667(c2046.f6841.isChecked());
                C0716.f2726.m2667(c2046.f6840.isChecked());
                return C3554.UNIT;
            case Opcodes.DCONST_0 /* 14 */:
                C2047 c2047 = (C2047) this.f1123;
                int checkedRadioButtonId2 = c2047.f6855.getCheckedRadioButtonId();
                if (checkedRadioButtonId2 == c2047.f6854.getId()) {
                    C0921.f3418.m2669(EnumC0920.f3412.f3417);
                } else if (checkedRadioButtonId2 == c2047.f6853.getId()) {
                    C0921.f3418.m2669(EnumC0920.f3413.f3417);
                } else if (checkedRadioButtonId2 == c2047.f6852.getId()) {
                    C0921.f3418.m2669(EnumC0920.f3414.f3417);
                }
                C0925 c0925 = C0925.f3422;
                Float fM4913 = AbstractC2907.m4912(String.valueOf(c2047.f6846.getText()));
                c0925.m2668(fM4913 != null ? fM4913.floatValue() : 0.0f);
                C0928 c0928 = C0928.f3425;
                Float fM4914 = AbstractC2907.m4912(String.valueOf(c2047.f6849.getText()));
                c0928.m2668(fM4914 != null ? fM4914.floatValue() : 500.0f);
                C0922 c0922 = C0922.f3419;
                Float fM4915 = AbstractC2907.m4912(String.valueOf(c2047.f6843.getText()));
                c0922.m2668(fM4915 != null ? fM4915.floatValue() : 1000.0f);
                C0926 c0926 = C0926.f3423;
                Float fM4916 = AbstractC2907.m4912(String.valueOf(c2047.f6847.getText()));
                c0926.m2668(fM4916 != null ? fM4916.floatValue() : 1000.0f);
                C0929 c0929 = C0929.f3426;
                Float fM4917 = AbstractC2907.m4912(String.valueOf(c2047.f6850.getText()));
                c0929.m2668(fM4917 != null ? fM4917.floatValue() : 5000.0f);
                C0923 c0923 = C0923.f3420;
                Float fM4918 = AbstractC2907.m4912(String.valueOf(c2047.f6844.getText()));
                c0923.m2668(fM4918 != null ? fM4918.floatValue() : 10000.0f);
                C0927 c0927 = C0927.f3424;
                Float fM4919 = AbstractC2907.m4912(String.valueOf(c2047.f6848.getText()));
                c0927.m2668(fM4919 != null ? fM4919.floatValue() : 10000.0f);
                C0930 c0930 = C0930.f3427;
                Float fM49110 = AbstractC2907.m4912(String.valueOf(c2047.f6851.getText()));
                c0930.m2668(fM49110 != null ? fM49110.floatValue() : 50000.0f);
                C0924 c0924 = C0924.f3421;
                Float fM49111 = AbstractC2907.m4912(String.valueOf(c2047.f6845.getText()));
                c0924.m2668(fM49111 != null ? fM49111.floatValue() : 100000.0f);
                return C3554.UNIT;
            case 15:
                C2048 c2048 = (C2048) this.f1123;
                C0932 c0932 = C0932.f3433;
                Integer numM4919 = AbstractC2908.m4914(String.valueOf(c2048.f6858.getText()));
                c0932.m2669(numM4919 != null ? numM4919.intValue() : 5000);
                C0933 c0933 = C0933.f3434;
                Integer numM49110 = AbstractC2908.m4914(String.valueOf(c2048.f6859.getText()));
                c0933.m2669(numM49110 != null ? numM49110.intValue() : 1888);
                return C3554.UNIT;
            case 16:
                C2041 c2041 = (C2041) this.f1123;
                C0945 c0945 = C0945.f3466;
                Integer numM49111 = AbstractC2908.m4914(String.valueOf(c2041.f6811.getText()));
                c0945.m2669(numM49111 != null ? numM49111.intValue() : 360);
                return C3554.UNIT;
            case Opcodes.SIPUSH /* 17 */:
                C2041 c2049 = (C2041) this.f1123;
                C0948 c0948 = C0948.f3473;
                Integer numM49112 = AbstractC2908.m4914(String.valueOf(c2049.f6811.getText()));
                c0948.m2669(numM49112 != null ? numM49112.intValue() : 99);
                return C3554.UNIT;
            case Opcodes.LDC /* 18 */:
                return AbstractC2844.m4786(new StringBuilder(), "val.", (String) this.f1123);
            case 19:
                AbstractC1024 abstractC1024 = (AbstractC1024) this.f1123;
                StringBuilder sb = new StringBuilder();
                C1576.f5470.getClass();
                sb.append(C1576.m3461());
                sb.append('.');
                sb.append(abstractC1024.f3742);
                return sb.toString();
            case 20:
                C1028 c1028 = (C1028) this.f1123;
                return "(" + AbstractC0739.m2295(c1028.f3763, "", null, null, new C0943(14), 30) + ")" + AbstractC1031.m2728(c1028.f3764);
            case Opcodes.ILOAD /* 21 */:
                C2046 c20410 = (C2046) this.f1123;
                C1060.f3842.m2667(c20410.f6841.isChecked());
                C1059.f3841.m2667(c20410.f6840.isChecked());
                return C3554.UNIT;
            case Opcodes.LLOAD /* 22 */:
                C2049 c20411 = (C2049) this.f1123;
                C1365.f4881.m2672(String.valueOf(c20411.f6863.getText()));
                C1367.f4883.m2672(String.valueOf(c20411.f6865.getText()));
                C1364.f4880.m2672(String.valueOf(c20411.f6862.getText()));
                C1366.f4882.m2672(String.valueOf(c20411.f6864.getText()));
                return C3554.UNIT;
            case Opcodes.FLOAD /* 23 */:
                C1691 c1692 = (C1691) this.f1123;
                C1408.f5085.m2672(String.valueOf(((TextInputEditText) c1692.f5686).getText()));
                if (((MaterialRadioButton) c1692.f5687).isChecked()) {
                    C1407.f5084.m2669(EnumC1406.f5079.f5083);
                } else if (((MaterialRadioButton) c1692.f5690).isChecked()) {
                    C1407.f5084.m2669(EnumC1406.f5080.f5083);
                } else if (((MaterialRadioButton) c1692.f5688).isChecked()) {
                    C1407.f5084.m2669(EnumC1406.f5081.f5083);
                }
                return C3554.UNIT;
            case Opcodes.DLOAD /* 24 */:
                C2051 c2051 = (C2051) this.f1123;
                C1509.f5325.m2672(String.valueOf(c2051.f6879.getText()));
                C1510.f5326.m2672(String.valueOf(c2051.f6880.getText()));
                C1511.f5327.m2672(String.valueOf(c2051.f6881.getText()));
                C1500.f5316.m2672(String.valueOf(c2051.f6870.getText()));
                C1501.f5317.m2672(String.valueOf(c2051.f6871.getText()));
                C1502.f5318.m2672(String.valueOf(c2051.f6872.getText()));
                C1503.f5319.m2672(String.valueOf(c2051.f6873.getText()));
                C1504.f5320.m2672(String.valueOf(c2051.f6874.getText()));
                C1505.f5321.m2672(String.valueOf(c2051.f6875.getText()));
                C1506.f5322.m2672(String.valueOf(c2051.f6876.getText()));
                C1507.f5323.m2672(String.valueOf(c2051.f6877.getText()));
                C1508.f5324.m2672(String.valueOf(c2051.f6878.getText()));
                return C3554.UNIT;
            case Opcodes.ALOAD /* 25 */:
                C2048 c20412 = (C2048) this.f1123;
                C1523.f5363.m2672(String.valueOf(c20412.f6858.getText()));
                C1524.f5364.m2672(String.valueOf(c20412.f6859.getText()));
                return C3554.UNIT;
            case 26:
                C1548.f5408.m2671(AbstractC0739.m2308(AbstractC2901.m4876(String.valueOf(((C2041) this.f1123).f6811.getText()), new String[]{","})));
                return C3554.UNIT;
            case 27:
                C2046 c20413 = (C2046) this.f1123;
                C1554.f5426.m2667(c20413.f6840.isChecked());
                C1555.f5427.m2667(c20413.f6841.isChecked());
                return C3554.UNIT;
            case 28:
                return ((Context) this.f1123).getFilesDir().getAbsolutePath() + "/fastkv/";
            default:
                return new C1028(((C2005) this.f1123).f6651);
        }
    }
}
