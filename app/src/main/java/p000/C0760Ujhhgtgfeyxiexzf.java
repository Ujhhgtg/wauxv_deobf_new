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
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸能不能ᛴᛲᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0760Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3029Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0760Ujhhgtgfeyxiexzf(int i) {
        this.f3029Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        int i = this.f3029Ujhhgtgfeyxiexzf;
        int i2 = 16;
        int i3 = 15;
        int i4 = 2;
        int i5 = 22;
        int i6 = 18;
        int i7 = 21;
        int i8 = 3;
        C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = null;
        boolean z = true;
        int i9 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = (C0394Ujhhgtgfeyxiexzf) obj;
                c0394Ujhhgtgfeyxiexzf.m1655Ujhhgtgfeyxiexzf(1);
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928511324763194762L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(i4);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(i8);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928541681592042890L, strArr));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928542484750927242L, strArr), MagicFactory.get(4928542647959684490L, strArr));
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C0760Ujhhgtgfeyxiexzf(4));
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = (C0394Ujhhgtgfeyxiexzf) obj;
                Class clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Context.class));
                Class cls = clsM5159Ujhhgtgfeyxiexzf == null ? Context.class : clsM5159Ujhhgtgfeyxiexzf;
                Class clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(List.class));
                Class cls2 = clsM5159Ujhhgtgfeyxiexzf2 == null ? List.class : clsM5159Ujhhgtgfeyxiexzf2;
                Class clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Intent.class));
                Class cls3 = clsM5159Ujhhgtgfeyxiexzf3 == null ? Intent.class : clsM5159Ujhhgtgfeyxiexzf3;
                Class clsM5159Ujhhgtgfeyxiexzf4 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class));
                Class cls4 = clsM5159Ujhhgtgfeyxiexzf4 == null ? String.class : clsM5159Ujhhgtgfeyxiexzf4;
                Class clsM5159Ujhhgtgfeyxiexzf5 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Integer.class));
                Class cls5 = clsM5159Ujhhgtgfeyxiexzf5 == null ? Integer.class : clsM5159Ujhhgtgfeyxiexzf5;
                Class clsM5159Ujhhgtgfeyxiexzf6 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.class));
                c0394Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(cls, cls2, cls3, cls4, cls5, null, clsM5159Ujhhgtgfeyxiexzf6 == null ? Boolean.class : clsM5159Ujhhgtgfeyxiexzf6);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 6:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 7:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 9:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 10:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 11:
                C2840feyxiexzfUjhhgtg c2840feyxiexzfUjhhgtg = (C2840feyxiexzfUjhhgtg) obj;
                C2840feyxiexzfUjhhgtg.m4166Ujhhgtgfeyxiexzf(c2840feyxiexzfUjhhgtg, "JsonPrimitive", new C0125Ujhhgtgfeyxiexzf(new C3471Ujhhgtgfeyxiexzf(14)));
                C2840feyxiexzfUjhhgtg.m4166Ujhhgtgfeyxiexzf(c2840feyxiexzfUjhhgtg, "JsonNull", new C0125Ujhhgtgfeyxiexzf(new C3471Ujhhgtgfeyxiexzf(15)));
                C2840feyxiexzfUjhhgtg.m4166Ujhhgtgfeyxiexzf(c2840feyxiexzfUjhhgtg, "JsonLiteral", new C0125Ujhhgtgfeyxiexzf(new C3471Ujhhgtgfeyxiexzf(16)));
                C2840feyxiexzfUjhhgtg.m4166Ujhhgtgfeyxiexzf(c2840feyxiexzfUjhhgtg, "JsonObject", new C0125Ujhhgtgfeyxiexzf(new C3471Ujhhgtgfeyxiexzf(17)));
                C2840feyxiexzfUjhhgtg.m4166Ujhhgtgfeyxiexzf(c2840feyxiexzfUjhhgtg, "JsonArray", new C0125Ujhhgtgfeyxiexzf(new C3471Ujhhgtgfeyxiexzf(18)));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                AbstractC0120Ujhhgtgfeyxiexzf abstractC0120Ujhhgtgfeyxiexzf = (AbstractC0120Ujhhgtgfeyxiexzf) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC1154feyxiexzfUjhhgtg.m2646Ujhhgtgfeyxiexzf(sb, str);
                sb.append(':');
                sb.append(abstractC0120Ujhhgtgfeyxiexzf);
                return sb.toString();
            case 13:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928500492855674250L, strArr2));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928501356144100746L, strArr2), MagicFactory.get(4928501399093773706L, strArr2));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928501218705147274L, strArr3));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928497525033272714L, strArr3), MagicFactory.get(4928497589457782154L, strArr3));
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1853Ujhhgtgfeyxiexzf(Double.valueOf(C0248Ujhhgtgfeyxiexzf.f1579Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg3);
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928847135371167114L, strArr4));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928847195500709258L, strArr4), MagicFactory.get(4928850601409774986L, strArr4));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg4);
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928847818270967178L, strArr5));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928846778888881546L, strArr5));
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
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
                AlertDialog.Builder builder = new AlertDialog.Builder(((View) c0919feyxiexzfUjhhgtg).getContext());
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                builder.setTitle(MagicFactory.get(4928847732371621258L, strArr6));
                LinearLayout linearLayout = new LinearLayout(builder.getContext());
                linearLayout.setGravity(17);
                linearLayout.setOrientation(0);
                EditText editText = new EditText(linearLayout.getContext());
                editText.setInputType(12290);
                editText.setText(String.valueOf(C0248Ujhhgtgfeyxiexzf.f1579Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                editText.addTextChangedListener(new C0250Ujhhgtgfeyxiexzf(editText, 0));
                linearLayout.addView(editText);
                EditText editText2 = new EditText(linearLayout.getContext());
                editText2.setInputType(12290);
                editText2.setText(String.valueOf(C0247Ujhhgtgfeyxiexzf.f1578Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                editText2.addTextChangedListener(new C0250Ujhhgtgfeyxiexzf(editText2, 1));
                linearLayout.addView(editText2);
                builder.setView(linearLayout);
                builder.setPositiveButton(MagicFactory.get(4928847706601817482L, strArr6), (DialogInterface.OnClickListener) null);
                builder.setNegativeButton(MagicFactory.get(4928847831155869066L, strArr6), (DialogInterface.OnClickListener) null);
                builder.show();
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg5 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg5.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928850966481995146L, strArr7));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf5 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf5.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928850846222910858L, strArr7), MagicFactory.get(4928850897762518410L, strArr7));
                c3452feyxiexzfUjhhgtg5.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg6 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg6);
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928846937802671498L, strArr8));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928846997932213642L, strArr8));
                c3452feyxiexzfUjhhgtg6.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1853Ujhhgtgfeyxiexzf(Double.valueOf(C0247Ujhhgtgfeyxiexzf.f1578Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                View view = (View) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf(view, R.layout.module_dialog_location, null, false);
                int i10 = R.id.moduleDialogBtnLocationSelect;
                MaterialButton materialButton = (MaterialButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogBtnLocationSelect);
                if (materialButton != null) {
                    i10 = R.id.moduleDialogEdtLocationLatitude;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtLocationLatitude);
                    if (textInputEditText != null) {
                        i10 = R.id.moduleDialogEdtLocationLongitude;
                        TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtLocationLongitude);
                        if (textInputEditText2 != null) {
                            i10 = R.id.moduleDialogInputLocationLatitude;
                            if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputLocationLatitude)) != null) {
                                i10 = R.id.moduleDialogInputLocationLongitude;
                                if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputLocationLongitude)) != null) {
                                    C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf = new C0328Ujhhgtgfeyxiexzf((LinearLayout) viewM2416Ujhhgtgfeyxiexzf, materialButton, textInputEditText, textInputEditText2);
                                    materialButton.setOnClickListener(new ViewOnClickListenerC0241Ujhhgtgfeyxiexzf(view, i9));
                                    C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf2 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                                    if (c0328Ujhhgtgfeyxiexzf2 == null) {
                                        MagicFactory.get(4928848084558939530L, strArr9);
                                        c0328Ujhhgtgfeyxiexzf2 = null;
                                    }
                                    c0328Ujhhgtgfeyxiexzf2.f1933Ujhhgtgfeyxiexzf.setText(String.valueOf(C0248Ujhhgtgfeyxiexzf.f1579Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                                    C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf3 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                                    if (c0328Ujhhgtgfeyxiexzf3 == null) {
                                        MagicFactory.get(4928848050199201162L, strArr9);
                                        c0328Ujhhgtgfeyxiexzf3 = null;
                                    }
                                    c0328Ujhhgtgfeyxiexzf3.f1934Ujhhgtgfeyxiexzf.setText(String.valueOf(C0247Ujhhgtgfeyxiexzf.f1578Ujhhgtgfeyxiexzf.m4618Ujhhgtgfeyxiexzf()));
                                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                    C0277Ujhhgtgfeyxiexzf.f1689Ujhhgtgfeyxiexzf.getClass();
                                    c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C0277Ujhhgtgfeyxiexzf.f1694Ujhhgtgfeyxiexzf;
                                    C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf4 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                                    if (c0328Ujhhgtgfeyxiexzf4 == null) {
                                        MagicFactory.get(4928848153278416266L, strArr9);
                                        c0328Ujhhgtgfeyxiexzf4 = null;
                                    }
                                    c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = c0328Ujhhgtgfeyxiexzf4.f1932Ujhhgtgfeyxiexzf;
                                    c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928848118918677898L, strArr9), new C3471Ujhhgtgfeyxiexzf(22));
                                    c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928848243472729482L, strArr9), new C3471Ujhhgtgfeyxiexzf(21));
                                    C0290Ujhhgtgfeyxiexzf.m1498Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                                    c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                                    return c1943Ujhhgtgfeyxiexzf;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928803704661869962L, strArr9).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i10)));
            case Opcodes.ALOAD /* 25 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                int iIntValue = ((Number) c0919feyxiexzfUjhhgtg2).intValue();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                if (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg3 = null;
                }
                int iIntValue2 = ((Number) c0919feyxiexzfUjhhgtg3).intValue();
                if (iIntValue == 6 && iIntValue2 == -1) {
                    try {
                        c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[2];
                        if (c0919feyxiexzfUjhhgtg4 == null) {
                            c0919feyxiexzfUjhhgtg4 = null;
                        }
                    } catch (Throwable th4) {
                        c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                    }
                    if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                    String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    Parcelable parcelableExtra = ((Intent) c0919feyxiexzfUjhhgtg4).getParcelableExtra(MagicFactory.get(4928848230587827594L, strArr10));
                    int i11 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(parcelableExtra).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f2121feyxiexzfUjhhgtg = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class);
                    String str2 = (String) ((C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf())).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                    C0207Ujhhgtgfeyxiexzf c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf = AbstractC1243feyxiexzfUjhhgtg.m2727Ujhhgtgfeyxiexzf(Pattern.compile(MagicFactory.get(4928848299307304330L, strArr10)).matcher(str2), 0, str2);
                    if (c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf == null || ((AbstractC2933Ujhhgtgfeyxiexzf) c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.m1285Ujhhgtgfeyxiexzf()).mo1287Ujhhgtgfeyxiexzf() != 3) {
                        C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf5 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                        if (c0328Ujhhgtgfeyxiexzf5 == null) {
                            MagicFactory.get(4928847444608812426L, strArr10);
                            c0328Ujhhgtgfeyxiexzf5 = null;
                        }
                        c0328Ujhhgtgfeyxiexzf5.f1933Ujhhgtgfeyxiexzf.setText(MagicFactory.get(4928847547688027530L, strArr10));
                        C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf6 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                        if (c0328Ujhhgtgfeyxiexzf6 == null) {
                            MagicFactory.get(4928847504738354570L, strArr10);
                        } else {
                            c0328Ujhhgtgfeyxiexzf = c0328Ujhhgtgfeyxiexzf6;
                        }
                        c0328Ujhhgtgfeyxiexzf.f1934Ujhhgtgfeyxiexzf.setText(MagicFactory.get(4928847607817569674L, strArr10));
                    } else {
                        C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf7 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                        if (c0328Ujhhgtgfeyxiexzf7 == null) {
                            MagicFactory.get(4928847375889335690L, strArr10);
                            c0328Ujhhgtgfeyxiexzf7 = null;
                        }
                        TextInputEditText textInputEditText3 = c0328Ujhhgtgfeyxiexzf7.f1933Ujhhgtgfeyxiexzf;
                        Float fM2676feyxiexzfUjhhgtg = AbstractC1185feyxiexzfUjhhgtg.m2676feyxiexzfUjhhgtg((String) ((C0208Ujhhgtgfeyxiexzf) c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.m1285Ujhhgtgfeyxiexzf()).get(1));
                        textInputEditText3.setText(String.valueOf(fM2676feyxiexzfUjhhgtg != null ? fM2676feyxiexzfUjhhgtg.floatValue() : 31.135633f));
                        C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf8 = C0277Ujhhgtgfeyxiexzf.f1691Ujhhgtgfeyxiexzf;
                        if (c0328Ujhhgtgfeyxiexzf8 == null) {
                            MagicFactory.get(4928847478968550794L, strArr10);
                        } else {
                            c0328Ujhhgtgfeyxiexzf = c0328Ujhhgtgfeyxiexzf8;
                        }
                        TextInputEditText textInputEditText4 = c0328Ujhhgtgfeyxiexzf.f1934Ujhhgtgfeyxiexzf;
                        Float fM2676feyxiexzfUjhhgtg2 = AbstractC1185feyxiexzfUjhhgtg.m2676feyxiexzfUjhhgtg((String) ((C0208Ujhhgtgfeyxiexzf) c0207UjhhgtgfeyxiexzfM2727Ujhhgtgfeyxiexzf.m1285Ujhhgtgfeyxiexzf()).get(2));
                        textInputEditText4.setText(String.valueOf(fM2676feyxiexzfUjhhgtg2 != null ? fM2676feyxiexzfUjhhgtg2.floatValue() : 121.66625f));
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(19);
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(i5);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(i6);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C0760Ujhhgtgfeyxiexzf(i7);
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
