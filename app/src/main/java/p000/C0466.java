package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0466 implements InterfaceC2129, InterfaceC1796, EventListener.Factory {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2057;

    public /* synthetic */ C0466(Object obj) {
        this.f2057 = obj;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f2057, call);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1692(AbstractC0027 abstractC0027) {
        int i;
        Drawable.ConstantState constantState;
        Drawable.ConstantState constantState2;
        final C0815 c0815 = (C0815) this.f2057;
        C2873 c2873 = c0815.f3186;
        C2873 c2874 = c0815.f3188;
        C2873 c2875 = c0815.f3187;
        C2873 c2876 = c0815.f3189;
        RelativeLayout relativeLayout = ((C1962) abstractC0027).f6511.f6487;
        final int i2 = 0;
        relativeLayout.setVisibility(0);
        relativeLayout.addView(c0815.m2363(), new RelativeLayout.LayoutParams(-1, -2));
        c0815.m2363().removeViewAt(3);
        LinearLayout linearLayoutM2363 = c0815.m2363();
        C2873 c2877 = c0815.f3184;
        linearLayoutM2363.addView((LinearLayout) c2877.getValue(), 3);
        C2873 c2878 = c0815.f3185;
        RecyclerView recyclerView = (RecyclerView) c2878.getValue();
        
        C1565.m3276();
        final int i3 = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C0800 c0800 = c0815.f3192;
        if (c0800.f7926.m4442()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        c0800.f7927 = true;
        ((RecyclerView) c2878.getValue()).setAdapter(c0815.f3192);
        String[] strArr = AbstractC1574.f5469;
        C0816 c0816 = c0815.f3181;
        C0816 c0817 = null;
        if (c0816 == null) {
            "info";
            c0816 = null;
        }
        ((EditText) c2873.getValue()).setHint(c0816.f3198);
        ((EditText) c2873.getValue()).addTextChangedListener(new C0635(1, c0815));
        C0816 c0818 = c0815.f3181;
        if (c0818 == null) {
            "info";
            c0818 = null;
        }
        ((Button) c2875.getValue()).setText(c0818.f3200);
        int i4 = 0;
        MethodResolver c1973M3492 = AbstractC0968.startFieldResolution((Button) c2874.getValue()).m3492();
        c1973M3492.f6370 = "setIconResource";
        Class cls = Integer.TYPE;
        C1982 c1982 = (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(cls)}, 1, c1973M3492);
        C0816 c0819 = c0815.f3181;
        if (c0819 == null) {
            "info";
            c0819 = null;
        }
        c1982.m3831(Integer.valueOf(c0819.f3199));
        MethodResolver c1973M3493 = AbstractC0968.startFieldResolution((Button) c2875.getValue()).m3492();
        c1973M3493.f6370 = "setIconResource";
        C1982 c1983 = (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(cls)}, 1, c1973M3493);
        C0816 c08110 = c0815.f3181;
        if (c08110 == null) {
            "info";
            c08110 = null;
        }
        c1983.m3831(Integer.valueOf(c08110.f3201));
        C0816 c08111 = c0815.f3181;
        if (c08111 == null) {
            "info";
            c08111 = null;
        }
        ((Button) c2875.getValue()).setOnClickListener(new ViewOnClickListenerC0812(c08111.f3203, 0, c0815));
        C0816 c08112 = c0815.f3181;
        if (c08112 == null) {
            "info";
            c08112 = null;
        }
        ((Button) c2874.getValue()).setText(c08112.f3202);
        C0816 c08113 = c0815.f3181;
        if (c08113 == null) {
            "info";
            c08113 = null;
        }
        ((Button) c2874.getValue()).setOnClickListener(new ViewOnClickListenerC0812(c08113.f3204, 1, c0815));
        RadioGroup radioGroup = (RadioGroup) c2876.getValue();
        int childCount = radioGroup.getChildCount();
        int i5 = 0;
        while (true) {
            i = R.id.rbAll;
            if (i5 >= childCount) {
                break;
            }
            View childAt = radioGroup.getChildAt(i5);
            if (childAt.getId() != R.id.rbAll) {
                childAt.setVisibility(8);
            }
            i5++;
        }
        C0816 c08114 = c0815.f3181;
        if (c08114 == null) {
            "info";
            c08114 = null;
        }
        for (String str : AbstractC0744.m2206(c08114.f3196.keySet())) {
            RadioButton radioButton = (RadioButton) ((RadioGroup) c2876.getValue()).findViewById(i);
            C0224 c0224 = new C0224(radioButton.getContext(), null);
            c0224.setTextColor(radioButton.getTextColors());
            c0224.setTextSize(radioButton.getTextSize() / c0224.getResources().getDisplayMetrics().scaledDensity);
            c0224.setButtonTintList(radioButton.getButtonTintList());
            c0224.setLayoutParams(radioButton.getLayoutParams());
            c0224.setPadding(c0224.getPaddingLeft(), c0224.getPaddingTop(), c0224.getPaddingRight(), c0224.getPaddingBottom());
            c0224.setGravity(radioButton.getGravity());
            Drawable buttonDrawable = radioButton.getButtonDrawable();
            c0224.setButtonDrawable((buttonDrawable == null || (constantState2 = buttonDrawable.getConstantState()) == null) ? null : constantState2.newDrawable());
            Drawable background = radioButton.getBackground();
            c0224.setBackground((background == null || (constantState = background.getConstantState()) == null) ? null : constantState.newDrawable());
            c0224.setText(str);
            ((RadioGroup) c2876.getValue()).addView(c0224);
            i = R.id.rbAll;
        }
        C0800 c0801 = c0815.f3192;
        C0816 c08115 = c0815.f3181;
        if (c08115 == null) {
            "info";
        } else {
            c0817 = c08115;
        }
        ArrayList arrayList = c0817.f3195;
        if (!c0817.f3194 || arrayList.isEmpty()) {
            arrayList = c0817.f3197;
        }
        C0800.m2351(c0801, arrayList);
        c0815.m2366();
        c0815.m2364();
        ((CheckBox) c0815.f3190.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᤞᲁ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (0) {
                    case 0:
                        if (compoundButton.isPressed()) {
                            C0815 c08116 = c0815;
                            List<C0801> list = c08116.f3192.f3158;
                            ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list, 10));
                            for (C0801 c0802 : list) {
                                c0802.f3163 = z;
                                arrayList2.add(c0802);
                            }
                            c08116.f3192.m4441();
                        }
                        break;
                    default:
                        if (z) {
                            AbstractC1458.m3166(c0815, new C0055(3, compoundButton));
                        }
                        break;
                }
            }
        });
        RadioGroup radioGroup2 = (RadioGroup) c2876.getValue();
        int childCount2 = radioGroup2.getChildCount();
        while (0 < childCount2) {
            View childAt2 = radioGroup2.getChildAt(0);
            if (childAt2 instanceof RadioButton) {
                ((RadioButton) childAt2).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲈᲇᤞᲁ
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        switch (1) {
                            case 0:
                                if (compoundButton.isPressed()) {
                                    C0815 c08116 = c0815;
                                    List<C0801> list = c08116.f3192.f3158;
                                    ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list, 10));
                                    for (C0801 c0802 : list) {
                                        c0802.f3163 = z;
                                        arrayList2.add(c0802);
                                    }
                                    c08116.f3192.m4441();
                                }
                                break;
                            default:
                                if (z) {
                                    AbstractC1458.m3166(c0815, new C0055(3, compoundButton));
                                }
                                break;
                        }
                    }
                });
            }
            0++;
        }
        
        ((LinearLayout) c2877.getValue()).getLayoutParams().height = C1565.m3276().getResources().getDisplayMetrics().heightPixels / 2;
    }

    @Override // p000.InterfaceC1796
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo1693(View view, String str) {
        C2675 c2675 = (C2675) this.f2057;
        Uri uri = Uri.parse(str);
        Context context = c2675.f8605;
        String[] strArr = AbstractC1574.f5469;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", c2675.f8605.getPackageName());
        context.startActivity(intent);
    }
}
