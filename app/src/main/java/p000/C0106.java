package p000;

import android.content.Context;
import android.content.Intent;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲀᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0106 implements InterfaceC1414 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1054;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f1055;

    public /* synthetic */ C0106(int i, Object obj) {
        this.f1054 = i;
        this.f1055 = obj;
    }

    @Override // p000.InterfaceC1414
    public final Object invoke() {
        switch (this.f1054) {
            case 0:
                C2010 c2010 = (C2010) this.f1055;
                C0112 c0112 = C0112.f1061;
                Integer numM4853 = AbstractC2848.m4853(String.valueOf(c2010.f6700.getText()));
                c0112.m2545(numM4853 != null ? numM4853.intValue() : 40);
                C0111 c0111 = C0111.f1060;
                Integer numM4854 = AbstractC2848.m4853(String.valueOf(c2010.f6699.getText()));
                c0111.m2545(numM4854 != null ? numM4854.intValue() : 80);
                C0110 c0110 = C0110.f1059;
                Float fM4851 = AbstractC2847.m4851(String.valueOf(c2010.f6698.getText()));
                c0110.m2544(fM4851 != null ? fM4851.floatValue() : 0.5f);
                C0116.f1065.m2543(c2010.f6694.isChecked());
                C0117 c0117 = C0117.f1066;
                Integer numM4855 = AbstractC2848.m4853(String.valueOf(c2010.f6704.getText()));
                c0117.m2545(numM4855 != null ? numM4855.intValue() : 4);
                C0115.f1064.m2548(String.valueOf(c2010.f6703.getText()));
                C0108.f1057.m2543(c2010.f6693.isChecked());
                C0109 c0109 = C0109.f1058;
                Integer numM4856 = AbstractC2848.m4853(String.valueOf(c2010.f6697.getText()));
                c0109.m2545(numM4856 != null ? numM4856.intValue() : 4);
                C0107.f1056.m2548(String.valueOf(c2010.f6696.getText()));
                C0119.f1068.m2543(c2010.f6695.isChecked());
                C0120 c0120 = C0120.f1069;
                Integer numM4857 = AbstractC2848.m4853(String.valueOf(c2010.f6706.getText()));
                c0120.m2545(numM4857 != null ? numM4857.intValue() : 4);
                C0118.f1067.m2548(String.valueOf(c2010.f6705.getText()));
                C0114.f1063.m2548(String.valueOf(c2010.f6702.getText()));
                C0113.f1062.m2548(String.valueOf(c2010.f6701.getText()));
                return C3497.f10997;
            case 1:
                Context context = ((RelativeLayout) this.f1055).getContext();
                Intent intent = new Intent();
                intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI");
                context.startActivity(intent);
                return C3497.f10997;
            case 2:
                C0201.f1281.m2548(String.valueOf(((C2012) this.f1055).f6709.getText()));
                return C3497.f10997;
            case 3:
                return new C0060(1, (Object[]) this.f1055);
            case 4:
                C2013 c2013 = (C2013) this.f1055;
                C0308.f1533.m2543(c2013.f6711.isChecked());
                C0309.f1534.m2543(c2013.f6712.isChecked());
                C0307.f1532.m2543(c2013.f6710.isChecked());
                return C3497.f10997;
            case 5:
                C2014 c2014 = (C2014) this.f1055;
                C0455.f2030.m2548(String.valueOf(((TextInputEditText) c2014.f6718).getText()));
                C0456.f2031.m2548(String.valueOf(((TextInputEditText) c2014.f6719).getText()));
                C0457.f2032.m2548(String.valueOf(((TextInputEditText) c2014.f6720).getText()));
                C0460.f2035.m2548(String.valueOf(((TextInputEditText) c2014.f6721).getText()));
                C0461.f2036.m2543(((MaterialCheckBox) c2014.f6716).isChecked());
                C0462.f2037.m2543(((MaterialCheckBox) c2014.f6717).isChecked());
                C0459.f2034.m2543(((MaterialCheckBox) c2014.f6715).isChecked());
                C0458.f2033.m2543(((MaterialCheckBox) c2014.f6714).isChecked());
                return C3497.f10997;
            case 6:
                C0215 c0215 = (C0215) this.f1055;
                C0468.f2059.m2548(String.valueOf(((TextInputEditText) c0215.f1331).getText()));
                C0472.f2063.m2548(String.valueOf(((TextInputEditText) c0215.f1335).getText()));
                C0470.f2061.m2548(String.valueOf(((TextInputEditText) c0215.f1333).getText()));
                C0467.f2058.m2548(String.valueOf(((TextInputEditText) c0215.f1330).getText()));
                C0471.f2062.m2548(String.valueOf(((TextInputEditText) c0215.f1334).getText()));
                C0469.f2060.m2548(String.valueOf(((TextInputEditText) c0215.f1332).getText()));
                return C3497.f10997;
            case 7:
                ((C0299) this.f1055).invoke();
                return C3497.f10997;
            case 8:
                C2015 c2015 = (C2015) this.f1055;
                C0620.f2449.m2548(String.valueOf(c2015.f6729.getText()));
                C0613.f2442.m2548(String.valueOf(c2015.f6723.getText()));
                C0615.f2444.m2548(String.valueOf(c2015.f6725.getText()));
                C0617.f2446.m2548(String.valueOf(c2015.f6727.getText()));
                C0619.f2448.m2548(String.valueOf(c2015.f6728.getText()));
                C0612.f2441.m2548(String.valueOf(c2015.f6722.getText()));
                C0614.f2443.m2548(String.valueOf(c2015.f6724.getText()));
                C0616.f2445.m2548(String.valueOf(c2015.f6726.getText()));
                return C3497.f10997;
            case 9:
                C2103 c2103 = (C2103) this.f1055;
                C0628.f2463.m2548(String.valueOf(((TextInputEditText) c2103.f6937).getText()));
                C0627.f2462.m2543(((MaterialCheckBox) c2103.f6936).isChecked());
                return C3497.f10997;
            case 10:
                C2103 c2104 = (C2103) this.f1055;
                int checkedRadioButtonId = ((RadioGroup) c2104.f6938).getCheckedRadioButtonId();
                if (checkedRadioButtonId == ((MaterialRadioButton) c2104.f6936).getId()) {
                    C0659.f2523.m2545(EnumC0654.f2510.f2514);
                } else if (checkedRadioButtonId == ((MaterialRadioButton) c2104.f6935).getId()) {
                    C0659.f2523.m2545(EnumC0654.f2511.f2514);
                } else if (checkedRadioButtonId == ((MaterialRadioButton) c2104.f6937).getId()) {
                    C0659.f2523.m2545(EnumC0654.f2512.f2514);
                }
                return C3497.f10997;
            case 11:
                return new C1019(((C0698) this.f1055).f2649);
            case Opcodes.FCONST_1 /* 12 */:
                C2016 c2016 = (C2016) this.f1055;
                C0722.f2733.m2543(c2016.f6731.isChecked());
                C0721.f2732.m2543(c2016.f6730.isChecked());
                return C3497.f10997;
            case 13:
                C2017 c2017 = (C2017) this.f1055;
                int checkedRadioButtonId2 = c2017.f6744.getCheckedRadioButtonId();
                if (checkedRadioButtonId2 == c2017.f6743.getId()) {
                    C0922.f3411.m2545(EnumC0921.f3405.f3410);
                } else if (checkedRadioButtonId2 == c2017.f6742.getId()) {
                    C0922.f3411.m2545(EnumC0921.f3406.f3410);
                } else if (checkedRadioButtonId2 == c2017.f6741.getId()) {
                    C0922.f3411.m2545(EnumC0921.f3407.f3410);
                }
                C0926 c0926 = C0926.f3415;
                Float fM4852 = AbstractC2847.m4851(String.valueOf(c2017.f6735.getText()));
                c0926.m2544(fM4852 != null ? fM4852.floatValue() : 0.0f);
                C0929 c0929 = C0929.f3418;
                Float fM4853 = AbstractC2847.m4851(String.valueOf(c2017.f6738.getText()));
                c0929.m2544(fM4853 != null ? fM4853.floatValue() : 500.0f);
                C0923 c0923 = C0923.f3412;
                Float fM4854 = AbstractC2847.m4851(String.valueOf(c2017.f6732.getText()));
                c0923.m2544(fM4854 != null ? fM4854.floatValue() : 1000.0f);
                C0927 c0927 = C0927.f3416;
                Float fM4855 = AbstractC2847.m4851(String.valueOf(c2017.f6736.getText()));
                c0927.m2544(fM4855 != null ? fM4855.floatValue() : 1000.0f);
                C0930 c0930 = C0930.f3419;
                Float fM4856 = AbstractC2847.m4851(String.valueOf(c2017.f6739.getText()));
                c0930.m2544(fM4856 != null ? fM4856.floatValue() : 5000.0f);
                C0924 c0924 = C0924.f3413;
                Float fM4857 = AbstractC2847.m4851(String.valueOf(c2017.f6733.getText()));
                c0924.m2544(fM4857 != null ? fM4857.floatValue() : 10000.0f);
                C0928 c0928 = C0928.f3417;
                Float fM4858 = AbstractC2847.m4851(String.valueOf(c2017.f6737.getText()));
                c0928.m2544(fM4858 != null ? fM4858.floatValue() : 10000.0f);
                C0931 c0931 = C0931.f3420;
                Float fM4859 = AbstractC2847.m4851(String.valueOf(c2017.f6740.getText()));
                c0931.m2544(fM4859 != null ? fM4859.floatValue() : 50000.0f);
                C0925 c0925 = C0925.f3414;
                Float fM48510 = AbstractC2847.m4851(String.valueOf(c2017.f6734.getText()));
                c0925.m2544(fM48510 != null ? fM48510.floatValue() : 100000.0f);
                return C3497.f10997;
            case Opcodes.DCONST_0 /* 14 */:
                C2018 c2018 = (C2018) this.f1055;
                C0933 c0933 = C0933.f3426;
                Integer numM4858 = AbstractC2848.m4853(String.valueOf(c2018.f6745.getText()));
                c0933.m2545(numM4858 != null ? numM4858.intValue() : 5000);
                C0934 c0934 = C0934.f3427;
                Integer numM4859 = AbstractC2848.m4853(String.valueOf(c2018.f6746.getText()));
                c0934.m2545(numM4859 != null ? numM4859.intValue() : 1888);
                return C3497.f10997;
            case 15:
                C2012 c2012 = (C2012) this.f1055;
                C0945 c0945 = C0945.f3458;
                Integer numM48510 = AbstractC2848.m4853(String.valueOf(c2012.f6709.getText()));
                c0945.m2545(numM48510 != null ? numM48510.intValue() : 99);
                return C3497.f10997;
            case 16:
                return AbstractC2784.m4752(new StringBuilder(), "val.", (String) this.f1055);
            case Opcodes.SIPUSH /* 17 */:
                AbstractC1021 abstractC1021 = (AbstractC1021) this.f1055;
                StringBuilder sb = new StringBuilder();
                C1565.f5440.getClass();
                sb.append(C1565.m3281());
                sb.append('.');
                sb.append(abstractC1021.f3735);
                return sb.toString();
            case Opcodes.LDC /* 18 */:
                C1025 c1025 = (C1025) this.f1055;
                return "(" + AbstractC0744.m2196(c1025.f3756, "", null, null, new C0853(27), 30) + ")" + AbstractC1028.m2604(c1025.f3757);
            case 19:
                C2016 c2019 = (C2016) this.f1055;
                C1057.f3835.m2543(c2019.f6731.isChecked());
                C1056.f3834.m2543(c2019.f6730.isChecked());
                return C3497.f10997;
            case 20:
                C2019 c20110 = (C2019) this.f1055;
                int checkedRadioButtonId3 = c20110.f6757.getCheckedRadioButtonId();
                if (checkedRadioButtonId3 == c20110.f6753.getId()) {
                    C1159.f4282.m2545(EnumC1157.f4274.f4279);
                } else if (checkedRadioButtonId3 == c20110.f6754.getId()) {
                    C1159.f4282.m2545(EnumC1157.f4275.f4279);
                } else if (checkedRadioButtonId3 == c20110.f6755.getId()) {
                    C1159.f4282.m2545(EnumC1157.f4276.f4279);
                }
                int checkedRadioButtonId4 = c20110.f6756.getCheckedRadioButtonId();
                if (checkedRadioButtonId4 == c20110.f6747.getId()) {
                    C1158.f4281.m2545(EnumC1154.f4262.f4270);
                } else if (checkedRadioButtonId4 == c20110.f6748.getId()) {
                    C1158.f4281.m2545(EnumC1154.f4263.f4270);
                } else if (checkedRadioButtonId4 == c20110.f6749.getId()) {
                    C1158.f4281.m2545(EnumC1154.f4264.f4270);
                } else if (checkedRadioButtonId4 == c20110.f6750.getId()) {
                    C1158.f4281.m2545(EnumC1154.f4265.f4270);
                } else if (checkedRadioButtonId4 == c20110.f6751.getId()) {
                    C1158.f4281.m2545(EnumC1154.f4266.f4270);
                } else if (checkedRadioButtonId4 == c20110.f6752.getId()) {
                    C1158.f4281.m2545(EnumC1154.f4267.f4270);
                }
                return C3497.f10997;
            case Opcodes.ILOAD /* 21 */:
                C2020 c2020 = (C2020) this.f1055;
                C1359.f4859.m2548(String.valueOf(c2020.f6759.getText()));
                C1361.f4861.m2548(String.valueOf(c2020.f6761.getText()));
                C1358.f4858.m2548(String.valueOf(c2020.f6758.getText()));
                C1360.f4860.m2548(String.valueOf(c2020.f6760.getText()));
                return C3497.f10997;
            case Opcodes.LLOAD /* 22 */:
                C2103 c2105 = (C2103) this.f1055;
                C1400.f5056.m2548(String.valueOf(((TextInputEditText) c2105.f6935).getText()));
                if (((MaterialRadioButton) c2105.f6937).isChecked()) {
                    C1399.f5055.m2545(EnumC1398.f5050.f5054);
                } else if (((MaterialRadioButton) c2105.f6936).isChecked()) {
                    C1399.f5055.m2545(EnumC1398.f5051.f5054);
                } else if (((MaterialRadioButton) c2105.f6938).isChecked()) {
                    C1399.f5055.m2545(EnumC1398.f5052.f5054);
                }
                return C3497.f10997;
            case Opcodes.FLOAD /* 23 */:
                C2021 c2021 = (C2021) this.f1055;
                C1497.f5292.m2548(String.valueOf(((TextInputEditText) c2021.f6771).getText()));
                C1498.f5293.m2548(String.valueOf(((TextInputEditText) c2021.f6772).getText()));
                C1499.f5294.m2548(String.valueOf(((TextInputEditText) c2021.f6773).getText()));
                C1488.f5283.m2548(String.valueOf(((TextInputEditText) c2021.f6762).getText()));
                C1489.f5284.m2548(String.valueOf(((TextInputEditText) c2021.f6763).getText()));
                C1490.f5285.m2548(String.valueOf(((TextInputEditText) c2021.f6764).getText()));
                C1491.f5286.m2548(String.valueOf(((TextInputEditText) c2021.f6765).getText()));
                C1492.f5287.m2548(String.valueOf(((TextInputEditText) c2021.f6766).getText()));
                C1493.f5288.m2548(String.valueOf(((TextInputEditText) c2021.f6767).getText()));
                C1494.f5289.m2548(String.valueOf(((TextInputEditText) c2021.f6768).getText()));
                C1495.f5290.m2548(String.valueOf(((TextInputEditText) c2021.f6769).getText()));
                C1496.f5291.m2548(String.valueOf(((TextInputEditText) c2021.f6770).getText()));
                return C3497.f10997;
            case Opcodes.DLOAD /* 24 */:
                C2018 c20111 = (C2018) this.f1055;
                C1511.f5332.m2548(String.valueOf(c20111.f6745.getText()));
                C1512.f5333.m2548(String.valueOf(c20111.f6746.getText()));
                return C3497.f10997;
            case Opcodes.ALOAD /* 25 */:
                C1536.f5377.m2547(AbstractC0744.m2209(AbstractC2841.m4843(String.valueOf(((C2012) this.f1055).f6709.getText()), new String[]{","})));
                return C3497.f10997;
            case 26:
                C2016 c20112 = (C2016) this.f1055;
                C1543.f5396.m2543(c20112.f6730.isChecked());
                C1544.f5397.m2543(c20112.f6731.isChecked());
                return C3497.f10997;
            case 27:
                return ((Context) this.f1055).getFilesDir().getAbsolutePath() + "/fastkv/";
            case 28:
                return new C1025(((C1974) this.f1055).f6546);
            default:
                C2020 c2022 = (C2020) this.f1055;
                C2038.f6812.m2548(String.valueOf(c2022.f6759.getText()));
                C2040.f6814.m2548(String.valueOf(c2022.f6761.getText()));
                C2037.f6811.m2548(String.valueOf(c2022.f6758.getText()));
                C2039.f6813.m2548(String.valueOf(c2022.f6760.getText()));
                return C3497.f10997;
        }
    }
}
