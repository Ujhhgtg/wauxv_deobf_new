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
import com.bumptech.glide.ComponentCallbacks2C0027;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᤝᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0441 implements InterfaceC2163, InterfaceC1478, InterfaceC1819, EventListener.Factory {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f2029;

    public /* synthetic */ C0441(Object obj) {
        this.f2029 = obj;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f2029, call);
    }

    @Override // p000.InterfaceC1478
    public Object get() {
        return new C1465((ComponentCallbacks2C0027) this.f2029);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void m1800(AbstractC0034 abstractC0034) {
        int i;
        Drawable.ConstantState constantState;
        Drawable.ConstantState constantState2;
        final C0814 c0814 = (C0814) this.f2029;
        C2933 c2933 = c0814.f3193;
        C2933 c2934 = c0814.f3195;
        C2933 c2935 = c0814.f3194;
        C2933 c2936 = c0814.f3196;
        RelativeLayout relativeLayout = ((C1993) abstractC0034).f6616.f6592;
        final int i2 = 0;
        relativeLayout.setVisibility(0);
        relativeLayout.addView(c0814.m2479(), new RelativeLayout.LayoutParams(-1, -2));
        c0814.m2479().removeViewAt(3);
        LinearLayout linearLayoutM2479 = c0814.m2479();
        C2933 c2937 = c0814.f3191;
        linearLayoutM2479.addView((LinearLayout) c2937.getValue(), 3);
        C2933 c2938 = c0814.f3192;
        RecyclerView recyclerView = (RecyclerView) c2938.getValue();
        C1576.f5470.getClass();
        C1576.m3456();
        final int i3 = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        C0799 c0799 = c0814.f3199;
        if (c0799.f8077.m4463()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        c0799.f8078 = true;
        ((RecyclerView) c2938.getValue()).setAdapter(c0814.f3199);
        String[] strArr = AbstractC1471.f5234;
        C0815 c0815 = c0814.f3188;
        C0815 c0816 = null;
        if (c0815 == null) {
            "info";
            c0815 = null;
        }
        ((EditText) c2933.getValue()).setHint(c0815.f3205);
        ((EditText) c2933.getValue()).addTextChangedListener(new C0628(c0814, i3));
        C0815 c0817 = c0814.f3188;
        if (c0817 == null) {
            "info";
            c0817 = null;
        }
        ((Button) c2935.getValue()).setText(c0817.f3207);
        int i4 = AbstractC1768.f5906;
        C2004 c2004M3560 = AbstractC2727.m4713((Button) c2934.getValue()).m3560();
        c2004M3560.f6475 = "setIconResource";
        Class cls = Integer.TYPE;
        C2013 c2013 = (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls)}, 1, c2004M3560);
        C0815 c0818 = c0814.f3188;
        if (c0818 == null) {
            "info";
            c0818 = null;
        }
        c2013.m4025(Integer.valueOf(c0818.f3206));
        C2004 c2004M3561 = AbstractC2727.m4713((Button) c2935.getValue()).m3560();
        c2004M3561.f6475 = "setIconResource";
        C2013 c2014 = (C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(cls)}, 1, c2004M3561);
        C0815 c0819 = c0814.f3188;
        if (c0819 == null) {
            "info";
            c0819 = null;
        }
        c2014.m4025(Integer.valueOf(c0819.f3208));
        C0815 c08110 = c0814.f3188;
        if (c08110 == null) {
            "info";
            c08110 = null;
        }
        ((Button) c2935.getValue()).setOnClickListener(new ViewOnClickListenerC0811(c08110.f3210, i2, c0814));
        C0815 c08111 = c0814.f3188;
        if (c08111 == null) {
            "info";
            c08111 = null;
        }
        ((Button) c2934.getValue()).setText(c08111.f3209);
        C0815 c08112 = c0814.f3188;
        if (c08112 == null) {
            "info";
            c08112 = null;
        }
        ((Button) c2934.getValue()).setOnClickListener(new ViewOnClickListenerC0811(c08112.f3211, i3, c0814));
        RadioGroup radioGroup = (RadioGroup) c2936.getValue();
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
        C0815 c08113 = c0814.f3188;
        if (c08113 == null) {
            "info";
            c08113 = null;
        }
        for (String str : AbstractC0739.m2305(c08113.f3203.keySet())) {
            RadioButton radioButton = (RadioButton) ((RadioGroup) c2936.getValue()).findViewById(i);
            C0234 c0234 = new C0234(radioButton.getContext(), null);
            c0234.setTextColor(radioButton.getTextColors());
            c0234.setTextSize(radioButton.getTextSize() / c0234.getResources().getDisplayMetrics().scaledDensity);
            c0234.setButtonTintList(radioButton.getButtonTintList());
            c0234.setLayoutParams(radioButton.getLayoutParams());
            c0234.setPadding(c0234.getPaddingLeft(), c0234.getPaddingTop(), c0234.getPaddingRight(), c0234.getPaddingBottom());
            c0234.setGravity(radioButton.getGravity());
            Drawable buttonDrawable = radioButton.getButtonDrawable();
            c0234.setButtonDrawable((buttonDrawable == null || (constantState2 = buttonDrawable.getConstantState()) == null) ? null : constantState2.newDrawable());
            Drawable background = radioButton.getBackground();
            c0234.setBackground((background == null || (constantState = background.getConstantState()) == null) ? null : constantState.newDrawable());
            c0234.setText(str);
            ((RadioGroup) c2936.getValue()).addView(c0234);
            i = R.id.rbAll;
        }
        C0799 c07910 = c0814.f3199;
        C0815 c08114 = c0814.f3188;
        if (c08114 == null) {
            "info";
        } else {
            c0816 = c08114;
        }
        ArrayList arrayList = c0816.f3202;
        if (!c0816.f3201 || arrayList.isEmpty()) {
            arrayList = c0816.f3204;
        }
        C0799.m2467(c07910, arrayList);
        c0814.m2482();
        c0814.m2480();
        ((CheckBox) c0814.f3197.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᤞᲈ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i2) {
                    case 0:
                        if (compoundButton.isPressed()) {
                            C0814 c08115 = c0814;
                            List<C0800> list = c08115.f3199.f3165;
                            ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list, 10));
                            for (C0800 c0800 : list) {
                                c0800.f3170 = z;
                                arrayList2.add(c0800);
                            }
                            c08115.f3199.m4462();
                        }
                        break;
                    default:
                        if (z) {
                            C1787.m3673(c0814, new C0062(compoundButton, 4));
                        }
                        break;
                }
            }
        });
        RadioGroup radioGroup2 = (RadioGroup) c2936.getValue();
        int childCount2 = radioGroup2.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = radioGroup2.getChildAt(i2);
            if (childAt2 instanceof RadioButton) {
                ((RadioButton) childAt2).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲁᤞᲈ
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        switch (i3) {
                            case 0:
                                if (compoundButton.isPressed()) {
                                    C0814 c08115 = c0814;
                                    List<C0800> list = c08115.f3199.f3165;
                                    ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list, 10));
                                    for (C0800 c0800 : list) {
                                        c0800.f3170 = z;
                                        arrayList2.add(c0800);
                                    }
                                    c08115.f3199.m4462();
                                }
                                break;
                            default:
                                if (z) {
                                    C1787.m3673(c0814, new C0062(compoundButton, 4));
                                }
                                break;
                        }
                    }
                });
            }
            i2++;
        }
        C1576.f5470.getClass();
        ((LinearLayout) c2937.getValue()).getLayoutParams().height = C1576.m3456().getResources().getDisplayMetrics().heightPixels / 2;
    }

    @Override // p000.InterfaceC1819
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public void mo1801(View view, String str) {
        C2735 c2735 = (C2735) this.f2029;
        Uri uri = Uri.parse(str);
        Context context = c2735.f8763;
        String[] strArr = AbstractC1471.f5234;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", c2735.f8763.getPackageName());
        context.startActivity(intent);
    }
}
